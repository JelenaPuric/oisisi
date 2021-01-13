package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import Model.Student;
import View.MyWindow;
import View.PonistavanjeOcene;
import View.ProzorIzmenaStudenta;

public class PotvrdiPonistavanjeOceneKontroler extends AbstractAction
{
	
	public PotvrdiPonistavanjeOceneKontroler()
	{
		super("Da");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int index= ProzorIzmenaStudenta.getInstance().getPolozeniPanel().getTblPolozeni().getSelectedRow();
		int indStud=MyWindow.getInstance().getCentralniPanel().getTblStudenti().getSelectedRow();
		Student s= MyWindow.getInstance().getModel().getStudenti().get(indStud);
		s.getOcjene().remove(index);
		ProzorIzmenaStudenta.getInstance().getPolozeniPanel().getDtmPolozeni().removeRow(index);
		PonistavanjeOcene.getInstance().dispose();
	}

	

}

