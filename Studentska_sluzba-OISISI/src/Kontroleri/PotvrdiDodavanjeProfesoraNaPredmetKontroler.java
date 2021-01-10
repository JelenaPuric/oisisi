package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import Model.Predmet;
import Model.Profesor;
import View.DodavanjeProfesoraNaPredmet;
import View.MyWindow;

public class PotvrdiDodavanjeProfesoraNaPredmetKontroler extends AbstractAction
{
	
	public PotvrdiDodavanjeProfesoraNaPredmetKontroler()
	{
		super("Potvrdi");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int[] indexi= DodavanjeProfesoraNaPredmet.getInstance().getTblProfesori().getSelectedRows();
		int row=MyWindow.getInstance().getCentralniPanel().getTblPredmeti().getSelectedRow();
		Predmet pred=MyWindow.getInstance().getModel().getPredmeti().get(row);
		for(int i=0; i<indexi.length; i++) 
		{
			System.out.println("usao "+indexi[i]);
			String linija=(String) DodavanjeProfesoraNaPredmet.getInstance().getDtmProfesori().getValueAt(indexi[i], 0);
			String[] deloviLinije=linija.split("\\-");
			Profesor pr= MyWindow.getInstance().getModel().nadjiProfesora(deloviLinije[0]);
			//pred.getProfesor().add(pr);
			
		}
		DodavanjeProfesoraNaPredmet.getInstance().dispose();
		
	}

	
}
