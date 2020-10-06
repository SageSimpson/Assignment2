import acm.graphics.*;
import acm.program.*;
import java.awt.Color;

/* RobotFace should be centered on the screen */
public class RobotFace extends GraphicsProgram {

	/* Head dimensions */
	private static final double HEAD_WIDTH = 125;
	private static final double HEAD_HEIGHT = 200;
	
	/* Eye dimensions */
	private static final double EYE_RADIUS = 75;
	
	/* Mouth dimensions */
	private static final double MOUTH_WIDTH = 75;
	private static final double MOUTH_HEIGHT = 30;

	public void run() {
		head();
		eyes();
		mouth();
	}
	
	/* Constructing head details: */
	private void head() {
		double x = (getWidth()/2 - (HEAD_WIDTH/2)); // creating var x to make code look cleaner
		GRect playSq = new GRect(x, 50, HEAD_WIDTH, HEAD_HEIGHT); // will center head on screen
		
		playSq.setFillColor(Color.gray);
		playSq.setFilled(true);
		
		add(playSq);
	}
	
	/* Constructing Eye Details */
	private void eyes() {
		double x = ((410 - EYE_RADIUS)); // setting initial placement of leftEye
		double y = (20 + EYE_RADIUS); // can use both left and right eyes with y position 
		GOval leftEye = new GOval(x, y, 30, 30);
		
		leftEye.setFillColor(Color.yellow);
		leftEye.setFilled(true);
		
		add(leftEye);
		
		double z = (390); // have to add var z to separate rightEye position from leftEye
		GOval rightEye = new GOval(z, y, 30, 30);
		
		rightEye.setFillColor(Color.yellow);
		rightEye.setFilled(true);
		
		add(rightEye);
	}
	
	/* Constructing Mouth Details */
	private void mouth() {
		double x = (HEAD_HEIGHT + 140); // HEAD_WIDTH used to calculate center
		double y = (HEAD_HEIGHT - 20); // HEAD_HEIGHT used to calculate distance from bottom of head
		GRect mouth = new GRect(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		
		mouth.setFillColor(Color.white);
		mouth.setFilled(true);
		
		add(mouth);
	}	
}