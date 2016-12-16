package model.elements.gameelements;

import utility.geometry.geometry3d.Dimension3D;
import javafx.geometry.Point3D;
import javafx.scene.AmbientLight;
import javafx.scene.PointLight;
import javafx.scene.effect.Effect;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.DrawMode;
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
	private static final Dimension3D DIMENSION = new Dimension3D(400.0, 400.0, 1000.0);
	
	/* The field shape. */
	private Shape3D shape = new Box(DIMENSION.getWidth(), DIMENSION.getHeight(), DIMENSION.getDepth());
	
	private PhongMaterial material = new PhongMaterial(Color.BLUEVIOLET);
	
	private AmbientLight centerLight = new AmbientLight();
	
	/**
	 * Default constructor.
	 */
	public Field()
	{
		super(new Point3D(0,0,0));
		
		shape.setMaterial(material);
		shape.setDrawMode(DrawMode.FILL);
		shape.setCullFace(CullFace.FRONT);
			
		getParent().getChildren().addAll(shape, centerLight);
	}

	/** @return The size of the field. */
	public Dimension3D getFieldSize() { return DIMENSION; }
	
	/** @return The shape of the field. */
	public Shape3D getShape() { return shape; }
}
