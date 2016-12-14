package model.elements.gameelements;

import utility.geometry.geometry3d.Dimension3D;
import javafx.geometry.Point3D;
import javafx.scene.shape.Box;
import javafx.scene.shape.Shape3D;
import model.elements.GameElement;

/**
 * Class that represents the game field.
 * 
 * @author Manuel Gallina
 */
public class Field extends GameElement
{
	/* The dimensions of the field. */
	private static final Dimension3D DIMENSION = new Dimension3D(800.0, 800.0, 800.0);
	
	/* The field shape. */
	private static final Shape3D SHAPE = new Box(DIMENSION.getWidth(), DIMENSION.getHeight(), DIMENSION.getDepth());;
	
	/**
	 * Default constructor.
	 */
	public Field()
	{
		super(new Point3D(0,0,0));		
		getParent().getChildren().add(SHAPE);
	}

	/** @return The size of the field. */
	public static Dimension3D getFieldSize() { return DIMENSION; }
	
	/** @return The shape of the field. */
	public static Shape3D getShape() { return SHAPE; }
}
