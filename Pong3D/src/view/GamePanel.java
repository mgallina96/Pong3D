package view;

import java.util.List;

import javax.swing.JPanel;

import application.Main;
import javafx.embed.swing.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import model.objects.Ball;
import model.objects.Field;
import model.objects.GameElement;
import view.graphichandler.View;

@SuppressWarnings("serial")
public class GamePanel extends JPanel 
{
	private JFXPanel fxPanel = new JFXPanel();
	private Group root = new Group();
	private View view = new View(root);
	private Scene scene = new Scene(root, 1024, 768, true);
	
	private List<GameElement> players;
	private Ball ball = new Ball();
	
	/**
	 * Create the panel.
	 */
	public GamePanel(List<GameElement> players) 
	{
		createScene();
		fxPanel.setScene(scene);
		Main.setFrame(this.fxPanel);
	}
	
	private void createScene() 
	{
		scene.setFill(Color.CORAL);
		scene.setCamera(view.getCamera());
		root.getChildren().add(new Field().getParent());
	}
	
	public JFXPanel getFxPanel()
	{
		return fxPanel;
	}
}
