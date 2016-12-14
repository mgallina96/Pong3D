package model.elements;

import javafx.geometry.Point3D;
import utility.graphics.graphicobject.Object3D;

/**
 * Basic game element with a position in 3D space.
 * 
 * @author Manuel Gallina
 * @author Giosuè Filippini
 */
public class GameElement 
{
	private Point3D position;
	private Object3D parent;

	/**
	 * Constructor for 3D elements.
	 * 
	 * @param position The position of the element.
	 */
	public GameElement(Point3D position)
	{
		this.position = position;
		
		parent = new Object3D();
		parent.setPosition(position.getX(), position.getY(), position.getZ());
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
	
	/** @return The parent Transform. */
	public Object3D getParent() { return parent; }

	/** @param parent The parent Transform to set. */
	public void setParent(Object3D parent) { this.parent = parent; }
}
