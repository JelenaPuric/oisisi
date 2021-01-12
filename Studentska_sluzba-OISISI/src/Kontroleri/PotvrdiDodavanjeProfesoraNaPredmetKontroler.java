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
		
			
		int index= DodavanjeProfesoraNaPredmet.getInstance().getTblProfesori().getSelectedRow();
		int row=MyWindow.getInstance().getCentralniPanel().getTblPredmeti().getSelectedRow();
		Predmet pred=MyWindow.getInstance().getModel().getPredmeti().get(row);
		
		Profesor p=MyWindow.getInstance().getModel().getProfesori().get(index);
		pred.setProfesor(p.getBrojLicneKarte());
		
		
		DodavanjeProfesoraNaPredmet.getInstance().dispose();
		
	}

	
}
