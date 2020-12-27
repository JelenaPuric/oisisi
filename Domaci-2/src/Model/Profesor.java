package Model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Profesor implements Serializable{
	
	static final long serialVersionUID = 4567898L;
	private String Prezime;
	private String Ime;
	private String adresaStanovanja;
	private LocalDateTime datum;
	private String kontaktTel;
	private String email;
	private String adresaKancelarije;
	private String brojLicneKarte;
	private String titula;
	private String zvanja;
	private ArrayList<Predmet> profNaPredmetima;

	public String getPrezime() {
		return Prezime;
	}
	public void setPrezime(String prezime) {
		Prezime = prezime;
	}
	public String getIme() {
		return Ime;
	}
	public void setIme(String ime) {
		Ime = ime;
	}
	public String getAdresaStanovanja() {
		return adresaStanovanja;
	}
	public void setAdresaStanovanja(String adresaStanovanja) {
		this.adresaStanovanja = adresaStanovanja;
	}
	public LocalDateTime getDatum() {
		return datum;
	}
	public void setDatum(LocalDateTime datum) {
		this.datum = datum;
	}
	public String getKontaktTel() {
		return kontaktTel;
	}
	public void setKontaktTel(String kontaktTel) {
		this.kontaktTel = kontaktTel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresaKancelarije() {
		return adresaKancelarije;
	}
	public void setAdresaKancelarije(String adresaKancelarije) {
		this.adresaKancelarije = adresaKancelarije;
	}
	public String getBrojLicneKarte() {
		return brojLicneKarte;
	}
	public void setBrojLicneKarte(String brojLicneKarte) {
		this.brojLicneKarte = brojLicneKarte;
	}
	public String getTitula() {
		return titula;
	}
	public void setTitula(String titula) {
		this.titula = titula;
	}
	public String getZvanja() {
		return zvanja;
	}
	public void setZvanja(String zvanja) {
		this.zvanja = zvanja;
	}
	
	public Profesor(String prezime, String ime, String adresaStanovanja, LocalDateTime datum, String kontaktTel,
			String email, String adresaKancelarije, String brojLicneKarte, String titula, String zvanja,
			ArrayList<Predmet> profNaPredmetima) {
		super();
		Prezime = prezime;
		Ime = ime;
		this.adresaStanovanja = adresaStanovanja;
		this.datum = datum;
		this.kontaktTel = kontaktTel;
		this.email = email;
		this.adresaKancelarije = adresaKancelarije;
		this.brojLicneKarte = brojLicneKarte;
		this.titula = titula;
		this.zvanja = zvanja;
		this.profNaPredmetima = profNaPredmetima;
	}
	
	public Profesor(String prezime, String ime, String adresaStanovanja, LocalDateTime datum, String kontaktTel,
			String email, String adresaKancelarije, String brojLicneKarte, String titula, String zvanja) {
		super();
		Prezime = prezime;
		Ime = ime;
		this.adresaStanovanja = adresaStanovanja;
		this.datum = datum;
		this.kontaktTel = kontaktTel;
		this.email = email;
		this.adresaKancelarije = adresaKancelarije;
		this.brojLicneKarte = brojLicneKarte;
		this.titula = titula;
		this.zvanja = zvanja;
		this.profNaPredmetima = new ArrayList<Predmet>();
		
		
	}
	
	
	

}

