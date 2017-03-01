package controller;

import javafx.concurrent.ScheduledService;
import javafx.concurrent.Task;
import javafx.scene.Group;
import javafx.util.Duration;
import model.BallModel;
import view.BallView;

/**
 * The ball controller.
 * 
 * @author Manuel Gallina
 */
public class Ball
{
	private BallModel model;
	private BallView view;
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
	 * @param root The rendering group of the current scene.
	 */
	public Ball(Game game, Group root)
	{
		this.game = game;
		
		model = new BallModel(this);
		view = new BallView(model.getRadius(), root);
		
		ScheduledService<Object> ballService = new ScheduledService<Object>() {
			
			@Override
			protected Task<Object> createTask() {
				return new Updater();
			}
		};
		ballService.setDelay(Duration.ZERO);
		ballService.setPeriod(Duration.millis(15));
		ballService.setOnSucceeded(e -> {
			Renderer.refresh(view, model.getPosition());
		});
		ballService.setRestartOnFailure(true);
		ballService.start();	
	}
	
	/** @return The current game. */
	public Game getGame() { return game; }
}
