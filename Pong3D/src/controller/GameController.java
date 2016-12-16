package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.List;

import model.GameModel;
import model.elements.gameelements.Ball;
import model.elements.gameelements.Field;
import model.elements.gameelements.Player;
import model.elements.GameElement;
import view.gameelementsview.BallView;
import view.gameelementsview.FieldView;
import view.gameelementsview.GameElementView;
import view.gameelementsview.PlayerView;
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
	
	private List<GameElementView> playersView;
	private BallView ballView = new BallView();
	private FieldView fieldView = new FieldView();
		
	/**
	 * Default constructor
	 * 
	 * @param game The game played.
	 */
	public GameController(List<GameElement> players, List<GameElementView> playersView)
	{
		players.add(new Player(Player.Id.P1));
		players.add(new Player(Player.Id.P2));
		
		playersView.add(new PlayerView());
		playersView.add(new PlayerView());
		
		this.game = new GameModel(players, field, ball);
		this.panel = new GamePanel(playersView, fieldView, ballView);
	}
	
	/** @return The game. */
	public GameModel getGame() { return game; }

	/** @param game The game to set. */
	public void setGame(GameModel game) { this.game = game; }

	public GamePanel getPanel()
	{
		return this.panel;
	}
	
	@Override
	public void mouseMoved(MouseEvent arg0) 
	{
		game.update();
	}
	
	@Override
	public void mouseDragged(MouseEvent arg0) { /* Unused. */ }
}
