import acm.graphics.*;
import acm.program.*;
import java.awt.Color;
import acm.util.*;


public class RandomCircles extends GraphicsProgram {
	
	/* List of constants being used for program */
	private static final int MAX_NUM_CIRCLES = 10; // will create ten circles
	
	private static final double MIN_RADIUS = 5; // 5px <= circle radius size
	
	private static final double MAX_RADIUS = 50; // 50px >= circle radius size

	/* program to run */
	public void run() {
		for (int i = 0; i < MAX_NUM_CIRCLES; i++) { // For Loop: maximum run of command: 10
			randomCircle();
		}
	}
	
	private void randomCircle() {
		double r = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS); // Establishes random min/max radius
		double x = rgen.nextDouble(0, getWidth() - (r * 2)); 
		double y = rgen.nextDouble(0, getHeight() - (r * 2));
		GOval circle = new GOval (x, y, r, r);
		circle.setFillColor(rgen.nextColor());
		circle.setFilled(true);
		add(circle);
	}

	/* Instance Variable list */
	/* Gives me an object via the RandomGenerator */
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
