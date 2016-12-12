package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import application.MainForm;
import view.GamePanel;
/**
 * Controller class for the MainMenu 
 * 
 * @author Manuel Gallina
 * @author Giosu� Filippini
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
			//modalit� single player
			MainForm.setFrame(new GamePanel().getFxPanel());
			
		}
		
		if(btnType == BtnType.MULTIPLAYER) {
			//modalit� mutliplayer
		}
		
		if(btnType == BtnType.QUIT) {
			//exit
		}
		
	}

}
