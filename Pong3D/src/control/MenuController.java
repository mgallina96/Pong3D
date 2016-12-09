package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Controller class for the MainMenu 
 * 
 * @author Manuel Gallina
 * @author Giosuè Filippini
 *
 */
public class MenuController implements ActionListener {
	
	public enum BtnType { SINGLE_PLAYER, MULTIPLAYER, QUIT};
	
	private BtnType btnType;
	
	public MenuController(BtnType _btnType) 
	{
		this.btnType = _btnType;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) //implementazione provvisoria
	{
		
		if(btnType == BtnType.SINGLE_PLAYER) {
			//modalità single player
		}
		
		if(btnType == BtnType.MULTIPLAYER) {
			//modalità mutliplayer
		}
		
		if(btnType == BtnType.QUIT) {
			//exit
		}
		
	}

}
