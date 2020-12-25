package Kontroleri;

import java.awt.event.ActionEvent;
import java.time.LocalDateTime;

import javax.swing.AbstractAction;

import Enums.TrenutnaGodina;
import Enums.Semestar;
import Model.Predmet;
import View.MyWindow;
import View.ProzorIzmenaPredmeta;

public class PotvrdiIzmenuPredmetaKontroler extends AbstractAction
{


	public PotvrdiIzmenuPredmetaKontroler()
	{
		super("Potvrdi");
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String nazivPredmeta=ProzorIzmenaPredmeta.getInstance().getTxtNazivPredmeta().getText();
		String sifraPredmeta=ProzorIzmenaPredmeta.getInstance().getTxtSifraPredmeta().getText();
		String predmetniProfesor=ProzorIzmenaPredmeta.getInstance().getTxtPredmetniProfesor().getText();
	    int ESPB=Integer.parseInt(ProzorIzmenaPredmeta.getInstance().getTxtEspb().getText());
	
	    String semestarStr=(String) ProzorIzmenaPredmeta.getInstance().getSemestar().getSelectedItem();
		Semestar semestar;
		
		if(semestarStr.equals("Ljetnji"))
		{
			semestar=Semestar.letnji;
		}
		else 
		{
			semestar=Semestar.zimski;
		}
	    

		String godinaS=(String) ProzorIzmenaPredmeta.getInstance().getGodinaStudija().getSelectedItem();
		TrenutnaGodina godina;
		if(godinaS.equals("I(prva)")) 
		{
			
			godina=TrenutnaGodina.prva;
		}
		else if(godinaS.equals("II(druga)"))
		{
			godina=TrenutnaGodina.druga;
	    }
		else if(godinaS.equals("III(treća)"))
				{
			      godina=TrenutnaGodina.treca;
				}
		else
		{
			godina=TrenutnaGodina.cetvrta;
		}
		
	
	
	
	int indx=MyWindow.getInstance().getCentralniPanel().getTblPredmeti().getSelectedRow();
	Predmet p=MyWindow.getInstance().getModel().getPredmeti().get(indx);
	p.setNazivPredmeta(nazivPredmeta);
	p.setSifraPredmeta(sifraPredmeta);
	p.setSemestar(semestar);
	p.setGodinaStudija(godina);
	p.setProfesor(predmetniProfesor);
	p.setEspBodovi(ESPB);
	MyWindow.getInstance().getCentralniPanel().getDtmPredmeti().setRowCount(0);

	ProzorIzmenaPredmeta.getInstance().dispose();
	}
	

}
