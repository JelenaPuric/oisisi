package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import Model.Predmet;
import Model.Student;
import View.MyWindow;
import View.ProzorIzmenaStudenta;
import View.UklanjanjePredmetaStudentu;


public class PotvrdiUklanjanjePredmetaStudentuKontroler extends AbstractAction {
	
	public PotvrdiUklanjanjePredmetaStudentuKontroler()
	{
		super("Da");
		
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int index=ProzorIzmenaStudenta.getInstance().getNepolozeniPanel().getTblNepolozeni().getSelectedRow();
		int indStud=MyWindow.getInstance().getCentralniPanel().getTblStudenti().getSelectedRow();
		Student s= MyWindow.getInstance().getModel().getStudenti().get(indStud);
		if(index!=-1) 
		{
			String sifra=(String) ProzorIzmenaStudenta.getInstance().getNepolozeniPanel().getDtmNepolozeni().getValueAt(index, 0);
			for(int i=0; i<s.getNepolozeniPredmeti().size(); i++) 
			{
				Predmet p= s.getNepolozeniPredmeti().get(i);
				if(p.getSifraPredmeta().equals(sifra)) 
				{
					s.getNepolozeniPredmeti().remove(i);
					break;
				}
			}
			ProzorIzmenaStudenta.getInstance().getNepolozeniPanel().getDtmNepolozeni().removeRow(index);
			UklanjanjePredmetaStudentu.getInstance().dispose();
			
		}
	}


}

