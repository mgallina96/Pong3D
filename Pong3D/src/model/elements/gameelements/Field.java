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
	/**
	 * Default constructor.
	 */
	public Field()
	{
		super(new Point3D(0,0,0));
	}
}
