package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import Model.Predmet;
import Model.Profesor;
import View.MyWindow;
import View.ProzorDodavanjePredmetaProfesoru;

public class DugmeDodajPredmetKontroler extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		ProzorDodavanjePredmetaProfesoru.getInstance().show();
		
	}
	
	public DugmeDodajPredmetKontroler()
	{
		super("Dodaj predmet");
	}

}
