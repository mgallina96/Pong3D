package model;

import java.util.List;

import model.objects.Ball;
import model.objects.Field;
import model.objects.GameElement;

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
	private List<GameElement> players;
	private Ball ball;
	private Field field;
		
	/**
	 * Default constructor.
	 * 
	 * @param players The players of the game.
	 */
	public Game(List<GameElement> players, Field field, Ball ball)
	{
		this.setPlayers(players);
		
		this.field = field;
		this.ball = ball;
	}

	/** @return The players. */
	public List<GameElement> getPlayers() { return players; }

	/** @param players The players to set. */
	public void setPlayers(List<GameElement> players) { this.players = players; }

	/** @return The ball. */
	public Ball getBall() { return ball; }

	/** @param ball The ball to set. */
	public void setBall(Ball ball) { this.ball = ball; }

	/**
	 * This method updates the state of all the objects in this game.
	 */
	public void update()
	{
		//TODO
	}
}
