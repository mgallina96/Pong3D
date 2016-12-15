package view.gamepanel;

import java.util.List;

import application.Main;
import application.Settings;
import javafx.embed.swing.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import model.elements.gameelements.*;
import model.elements.GameElement;
import controller.graphichandler.View;

public class GamePanel
{
	private Group root = new Group();
	private View view = new View(root);
	private Scene scene = new Scene(root, Settings.FRAME_RESOLUTION.getWidth(), Settings.FRAME_RESOLUTION.getHeight(), true);
	
	private List<GameElement> players;
	private Ball ball;
	private Field field;
	
	/**
	 * Create the panel.
	 */
	public GamePanel(List<GameElement> players, Field field, Ball ball) 
	{

//		Main.setFrame(this.fxPanel);
		
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
	}
	
	public Scene getScene() 
	{
		return this.scene;
	}
	

}
