package Kontroleri;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import File.Configuartion;
import Model.Predmet;
import Model.Profesor;
import Model.Student;
import View.MyWindow;
import View.ProzorDodajProfesora;

public class PretragaKontroler extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int ind = MyWindow.getInstance().getCentralniPanel().getTabbedPane().getSelectedIndex();
		String text= MyWindow.getInstance().getToolBar().getPoljePretrazi().getText();
		String[] deloviLinije= text.split("// ");
		
		ArrayList<Profesor> pretrazeniProfesori= new ArrayList<Profesor>();
		ArrayList<Predmet> pretrazeniPredmeti= new ArrayList<Predmet>();
		ArrayList<Student> pretrazeniStudenti= new ArrayList<Student>();
		if(text.equals(" ")) 
		{
			JOptionPane.showMessageDialog(null, "Morate popuniti tekstualno polje za pretragu!!!");
			return;
		}
	
		
		if(ind==0)
		{
			if(deloviLinije.length==1)
			{
				String deoPrezimena=deloviLinije[0];
				for(int i=0; i<MyWindow.getInstance().getModel().getStudenti().size(); i++)
				{
					Student st=MyWindow.getInstance().getModel().getStudenti().get(i);
					if(st.getPrezime().toLowerCase().contains(deoPrezimena.toLowerCase()))
					{
						pretrazeniStudenti.add(st);
					}
				}
				
				popuniPretrazeneStudente(pretrazeniStudenti);
			}
			
			else if(deloviLinije.length==2)
			{
				String deoPrezimena=deloviLinije[0];
				String deoImena=deloviLinije[1];
				for(int i=0; i<MyWindow.getInstance().getModel().getStudenti().size(); i++)
				{
					Student st=MyWindow.getInstance().getModel().getStudenti().get(i);
					if(st.getIme().toLowerCase().contains(deoImena.toLowerCase()) && st.getPrezime().toLowerCase().contains(deoPrezimena.toLowerCase()) )
					{
						pretrazeniStudenti.add(st);
					}
				}
				
				popuniPretrazeneStudente(pretrazeniStudenti);
				
			}
			
			else if(deloviLinije.length==3)
			{
				String deoPrezimena=deloviLinije[0];
				String deoImena=deloviLinije[1];
				String deoIndexa=deloviLinije[2];
				for(int i=0; i<MyWindow.getInstance().getModel().getStudenti().size(); i++)
				{
					Student st=MyWindow.getInstance().getModel().getStudenti().get(i);
					if(st.getIndex().toLowerCase().contains(deoIndexa.toLowerCase()) && st.getPrezime().toLowerCase().contains(deoPrezimena.toLowerCase()) && st.getIme().toLowerCase().contains(deoImena.toLowerCase()) )
					{
						pretrazeniStudenti.add(st);
					}
				}
				
				popuniPretrazeneStudente(pretrazeniStudenti);
			}
			
			
				
			
		}
		
		else if(ind==1)
		{
			if(deloviLinije.length==1)
			{
				String deoPrezimena=deloviLinije[0];
				for(int i=0; i<MyWindow.getInstance().getModel().getProfesori().size(); i++) 
				{
					Profesor p= MyWindow.getInstance().getModel().getProfesori().get(i);
					if(p.getPrezime().toLowerCase().contains(deoPrezimena.toLowerCase())) 
					{
						pretrazeniProfesori.add(p);
						
					}
					
				}
				
				
				popuniPretrazeneProfesore(pretrazeniProfesori);				
				
				
			}
				else if(deloviLinije.length==2) 
				{
					String deoPrezimena=deloviLinije[0];
					String deoImena=deloviLinije[1];
					for(int i=0; i<MyWindow.getInstance().getModel().getProfesori().size(); i++)
					{
						Profesor p= MyWindow.getInstance().getModel().getProfesori().get(i);
						if(p.getPrezime().contains(deoPrezimena) && p.getIme().contains(deoImena))
						{
							pretrazeniProfesori.add(p);
						}
						
					}
					popuniPretrazeneProfesore(pretrazeniProfesori);
				}
				
			
			
		}
		else
		{
			for(int i=0; i<MyWindow.getInstance().getModel().getPredmeti().size(); i++) 
			{
				Predmet p= MyWindow.getInstance().getModel().getPredmeti().get(i);
				if(p.getNazivPredmeta().contains(text)) 
				{
					pretrazeniPredmeti.add(p);
					
				}
				
			}
			
			
			popuniPretrazenePredmete(pretrazeniPredmeti);	
		}
		
	}
	
	public PretragaKontroler()
	{
		super("Pretraga");
	}
	
	public void popuniPretrazeneStudente(ArrayList<Student> studenti)
	{
		MyWindow.getInstance().getCentralniPanel().getDtmStudenti().setRowCount(0);
		for(int i=0; i<studenti.size(); i++) 
		{
			Student s=studenti.get(i);
			Object[] data= {s.getIndex(),s.getIme(),s.getPrezime(),s.getGodina(),s.getStatus(),s.getProsjecnaOcjena()};
			MyWindow.getInstance().getCentralniPanel().getDtmStudenti().addRow(data);
			
		}
	}
	
	
	public void popuniPretrazeneProfesore(ArrayList<Profesor> profesori) 
	{
		MyWindow.getInstance().getCentralniPanel().getDtmProfesori().setRowCount(0);
		
		 for(int i=0; i<profesori.size(); i++) 
		   {
			   Profesor p=profesori.get(i);
			   Object[] data2= {p.getPrezime(), p.getIme(), p.getTitula(), p.getZvanja()};
			   MyWindow.getInstance().getCentralniPanel().getDtmProfesori().addRow(data2);
			   
		   }
			
	}
	
	public void popuniPretrazenePredmete(ArrayList<Predmet> predmeti)
	{
		MyWindow.getInstance().getCentralniPanel().getDtmPredmeti().setRowCount(0);
		
		for(int i=0; i<predmeti.size(); i++)
		{
			Predmet p=predmeti.get(i);
			Object[] data3= {p.getSifraPredmeta(), p.getNazivPredmeta(), p.getEspBodovi(), p.getGodinaStudija(), p.getSemestar()};
			MyWindow.getInstance().getCentralniPanel().getDtmPredmeti().addRow(data3);
		}
	}

	//TODO POPUNITI DTM 
}
