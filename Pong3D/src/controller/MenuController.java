package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;

import application.Main;
import application.Settings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import model.GameModel;
import model.elements.GameElement;
import model.elements.gameelements.Ball;
import model.elements.gameelements.Field;
import utility.graphics.GenericFXPanel;
import view.gamepanel.GamePanel;

/**
 * Controller class for the singlePlayer menu. 
 * 
 * @author Manuel Gallina
 * @author Giosuè Filippini
 *
 */
public class MenuController implements Initializable 
{		

	private List<GameElement> players = new ArrayList<>();
	
	@FXML private Button singlePlayer;
	@FXML private Button multiplayer;
	@FXML private Button quit;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		singlePlayer.setOnAction(e -> { 
			Main.LOG.log(Level.INFO, "Game Panel");
			Main.setStartScene(new GameController(players).getPanel().getScene());
	    });
		
		quit.setOnAction(e -> {
			Main.LOG.log(Level.INFO, "Exit");
			Main.getStage().close();
		});
	}
}
