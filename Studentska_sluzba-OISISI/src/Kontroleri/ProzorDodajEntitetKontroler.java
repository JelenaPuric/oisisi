package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.ProzorDodajProfesora;
import View.MyWindow;

public class ProzorDodajEntitetKontroler extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		int index=MyWindow.getInstance().getCentralniPanel().getTabbedPane().getSelectedIndex();
		 if(index==1) 
		{
			ProzorDodajProfesora.getInstance().show();
			
		}
		
		
	}
	
	public ProzorDodajEntitetKontroler()
	{
		 
		super("Dodaj");
	}

}
