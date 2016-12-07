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
	// The main menu buttons dimension.
	private static final Dimension BUTTON_DIMENSION = new Dimension(200, 50);
	
	/**
	 * Constructor.
	 */
	public MainMenu() 
	{
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(10);
		panel.setPreferredSize(new Dimension(220, 200));
		add(panel);
		
		JButton singlePlayer = new JButton("Single Player");
		panel.add(singlePlayer);
			singlePlayer.setPreferredSize(BUTTON_DIMENSION);
			singlePlayer.setFont(new Font("Tahoma", Font.PLAIN, 29));
			singlePlayer.setAlignmentX(0.5f);
			
		JButton multiplayer = new JButton("Multiplayer");
		panel.add(multiplayer);
			multiplayer.setPreferredSize(BUTTON_DIMENSION);
			multiplayer.setFont(new Font("Tahoma", Font.PLAIN, 29));
			multiplayer.setAlignmentX(0.5f);
			
		JButton quit = new JButton("Quit");
		panel.add(quit);
			quit.setPreferredSize(BUTTON_DIMENSION);
			quit.setFont(new Font("Tahoma", Font.PLAIN, 29));
			quit.setAlignmentX(0.5f);
	}
}
