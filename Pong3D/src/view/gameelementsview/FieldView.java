package view.gameelementsview;

import javafx.scene.AmbientLight;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Shape3D;
import utility.geometry.geometry3d.Dimension3D;
/**
 * /**
 * Class that represents the field's view
 * 
 * @author Manuel Gallina
 * @author Giosuè Filippini
 *
 */ 
public class FieldView extends GameElementView
{
	/* The dimensions of the field. */
	private static final Dimension3D DIMENSION = new Dimension3D(400.0, 400.0, 1000.0);
	
	/* The field shape. */
	private Shape3D shape = new Box(DIMENSION.getWidth(), DIMENSION.getHeight(), DIMENSION.getDepth());
	
	private PhongMaterial material = new PhongMaterial(Color.BLUEVIOLET);
	
	private AmbientLight centerLight = new AmbientLight();
	
	/**
	 * Default Constructor
	 */
	public FieldView()
	{
		super();
		
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
