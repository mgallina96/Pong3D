package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import model.Game;

public class MainController implements MouseMotionListener
{
	private Game game;
	
	public MainController()
	{
		
	}
	
	/**
	 * @return the game
	 */
	public Game getGame() {
		return game;
	}

	/**
	 * @param game the game to set
	 */
	public void setGame(Game game) {
		this.game = game;
	}

	@Override
	public void mouseMoved(MouseEvent arg0) 
	{
		game.update();
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {}
}
