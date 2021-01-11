package Model;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

import Enums.TrenutnaGodina;
import Enums.Status;

public class Student implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8231314242546364910L;
	private String prezime;
	private String ime;
	private LocalDateTime datumRodjenja;
	private String adresaStanovanja;
	private String telefon;
	private String email;
	private String index;
	private int godinaUpisa;
	private TrenutnaGodina godina;
	private Status status;
	private double prosjecnaOcjena;
	private ArrayList<Ocena> ocjene;
	private ArrayList<Predmet> nepolozeniPredmeti;

	
	public Student(String prezime, String ime, LocalDateTime datumRodjenja, String adresaStanovanja, String telefon,
			String email, String index, int godinaUpisa, TrenutnaGodina godina, Status status)
	{
		this.prezime = prezime;
		this.ime = ime;
		this.datumRodjenja = datumRodjenja;
		this.adresaStanovanja = adresaStanovanja;
		this.telefon = telefon;
		this.email = email;
		this.index = index;
		this.godinaUpisa = godinaUpisa;
		this.godina = godina;
		this.status = status;
		this.ocjene=new ArrayList<Ocena>();
		this.nepolozeniPredmeti=new ArrayList<Predmet>();
	}
	
	
	
	public ArrayList<Predmet> getNepolozeniPredmeti() {
		return nepolozeniPredmeti;
	}



	public void setNepolozeniPredmeti(ArrayList<Predmet> nepolozeniPredmeti) {
		this.nepolozeniPredmeti = nepolozeniPredmeti;
	}



	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public LocalDateTime getDatumRodjenja() {
		return datumRodjenja;
	}
	public void setDatumRodjenja(LocalDateTime datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}
	public String getAdresaStanovanja() {
		return adresaStanovanja;
	}
	public void setAdresaStanovanja(String adresaStanovanja) {
		this.adresaStanovanja = adresaStanovanja;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public int getGodinaUpisa() {
		return godinaUpisa;
	}
	public void setGodinaUpisa(int godinaUpisa) {
		this.godinaUpisa = godinaUpisa;
	}
	public TrenutnaGodina getGodina() {
		return godina;
	}
	public void setGodina(TrenutnaGodina godina) {
		this.godina = godina;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public double getProsjecnaOcjena() {
		return prosjecnaOcjena;
	}
	public void setProsjecnaOcjena(double prosjecnaOcjena) {
		this.prosjecnaOcjena = prosjecnaOcjena;
	

	}
	public ArrayList<Ocena> getOcjene() {
		return ocjene;
	}
	public void setOcjene(ArrayList<Ocena> ocjene) {
		this.ocjene = ocjene;
	}
	
	public void removePredmet(String sifra) 
	{
		
		for(int i=0; i<nepolozeniPredmeti.size(); i++) 
		{
			if(nepolozeniPredmeti.get(i).getSifraPredmeta().equals(sifra)) 
			{
				nepolozeniPredmeti.remove(i);
			}
		}
	}
	
	

}