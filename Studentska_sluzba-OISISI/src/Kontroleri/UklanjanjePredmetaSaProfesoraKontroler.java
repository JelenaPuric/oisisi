package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.UklanjanjePredmetaSaProfesora;


public class UklanjanjePredmetaSaProfesoraKontroler extends AbstractAction {
	
	public UklanjanjePredmetaSaProfesoraKontroler()
	{
		super("Ukloni predmet");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		UklanjanjePredmetaSaProfesora.getInstance().show();
	}



}