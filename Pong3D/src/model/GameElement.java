package model;

import javafx.geometry.Point3D;

/**
 * Basic game element with a position in 3D space.
 * 
 * @author Manuel Gallina
 * @author Giosu� Filippini
 */
public class GameElement 
{
	private Point3D position;

	/**
	 * Default constructor.
	 * 
	 * @param position The position of the element.
	 */
	public GameElement(Point3D position)
	{
		this.position = position;
	}
	
	/**
	 * Constructor.
	 * 
	 * @param x The X coord.
	 * @param y The Y coord.
	 * @param z The Z coord.
	 */
	public GameElement(double x, double y, double z)
	{
		this.position = new Point3D(x, y, z);
	}
	
	/** @return The element position. */
	public Point3D getPosition() { return position;	}

	/** @param position The position to set. */
	public void setPosition(Point3D position) {	this.position = position; }
}
