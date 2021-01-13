package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import File.ReadWrite;
import View.MyWindow;
import View.ProzorObrisiEntitet;

public class PotvrdiBrisanjeKontroler extends AbstractAction {
	
	public PotvrdiBrisanjeKontroler()
	{
	    super("Da");	
	}
		
		  public void actionPerformed(ActionEvent arg0) {
				
			  int index;
			  index=MyWindow.getInstance().getCentralniPanel().getTabbedPane().getSelectedIndex();
				
				if(index==0) 
				{
				
					MyWindow.getInstance().getCentralniPanel().getTblStudenti().getSelectedRow();
					if(index>=0)
					{
						MyWindow.getInstance().getCentralniPanel().getDtmStudenti().removeRow(index);
					}
					
				}
				else if(index==1)
				{
					MyWindow.getInstance().getCentralniPanel().getTblProfesori().getSelectedRow();
					if(index>=0)
					{
						MyWindow.getInstance().getCentralniPanel().getDtmProfesori().removeRow(index);
					}
				}
				else 
				{
					int ind=MyWindow.getInstance().getCentralniPanel().getTblPredmeti().getSelectedRow();
					if(ind>=0) 
					{
						
						MyWindow.getInstance().getCentralniPanel().getDtmPredmeti().removeRow(ind);
						MyWindow.getInstance().getModel().getPredmeti().remove(ind);
					}
				}
				ProzorObrisiEntitet.getInstance(" ").dispose();
				ProzorObrisiEntitet.setInstance(null);
			}
		
	

  
}
