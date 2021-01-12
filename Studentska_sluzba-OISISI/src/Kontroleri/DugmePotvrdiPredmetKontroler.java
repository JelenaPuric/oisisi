package Kontroleri;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.AbstractAction;

import Enums.TrenutnaGodina;
import Enums.Semestar;
import Model.Predmet;

import View.MyWindow;
import View.ProzorDodajPredmet;

public class DugmePotvrdiPredmetKontroler extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String sifraPredmeta=ProzorDodajPredmet.getInstance().getTxtSifraPredmeta().getText();
		String nazivPredmeta=ProzorDodajPredmet.getInstance().getTxtNazivPredmeta().getText();
		String predmetniProfesor=ProzorDodajPredmet.getInstance().getTxtProfesor().getText();
		int ESPB=Integer.parseInt(ProzorDodajPredmet.getInstance().getTxtEspbBodovi().getText());
		
		String godinaStudija=(String) ProzorDodajPredmet.getInstance().getTxtGodinaStudija().getSelectedItem();
		TrenutnaGodina godina;
		if(godinaStudija.equals("I(prva)")) 
		{
			
			godina=TrenutnaGodina.prva;
		}
		else if(godinaStudija.equals("II(druga)"))
		{
			godina=TrenutnaGodina.druga;
	    }
		else if(godinaStudija.equals("III(treća)"))
				{
			      godina=TrenutnaGodina.treca;
				}
		else
		{
			godina=TrenutnaGodina.cetvrta;
		}
		
		
		String semestarStr=(String) ProzorDodajPredmet.getInstance().getTxtSemestar().getSelectedItem();
		Semestar semestar;
		
		if(semestarStr.equals("Ljetnji"))
		{
			semestar=Semestar.letnji;
		}
		else 
		{
			semestar=Semestar.zimski;
		}
		
		
		
		
		Predmet pr=new Predmet(sifraPredmeta,nazivPredmeta,semestar,godina,predmetniProfesor,ESPB);
		if(MyWindow.getInstance().getModel().dodajPredmet(pr)==true)
		{
			
		Object[] rdata= { pr.getSifraPredmeta(), pr.getNazivPredmeta(), pr.getEspBodovi(),pr.getGodinaStudija(),pr.getSemestar()};
		MyWindow.getInstance().getCentralniPanel().getDtmPredmeti().addRow(rdata);
		}
		
		ProzorDodajPredmet.getInstance().dispose();
		
	}
	public DugmePotvrdiPredmetKontroler()
	{
		super("Potvrdi");
	}
	
}