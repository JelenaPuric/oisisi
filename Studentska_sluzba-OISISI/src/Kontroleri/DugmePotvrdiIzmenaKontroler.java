package Kontroleri;

import java.awt.event.ActionEvent;
import java.time.LocalDateTime;

import javax.swing.AbstractAction;

import Enums.TrenutnaGodina;
import Enums.Status;
import Model.Student;
import View.MyWindow;
import View.ProzorIzmenaStudenta;

public class DugmePotvrdiIzmenaKontroler extends AbstractAction
{


	public DugmePotvrdiIzmenaKontroler()
	{
		super("Potvrdi");
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String ime=ProzorIzmenaStudenta.getInstance().getTxtIme().getText();
		String prezime=ProzorIzmenaStudenta.getInstance().getTxtPrezime().getText();
		String datumRodjenja=ProzorIzmenaStudenta.getInstance().getTxtDatumRodjenja().getText();
		String adresaStanovanja=ProzorIzmenaStudenta.getInstance().getTxtAdresaStanovanja().getText();
		String brojTelefona=ProzorIzmenaStudenta.getInstance().getTxtBrojTelefona().getText();
		String Email=ProzorIzmenaStudenta.getInstance().getTxtEmail().getText();
		String brojIndeksa=ProzorIzmenaStudenta.getInstance().getTxtBrojIndeksa().getText();
		int godinaUpisa=Integer.parseInt(ProzorIzmenaStudenta.getInstance().getTxtGodinaUpisa().getText());
		//DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd MMM uuuu");
		//TODO FIX DATE  FROM STRING
		LocalDateTime date=LocalDateTime.now();

		String trenutna=(String) ProzorIzmenaStudenta.getInstance().getTrenutnaGodinaStudija().getSelectedItem();
		TrenutnaGodina godina;
		if(trenutna.equals("I(prva)")) 
		{
			
			godina=TrenutnaGodina.prva;
		}
		else if(trenutna.equals("II(druga)"))
		{
			godina=TrenutnaGodina.druga;
	    }
		else if(trenutna.equals("III(treća)"))
				{
			      godina=TrenutnaGodina.treca;
				}
		else
		{
			godina=TrenutnaGodina.cetvrta;
		}
		
	
	
	String statusStr=(String) ProzorIzmenaStudenta.getInstance().getNacinFinansiranja().getSelectedItem();
	Status status;
	
	if(statusStr.equals("S"))
	{
		status=Status.S;
	}
	else 
	{
		status=Status.B;
	}
	int indx=MyWindow.getInstance().getCentralniPanel().getTblStudenti().getSelectedRow();
	Student s=MyWindow.getInstance().getModel().getStudenti().get(indx);
	s.setIme(ime);
	s.setPrezime(prezime);
	s.setDatumRodjenja(date);
	s.setAdresaStanovanja(adresaStanovanja);
	s.setTelefon(brojTelefona);
	s.setEmail(Email);
	s.setIndex(brojIndeksa);	
	s.setGodinaUpisa(godinaUpisa);
	s.setGodina(godina);
	s.setStatus(status);
	MyWindow.getInstance().getCentralniPanel().getDtmStudenti().setRowCount(0);
	MyWindow.getInstance().getCentralniPanel().loadTableStudents();
	ProzorIzmenaStudenta.getInstance().dispose();
	}
	

}
