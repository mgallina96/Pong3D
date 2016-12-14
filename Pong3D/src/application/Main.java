package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import utility.graphics.GenericFXPanel;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Pong3D Project.
 * 
 * Main class.
 * 
 * @author Manuel Gallina
 * @author Giosuè Filippini
 */
public class Main extends Application
{
	/** The logger of the application. */
	public static final Logger LOG = Logger.getLogger(Main.class.getName());
	
	private static Scene START_SCENE;
	private static Stage STAGE;
	
	@Override
	public void start(Stage primaryStage) 
	{		
		LOG.setLevel(Level.ALL);
		
		try 
		{
			START_SCENE = new Scene(new GenericFXPanel("/view/startpanel/StartPanel.fxml").getRoot(), 
					Settings.FRAME_RESOLUTION.getWidth(), 
					Settings.FRAME_RESOLUTION.getHeight()); 
		
			STAGE = primaryStage;
			
			primaryStage.setScene(START_SCENE);
			primaryStage.show();
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Main method for the Pong3D project.
	 * 
	 * @param args The console parameters.
	 */
	public static void main(String[] args) 
	{
		launch(args);
	}
	
	/** @return The scene */
	public static Scene getStartScene() { return START_SCENE; }

	/** @param startScene The scene to set. */
	public static void setStartScene(Scene startScene) 
	{ 
		START_SCENE = startScene;
		STAGE.setScene(START_SCENE);	
	}

	/** @return The stage. */
	public static Stage getStage() { return STAGE; }
}
