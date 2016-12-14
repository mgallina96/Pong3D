package model.elements.gameelements;

import javafx.geometry.Point3D;
import javafx.scene.shape.Box;
import javafx.scene.shape.Shape3D;
import model.elements.GameElement;
import utility.geometry.geometry3d.*;

/**
 * Class that represents the player object in the game.
 * 
 * @see {@link model.objects.GameElement}.
 * 
 * @author Manuel Gallina
 * @author Giosuè Filippini
 */
public class Player extends GameElement
{
	/** The starting position of the Player_1 object. */
	public static final Point3D P1_START_POS = null;
	
	/** The starting position of the Player_2 object. */
	public static final Point3D P2_START_POS = null;
	
	/** The starting position of the CPU object. */
	public static final Point3D CPU_START_POS = null;
	
	/** The default starting score of all the players. */
	public static final int START_SCORE = 0;
	
	/** The dimensions of the player. */
	public static final Dimension3D PLAYER_DIMENSION = new Dimension3D(100.0, 100.0, 100.0);;
	
	/**
	 * The possible player ids.
	 * 
	 * Every id corresponds to a starting state.
	 *  
	 * @author Manuel Gallina
	 * @author Giosuè Filippini
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
	private Shape3D shape;
	
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
		this.shape = new Box(PLAYER_DIMENSION.getWidth(), PLAYER_DIMENSION.getHeight(), PLAYER_DIMENSION.getDepth());
		
		getParent().getChildren().add(shape);
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
