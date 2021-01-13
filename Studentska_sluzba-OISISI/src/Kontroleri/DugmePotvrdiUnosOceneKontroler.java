package Kontroleri;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.AbstractAction;

import Model.Ocena;
import Model.Predmet;
import Model.Student;
import View.CentralniPanel;
import View.MyWindow;
import View.NepolozeniPanel;
import View.PolozeniPanel;
import View.ProzorIzmenaStudenta;
import View.ProzorUnosOcene;

public class DugmePotvrdiUnosOceneKontroler extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String sifra= ProzorUnosOcene.getInstance().getTxtSifra().getText();
		String naziv= ProzorUnosOcene.getInstance().getTxtNaziv().getText();
		int ocena;
		String datum= ProzorUnosOcene.getInstance().getTxtdatum().getText();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate datumpol=LocalDate.parse(datum,formatter);
		LocalDateTime dat=LocalDateTime.of(datumpol, LocalDateTime.now().toLocalTime());
		
		
		int ind= MyWindow.getInstance().getCentralniPanel().getTblStudenti().getSelectedRow();
		Student s= MyWindow.getInstance().getModel().getStudenti().get(ind);
		
		
		int indexp= ProzorIzmenaStudenta.getInstance().getNepolozeniPanel().getTblNepolozeni().getSelectedRow();
		Predmet p=s.getNepolozeniPredmeti().get(indexp);
		
		int index= ProzorUnosOcene.getInstance().getOcena().getSelectedIndex();
		if(index==0)
		{
			 ocena = 6;
		}
		else if(index==1)
		{
			 ocena= 7;
		}
		else if(index==2)
		{
			 ocena= 8;
		}
		else if(index==3)
		{
			 ocena=9;
			
		}
		else
		{
			 ocena=10;
		}
		
		
		Ocena o= new Ocena(s,p, ocena, dat);
		s.getOcjene().add(o);
		o.setStudent(s);
		System.out.println(s.getOcjene().size());
		s.getNepolozeniPredmeti().remove(indexp);
		//s.removePredmet(p.getSifraPredmeta());
		int indexP=ProzorIzmenaStudenta.getInstance().getNepolozeniPanel().getTblNepolozeni().getSelectedRow();
		
		ProzorIzmenaStudenta.getInstance().getNepolozeniPanel().getDtmNepolozeni().removeRow(indexp);
		Object[] rowData= {p.getSifraPredmeta(), p.getNazivPredmeta(), p.getEspBodovi(), o.getVrijednostOcjene(), o.getDatumPolaganjaPredmeta()};
		ProzorIzmenaStudenta.getInstance().getPolozeniPanel().getDtmPolozeni().addRow(rowData);
		PolozeniPanel.Izracunaj();
		ProzorUnosOcene.getInstance().dispose();
	}
	
	public DugmePotvrdiUnosOceneKontroler()
	{
		super("Potvrdi");
	}

}
