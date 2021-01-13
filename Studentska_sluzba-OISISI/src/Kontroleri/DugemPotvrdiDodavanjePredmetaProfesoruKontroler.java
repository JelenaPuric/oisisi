package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import Model.Predmet;
import Model.Profesor;
import View.MyWindow;
import View.ProzorDodavanjePredmetaProfesoru;
import View.ProzorIzmenaProfesora;

public class DugemPotvrdiDodavanjePredmetaProfesoruKontroler extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int[] ind= ProzorDodavanjePredmetaProfesoru.getInstance().getTblPredmeti().getSelectedRows();
		int indP=MyWindow.getInstance().getCentralniPanel().getTblProfesori().getSelectedRow();
		Profesor prof=MyWindow.getInstance().getModel().getProfesori().get(indP);
		
		for(int i=0; i<ind.length; i++) 
		{
			String linija=(String) ProzorDodavanjePredmetaProfesoru.getInstance().getDtmPredmeti().getValueAt(ind[i], 0);
			String[] deloviLinije=linija.split("\\-");
			System.out.println(deloviLinije[0]);
			Predmet p= MyWindow.getInstance().getModel().nadjiPredmet(deloviLinije[0]);
			prof.getProfNaPredmetima().add(p);
			Object[] rowData= {p.getSifraPredmeta(),p.getNazivPredmeta(),p.getGodinaStudija(),p.getSemestar()};
			ProzorIzmenaProfesora.getInstance().getDtmPredmeti().addRow(rowData);
			

		}
		
		ProzorDodavanjePredmetaProfesoru.getInstance().dispose();
			
		}
		public DugemPotvrdiDodavanjePredmetaProfesoruKontroler()
		{
			super("Potvdi");
		}

		
}
