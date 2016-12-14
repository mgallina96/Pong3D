package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import model.objects.GameElement;

/**
 * Controller class for the MainMenu 
 * 
 * @author Manuel Gallina
 * @author Giosuè Filippini
 *
 */
public class MenuController implements ActionListener 
{	
	
	
	public enum BtnType { SINGLE_PLAYER, MULTIPLAYER, QUIT };
	
	private BtnType btnType;
	
	public MenuController(BtnType btnType) 
	{
		this.btnType = btnType;
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		//Implementazione provvisoria.
		switch(btnType)
		{
		case SINGLE_PLAYER: new GameController(new ArrayList<GameElement>()); break;
		case MULTIPLAYER: /* Multiplayer. */ break;
		case QUIT: /* Quit. */ break;
		}
	}
}
