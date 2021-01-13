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
				
					int ind=MyWindow.getInstance().getCentralniPanel().getTblStudenti().getSelectedRow();
					if(ind>=0)
					{
						MyWindow.getInstance().getCentralniPanel().getDtmStudenti().removeRow(ind);
						MyWindow.getInstance().getModel().getStudenti().remove(ind);
					}
					
				}
				else if(index==1)
				{
					int i=MyWindow.getInstance().getCentralniPanel().getTblProfesori().getSelectedRow();
					if(index>=0)
					{
						MyWindow.getInstance().getCentralniPanel().getDtmProfesori().removeRow(index);
						MyWindow.getInstance().getModel().getProfesori().remove(i);

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
