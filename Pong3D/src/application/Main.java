package application;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;

import view.MainMenu;
import java.awt.FlowLayout;

/**
 * Pong3D Project.
 * 
 * Main class.
 * 
 * @author Manuel Gallina
 * @author Giosuè Filippini
 */
public class Main 
{
	private static Dimension frameRes = new Dimension(1600, 900);
	private static JFrame frame;
	
	/**
	 * Main method for the Pong3D project.
	 * 
	 * @param args The console parameters.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					initialize();
					Main.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/* Initialize the contents of the frame. */
	private static void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, Main.frameRes.width, Main.frameRes.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		MainMenu paintArea = new MainMenu();
			paintArea.setBounds(0, 246, 697, 329);
			paintArea.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		frame.getContentPane().add(paintArea);
	}

	/**
	 * Sets the panel to show in the frame.
	 * 
	 * @param pane The panel to set.
	 */
	public static void setFrame(Container pane)
	{
		frame.setContentPane(pane);
	}
	
}
