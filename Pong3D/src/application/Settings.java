package application;

import java.awt.Dimension;

import javafx.geometry.Point3D;

/**
 * A {@code static} class with a list of {@code public} constants for the project.
 * 
 * @author Manuel Gallina
 * @author Giosuè Filippini
 */
public class Settings 
{
	/** The starting position of the Player_1 object. */
	public static final Point3D P1_START_POS = null;
	
	/** The starting position of the Player_2 object. */
	public static final Point3D P2_START_POS = null;
	
	/** The starting position of the CPU object. */
	public static final Point3D CPU_START_POS = null;
	
	/** The default starting score of all the players. */
	public static final int START_SCORE = 0;
	
	/** The dimensions of the player. The player is made of an image on the plane, so only width and height are needed. */
	public static final Dimension PLAYER_DIMENSION = null;
	
	/** The dimensions of the field, expressed as [x, y, z] array of coordinates. */
	public static final Dimension FIELD_SIZE = null;
	
	private Settings(){}
}
