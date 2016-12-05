package model;

import java.awt.Dimension;

import application.Settings;
import javafx.geometry.Point3D;

/**
 * This class is the model core of the game.
 * 
 * It implements all the methods used to detect collisions between objects and update their state and location.
 * 
 * @author Manuel Gallina
 * @author Giosuè Filippini
 */
public class Game 
{
	// The speed of the ball, expressed as a 3D vector in the [x, y, z] form.
	private static final double[] BALL_SPEED = null;	
	
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
	
	/**
	 * Inner class that represents the player object in the game.
	 * 
	 * @see {@link model.GameElement}.
	 * 
	 * @author Manuel Gallina
	 * @author Giosuè Filippini
	 */
	public class Player extends GameElement
	{
		private Id id;
		private int score;
		private Dimension dimension;
		
		/**
		 * Default constructor.
		 * 
		 * @param id The player Id.
		 */
		public Player(Id id)
		{
			super(id.position);
			
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
	
	/**
	 * Inner class that represents the ball in the game.
	 * 
	 * @see {@link model.GameElement}.
	 * 
	 * @author Manuel Gallina
	 * @author Giosuè Filippini
	 */
	public class Ball extends GameElement
	{
		private double radius;
		private double[] speed;
		
		/**
		 * Default constructor.
		 */
		public Ball()
		{
			super(Settings.BALL_START_POS);
			
			this.setRadius(Settings.BALL_RADIUS);
			this.setSpeed(BALL_SPEED);
		}

		/** @return The radius of the ball. */
		public double getRadius() { return radius; }

		/** @param radius The radius to set. */
		public void setRadius(double radius) { this.radius = radius; }

		/** @return The speed of the ball. */
		public double[] getSpeed() { return speed; }

		/** @param speed The speed to set. */
		public void setSpeed(double[] speed) { this.speed = speed; }
	}
	
	private Player[] players;
	private Ball ball;
	
	private Dimension fieldDimension;
	
	/**
	 * Default constructor.
	 * 
	 * @param players The players of the game.
	 */
	public Game(Player[] players)
	{
		this.setPlayers(players);
		this.setBall(new Ball());
		
		this.setFieldDimension(Settings.FIELD_SIZE);
	}

	/** @return The players. */
	public Player[] getPlayers() { return players; }

	/** @param players The players to set. */
	public void setPlayers(Player[] players) { this.players = players; }

	/** @return The ball. */
	public Ball getBall() { return ball; }

	/** @param ball The ball to set. */
	public void setBall(Ball ball) { this.ball = ball; }

	/** @return The field's dimensions. */
	public Dimension getFieldDimension() { return fieldDimension; }

	/** @param fieldDimension The dimensions to set. */
	public void setFieldDimension(Dimension fieldDimension) { this.fieldDimension = fieldDimension; }
	
	/**
	 * This method updates the state of all the objects in this game.
	 */
	public void update()
	{
		//TODO
	}
}
