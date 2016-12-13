package model.objects;

import javafx.geometry.Point3D;
import javafx.scene.shape.Box;

public class Field extends GameElement
{
	public Field()
	{
		super(new Point3D(0,0,0));
		getParent().getChildren().add(new Box(800,800,800));
	}
}
