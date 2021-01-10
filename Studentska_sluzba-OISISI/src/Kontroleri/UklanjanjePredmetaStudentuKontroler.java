package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.UklanjanjePredmetaStudentu;

public class UklanjanjePredmetaStudentuKontroler extends AbstractAction {
	
	public UklanjanjePredmetaStudentuKontroler()
	{
		super("Ukloni");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		UklanjanjePredmetaStudentu.getInstance().show();
	}



}
