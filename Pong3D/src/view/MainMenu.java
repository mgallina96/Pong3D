package view;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JTable;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MainMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public MainMenu() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton singlePlayer = new JButton("Single Player");
		singlePlayer.setPreferredSize(new Dimension(200, 50));
		singlePlayer.setFont(new Font("Tahoma", Font.PLAIN, 35));
		singlePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		add(singlePlayer);
		
		JButton multiplayer = new JButton("Multiplayer");
		multiplayer.setPreferredSize(new Dimension(200, 50));
		multiplayer.setFont(new Font("Tahoma", Font.PLAIN, 35));
		multiplayer.setAlignmentX(0.5f);
		add(multiplayer);
		
		JButton quit = new JButton("Quit");
		quit.setPreferredSize(new Dimension(200, 50));
		quit.setFont(new Font("Tahoma", Font.PLAIN, 35));
		quit.setAlignmentX(0.5f);
		add(quit);

	}
}
