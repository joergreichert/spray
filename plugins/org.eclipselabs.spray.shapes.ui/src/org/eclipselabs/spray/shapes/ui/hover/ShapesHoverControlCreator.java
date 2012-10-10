package org.eclipselabs.spray.shapes.ui.hover;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.internal.text.html.BrowserInformationControl;
import org.eclipse.jface.text.AbstractReusableInformationControlCreator;
import org.eclipse.jface.text.DefaultInformationControl;
import org.eclipse.jface.text.IInformationControl;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IInformationControlExtension4;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.editors.text.EditorsUI;

public class ShapesHoverControlCreator extends AbstractReusableInformationControlCreator {
	private final ShapesEObjectHoverProvider shapesEObjectHoverProvider;
	private Map<Shell, IInformationControl> fInformationControls = new HashMap<Shell, IInformationControl>();

	private final IInformationControlCreator fInformationPresenterControlCreator;

	public ShapesHoverControlCreator(ShapesEObjectHoverProvider shapesEObjectHoverProvider, 
			IInformationControlCreator informationPresenterControlCreator) {
		this.shapesEObjectHoverProvider = shapesEObjectHoverProvider;
		fInformationPresenterControlCreator = informationPresenterControlCreator;
	}

	/*
	 * @see org.eclipse.jdt.internal.ui.text.java.hover.AbstractReusableInformationControlCreator#doCreateInformationControl(org.eclipse.swt.widgets.Shell)
	 */
	@Override
	public IInformationControl doCreateInformationControl(Shell parent) {
		String tooltipAffordanceString = EditorsUI.getTooltipAffordanceString();
		if (BrowserInformationControl.isAvailable(parent)) {
			String font = "org.eclipse.jdt.ui.javadocfont"; // FIXME: PreferenceConstants.APPEARANCE_JAVADOC_FONT;
			BrowserInformationControl iControl = new BrowserInformationControl(parent, font,
					tooltipAffordanceString) {
				/*
				 * @see org.eclipse.jface.text.IInformationControlExtension5#getInformationPresenterControlCreator()
				 */
				@Override
				public IInformationControlCreator getInformationPresenterControlCreator() {
					return fInformationPresenterControlCreator;
				}
			};
			shapesEObjectHoverProvider.addLinkListener(iControl);
			return iControl;
		} else {
			return new DefaultInformationControl(parent, tooltipAffordanceString);
		}
	}

	/*
	 * @see org.eclipse.jdt.internal.ui.text.java.hover.AbstractReusableInformationControlCreator#canReuse(org.eclipse.jface.text.IInformationControl)
	 */
	@Override
	public boolean canReuse(IInformationControl control) {
		if (!super.canReuse(control))
			return false;

		if (control instanceof IInformationControlExtension4) {
			String tooltipAffordanceString = EditorsUI.getTooltipAffordanceString();
			((IInformationControlExtension4) control).setStatusText(tooltipAffordanceString);
		}

		return true;
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
