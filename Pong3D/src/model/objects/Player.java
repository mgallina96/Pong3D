package model.objects;

import java.awt.Dimension;

import application.Settings;
import javafx.geometry.Point3D;
import javafx.scene.shape.Box;
import javafx.scene.shape.Shape3D;
import model.objects.GameElement;

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
		P1(Settings.P1_START_POS), P2(Settings.P2_START_POS), CPU(Settings.CPU_START_POS);
		
		private Point3D position;
		
		private Id(Point3D position)
		{
			this.position = position;
		}
	}
	
	private Id id;
	private int score;
	private Dimension dimension; //TODO
	private Shape3D shape = new Box(100, 100, 10);
	
	/**
	 * Default constructor.
	 * 
	 * @param id The player Id.
	 */
	public Player(Id id)
	{
		super(id.position);
		
		getParent().getChildren().add(shape);
		
		this.setId(id);
		this.score = Settings.START_SCORE;
		this.dimension = Settings.PLAYER_DIMENSION;
	}

	/** @return The player Id. */
	public Id getId() {	return id; }

	/** @param id The id to set. */
	public void setId(Id id) { this.id = id; }

	/** @return The player score. */
	public int getScore() { return score; }

	/** @param score The score to set. */
	public void setScore(int score) { this.score = score; }

	/** @return The dimension. */
	public Dimension getDimension() { return dimension; }

	/** @param dimension The dimension to set. */
	public void setDimension(Dimension dimension) { this.dimension = dimension;	}
}
