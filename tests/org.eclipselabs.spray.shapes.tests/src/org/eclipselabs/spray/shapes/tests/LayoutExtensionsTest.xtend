package org.eclipselabs.spray.shapes.tests

import javax.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipselabs.spray.shapes.Ellipse
import org.eclipselabs.spray.shapes.ShapeContainer
import org.eclipselabs.spray.shapes.generator.svg.LayoutExtensions
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.eclipselabs.xtext.utils.unittesting.XtextTest
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import org.eclipselabs.spray.shapes.tests.util.ShapeTestsInjectorProviderimport org.eclipselabs.spray.shapes.ShapeContainerElement

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(ShapeTestsInjectorProvider))
class LayoutExtensionsTest extends XtextTest {

	@Inject
	private LayoutExtensions layoutExtensions

	@Inject
	private ParseHelper<ShapeContainerElement> parseHelper
	
	@Test
	def void testGetParentX() {
		val shape = (parseHelper.parse(shapeDefinition) as ShapeContainer)
			.shapeContainerElement.head
		val outerEllipse = shape.eAllContents.filter(typeof(Ellipse))
			.filter(e|e.layout.common.xcor == 12).head
		val innerEllipse = shape.eAllContents.filter(typeof(Ellipse))
			.filter(e|e.layout.common.xcor == 2).head
		
		val outerEllipseParentX = layoutExtensions.parentX(outerEllipse)
		val outerEllipseParentY = layoutExtensions.parentY(outerEllipse)
		val innerEllipseParentX = layoutExtensions.parentX(innerEllipse)
		val innerEllipseParentY = layoutExtensions.parentY(innerEllipse)
		val outerEllipseX = layoutExtensions.x(outerEllipse, true)
		val outerEllipseY = layoutExtensions.y(outerEllipse, true)
		val innerEllipseX = layoutExtensions.x(innerEllipse, true)
		val innerEllipseY = layoutExtensions.y(innerEllipse, true)
		
		assertEquals("outer ellipse parent x coord", 0, outerEllipseParentX)
		assertEquals("outer ellipse parent y coord", 0, outerEllipseParentY)
		assertEquals("inner ellipse parent x coord", 12, innerEllipseParentX)
		assertEquals("inner ellipse parent y coord", 12, innerEllipseParentY)
		assertEquals("inner ellipse x coord", 30, outerEllipseX) // 12 + (37/2)
		assertEquals("inner ellipse y coord", 30, outerEllipseY) // 12 + (37/2)
		assertEquals("inner ellipse x coord", 18, innerEllipseX) // 2 + (33/2)
		assertEquals("inner ellipse y coord", 18, innerEllipseY) // 2 + (33/2)
	}
	
	def shapeDefinition() '''
		shape BPMN_Gateway_Event {
			polygon {
				point (x=0, y=30)
				point (x=30, y=0)
				point (x=60, y=30)
				point (x=30, y=60)
				ellipse {
					position (x=12, y=12)
					size (width=37, height=37)
					ellipse {
						position (x=2, y=2)
						size (width=33, height=33)
						polyline {
							point (x=16, y=3)
							point (x=28, y=11)
							point (x=24, y=27)
							point (x=8, y=27)
							point (x=4, y=11)
							point (x=16, y=3)
						}
					}
				}
			}
		}
	'''
}