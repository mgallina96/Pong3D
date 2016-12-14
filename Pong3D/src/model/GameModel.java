package model;

import java.util.List;

import model.elements.gameelements.*;
import model.elements.*;

/**
 * This class is the model core of the game.
 * 
 * It implements all the methods used to detect collisions between objects and update their state and location.
 * 
 * @author Manuel Gallina
 * @author Giosuè Filippini
 */
public class GameModel 
{
	private List<GameElement> players;
	private Ball ball;
	private Field field;
		
	/**
	 * Default constructor.
	 * 
	 * @param players The players of the game.
	 */
	public GameModel(List<GameElement> players, Field field, Ball ball)
	{
		this.setPlayers(players);
		
		this.setField(field);
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

	/** @return The field. */
	public Field getField() { return field;	}

	/** @param field The field to set. */
	public void setField(Field field) {	this.field = field;	}

	/**
	 * This method updates the state of all the objects in this game.
	 */
	public void update()
	{
		//TODO
	}
}
