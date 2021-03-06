package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import Model.Predmet;
import View.MyWindow;
import View.ProzorIzmenaStudenta;
import View.ProzorUnosOcene;

public class DugmePolaganjeKontroler extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int indexp= ProzorIzmenaStudenta.getInstance().getNepolozeniPanel().getTblNepolozeni().getSelectedRow();
		Predmet p=MyWindow.getInstance().getModel().getPredmeti().get(indexp);
		ProzorUnosOcene.getInstance().getTxtSifra().setText(p.getSifraPredmeta());
		ProzorUnosOcene.getInstance().getTxtSifra().setEditable(false);
		ProzorUnosOcene.getInstance().getTxtNaziv().setText(p.getNazivPredmeta());
		ProzorUnosOcene.getInstance().getTxtNaziv().setEditable(false);
		if(indexp>=0)
		{
			ProzorUnosOcene.getInstance().show();
			
		}
	}

	public DugmePolaganjeKontroler()
	{
		super("Polaganje");
	}
}
