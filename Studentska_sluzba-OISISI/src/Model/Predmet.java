package Model;

import java.util.ArrayList;

import Enums.Semestar;
import Enums.TrenutnaGodina;


public class Predmet {
	
	static final long serialVersionUID = 871124L;
	private String sifraPredmeta;
	private String nazivPredmeta;
	private Enums.Semestar semestar;
	private Enums.TrenutnaGodina godinaStudija;
	private Profesor profesor;
	private int espBodovi;
	private ArrayList<Student> poloziliPredmet;
	private ArrayList<Student> nisuPoloziliPredmet;
	public String getSifraPredmeta() {
		return sifraPredmeta;
	}
	public void setSifraPredmeta(String sifraPredmeta) {
		this.sifraPredmeta = sifraPredmeta;
	}
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}
	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	public Semestar getSemestar() {
		return semestar;
	}
	public void setSemestar(Semestar semestar) {
		this.semestar = semestar;
	}
	public TrenutnaGodina getGodinaStudija() {
		return godinaStudija;
	}
	public void setGodinaStudija(TrenutnaGodina godinaStudija) {
		this.godinaStudija = godinaStudija;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public int getEspBodovi() {
		return espBodovi;
	}
	public void setEspBodovi(int espBodovi) {
		if(espBodovi>=0 && espBodovi<=240) {
		this.espBodovi = espBodovi;
		}
	}
	public ArrayList<Student> getPoloziliPredmet() {
		return poloziliPredmet;
	}
	public void setPoloziliPredmet(ArrayList<Student> poloziliPredmet) {
		this.poloziliPredmet = poloziliPredmet;
	}
	public ArrayList<Student> getNisuPoloziliPredmet() {
		return nisuPoloziliPredmet;
	}
	public void setNisuPoloziliPredmet(ArrayList<Student> nisuPoloziliPredmet) {
		this.nisuPoloziliPredmet = nisuPoloziliPredmet;
	}
	public Predmet(String sifraPredmeta, String nazivPredmeta, Semestar semestar, TrenutnaGodina godinaStudija,
			Profesor profesor, int espBodovi, ArrayList<Student> poloziliPredmet,
			ArrayList<Student> nisuPoloziliPredmet) {
		super();
		this.sifraPredmeta = sifraPredmeta;
		this.nazivPredmeta = nazivPredmeta;
		this.semestar = semestar;
		this.godinaStudija = godinaStudija;
		this.profesor = profesor;
		this.espBodovi = espBodovi;
		this.poloziliPredmet = poloziliPredmet;
		this.nisuPoloziliPredmet = nisuPoloziliPredmet;
	}
	
	
	

}