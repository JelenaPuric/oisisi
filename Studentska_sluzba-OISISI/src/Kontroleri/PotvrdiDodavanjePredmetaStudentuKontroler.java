package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import Model.Predmet;
import Model.Student;
import View.DodavanjePredmetaStudentu;
import View.MyWindow;
import View.ProzorIzmenaStudenta;

public class PotvrdiDodavanjePredmetaStudentuKontroler extends AbstractAction
{
   public PotvrdiDodavanjePredmetaStudentuKontroler()
   {
	   super("Dodaj");
   }
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub
		int[] indexi= DodavanjePredmetaStudentu.getInstance().getTblPredmeti().getSelectedRows();
		int row=MyWindow.getInstance().getCentralniPanel().getTblStudenti().getSelectedRow();
		Student stud=MyWindow.getInstance().getModel().getStudenti().get(row);
		for(int i=0; i<indexi.length; i++) 
		{
			System.out.println("usao "+indexi[i]);
			String linija=(String) DodavanjePredmetaStudentu.getInstance().getDtmPredmeti().getValueAt(indexi[i], 0);
			String[] deloviLinije=linija.split("\\-");
			Predmet p= MyWindow.getInstance().getModel().nadjiPredmet(deloviLinije[0]);
			stud.getNepolozeniPredmeti().add(p);
			
			
			Object[] data= {p.getSifraPredmeta(),p.getNazivPredmeta(),p.getEspBodovi(),p.getGodinaStudija(),p.getSemestar()};
			ProzorIzmenaStudenta.getInstance().getNepolozeniPanel().getDtmNepolozeni().addRow(data);
		}
		DodavanjePredmetaStudentu.getInstance().dispose();
		
		
	}

}
