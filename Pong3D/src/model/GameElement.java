package model;

import javafx.geometry.Point3D;

public class GameElement 
{
	private Point3D position;

	public GameElement(Point3D _position)
	{
		this.position = _position;
	}
	
	public GameElement(double x, double y, double z)
	{
		this.position = new Point3D(x, y, z);
	}
	
	/**
	 * @return the position
	 */
	public Point3D getPosition() 
	{
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(Point3D position) 
	{
		this.position = position;
	}
}
