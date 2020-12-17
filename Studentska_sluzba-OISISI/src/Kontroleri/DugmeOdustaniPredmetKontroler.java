package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.ProzorDodajPredmet;

public class DugmeOdustaniPredmetKontroler extends  AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ProzorDodajPredmet.getInstance().dispose();
		
	}

	public DugmeOdustaniPredmetKontroler()
	{
		super("Odustani");
	}
}
