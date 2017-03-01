package model;

import controller.Player;
import javafx.geometry.Point3D;
import utility.geometry.geometry3d.Dimension3D;

/**
 * The Player model.
 * 
 * This class defines how the player moves.
 * 
 * @author Manuel Gallina
 */
public class PlayerModel
{
	private static final Dimension3D SIZE = new Dimension3D(80, 80, 2);	
	
	private Tag tag;
	
	private Point3D position;
	private Point3D target;
	private Point3D instantTarget; //This field is used to avoid changes in the target position during calculations.
	private double speed;
	
	private double left;
	private double right;
		
	private double top;
	private double bottom;
	
	/* Defines the player position and behavior. */
	private enum Tag
	{
		P1(new Point3D(0,0,-400)), P2(new Point3D(0,0,400));
		
		private Point3D position;
		
		private Tag(Point3D position) {	this.position = position; }
		
		/** @return The position. */
		public Point3D getPosition() { return position; }
	}
	
	/**
	 * Constructor.
	 * 
	 * @param controller The player controller class.
	 * @param tag The player tag.
	 */
	public PlayerModel(Player controller, String tag)
	{		
		speed = 25;
		
		target = new Point3D(0, 0, 0);
		instantTarget = new Point3D(0, 0, 0);
				
		left = -controller.getGame().getField().getSize().getWidth()/2 + controller.getGame().getField().getPosition().getX() + SIZE.getWidth()/2;
		right = controller.getGame().getField().getSize().getWidth()/2 + controller.getGame().getField().getPosition().getX() - SIZE.getWidth()/2;
		
		top = controller.getGame().getField().getSize().getHeight()/2 + controller.getGame().getField().getPosition().getY() - SIZE.getHeight()/2;
		bottom = -controller.getGame().getField().getSize().getHeight()/2 + controller.getGame().getField().getPosition().getY() + SIZE.getHeight()/2;
		
		/* Target update to cursor position. */
		
		double fieldWidth = controller.getGame().getField().getSize().getWidth();
		double fieldHeight = controller.getGame().getField().getSize().getHeight();
		
		double sceneWidth = controller.getGame().getScene().getWidth();
		double sceneHeight = controller.getGame().getScene().getHeight();
				
		switch(tag)
		{
			case "p1": position = Tag.P1.getPosition(); this.tag = Tag.P1; break;
			case "p2": position = Tag.P2.getPosition(); this.tag = Tag.P2; break;
			default: position = Tag.P1.getPosition();
		}

		if(this.tag == Tag.P1)
			controller.getGame().getScene().setOnMouseMoved(e -> {
				double cursorX = e.getSceneX() - controller.getGame().getScene().getWidth()/2;
				double cursorY = e.getSceneY() - controller.getGame().getScene().getHeight()/2;
				
				instantTarget = new Point3D((int)(fieldWidth * cursorX / sceneWidth), (int)(fieldHeight * cursorY / sceneHeight), 0);
			});
	}
	
	/** @return The player size. */
	public Dimension3D getSize() { return SIZE; }
	
	/** @return The player position. */
	public Point3D getPosition() { return position; }
	
	/**
	 * Updates the position of the player, based on the target position.
	 * 
	 * @return The new updated player position.
	 */
	public Point3D updatePosition()
	{	
		if(tag == Tag.P1)
			target = instantTarget;
		
		double l = target.getX() - position.getX();
		double m = target.getY() - position.getY();
		double k;
		
		double x, y;
		
		if(Math.abs(m) > speed || Math.abs(l) > speed)
		{
			k = speed/Math.sqrt(m*m + l*l);
			
			x = l*k + position.getX();
			y = m*k + position.getY();
						
		}
		else
		{
			x = target.getX();
			y = target.getY();
		}
		
		if(x > right) { x = right; }
		if(x < left) { x = left; }
		
		if(y > top) { y = top; }
		if(y < bottom) { y = bottom; }
		
		position = new Point3D(x, y, tag.getPosition().getZ());
		
		return position;
	}
}
