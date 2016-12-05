package view;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Font;

/**
 * The main menu panel.
 * 
 * @author Manuel Gallina
 * @author Giosuè Filippini
 */
@SuppressWarnings("serial")
public class MainMenu extends JPanel 
{
	// The main menu buttons font.
	private static final Font BUTTON_FONT = new Font("Tahoma", Font.PLAIN, 35);
	
	// The main menu buttons dimension.
	private static final Dimension BUTTON_DIMENSION = new Dimension(200, 50);
	
	/**
	 * Constructor.
	 */
	public MainMenu() 
	{
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton singlePlayer = new JButton("Single Player");
			singlePlayer.setPreferredSize(BUTTON_DIMENSION);
			singlePlayer.setFont(BUTTON_FONT);
			singlePlayer.setAlignmentX(0.5f);
			add(singlePlayer);
			
		JButton multiplayer = new JButton("Multiplayer");
			multiplayer.setPreferredSize(BUTTON_DIMENSION);
			multiplayer.setFont(BUTTON_FONT);
			multiplayer.setAlignmentX(0.5f);
			add(multiplayer);
			
		JButton quit = new JButton("Quit");
			quit.setPreferredSize(BUTTON_DIMENSION);
			quit.setFont(BUTTON_FONT);
			quit.setAlignmentX(0.5f);
			add(quit);
	}
}
