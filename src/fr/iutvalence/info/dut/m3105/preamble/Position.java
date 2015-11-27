package fr.iutvalence.info.dut.m3105.preamble;

public class Position {

	private int abscissa;
	private int ordinate;
	
	public Position(int x, int y)
	{
		this.abscissa = x;
		this.ordinate = y;
	}
	@Override
	public String toString() {
		return "("+this.abscissa+","+this.ordinate+")";
	}

}
