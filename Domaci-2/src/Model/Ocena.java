package Model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Ocena implements Serializable {
     private Student student;
     private Predmet predmet;
     private int vrijednostOcjene;
     private LocalDateTime datumPolaganjaPredmeta;
     
     public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Predmet getPredmet() {
		return predmet;
	}
	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}
	public int getVrijednostOcjene() {
		return vrijednostOcjene;
	}
	public void setVrijednostOcjene(int vrijednostOcjene)
	{
		if(vrijednostOcjene>=6 && vrijednostOcjene<=10)
		{
		this.vrijednostOcjene = vrijednostOcjene;
	    }
	}
	public LocalDateTime getDatumPolaganjaPredmeta() {
		return datumPolaganjaPredmeta;
	}
	public void setDatumPolaganjaPredmeta(LocalDateTime datumPolaganjaPredmeta) {
		this.datumPolaganjaPredmeta = datumPolaganjaPredmeta;
	}
	

}
