package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.MyWindow;
import View.ProzorObrisiEntitet;

public class ProzorObrisiKontroler extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent e) {
		int index=MyWindow.getInstance().getCentralniPanel().getTabbedPane().getSelectedIndex();
		if( index==2) 
		{
			int ind=MyWindow.getInstance().getCentralniPanel().getTblPredmeti().getSelectedRow();
			if(ind>=0) 
			{
				
				ProzorObrisiEntitet.getInstance("predmet").show();
				
			}
			
		}
		
		
		
	}
	
	public ProzorObrisiKontroler()
	{
		super("Obrisi");
	}

}
