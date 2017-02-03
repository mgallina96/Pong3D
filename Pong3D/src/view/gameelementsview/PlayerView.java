package view.gameelementsview;

import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Shape3D;
import utility.geometry.geometry3d.Dimension3D;
/**
 * Class that represents the view of a player
 * 
 * @author Manuel Gallina
 * @author Giosuè Filippini
 *
 */
public class PlayerView extends GameElementView
{
	/** The dimensions of the player. */
	public static final Dimension3D PLAYER_DIMENSION = new Dimension3D(110.0, 80.0, 10.0);;
	
	private PhongMaterial material = new PhongMaterial(Color.GREEN);
	
	private Shape3D shape;
	
	/**
	 * Default Constructor
	 */
	public PlayerView() 
	{
		super();
		
		this.shape = new Box(PLAYER_DIMENSION.getWidth(), PLAYER_DIMENSION.getHeight(), PLAYER_DIMENSION.getDepth());
		this.shape.setMaterial(material);
		this.shape.setOpacity(0.2);
		
		getParent().getChildren().add(shape);
	}
}
