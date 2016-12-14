package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.List;

import model.Game;
import model.objects.Ball;
import model.objects.Field;
import model.objects.GameElement;
import view.GamePanel;

/**
 * Controller class for the game panel.
 * 
 * @author Manuel Gallina
 * @author Giosu� Filippini
 */
public class GameController implements MouseMotionListener
{
	private Game game;
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
		this.game = new Game(players, field, ball);
		this.panel = new GamePanel(players, field, ball);
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
