package view.gameelementsview;

import javafx.scene.shape.Shape3D;
import javafx.scene.shape.Sphere;
/**
 * Class for the graphic representation of Ball.
 * 
 * @author Giosuè Filippini
 *
 */
public class BallView extends GameElementView
{
	/* The radius of the ball. */
	private static final double BALL_RADIUS = 30;	
	
	/* The shape of the ball. */
	private static final Shape3D SHAPE = new Sphere(BALL_RADIUS);
	
	public BallView()
	{
		super();
		
		getParent().getChildren().add(SHAPE);
	}
	
	/** @return The radius of the ball. */
	public double getRadius() { return BALL_RADIUS; }


}
