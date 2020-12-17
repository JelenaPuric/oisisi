package Kontroleri;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.AbstractAction;

import Model.Profesor;

import View.MyWindow;
import View.ProzorDodajProfesora;

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
		String titula=ProzorDodajProfesora.getInstance().getTxtTitula().getText();
		String zvanje=ProzorDodajProfesora.getInstance().getTxtZvanje().getText();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate datum=LocalDate.parse(datumRodjenja,formatter);
		LocalDateTime dat=LocalDateTime.of(datum, LocalDateTime.now().toLocalTime());
		
		
		
		Profesor p=new Profesor(prezime,ime,adresaStanovanja,dat ,brojTelefona,mail,adresaKancelarije,brojLicneKarte, titula,  zvanje);
		MyWindow.getInstance().getModel().dodajProfesora(p);
		
		
		
		Object[] rdata= { p.getIme(), p.getPrezime(), p.getTitula(),p.getZvanja()};
		MyWindow.getInstance().getCentralniPanel().getDtmProfesori().addRow(rdata);
		
		ProzorDodajProfesora.getInstance().dispose();
		
	}
	public DugmePotvrdiProfesoraKontroler()
	{
		super("Potvrdi");
	}
	
}
