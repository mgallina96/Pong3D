package controller;

import application.Settings;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import utility.geometry.geometry3d.Dimension3D;
import view.View;

/**
 * The game panel.
 * 
 * @author Manuel Gallina
 */
public class Game 
{
	private Field field;
	private Ball ball;
	private Player player1;
	private Player player2;
	
	private Scene scene;
	
	/**
	 * Constructor.
	 * 
	 * @param window The window.
	 */
	public Game(Stage window)
	{
		Group root = new Group();
		
		scene = new Scene(root, Settings.RESOLUTION.getWidth(), Settings.RESOLUTION.getHeight(), true, SceneAntialiasing.BALANCED);
		
		field = new Field(new Dimension3D(400, 400, 800), new Point3D(0, 0, 0), root);
		ball = new Ball(this, root);
		player1 = new Player(this, "p1", root);
		player2 = new Player(this, "p2", root);
		
		scene.setFill(Color.BLACK);
		scene.setCamera(new View(root).getCamera());
		window.setScene(scene);
	}

	/** @return The field. */
	public Field getField() { return field;	}
	
	/** @return The ball. */
	public Ball getBall() { return ball; }
	
	/** @return The player 1. */
	public Player getPlayer1() { return player1; }
	
	/** @return The player 2. */
	public Player getPlayer2() { return player2; }
	
	/** @return The scene. */
	public Scene getScene() { return scene; }
}
