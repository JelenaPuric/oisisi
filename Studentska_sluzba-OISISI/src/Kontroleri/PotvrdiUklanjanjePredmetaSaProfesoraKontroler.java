package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import Model.Predmet;
import Model.Profesor;
import View.MyWindow;
import View.ProzorIzmenaProfesora;
import View.UklanjanjePredmetaSaProfesora;


public class PotvrdiUklanjanjePredmetaSaProfesoraKontroler extends AbstractAction {
	
	public PotvrdiUklanjanjePredmetaSaProfesoraKontroler()
	{
		super("Potvrdi");
		
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int index=ProzorIzmenaProfesora.getInstance().getTblPredmeti().getSelectedRow();
		int indProf=MyWindow.getInstance().getCentralniPanel().getTblProfesori().getSelectedRow();
		Profesor p= MyWindow.getInstance().getModel().getProfesori().get(indProf);
		if(index!=-1) 
		{
			String sifra=(String) ProzorIzmenaProfesora.getInstance().getDtmPredmeti().getValueAt(index, 0);
			for(int i=0; i<p.getProfNaPredmetima().size(); i++) 
			{
				Predmet pr= p.getProfNaPredmetima().get(i);
				if(pr.getSifraPredmeta().equals(sifra)) 
				{
					p.getProfNaPredmetima().remove(i);
					break;
				}
			}
			ProzorIzmenaProfesora.getInstance().getDtmPredmeti().removeRow(index);
			UklanjanjePredmetaSaProfesora.getInstance().dispose();
			
		}
	}


}