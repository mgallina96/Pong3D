package view;

import javafx.geometry.Point3D;

/**
 * This interface provides a method to move a graphic object to a point in the space.
 * 
 * @author Manuel Gallina
 */
public interface MovingObject 
{
	/**
	 * Moves the object to this position.
	 * 
	 * @param position The position to move to.
	 */
	public abstract void moveTo(Point3D position);
}
