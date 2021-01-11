package Kontroleri;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.AbstractAction;

import Enums.Titula;
import Enums.Zvanje;
import Model.Profesor;

import View.MyWindow;
import View.ProzorDodajProfesora;
import View.ProzorIzmenaProfesora;

public class DugmePotvrdiProfesoraKontroler extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String ime=ProzorDodajProfesora.getInstance().getTxtIme().getText();
		String prezime=ProzorDodajProfesora.getInstance().getTxtPrezime().getText();
		String datumRodjenja=ProzorDodajProfesora.getInstance().getTxtDatumRodjenja().getText();
		String adresaStanovanja=ProzorDodajProfesora.getInstance().getTxtAdresaStanovanja().getText();
		String brojTelefona=ProzorDodajProfesora.getInstance().getTxtBrojTelefona().getText();
		String mail=ProzorDodajProfesora.getInstance().getTxtEmail().getText();
		String adresaKancelarije=ProzorDodajProfesora.getInstance().getTxtAdresaStanovanja().getText();
		String brojLicneKarte=ProzorDodajProfesora.getInstance().getTxtBrojLicneKarte().getText();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate datum=LocalDate.parse(datumRodjenja,formatter);
		LocalDateTime dat=LocalDateTime.of(datum, LocalDateTime.now().toLocalTime());
		
		Titula titulaP;
		int index= ProzorDodajProfesora.getInstance().getCmbTitula().getSelectedIndex();
		if(index==0)
		{
			titulaP=Titula.BSc;
		}
		else if(index==1)
		{
			titulaP=Titula.MSc;
		}
		else if(index==2)
		{
			titulaP=Titula.mr;
		}
		else if(index==3)
		{
			titulaP=Titula.dr;
		}
		else 
		{
			titulaP=Titula.prof_dr;
		}
		
		Zvanje zvanjeP;
		int ind= ProzorDodajProfesora.getInstance().getCmbZvanje().getSelectedIndex();
		if(ind==0)
		{
			zvanjeP=Zvanje.saradnik_u_nastavi;
		}
		else if (ind==1) {
		
			zvanjeP=Zvanje.asistent;
		}
		else if (ind==2)
		{
			zvanjeP=Zvanje.asistent_sa_doktoratom;
		}
		else if(ind==3)
		{
			zvanjeP=Zvanje.docent;
		}
		else if(ind==4)
		{
			zvanjeP=Zvanje.vanredni_profesor;
		}
		else if(ind==5)
		{
			zvanjeP=Zvanje.redovni_profesor;
		}
		else
		{
			zvanjeP=Zvanje.profesor_emertius;
		}
		
		System.out.println(zvanjeP);
		
		Profesor p=new Profesor(prezime,ime,adresaStanovanja,dat ,brojTelefona,mail,adresaKancelarije,brojLicneKarte, titulaP,  zvanjeP);
		MyWindow.getInstance().getModel().dodajProfesora(p);
		
		
		
		Object[] rdata= { p.getIme(), p.getPrezime(), p.getTitula(),p.getZvanja()};
		MyWindow.getInstance().getCentralniPanel().getDtmProfesori().addRow(rdata);
		
		ProzorDodajProfesora.getInstance().dispose();
		ProzorDodajProfesora.toNull();
		
	}
	public DugmePotvrdiProfesoraKontroler()
	{
		super("Potvrdi");
	}
	
}
