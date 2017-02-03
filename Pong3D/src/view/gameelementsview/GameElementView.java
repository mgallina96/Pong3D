package view.gameelementsview;

import javafx.geometry.Point3D;
import utility.graphics.graphicobject.Object3D;
/**
 * Class that represents the view of a generic Game element
 * 
 * @author Manuel Gallina
 * @author Giosuè Filippini
 *
 */
public class GameElementView 
{
	
	Object3D parent;
	
	/**
	 * Default constructor
	 */
	public GameElementView()
	{
		this.parent= new Object3D();
	}
	
	/** 
	 * @return the parent
	 */
	public Object3D getParent() 
	{
		return parent;
	}
	
	/**
	 * @param parent the parent to set
	 */
	public void setParent(Object3D parent) 
	{
		this.parent = parent;
	}
	
	/**
	 * @param position the parent position to set
	 */
	public void setParentPosition(Point3D position)
	{
		this.parent.setPosition(position.getX(), position.getY(), position.getZ());
	}

}
