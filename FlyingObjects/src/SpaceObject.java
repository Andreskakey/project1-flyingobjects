import java.awt.*;
import java.awt.event.*;

public class SpaceObject {

	protected Polygon shape;

	// default constructor; shouldn't really be invoked but necessary 
	
	public SpaceObject() {
		Point[] points = {new Point(0,0)};
		shape = new Polygon(points, new Point(0,0), 0);
	}
	
	public SpaceObject(Point[] inShape, Point inOffset, double inRotation) {
		shape = new Polygon(inShape, inOffset, inRotation);
	}

	public void paint(Graphics brush) {
		shape.paint(brush);

	}

}