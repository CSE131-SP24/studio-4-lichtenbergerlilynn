package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {

		StdDraw.setPenColor(0,100,255);
		StdDraw.filledRectangle(0.5, 0.5, 0.2, 0.1);
		StdDraw.setPenColor(0,255,0);
		StdDraw.filledCircle(0.5, 0.5, 0.1);
		StdDraw.setPenColor(150,50,50);
		StdDraw.arc(0.6, 0.5, 0.1, 270, 360);
		StdDraw.arc(0.4, 0.5, 0.1, 180, 270);
	}
}