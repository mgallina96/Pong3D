package controller;

import javafx.concurrent.ScheduledService;
import javafx.concurrent.Task;
import javafx.scene.Group;
import javafx.util.Duration;
import model.PlayerModel;
import view.PlayerView;

/**
 * The player controller.
 *  
 * @author Manuel Gallina
 */
public class Player
{
	private PlayerModel model;
	private PlayerView view;
	private Game game;
	
	/* 
	 * Task associated to the player service. 
	 * It updates the player position as defined by the player model, then calls the renderer to refresh the view. 
	 */
	private class Updater extends Task<Object>
	{
		@Override
		protected Object call() throws Exception {
			model.updatePosition();
			return null;
		}
	}
		
	/**
	 * Constructor.
	 * 
	 * @param game The current game.
	 * @param tag The player tag. It's used to define the player position.
	 * @param root The rendering group of the current scene.
	 */
	public Player(Game game, String tag, Group root)
	{
		this.game = game;
		
		model = new PlayerModel(this, tag);
		view = new PlayerView(model.getSize(), model.getPosition(), root);
		
		ScheduledService<Object> playerService = new ScheduledService<Object>() {
			
			@Override
			protected Task<Object> createTask() {
				return new Updater();
			}
		};
		playerService.setDelay(Duration.ZERO);
		playerService.setPeriod(Duration.millis(15));
		playerService.setOnSucceeded(e -> {
			Renderer.refresh(view, model.getPosition());
		});
		playerService.setRestartOnFailure(true);
		playerService.start();
	}
	
	/** @return The current game. */
	public Game getGame() { return game; }
}
