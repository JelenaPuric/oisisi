package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.DodavanjePredmetaStudentu;

public class DodavanjePredmetaStudentuKontroler extends AbstractAction
{

	public DodavanjePredmetaStudentuKontroler()
	{
		super("Dodaj");
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		DodavanjePredmetaStudentu.getInstance().show();
		
	}

}
