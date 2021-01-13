package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import File.Configuartion;
import View.MyWindow;
import View.ProzorObrisiEntitet;

public class ProzorObrisiKontroler extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent e) {
		int index=MyWindow.getInstance().getCentralniPanel().getTabbedPane().getSelectedIndex();
		if(index==0)
		{
			int ind=MyWindow.getInstance().getCentralniPanel().getTblStudenti().getSelectedRow();
			if(ind>=0) 
			{
				
				ProzorObrisiEntitet.getInstance("studenta").show();
				
			}	
		}
		else if(index==1)
		{
			int ind=MyWindow.getInstance().getCentralniPanel().getTblProfesori().getSelectedRow();
			if(ind>=0) 
			{
				
				ProzorObrisiEntitet.getInstance("profesora").show();
				
			}	
		}
		
		
		else 
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
		super("",Configuartion.deleteIcon);
	}

}
