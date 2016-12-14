package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import application.Settings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import utility.graphics.GenericFXPanel;

/**
 * Controller class for the singlePlayer menu. 
 * 
 * @author Manuel Gallina
 * @author Giosuè Filippini
 *
 */
public class MenuController implements Initializable 
{		
	public static final String GAME_PANEL_FXML_PATH = "/view/gamePanel/GamePanel.fxml";
	
	@FXML private Button singlePlayer;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		singlePlayer.setOnAction(e -> { //TODO: Creare finestra di gioco. Implementazione temporanea non funzionante.
			
			AnchorPane root;
			
	        try
	        {
	            root = new GenericFXPanel(GAME_PANEL_FXML_PATH).getRoot();	            
	            Main.setStartScene(new Scene(root, Settings.FRAME_RESOLUTION.getWidth(), Settings.FRAME_RESOLUTION.getHeight()));
	        } 
	        catch (IOException exception) 
	        {
	            exception.printStackTrace();
	        }
		});
	}
}
