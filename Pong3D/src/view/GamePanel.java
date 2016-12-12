package view;



import javax.swing.JPanel;
import javafx.embed.swing.*;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Translate;

public class GamePanel extends JPanel {

	private JFXPanel fxPanel = new JFXPanel();
	private PerspectiveCamera camera = new PerspectiveCamera();
	private Group root = new Group();
	//private Object3D field = new Object3D(); //classe da creare
	private Translate pivot = new Translate(0, 0, 0);
	
	/**
	 * Create the panel.
	 */
	public GamePanel() 
	{
		Scene scene = createScene();
		fxPanel.setScene(scene);
	}
	
	private Scene createScene() {
		Scene scene =  new Scene(root, 1024, 768, true);
		scene.setFill(Color.CORAL);
		
		buildCamera();
		scene.setCamera(camera);
		
		
		//root.getChildren().add();
		
		
		
		
		return scene;
	}
	
	public JFXPanel getFxPanel()
	{
		return fxPanel;
	}
	
	private void buildCamera() 
	{
		root.getChildren().add(camera);
	}
	
	

}
