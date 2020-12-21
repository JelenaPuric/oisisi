package Kontroleri;


import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import Enums.TrenutnaGodina;
import Enums.Status;
import Model.Student;
import View.MyWindow;
import View.ProzorIzmenaStudenta;

public class IzmenaEntitetKontroler extends AbstractAction
{


	public  IzmenaEntitetKontroler() 
	{
		super("Izmeni");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		int index=MyWindow.getInstance().getCentralniPanel().getTabbedPane().getSelectedIndex();
		if(index==0) 
		{
			int ind=MyWindow.getInstance().getCentralniPanel().getTblStudenti().getSelectedRow();
			if(ind!=-1) 
			{
				Student s=MyWindow.getInstance().getModel().getStudenti().get(ind);
				ProzorIzmenaStudenta.getInstance().getTxtIme().setText(s.getIme());
				ProzorIzmenaStudenta.getInstance().getTxtPrezime().setText(s.getPrezime());
				ProzorIzmenaStudenta.getInstance().getTxtDatumRodjenja().setText(s.getDatumRodjenja().toString());
				ProzorIzmenaStudenta.getInstance().getTxtAdresaStanovanja().setText(s.getAdresaStanovanja());
				ProzorIzmenaStudenta.getInstance().getTxtBrojTelefona().setText(s.getTelefon());
				ProzorIzmenaStudenta.getInstance().getTxtEmail().setText(s.getEmail());
				ProzorIzmenaStudenta.getInstance().getTxtBrojIndeksa().setText(s.getIndex());
				ProzorIzmenaStudenta.getInstance().getTxtGodinaUpisa().setText(String.valueOf(s.getGodinaUpisa()));
				if(s.getGodina()==TrenutnaGodina.prva) 
				{
					ProzorIzmenaStudenta.getInstance().getTrenutnaGodinaStudija().setSelectedIndex(0);
				}
				else if(s.getGodina()==TrenutnaGodina.druga)
				{
					ProzorIzmenaStudenta.getInstance().getTrenutnaGodinaStudija().setSelectedIndex(1);
				}
				else if(s.getGodina()==TrenutnaGodina.treca)
				{
					ProzorIzmenaStudenta.getInstance().getTrenutnaGodinaStudija().setSelectedIndex(2);
				}
				else
				{
					ProzorIzmenaStudenta.getInstance().getTrenutnaGodinaStudija().setSelectedIndex(3);
				}
				
				if(s.getStatus()==Status.B)
				{
					ProzorIzmenaStudenta.getInstance().getNacinFinansiranja().setSelectedIndex(0);
				}
				else
				{
					ProzorIzmenaStudenta.getInstance().getNacinFinansiranja().setSelectedIndex(1);
				}
				
					ProzorIzmenaStudenta.getInstance().show();
				
			}
			
		}
		
	}
   
  
}