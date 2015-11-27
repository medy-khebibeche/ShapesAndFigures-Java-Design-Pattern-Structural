package fr.iutvalence.info.dut.m3105.preamble;

public class ShadowShapeDecorator extends Decorator {

	private int angle;
	private int intensity;
	
	public ShadowShapeDecorator(int a, int i)
	{
		this.angle = a;
		this.intensity = i;
	}
}
