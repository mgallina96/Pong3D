package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javafx.geometry.Point3D;
import javafx.scene.shape.Shape3D;
import model.elements.GameElement;
import model.elements.gameelements.Player;
import view.gameelementsview.GameElementView;
import view.gameelementsview.PlayerView;

/**
 * Controller Class for the player
 * 
 * @author Manuel Gallina
 * @author Giosuè Filippini
 *
 */
public class PlayerController //implements MouseMotionListener
{
	/** The starting position of the Player_1 object. */
	public static final Point3D P1_START_POS = new Point3D(0,0,-500);
	
	/** The starting position of the Player_2 object. */
	public static final Point3D P2_START_POS = new Point3D(0,0,500);
	
	/** The starting position of the CPU object. */
	public static final Point3D CPU_START_POS = P2_START_POS;
	
	
	
	private Player player;
	private PlayerView playerView;
	
	/**
	 * The possible player ids.
	 * 
	 * Every id corresponds to a starting state.
	 *  
	 * @author Manuel Gallina
	 * @author Giosuè Filippini
	 */
	public enum Id 
	{
		P1(P1_START_POS), P2(P2_START_POS), CPU(CPU_START_POS);
		
		private Point3D position;
		
		private Id(Point3D position)
		{
			this.position = position;
		}
	}
	
	/**
	 * Constructor 
	 * 
	 * @param id The ID of the player
	 */
	public PlayerController(Id id)
	{
		this.player = new Player(id.position);
		this.playerView = new PlayerView();
		
		this.playerView.setParentPosition(id.position); //collega posizione del model alla rappresentazione della view.
		
		
	}

	/*@Override
	public void mouseDragged(MouseEvent e) {
		// unused
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		
	}*/
	
	public void move(double x, double y) 
	{
		
	}
	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @return the player's view
	 */
	public PlayerView getPlayerView() {
		return playerView;
	}
	
	
	
	
	

}
