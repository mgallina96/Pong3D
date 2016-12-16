package view.gamepanel;

import java.util.List;

import application.Main;
import application.Settings;
import javafx.embed.swing.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import model.elements.gameelements.*;
import view.gameelementsview.BallView;
import view.gameelementsview.FieldView;
import view.gameelementsview.GameElementView;
import model.elements.GameElement;
import controller.graphichandler.View;

public class GamePanel
{
	private Group root = new Group();
	private View view = new View(root);
	private Scene scene = new Scene(root, Settings.FRAME_RESOLUTION.getWidth(), Settings.FRAME_RESOLUTION.getHeight(), true);
	
	private List<GameElementView> players;
	private BallView ball;
	private FieldView field;
	
	/**
	 * Create the panel.
	 */
	public GamePanel(List<GameElementView> players, FieldView field, BallView ball) 
	{

		this.players = players;
		
		this.field = field;
		this.ball = ball;
		
		createScene();
	}
	
	private void createScene() 
	{
		scene.setFill(Color.CORAL);
		scene.setCamera(view.getCamera());
		root.getChildren().add(field.getParent());
		root.getChildren().add(ball.getParent());
		
		for(GameElementView e : players)
		{
			root.getChildren().add(e.getParent());
		}
	}
	
	public Scene getScene() 
	{
		return this.scene;
	}
	

}
