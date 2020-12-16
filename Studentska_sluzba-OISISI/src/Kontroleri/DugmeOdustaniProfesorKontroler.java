package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.ProzorDodajProfesora;

public class DugmeOdustaniProfesorKontroler extends  AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ProzorDodajProfesora.getInstance().dispose();
		
	}

	public DugmeOdustaniProfesorKontroler()
	{
		super("Odustani");
	}
}