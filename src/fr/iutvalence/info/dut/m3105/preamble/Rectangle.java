package fr.iutvalence.info.dut.m3105.preamble;

public class Rectangle extends Shape{

	private int height;
	private int width;
	
	public Rectangle(int h, int w)
	{
		this.height = h;
		this.width = w;
	}
	
	@Override
	public String toString() {
		return "Rectangle (h=" + height + ", w=" + width + ")";
	}
	
	
}
