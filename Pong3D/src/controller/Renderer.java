package controller;

import javafx.geometry.Point3D;
import view.MovingObject;

/**
 * The renderer.
 * 
 * This class is used to update the scene whenever the game elements change their position.
 * 
 * @author Manuel Gallina
 */
public class Renderer 
{
	/**
	 * Updates the scene, moving all the objects to their actual position.
	 * 
	 * @param view The view component of the object to move.
	 * @param position The position of the object.
	 */
	public static synchronized void refresh(MovingObject view, Point3D position)
	{
		view.moveTo(position);
	}
}
