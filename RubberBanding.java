/* Mouse click has three components:
 * 1. java.awt.event (The "Event")
 * 2. addMouseListeners(); (Calls on the "Event")
 * 3. public void mousePressed(MouseEvent e) (Holds the 
 * "Event")
 */



import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.awt.event.*; // first component

public class RubberBanding extends GraphicsProgram {

	public void run() {
		addMouseListeners(); // second component
	}
	
	/* Executes whenever the mouse is clicked */
	public void mousePressed(MouseEvent e) { // third component
		double x = e.getX(); //get x-coordinate
		double y = e.getY(); // get y-coordinate
		line = new GLine(x, y, x, y); // creates a line extending from first point (x1, y1) to second point (x2, y2)
		add(line); 
	}
	/** Called on mouse drag to reset the endpoint */
		public void mouseDragged(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		line.setEndPoint(x, y);
		 }
	/* Private instance variables */
		private GLine line;
} 
