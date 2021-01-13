package Model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Model implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7535166678034277659L;
	private ArrayList<Ocena> ocene;
	private ArrayList<Student> studenti;
	private ArrayList<Profesor> profesori;
	private ArrayList<Predmet> predmeti;

	public Model() 
	{
		ocene= new ArrayList<Ocena>();
		profesori= new ArrayList<Profesor>();
		studenti=new ArrayList<Student>();
		predmeti= new ArrayList<Predmet>();
	}
	
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
	
	public  boolean izbrisiProfesora(Profesor p)
	{
		for(int i=0; i<profesori.size(); i++)
		{	
			if(profesori.get(i).getBrojLicneKarte().equals(p.getBrojLicneKarte()))
			{
				studenti.remove(p);
				return true;
			}
		}
	return false;
	}
	
	
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
	

	
	


	public ArrayList<Ocena> getOcene() {
		return ocene;
	}


	public void setOcene(ArrayList<Ocena> ocene) {
		this.ocene = ocene;
	}


	public ArrayList<Student> getStudenti() {
		return studenti;
	}


	public void setStudenti(ArrayList<Student> studenti) {
		this.studenti = studenti;
	}



	public ArrayList<Profesor> getProfesori() {
		return profesori;
	}



	public void setProfesori(ArrayList<Profesor> profesori) {
		this.profesori = profesori;
	}

	public ArrayList<Predmet> getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(ArrayList<Predmet> predmeti) {
		this.predmeti = predmeti;
	}


	
	
	
	
	

}
