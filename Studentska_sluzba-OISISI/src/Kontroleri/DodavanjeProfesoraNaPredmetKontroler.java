package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.DodavanjeProfesoraNaPredmet;

public class DodavanjeProfesoraNaPredmetKontroler extends AbstractAction
{
	
	public DodavanjeProfesoraNaPredmetKontroler()
	{
		super("+");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		DodavanjeProfesoraNaPredmet.getInstance().show();
	}

	

}
