package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import model.Game;

/**
 * Controller class for the main menu of the game.
 * 
 * @author Manuel Gallina
 * @author Giosuè Filippini
 */
public class MainController implements MouseMotionListener
{
	private Game game;
	
	/**
	 * Default constructor
	 * 
	 * @param game The game played.
	 */
	public MainController(Game game)
	{
		this.game = game;
	}
	
	/** @return The game. */
	public Game getGame() { return game; }

	/** @param game The game to set. */
	public void setGame(Game game) { this.game = game; }

	@Override
	public void mouseMoved(MouseEvent arg0) 
	{
		game.update();
	}

	@Override
	public void mouseDragged(MouseEvent arg0) { /* Unused. */ }
}
