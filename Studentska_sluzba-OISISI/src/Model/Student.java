package Model;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

import Enums.TrenutnaGodina;
import Enums.Status;
/**
 * 
 * @author Jelena Puric RA215-2018
 *
 */

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

	/**
	 * konstruktor sa parametrima za klasu Student
	 * @param prezime prezime studenta
	 * @param ime ime studenta
	 * @param datumRodjenja datum rodjenja studenta
	 * @param adresaStanovanja asdresa stanovanja studenta
	 * @param telefon telefon studenta
	 * @param email email studenta
	 * @param index broj indeksa studneta
	 * @param godinaUpisa godina upisa studenta na fakultet
	 * @param godina godina studija na kojoj se student nalazi
	 * @param status status finnsiranja sudenta
	 */
	
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
	
	/**
	 * getter za listu nepolozeih predmeta
	 * @return nepolozeniPredmeti
	 */
	
	public ArrayList<Predmet> getNepolozeniPredmeti() {
		return nepolozeniPredmeti;
	}

/**
 * setter za listu nepolozenih predmeta
 * @param nepolozeniPredmeti
 */

	public void setNepolozeniPredmeti(ArrayList<Predmet> nepolozeniPredmeti) {
		this.nepolozeniPredmeti = nepolozeniPredmeti;
	}

	
	
	/**
	 * getter za prezime studenta
	 * @return prezime
	 */
	
	public String getPrezime() {
		return prezime;
	}
	
	/**
	 * setter za prezime
	 * @param prezime
	 */
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	/**
	 * getter za ime
	 * @return ime
	 */
	public String getIme() {
		return ime;
	}
	
	/**
	 * setter za ime
	 * @param ime
	 */
	public void setIme(String ime) {
		this.ime = ime;
	}
	/**
	 * getter za datum rodjenja
	 * @return datumRodjenja
	 */
	public LocalDateTime getDatumRodjenja() {
		return datumRodjenja;
	}
	
	/**
	 * setter za datum rodjenja
	 * @param datumRodjenja
	 */
	public void setDatumRodjenja(LocalDateTime datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}
	
	/**
	 * gtter za adresu stanovanja
	 * @return adresaStanovanja
	 */
	public String getAdresaStanovanja() {
		return adresaStanovanja;
	}
	
	/**
	 * setter za adresu stanovanja
	 * @param adresaStanovanja
	 */
	public void setAdresaStanovanja(String adresaStanovanja) {
		this.adresaStanovanja = adresaStanovanja;
	}
	
	/**
	 * getter za telefon
	 * @return telefon
	 */
	public String getTelefon() {
		return telefon;
	}
	
	/**
	 * setter za telefon
	 * @param telefon
	 */
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	/**
	 * getter za email
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * setter za email
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * getter za index
	 * @return index
	 */
	public String getIndex() {
		return index;
	}
	
	/**
	 * setter za index
	 * @param index
	 */
	public void setIndex(String index) {
		this.index = index;
	}
	
	/**
	 * getter za godinu upisa
	 * @return godinaUpisa
	 */
	public int getGodinaUpisa() {
		return godinaUpisa;
	}
	
	/**
	 * setter za godinuUpisa
	 * @param godinaUpisa
	 */
	public void setGodinaUpisa(int godinaUpisa) {
		this.godinaUpisa = godinaUpisa;
	}
	
	/**
	 * getter za trenutnu godinu studija
	 * @return godina
	 */
	public TrenutnaGodina getGodina() {
		return godina;
	}
	
	/**
	 * setter za trenutnu godinu studija
	 * @param godina
	 */
	public void setGodina(TrenutnaGodina godina) {
		this.godina = godina;
	}
	
	/**
	 * getter za status
	 * @return status
	 */
	public Status getStatus() {
		return status;
	}
	
	/**
	 * setter za status
	 * @param status
	 */
	public void setStatus(Status status) {
		this.status = status;
	}
	
	/**
	 * getter za prosjecnu ocjenu
	 * @return prosjecnaOcjena
	 */
	public double getProsjecnaOcjena() {
		return prosjecnaOcjena;
	}
	
	/**
	 * setter za prosjecnu ocjenu
	 * @param prosjecnaOcjena
	 */
	public void setProsjecnaOcjena(double prosjecnaOcjena) {
		this.prosjecnaOcjena = prosjecnaOcjena;
	

	}
	
	/**
	 * getter za listu ocjena
	 * @return ocjene
	 */
	public ArrayList<Ocena> getOcjene() {
		return ocjene;
	}
	
	/**
	 * setter za listu ocjena
	 * @param ocjene
	 */
	public void setOcjene(ArrayList<Ocena> ocjene) {
		this.ocjene = ocjene;
	}
	

    /**
     * Funkcija removePredmet koja prima sifru predmeta i prolazi kroz listu nepolozenih predmeta.
     * Kada se poklopi predmet sa istom sifrom koju proslijedimo, funkcija brise taj predmet iz liste
     * nepolozenih predmeta.
     * @param sifra predmeta
     */
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