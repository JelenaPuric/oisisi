package Kontroleri;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import Model.Predmet;
import Model.Profesor;
import View.MyWindow;
import View.ProzorDodajProfesora;

public class PretragaKontroler extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int ind = MyWindow.getInstance().getCentralniPanel().getTabbedPane().getSelectedIndex();
		String text= MyWindow.getInstance().getToolBar().getPoljePretrazi().getText();
		ArrayList<Profesor> pretrazeniProfesori= new ArrayList<Profesor>();
		if(text.equals("")) 
		{
			JOptionPane.showMessageDialog(null, "Morate popuniti tekstualno polje za pretragu!!!");
			return;
		}
	
		String[] deloviLinije= text.split(" ");
		if(ind==0)
		{
			//to do
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
		
		
	}
	
	public PretragaKontroler()
	{
		super("Pretraga");
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

	//TODO POPUNITI DTM 
}
