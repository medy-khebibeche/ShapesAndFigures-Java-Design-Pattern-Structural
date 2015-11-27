package fr.iutvalence.info.dut.m3105.preamble;

import com.sun.prism.paint.Color;

public class DrawingApplication {

	public static void main(String[] args)
	{
		Circle circle = new Circle(3);
		circle.draw(new Position(3,4));
		
		Rectangle rectangle = new Rectangle(7,2);
		rectangle.draw(new Position(0,1));
		
		SolidFillShapeDecorator solidFillDecorator = new SolidFillShapeDecorator(Color.BLACK); 
		BorderShapeDecorator BDS = new BorderShapeDecorator(2);
		ShadowShapeDecorator truc = new ShadowShapeDecorator(45,6);
		
	}

}
