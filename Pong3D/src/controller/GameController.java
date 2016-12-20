package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.List;

import model.GameModel;
import model.elements.gameelements.Ball;
import model.elements.gameelements.Field;
import model.elements.gameelements.Player;

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
	
	private List<Player> players;
	private List<PlayerView> playersView;
	private PlayerController player1= new PlayerController(PlayerController.Id.P1);
	private PlayerController player2= new PlayerController(PlayerController.Id.P2);
	private BallController ball = new BallController();
	private FieldView field = new FieldView();
	
		
	/**
	 * Default constructor
	 * 
	 * @param game The game played.
	 */
	/*public GameController(List<PlayerController> playersController)
	{
		playersController.add(0, new PlayerController(PlayerController.Id.P1)); //caos, implementazione temporanea non funzionante
		playersController.add(1, new PlayerController(PlayerController.Id.CPU));
		
		this.players.add(playersController.get(0).getPlayer());
		this.players.add(playersController.get(1).getPlayer());
		
		this.playersView.add(playersController.get(0).getPlayerView());
		this.playersView.add(playersController.get(1).getPlayerView());
		
		this.game = new GameModel(players, ball.getBall());
		this.panel = new GamePanel(playersView, field, ball.getBallView()); 	
	}*/
	
	public GameController()
	{
		players.add(player1.getPlayer());
		players.add(player2.getPlayer());
		playersView.add(player1.getPlayerView());
		playersView.add(player1.getPlayerView());
		this.game = new GameModel(players, ball.getBall());
		this.panel = new GamePanel(playersView, field, ball.getBallView()); 
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
