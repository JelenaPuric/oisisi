package Model;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * 
 * @author Jelena Puric RA215-2018 i Bojana Lukic RA147-2018
 *
 */

public class Model implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7535166678034277659L;
	private ArrayList<Ocena> ocene;
	private ArrayList<Student> studenti;
	private ArrayList<Profesor> profesori;
	private ArrayList<Predmet> predmeti;

	/**
	 * prazan konstruktor za klasu Model 
	 */
	public Model() 
	{
		ocene= new ArrayList<Ocena>();
		profesori= new ArrayList<Profesor>();
		studenti=new ArrayList<Student>();
		predmeti= new ArrayList<Predmet>();
	}
	
	/**
	 * Funkcija dodajPredmet koja prima predmet p i prolazi kros listu predmeta gdje uporedjuje sifru proslijedjenog
	 * predmeta i sifru predmeta iz liste. Ukoliko su jednake, onda predmet postoji u listi i vraca netacno odnosno
	 * ne dodaje se. Ukoliko nisu jednake znaci da predmet ne postoji u listi i dodajedmo ga u lsitu ovom linijom koda
	 * "predmeti.add(p);" i vracamo tacno jer je funkcija tipa boolean.
	 * @param p predmet
	 * @return true 
	 */
	public boolean dodajPredmet(Predmet p)
	{
		for(int i=0; i<predmeti.size(); i++)
		{
			if(predmeti.get(i).getSifraPredmeta().equals(p.getSifraPredmeta()))
			{
				return false;
			}
			
		
		}
		predmeti.add(p);
		return true;
	}
	
	/**
	 * Funkcija izbrisiPredmet koja prima predmet p i prolazi kros listu predmeta gdje uporedjuje sifru proslijedjenog
	 * predmeta i sifru predmeta iz liste. Ukoliko su jednake, onda predmet postoji u listi i vraca tacno odnosno
	 * predmet se brise preko sljedece linije koda "predmeti.remove(p);". Ukoliko nisu jednake znaci da predmet ne postoji u listi
	 * i vracamo netacno jer nemamo sta da izbrisemo. Return true i false imamo jer je funkcija tipa boolean.
	 * @param p predmet
	 * @return false
	 */
	public boolean izbrisiPredmet(Predmet p)
	{
		for(int i=0; i<predmeti.size(); i++)
		{
			if(predmeti.get(i).getSifraPredmeta().equals(p.getSifraPredmeta()))
			{
				predmeti.remove(p);
				return true;
			}
		}
	return false;
	}
	
	/**
	 * Funkcija nadjiPredmet koja prima string sifraPredmeta i prolazi kros listu predmeta gdje uporedjuje sifru proslijedjenog
	 * predmeta i sifru predmeta iz liste. Ukoliko su jednake, onda predmet postoji u listi i nasli smo ga,
	 * pa vracamo return predmeti.get(i);. Ukoliko nisu jednake znaci da predmet ne postoji u listi i vraca null
	 * odnosno nije ga pronasao.
	 * 
	 * @param sifraPredmeta
	 * @return predmeti.get(i) nasao predmet
	 */
	public Predmet nadjiPredmet(String sifraPredmeta)
	{
		for(int i=0;i<predmeti.size();i++)
		{
				if(predmeti.get(i).getSifraPredmeta().equals(sifraPredmeta))
					{
						return predmeti.get(i);

						}

	}
	return null;
	}
	
    /**
     * Funkcija dodajPofesora koja prima profesora p i prolazi kros listu profesora gdje uporedjuje broj licne
     * kartte proslijedjenog profesora i broj licne karte profesora iz liste. Ukoliko su jednaki, onda profesor
     * postoji u listi i vraca netacno odnosno ne dodaje se. Ukoliko nisu jednaki znaci da profesor ne postoji
     * u listi i dodajedmo ga u lsitu ovom linijom koda "profesori.add(p);" i vracamo tacno jer je funkcija tipa boolean.
     * @param p profesor
     * @return true
     */
	public boolean dodajProfesora(Profesor p)
	{
		for(int i=0; i<profesori.size(); i++)
		{
			if(profesori.get(i).getBrojLicneKarte().equals(p.getBrojLicneKarte()))
			{
				return false;
			}
			
		
		}
		profesori.add(p);
		return true;
	}
	
	/**
	 * Funkcija nadjiProfesora koja prima string brojLicneKarte i prolazi kros listu profesora gdje uporedjuje broj licne karte proslijedjenog
	 * profesora i broj licne karte profesora iz liste. Ukoliko su jednaki, onda profesor postoji u listi i nasli smo ga,
	 * pa vracamo return profesori.get(i);. Ukoliko nisu jednaki znaci da profesor ne postoji u listi i vraca null
	 * odnosno nije ga pronasao.
	 * @param brojLicneKarte
	 * @return profesori.get(i)
	 */
	public Profesor nadjiProfesora(String brojLicneKarte )
	{
		System.out.println(brojLicneKarte);
	for(int i=0;i<profesori.size();i++)
	{
		System.out.println(profesori.get(i).getBrojLicneKarte());
		if(profesori.get(i).getBrojLicneKarte().equals(brojLicneKarte))
		{
			return profesori.get(i);
		}
	}
	return null;
	}
	
	/**
	 * Funkcija izbrisiProfesora koja prima profesora p i prolazi kros listu profesora gdje uporedjuje broj licne karte proslijedjenog
	 * profesora i broj licne karte profesora iz liste. Ukoliko su jednake, onda profesor postoji u listi i vraca tacno odnosno
	 * profesor se brise preko sljedece linije koda "profesori.remove(p);". Ukoliko nisu jednake znaci da profesor ne postoji u listi
	 * i vracamo netacno jer nemamo sta da izbrisemo. Return true i false imamo jer je funkcija tipa boolean.
	 * @param p profesor
	 * @return true
	 */
	public  boolean izbrisiProfesora(Profesor p)
	{
		for(int i=0; i<profesori.size(); i++)
		{	
			if(profesori.get(i).getBrojLicneKarte().equals(p.getBrojLicneKarte()))
			{
				profesori.remove(p);
				return true;
			}
		}
	return false;
	}
	
	/**
	 * Funkcija dodajStudenta koja prima studenta s i prolazi kros listu studenata gdje uporedjuje broj indexa proslijedjenog
	 * studenta i broj indexa studenta iz liste. Ukoliko su jednaki, onda student postoji u listi i vraca netacno odnosno
	 * ne dodaje se. Ukoliko nisu jednaki znaci da student ne postoji u listi i dodajedmo ga u lsitu ovom linijom koda
	 * "studenti.add(s);" i vracamo tacno jer je funkcija tipa boolean.
	 * @param student
	 * @return true
	 */
	public boolean dodajStudenta(Student student) 
	{
		for(int i=0; i<studenti.size(); i++) 
		{
			if(studenti.get(i).getIndex()==student.getIndex()) 
			{
				return false;
			}
		}
		
		studenti.add(student);
		return true;
		
		}
	
	

	/**
	 * Funkcija dodajOcenu koja prima ocenu ocena i prolazi kros listu oecna gdje uporedjuje sifru proslijedjenog
	 * predmeta i sifru predmeta iz liste ocena. Vrsimo jos jednu provjeru za jednakost broja indexa studenta iz 
	 * lsite ocena i proslijedjenog broja indexa stduenta iz liste ocena. Ukoliko su jednake, onda ocena postoji u listi i vraca netacno odnosno
	 * ne dodaje se. Ukoliko nisu jednake znaci da ocena ne postoji u listi i dodajedmo je u lsitu ovom linijom koda
	 * "ocene.add(ocena);" i vracamo tacno jer je funkcija tipa boolean.
	 * @param ocena
	 * @return true
	 */
	public boolean dodajOcenu(Ocena ocena)
	{
		for(int i=0; i<ocene.size(); i++)
		{
			if(ocena.getPredmet().getSifraPredmeta().equals(ocene.get(i).getPredmet().getSifraPredmeta())) 
			{
				if(ocena.getStudent().getIndex()==ocene.get(i).getStudent().getIndex()) 
				{
					
					return false;
				}
				
			}
		}
		
		ocene.add(ocena);
		return true;
	}
	

	
	

    /**
     * getter za listu ocena
     * @return ocene
     */
	public ArrayList<Ocena> getOcene() {
		return ocene;
	}

    /**
     * setter za listu ocena
     * @param ocene
     */
	public void setOcene(ArrayList<Ocena> ocene) {
		this.ocene = ocene;
	}

    /**
     * getter za listu studenata
     * @return studenti
     */
	public ArrayList<Student> getStudenti() {
		return studenti;
	}

    /**
     * setter za listu studenata
     * @param studenti
     */
	public void setStudenti(ArrayList<Student> studenti) {
		this.studenti = studenti;
	}


     /**
      * getter za listu profesora
      * @return profesori
      */
	public ArrayList<Profesor> getProfesori() {
		return profesori;
	}


    /**
     * setter za listu profesora
     * @param profesori
     */
	public void setProfesori(ArrayList<Profesor> profesori) {
		this.profesori = profesori;
	}

	/**
	 * getter za listu predmeta
	 * @return predmeti
	 */
	public ArrayList<Predmet> getPredmeti() {
		return predmeti;
	}

	/**
	 * setter za listu predmeta
	 * @param predmeti
	 */
	public void setPredmeti(ArrayList<Predmet> predmeti) {
		this.predmeti = predmeti;
	}


	
	
	
	
	

}
