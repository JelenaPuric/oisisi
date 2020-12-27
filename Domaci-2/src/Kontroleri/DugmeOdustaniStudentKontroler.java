package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.ProzorDodajStudenta;


public class DugmeOdustaniStudentKontroler extends  AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ProzorDodajStudenta.getInstance().dispose();
		
	}

	public DugmeOdustaniStudentKontroler()
	{
		super("Odustani");
	}
}
