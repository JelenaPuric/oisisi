package Model;

import java.util.ArrayList;

public class Model {
	
	private ArrayList<Ocena> ocene;
	private ArrayList<Student> studenti;
	
	public Model() 
	{
		ocene= new ArrayList<Ocena>();
		
		studenti=new ArrayList<Student>();
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
			if(ocena.getPredmet().getSifraPredmeta()==ocene.get(i).getPredmet().getSifraPredmeta()) 
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

}
