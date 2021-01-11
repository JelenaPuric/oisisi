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

public class DugmePotvrdiIzmenuProfesora extends AbstractAction{

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
		LocalDateTime dat=datum.atStartOfDay();
		
		Titula titulaP;
		int index= ProzorIzmenaProfesora.getInstance().getCmbTitula().getSelectedIndex();
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
		int ind= ProzorIzmenaProfesora.getInstance().getCmbZvanje().getSelectedIndex();
		if(index==0)
		{
			zvanjeP=Zvanje.saradnik_u_nastavi;
		}
		else if (index==1) {
		
			zvanjeP=Zvanje.asistent;
		}
		else if (index==2)
		{
			zvanjeP=Zvanje.asistent_sa_doktoratom;
		}
		else if(index==3)
		{
			zvanjeP=Zvanje.docent;
		}
		else if(index==4)
		{
			zvanjeP=Zvanje.vanredni_profesor;
		}
		else if(index==5)
		{
			zvanjeP=Zvanje.redovni_profesor;
		}
		else
		{
			zvanjeP=Zvanje.profesor_emertius;
		}
		
		Profesor p=MyWindow.getInstance().getModel().nadjiProfesora(brojLicneKarte);
		p.setIme(ime);
		p.setPrezime(prezime);
		p.setDatum(dat);
		p.setAdresaStanovanja(adresaStanovanja);
		p.setKontaktTel(brojTelefona);
		p.setEmail(mail);
		p.setAdresaKancelarije(adresaKancelarije);
		p.setBrojLicneKarte(brojLicneKarte);
		p.setTitula(titulaP);
		p.setZvanja(zvanjeP);
		
		ProzorIzmenaProfesora.getInstance().dispose();
		
	}
	
	public DugmePotvrdiIzmenuProfesora()
	{
		super("Potvrdi");
	}

}
