package Kontroleri;


import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import Enums.TrenutnaGodina;
import Enums.Semestar;
import Enums.Status;
import Model.Predmet;
import Model.Profesor;
import Model.Student;
import View.MyWindow;
import View.PolozeniPanel;
import View.ProzorIzmenaPredmeta;
import View.ProzorIzmenaProfesora;
import View.ProzorIzmenaStudenta;

public class IzmenaEntitetKontroler extends AbstractAction
{


	public  IzmenaEntitetKontroler() 
	{
		super("Izmeni");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		int index=MyWindow.getInstance().getCentralniPanel().getTabbedPane().getSelectedIndex();
		if(index==0) 
		{
			int ind=MyWindow.getInstance().getCentralniPanel().getTblStudenti().getSelectedRow();
			if(ind!=-1) 
			{
				Student s=MyWindow.getInstance().getModel().getStudenti().get(ind);
				ProzorIzmenaStudenta.getInstance().getTxtIme().setText(s.getIme());
				ProzorIzmenaStudenta.getInstance().getTxtPrezime().setText(s.getPrezime());
				
				ProzorIzmenaStudenta.getInstance().getTxtDatumRodjenja().setText(s.getDatumRodjenja().toString());
				ProzorIzmenaStudenta.getInstance().getTxtAdresaStanovanja().setText(s.getAdresaStanovanja());
				ProzorIzmenaStudenta.getInstance().getTxtBrojTelefona().setText(s.getTelefon());
				ProzorIzmenaStudenta.getInstance().getTxtEmail().setText(s.getEmail());
				ProzorIzmenaStudenta.getInstance().getTxtBrojIndeksa().setText(s.getIndex());
				ProzorIzmenaStudenta.getInstance().getTxtGodinaUpisa().setText(String.valueOf(s.getGodinaUpisa()));
				if(s.getGodina()==TrenutnaGodina.prva) 
				{
					ProzorIzmenaStudenta.getInstance().getTrenutnaGodinaStudija().setSelectedIndex(0);
				}
				else if(s.getGodina()==TrenutnaGodina.druga)
				{
					ProzorIzmenaStudenta.getInstance().getTrenutnaGodinaStudija().setSelectedIndex(1);
				}
				else if(s.getGodina()==TrenutnaGodina.treca)
				{
					ProzorIzmenaStudenta.getInstance().getTrenutnaGodinaStudija().setSelectedIndex(2);
				}
				else
				{
					ProzorIzmenaStudenta.getInstance().getTrenutnaGodinaStudija().setSelectedIndex(3);
				}
				
				if(s.getStatus()==Status.B)
				{
					ProzorIzmenaStudenta.getInstance().getNacinFinansiranja().setSelectedIndex(0);
				}
				else
				{
					ProzorIzmenaStudenta.getInstance().getNacinFinansiranja().setSelectedIndex(1);
				}
				
					ProzorIzmenaStudenta.popuniPolozene();
				    ProzorIzmenaStudenta.popuniNepolozene();
				    PolozeniPanel.Izracunaj();
					ProzorIzmenaStudenta.getInstance().show();
				
			}
		}
			else if(index==1)
			{
				int ind1=MyWindow.getInstance().getCentralniPanel().getTblProfesori().getSelectedRow();
				if(ind1>=0) {
					
					Profesor p= MyWindow.getInstance().getModel().getProfesori().get(ind1);
					ProzorIzmenaProfesora.getInstance().getTxtIme().setText(p.getIme());
					ProzorIzmenaProfesora.getInstance().getTxtPrezime().setText(p.getPrezime());
					String date;
					date=String.valueOf(p.getDatum().getYear())+"-"+String.valueOf(p.getDatum().getMonthValue())+"-"+String.valueOf(p.getDatum().getDayOfMonth());
					
					
					ProzorIzmenaProfesora.getInstance().getTxtDatumRodjenja().setText(date);
					ProzorIzmenaProfesora.getInstance().getTxtAdresaStanovanja().setText(p.getAdresaStanovanja());
					ProzorIzmenaProfesora.getInstance().getTxtKontaktTelefon().setText(p.getKontaktTel());
					ProzorIzmenaProfesora.getInstance().getTxtEmail().setText(p.getEmail());
					ProzorIzmenaProfesora.getInstance().getTxtAdresaKancelarije().setText(p.getAdresaKancelarije());
					ProzorIzmenaProfesora.getInstance().getTxtBrojLicneKarte().setText(p.getBrojLicneKarte());
					int indexT= ProzorIzmenaProfesora.getInstance().getCmbTitula().getSelectedIndex();
					ProzorIzmenaProfesora.getInstance().getCmbTitula().setSelectedIndex(indexT);
					int indexZ= ProzorIzmenaProfesora.getInstance().getCmbZvanje().getSelectedIndex();
					ProzorIzmenaProfesora.getInstance().getCmbZvanje().setSelectedIndex(indexZ);
				ProzorIzmenaProfesora.getInstance().show();
				}
			}
			
		
		else if(index==2)
		{
			int ind=MyWindow.getInstance().getCentralniPanel().getTblPredmeti().getSelectedRow();
			if(ind!=-1)
			{
				Predmet p=MyWindow.getInstance().getModel().getPredmeti().get(ind);
				ProzorIzmenaPredmeta.getInstance().getTxtNazivPredmeta().setText(p.getNazivPredmeta());
			    ProzorIzmenaPredmeta.getInstance().getTxtSifraPredmeta().setText(p.getSifraPredmeta());
				ProzorIzmenaPredmeta.getInstance().getTxtPredmetniProfesor().setText(p.getProfesor());
			    ProzorIzmenaPredmeta.getInstance().getTxtEspb().setText(String.valueOf(p.getEspBodovi()));
			    
			    if(p.getSemestar()==Semestar.letnji)
			    {
			    	ProzorIzmenaPredmeta.getInstance().getSemestar().setSelectedIndex(0);
			    }
			    else
			    {
			    	ProzorIzmenaPredmeta.getInstance().getSemestar().setSelectedIndex(1);
			    }
			    
				if(p.getGodinaStudija()==TrenutnaGodina.prva) 
				{
					ProzorIzmenaPredmeta.getInstance().getGodinaStudija().setSelectedIndex(0);
				}
				else if(p.getGodinaStudija()==TrenutnaGodina.druga)
				{
					ProzorIzmenaPredmeta.getInstance().getGodinaStudija().setSelectedIndex(1);
				}
				else if(p.getGodinaStudija()==TrenutnaGodina.treca)
				{
					ProzorIzmenaPredmeta.getInstance().getGodinaStudija().setSelectedIndex(2);
				}
				else
				{
					ProzorIzmenaPredmeta.getInstance().getGodinaStudija().setSelectedIndex(3);
				}
				
			
				
					ProzorIzmenaPredmeta.getInstance().show();
				
			}
			}
				
		}
		
		
	}
   
  
