package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.PonistavanjeOcene;

public class PonistavanjeOceneKontroler extends AbstractAction {
	
	public PonistavanjeOceneKontroler()
	{
		super("Poništi ocenu");
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		PonistavanjeOcene.getInstance().show();
		
	}

	

}
