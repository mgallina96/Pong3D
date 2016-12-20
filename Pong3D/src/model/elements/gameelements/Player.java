package model.elements.gameelements;

import javafx.geometry.Point3D;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Shape3D;
import model.elements.GameElement;
import utility.geometry.geometry3d.*;

/**
 * Class that represents the player object in the game.
 * 
 * @see {@link model.GameElement.GameElement}.
 * 
 * @author Manuel Gallina
 * @author Giosuè Filippini
 */
public class Player extends GameElement
{

	
	/** The default starting score of all the players. */
	public static final int START_SCORE = 0;
	
	

	
	private int score;
	
	/**
	 * Default constructor.
	 * 
	 * @param position The position of the player.
	 */
	public Player(Point3D position)
	{
		super(position);
		
		//this.setId(id);
		this.score = START_SCORE;

	}


	/** @return The player score. */
	public int getScore() { return score; }

	/** @param score The score to set. */
	public void setScore(int score) { this.score = score; }
}
