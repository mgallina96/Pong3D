package view.gameelementsview;

import utility.graphics.graphicobject.Object3D;

public class GameElementView 
{
	
	Object3D parent;

	public GameElementView()
	{
		this.parent= new Object3D();
	}
	
	public Object3D getParent() 
	{
		return parent;
	}

	public void setParent(Object3D parent) 
	{
		this.parent = parent;
	}

}
