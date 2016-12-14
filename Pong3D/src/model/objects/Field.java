package model.objects;

import javafx.geometry.Point3D;
import javafx.scene.shape.Box;
import javafx.scene.shape.Shape3D;

public class Field extends GameElement
{
	private Shape3D shape = new Box(800,800,800);
	
	public Field()
	{
		super(new Point3D(0,0,0));
		getParent().getChildren().add(shape);
	}
}
