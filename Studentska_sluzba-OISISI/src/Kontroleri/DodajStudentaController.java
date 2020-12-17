package Kontroleri;

import java.awt.event.ActionEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.AbstractAction;

import Enums.TrenutnaGodina;
import Enums.Status;
import Model.Student;
import View.MyWindow;
import View.ProzorDodajStudenta;

public class DodajStudentaController extends AbstractAction{

	public  DodajStudentaController() {
		super("Potvrdi");
	}
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		String ime=ProzorDodajStudenta.getInstance().getTxtIme().getText();
		String prezime=ProzorDodajStudenta.getInstance().getTxtPrezime().getText();
		String datumRodjenja=ProzorDodajStudenta.getInstance().getTxtDatumRodjenja().getText();
		String adresaStanovanja=ProzorDodajStudenta.getInstance().getTxtAdresaStanovanja().getText();
		String brojTelefona=ProzorDodajStudenta.getInstance().getTxtBrojTelefona().getText();
		String Email=ProzorDodajStudenta.getInstance().getTxtEmail().getText();
		String brojIndeksa=ProzorDodajStudenta.getInstance().getTxtBrojIndeksa().getText();
		int godinaUpisa=Integer.parseInt(ProzorDodajStudenta.getInstance().getTxtGodinaUpisa().getText());
		//DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd MMM uuuu");
		//TODO FIX DATE  FROM STRING
		LocalDateTime date=LocalDateTime.now();

		String trenutna=(String) ProzorDodajStudenta.getInstance().getTrenutnaGodinaStudija().getSelectedItem();
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
		
	
	
	String statusStr=(String) ProzorDodajStudenta.getInstance().getNacinFinansiranja().getSelectedItem();
	Status status;
	
	if(statusStr.equals("S"))
	{
		status=Status.S;
	}
	else 
	{
		status=Status.B;
	}
	Student s= new Student(prezime,ime,date,adresaStanovanja,brojTelefona,Email,brojIndeksa,godinaUpisa,godina,status);
	MyWindow.getInstance().getModel().dodajStudenta(s);
	Object[] data= {brojIndeksa,ime,prezime,trenutna,statusStr};
	MyWindow.getInstance().getCentralniPanel().getDtmStudenti().addRow(data);
	ProzorDodajStudenta.getInstance().dispose();
}
}