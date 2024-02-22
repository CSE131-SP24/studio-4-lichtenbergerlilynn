package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape=in.next();
		int redcomp=in.nextInt();
		int greencomp=in.nextInt();
		int bluecomp=in.nextInt();
		boolean isFilled=in.nextBoolean();
		double x=in.nextDouble();
		double y=in.nextDouble();
		
		if(shape.equals("rectangle")) {
		double halfWidth=in.nextDouble();
		double halfHeight=in.nextDouble();
			if(isFilled==false) {
				StdDraw.setPenColor(redcomp,greencomp,bluecomp);
				StdDraw.rectangle(x,y,halfWidth,halfHeight);
			}
			else if(isFilled==true) {
				StdDraw.setPenColor(redcomp,greencomp,bluecomp);
				StdDraw.filledRectangle(x,y,halfWidth,halfHeight);
			}}
		else if(shape.equals("ellipse")){
		double semiMajorAxis=in.nextDouble();
		double semiMinorAxis=in.nextDouble();
			if(isFilled==false) {
				StdDraw.setPenColor(redcomp,greencomp,bluecomp);
				StdDraw.ellipse(x,y,semiMajorAxis,semiMinorAxis);
			}
			else if(isFilled==true) {
				StdDraw.setPenColor(redcomp,greencomp,bluecomp);
				StdDraw.filledEllipse(x,y,semiMajorAxis,semiMinorAxis);
			}}
	}
}
