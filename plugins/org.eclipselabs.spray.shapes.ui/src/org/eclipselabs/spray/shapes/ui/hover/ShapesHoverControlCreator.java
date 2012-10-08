package org.eclipselabs.spray.shapes.ui.hover;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.internal.text.html.BrowserInformationControl;
import org.eclipse.jface.text.IInformationControl;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider.HoverControlCreator;

public class ShapesHoverControlCreator extends HoverControlCreator {
	private Map<Shell, IInformationControl> fInformationControls = new HashMap<Shell, IInformationControl>();

	public ShapesHoverControlCreator(
			DefaultEObjectHoverProvider defaultEObjectHoverProvider,
			IInformationControlCreator informationPresenterControlCreator) {
		defaultEObjectHoverProvider.super(informationPresenterControlCreator);
	}

	@Override
	public IInformationControl createInformationControl(final Shell parent) {
		IInformationControl control = (IInformationControl) fInformationControls
				.get(parent);
		if (control == null) {
			final IInformationControl newControl = doCreateInformationControl(parent);
			newControl.addDisposeListener(this);
			try {
				Display.getCurrent().asyncExec(new Runnable() {

					@Override
					public void run() {
						if (BrowserInformationControl.isAvailable(parent)) {
							Point sizeHint = newControl.computeSizeHint();
							newControl.setSize(sizeHint.x, 200);
						}
					}
				});
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (newControl != null) {
				fInformationControls.put(parent, newControl);
			}
			control = newControl;
		}
		return control;
	}

	public void widgetDisposed(DisposeEvent e) {
		Composite parent = null;
		if (e.widget instanceof Shell)
			parent = ((Shell) e.widget).getParent();
		if (parent instanceof Shell)
			fInformationControls.remove(parent);
	}
}
