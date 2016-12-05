package model;

import application.Settings;
import javafx.geometry.Point3D;

public class Game 
{
	public enum Id 
	{
		p1(Settings.P1_START_POS), p2(Settings.P2_START_POS), cpu(Settings.CPU_START_POS);
		
		private Point3D position;
		
		private Id(Point3D _position)
		{
			this.position = _position;
		}
	}
	
	public class Player extends GameElement
	{
		private Id id;
		private int score;
		private double[] dimension;
		
		public Player(Id _id)
		{
			super(_id.position);
			this.setId(_id);
			this.score = Settings.START_SCORE;
			this.dimension = Settings.PLAYER_DIMENSION;
		}

		/**
		 * @return the id
		 */
		public Id getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(Id id) {
			this.id = id;
		}

		/**
		 * @return the score
		 */
		public int getScore() {
			return score;
		}

		/**
		 * @param score the score to set
		 */
		public void setScore(int score) {
			this.score = score;
		}

		/**
		 * @return the dimension
		 */
		public double[] getDimension() {
			return dimension;
		}

		/**
		 * @param dimension the dimension to set
		 */
		public void setDimension(double[] dimension) {
			this.dimension = dimension;
		}
	}
	
	public class Ball extends GameElement
	{
		private double radius;
		private double[] speed;
		
		public Ball()
		{
			super(Settings.CENTER_POS);
			this.setRadius(Settings.BALL_RADIUS);
			this.setSpeed(Settings.BALL_SPEED);
		}

		/**
		 * @return the radius
		 */
		public double getRadius() {
			return radius;
		}

		/**
		 * @param radius the radius to set
		 */
		public void setRadius(double radius) {
			this.radius = radius;
		}

		/**
		 * @return the speed
		 */
		public double[] getSpeed() {
			return speed;
		}

		/**
		 * @param speed the speed to set
		 */
		public void setSpeed(double[] speed) {
			this.speed = speed;
		}
	}
	
	private Player[] players;
	private Ball ball;
	
	private double[] fieldSize;
	
	public Game(Player[] _players)
	{
		this.setPlayers(_players);
		this.setBall(new Ball());
		
		this.setFieldSize(Settings.FIELD_SIZE);
	}

	/**
	 * @return the players
	 */
	public Player[] getPlayers() {
		return players;
	}

	/**
	 * @param players the players to set
	 */
	public void setPlayers(Player[] players) {
		this.players = players;
	}

	/**
	 * @return the ball
	 */
	public Ball getBall() {
		return ball;
	}

	/**
	 * @param ball the ball to set
	 */
	public void setBall(Ball ball) {
		this.ball = ball;
	}

	/**
	 * @return the fieldSize
	 */
	public double[] getFieldSize() {
		return fieldSize;
	}

	/**
	 * @param fieldSize the fieldSize to set
	 */
	public void setFieldSize(double[] fieldSize) {
		this.fieldSize = fieldSize;
	}
	
	public void update()
	{
		
	}
}
