package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;

import Enums.Titula;
import Enums.Zvanje;


public class Profesor {

	static final long serialVersionUID = 4567898L;
	private String Prezime;
	private String Ime;
	private String adresaStanovanja;
	private LocalDateTime datum;
	private String kontaktTel;
	private String email;
	private String adresaKancelarije;
	private String brojLicneKarte;
	private Titula titula;
	private Zvanje zvanja;
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
	public ArrayList<Predmet> getProfNaPredmetima() {
		return profNaPredmetima;
	}
	public void setProfNaPredmetima(ArrayList<Predmet> profNaPredmetima) {
		this.profNaPredmetima = profNaPredmetima;
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
	public Titula getTitula() {
		return titula;
	}
	public void setTitula(Titula titulaP) {
		this.titula = titulaP;
	}
	public Zvanje getZvanja() {
		return zvanja;
	}
	public void setZvanja(Zvanje zvanjeP) {
		this.zvanja = zvanjeP;
	}
	
	public Profesor(String prezime, String ime, String adresaStanovanja, LocalDateTime datum, String kontaktTel,
			String email, String adresaKancelarije, String brojLicneKarte, Titula titula, Zvanje zvanja,
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
			String email, String adresaKancelarije, String brojLicneKarte, Titula titula, Zvanje zvanja) {
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
