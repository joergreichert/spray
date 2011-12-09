grammar org.eclipselabs.spray.Shapes with org.eclipselabs.spray.Styles // with org.eclipse.xtext.common.Terminals

import 'http://www.eclipse.org/emf/2002/Ecore' as ecore

generate shapes 'http://www.eclipselabs.org/spray/Shapes'

ShapeContainer:
	shapes+=ShapeDefinition*;

ShapeDefinition:
	'shape' name=ID (param+=JvmFormalParameter+)? '{'
		shapeLayout=ShapeLayout
	   	shape+=Shape+
	'}';

Shape:
	{Shape} (type=ShapeType (style=WithStyle)?);

ShapeType:
	Line |
	Polyline |
	Rectangle |
	RoundedRectangle |
	Polygon |
	Ellipse |
	Text;

Line: {Line} 'line' ( '{' shapeLayout=LineLayout shape+=Shape*   '}' )? ;
Polyline: {Polyline} 'polyline' ( '{' layout=PolyLineLayout shape+=Shape* '}' )?;
Rectangle: {Rectangle} 'rectangle' ( '{' layout=RectangleEllipseLayout shape+=Shape* '}' )?;
RoundedRectangle: {RoundedRectangle} 'rounded-rectangle' (layout=RoundedRectangleLayout shape+=Shape* '}' )?;
Polygon: {Polygon} 'polygon' ( '{' layout=PolyLineLayout shape+=Shape* '}' )?;
Ellipse: {Ellipse} 'ellipse' ( '{' layout=RectangleEllipseLayout shape+=Shape* '}' )?;
Text: {Text} 'text' ( '{' layout=TextLayout shape+=Shape* '}' )?;

WithStyle: 'with' (style=JvmTypeReference);

ShapeLayout:
	{ShapeLayout} 
	(
	'('
	   ('size-min'               '=' '(' 'width' '=' minwidth=INT 'height' '=' minheight=INT ')')? &
	   ('size-default'           '=' '(' 'width' '=' defwidth=INT 'height' '=' defheight=INT ')')? &
	   ('size-max'               '=' '(' 'width' '=' maxwidth=INT 'height' '=' maxheight=INT ')')? &
	   ('stretching'  			 '=' '(' ( 'horizontal' '=' stretchH=Boolean)? & ( 'vertical' '=' stretchV=Boolean)? ')' )? &
	   ('proportional'           '=' proportional=Boolean)? &
	   ('angle'                  '=' angle=DOUBLE)?
	')'
	)
;

RectangleEllipseLayout:
	{RectangleEllipseLayout} 
	(
    	common=CommonLayout &
    	layout=StyleLayout 
    )
;

RoundedRectangleLayout:
	{RoundedRectangleLayout} 
	(
	'('
    	common=CommonLayout &
    	('curve'   '=' curve=INT)? &
    	layout=StyleLayout 
	')'
    )
;

PolyLineLayout:
	{PolyLineLayout} (
	'('
       point+=Point & 
	   point+=Point+
	   layout=StyleLayout
	')'
);

LineLayout:
	{LineLayout} (
		'points' '=' point+=Point & point+=Point 
		layout=StyleLayout
);

TextLayout:
	{TextLayout} (
	'('
		'align' '(' ( 'horizontal' '=' hAlign=HAlign)? & ( 'vertical' '=' vAlign=VAlign)? ')' & 
	  	layout=StyleLayout
	')'
);

CommonLayout:
	{CommonLayout} 
	( 
	   ('position' '=' '(' 
	   		('x' '=' xcor=INT)? & 
	   		('y' '=' ycor=INT)? 
	   	')') &
	   ('size' '=' '(' 
	   		('width' '=' width=INT)? & 
	   		('heigth' '=' heigth=INT)? 
	   	')')
    );       

Point: {Point} ( '(' xcor=INT ',' ycor=INT ')' );
Boolean returns ecore::EBoolean: 'true' | 'false';
enum HAlign: LEFT='left' | CENTER='center' | RIGHT='right';
enum VAlign: TOP='top' | MIDDLE='middle' | BOTTOM='bottom';