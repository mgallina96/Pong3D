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
 * @see {@link model.objects.GameElement}.
 * 
 * @author Manuel Gallina
 * @author Giosu� Filippini
 */
public class Player extends GameElement
{
	/** The starting position of the Player_1 object. */
	public static final Point3D P1_START_POS = new Point3D(0,0,-500);
	
	/** The starting position of the Player_2 object. */
	public static final Point3D P2_START_POS = new Point3D(0,0,500);
	
	/** The starting position of the CPU object. */
	public static final Point3D CPU_START_POS = P2_START_POS;
	
	/** The default starting score of all the players. */
	public static final int START_SCORE = 0;
	
	
	/**
	 * The possible player ids.
	 * 
	 * Every id corresponds to a starting state.
	 *  
	 * @author Manuel Gallina
	 * @author Giosu� Filippini
	 */
	public enum Id 
	{
		P1(P1_START_POS), P2(P2_START_POS), CPU(CPU_START_POS);
		
		private Point3D position;
		
		private Id(Point3D position)
		{
			this.position = position;
		}
	}
	
	private Id id;
	private int score;
	
	/**
	 * Default constructor.
	 * 
	 * @param id The player Id.
	 */
	public Player(Id id)
	{
		super(id.position);
		
		this.setId(id);
		this.score = START_SCORE;

	}

	/** @return The player Id. */
	public Id getId() {	return id; }

	/** @param id The id to set. */
	public void setId(Id id) { this.id = id; }

	/** @return The player score. */
	public int getScore() { return score; }

	/** @param score The score to set. */
	public void setScore(int score) { this.score = score; }
}
