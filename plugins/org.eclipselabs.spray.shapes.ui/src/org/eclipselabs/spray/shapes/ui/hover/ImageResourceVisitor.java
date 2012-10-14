package org.eclipselabs.spray.shapes.ui.hover;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.PNGTranscoder;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import static org.eclipselabs.spray.shapes.generator.ImageConstants.*;

public class ImageResourceVisitor implements IResourceVisitor {
	private final Map<String, String> shapeToSvgPath;
	private final Map<String, String> shapeToPngPath;
	private String shapeName = null;

	public ImageResourceVisitor() {
		this.shapeToSvgPath = new HashMap<String, String>();
		this.shapeToPngPath = new HashMap<String, String>();
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

	@Override
	public boolean visit(final IResource resource) throws CoreException {
		if (shapeName != null) {
			if ((shapeName + ".svg").equals(resource.getName())
					&& resource.getLocationURI().toString().contains(SVG_PATH)) {
				shapeToSvgPath.put(shapeName, resource.getLocation().toFile()
						.getAbsolutePath());
				resource.getWorkspace().addResourceChangeListener(
						new IResourceChangeListener() {

							@Override
							public void resourceChanged(
									IResourceChangeEvent event) {
								if (resource.equals(event.getResource())) {
									if (event.getType() == IResourceChangeEvent.PRE_DELETE) {
										shapeToSvgPath.remove(shapeName);
										shapeToPngPath.remove(shapeName);
									} else {
										generatePng(shapeName, resource, true);
									}
								}
							}
						});
				generatePng(shapeName, resource, false);
			} else if ((shapeName + ".png").equals(resource.getName())
					&& resource.getLocationURI().toString().contains(PNG_PATH)) {
				shapeToPngPath.put(shapeName, resource.getLocation().toFile()
						.getAbsolutePath());
			} else if (resource instanceof IContainer) {
				return true;
			}
		}
		return false;
	}

	private void generatePng(String shapeName, final IResource resource,
			boolean dirty) {
		String absoluteSvgPath = resource.getLocation().toFile()
				.getAbsolutePath();
		if (!shapeToPngPath.containsKey(shapeName) | dirty) {
			Scanner scanner = null;
			FileOutputStream writer = null;
			try {
				scanner = new Scanner(new File(absoluteSvgPath));
				scanner.useDelimiter("\\Z");
				if (scanner.hasNext()) {
					byte[] svgContent = scanner.next().getBytes();
					PNGTranscoder t = new PNGTranscoder();
					TranscoderInput input = new TranscoderInput(
							new ByteArrayInputStream(svgContent));
					String absolutePngPath = absoluteSvgPath.replace(".svg",
							".png").replace(getSystemPath(SVG_PATH), getSystemPath(PNG_PATH));
					File pngFile = new File(absolutePngPath);
					pngFile.getParentFile().mkdirs();
					writer = new FileOutputStream(pngFile);
					TranscoderOutput output = new TranscoderOutput(writer);
					t.transcode(input, output);
					shapeToPngPath.put(shapeName, absolutePngPath);
					resource.getParent().refreshLocal(IResource.DEPTH_INFINITE,
							new NullProgressMonitor());
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (TranscoderException e) {
				e.printStackTrace();
			} catch (CoreException e) {
				e.printStackTrace();
			} finally {
				if (scanner != null) {
					scanner.close();
				}
				if (writer != null) {
					try {
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	private String getSystemPath(String path) {
		return path.replace("/", System.getProperty("file.separator"));
	}

	public String getImagePath() {
		if (shapeName != null) {
			return shapeToPngPath.get(shapeName);
		}
		return null;
	}
}
