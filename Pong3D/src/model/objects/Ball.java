package model.objects;

import javafx.geometry.Point3D;
import javafx.scene.shape.Shape3D;
import javafx.scene.shape.Sphere;
import model.objects.GameElement;
		
/**
 * Class that represents the ball in the game.
 * 
 * @see {@link model.GameElement}.
 * 
 * @author Manuel Gallina
 * @author Giosuè Filippini
 */
public class Ball extends GameElement
{
	/* The starting position of the ball. In this case it's the center of the field. */
	private static final Point3D START_POS = new Point3D(0,0,0);
	
	/* The radius of the ball. */
	private static final double BALL_RADIUS = 100;
	
	/* The speed of the ball, expressed as a 3D vector in the [x, y, z] form. */
	private static final double[] BALL_SPEED = null;	
	
	/* The shape of the ball. */
	private static final Shape3D SHAPE = new Sphere(BALL_RADIUS);
	
	private double[] speed;
	
	/**
	 * Default constructor.
	 */
	public Ball()
	{
		super(START_POS);
		
		getParent().getChildren().add(SHAPE);
		this.setSpeed(BALL_SPEED);
	}

	/** @return The radius of the ball. */
	public double getRadius() { return BALL_RADIUS; }

	/** @return The speed of the ball. */
	public double[] getSpeed() { return speed; }

	/** @param speed The speed to set. */
	public void setSpeed(double[] speed) { this.speed = speed; }
}
	
