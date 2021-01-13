package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.ProzorDodavanjePredmetaProfesoru;

public class DugmeOdustaniDodavanjePredmetaProfesoruKontroler extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ProzorDodavanjePredmetaProfesoru.getInstance().dispose();
	}
	
	public DugmeOdustaniDodavanjePredmetaProfesoruKontroler()
	{
		super("Odustani");
	}

}

