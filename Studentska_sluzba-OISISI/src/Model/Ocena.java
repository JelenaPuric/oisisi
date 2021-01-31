package Model;
import java.io.Serializable;
import java.time.LocalDateTime;
/**
 * 
 * @author Jelena Puric RA215-2018
 *
 */

public class Ocena implements Serializable {
     /**
	 * 
	 */
	
	private static final long serialVersionUID = 1307981810800486554L;
	private Student student;
     private Predmet predmet;
     private int vrijednostOcjene;
     private LocalDateTime datumPolaganjaPredmeta;
     
     /**
      * getter za studenta
      * @return student
      */
     public Student getStudent() {
		return student;
	}
     
     /**
      * setter za studenta
      * @param student
      */
	public void setStudent(Student student) {
		this.student = student;
	}
	
	/**
	 * getter za predmet
	 * @return predmet
	 */
	public Predmet getPredmet() {
		return predmet;
	}
	
	/**
	 * setter za predmet
	 * @param predmet
	 */
	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}
	
	/**
	 * getter za vrijednost ocjene
	 * @return vrijednostOcjene
	 */
	public int getVrijednostOcjene() {
		return vrijednostOcjene;
	}
	
	/**
	 * setter za vrijednost ocjene sa tim sto imamao uslove da ocjena moze biti od 6 do 10
	 * @param vrijednostOcjene
	 */
	public void setVrijednostOcjene(int vrijednostOcjene)
	{
		if(vrijednostOcjene>=6 && vrijednostOcjene<=10)
		{
		this.vrijednostOcjene = vrijednostOcjene;
	    }
	}
	
	/**
	 * getter za datum polaganja predmeta
	 * @return datumPolaganjaPredmeta
	 */
	public LocalDateTime getDatumPolaganjaPredmeta() {
		return datumPolaganjaPredmeta;
	}
	
	/**
	 * setter za datum polaganja predmeta
	 * @param datumPolaganjaPredmeta
	 */
	public void setDatumPolaganjaPredmeta(LocalDateTime datumPolaganjaPredmeta) {
		this.datumPolaganjaPredmeta = datumPolaganjaPredmeta;
	}
	
	/**
	 * konstruktor sa parametrima za klasu Ocena
	 * @param student
	 * @param predmet
	 * @param vrijednostOcjene
	 * @param datumPolaganjaPredmeta
	 */
	public Ocena(Student student, Predmet predmet, int vrijednostOcjene, LocalDateTime datumPolaganjaPredmeta) {
		super();
		this.student = student;
		this.predmet = predmet;
		this.vrijednostOcjene = vrijednostOcjene;
		this.datumPolaganjaPredmeta = datumPolaganjaPredmeta;
	}
	

}
