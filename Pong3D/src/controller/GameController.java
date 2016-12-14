package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.List;

import model.GameModel;
import model.elements.gameelements.Ball;
import model.elements.gameelements.Field;
import model.elements.GameElement;
import view.gamepanel.GamePanel;

/**
 * Controller class for the game panel.
 * 
 * @author Manuel Gallina
 * @author Giosuè Filippini
 */
public class GameController implements MouseMotionListener
{
	private GameModel game;
	private GamePanel panel;
	
	private List<GameElement> players;
	private Ball ball = new Ball();
	private Field field = new Field();
		
	/**
	 * Default constructor
	 * 
	 * @param game The game played.
	 */
	public GameController(List<GameElement> players)
	{
		this.game = new GameModel(players, field, ball);
//		this.panel = new GamePanel(players, field, ball);
	}
	
	/** @return The game. */
	public GameModel getGame() { return game; }

	/** @param game The game to set. */
	public void setGame(GameModel game) { this.game = game; }

	@Override
	public void mouseMoved(MouseEvent arg0) 
	{
		game.update();
	}
	
	@Override
	public void mouseDragged(MouseEvent arg0) { /* Unused. */ }
}
