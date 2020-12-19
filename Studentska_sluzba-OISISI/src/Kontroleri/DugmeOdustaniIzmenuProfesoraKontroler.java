package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.ProzorIzmenaProfesora;

public class DugmeOdustaniIzmenuProfesoraKontroler extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ProzorIzmenaProfesora.getInstance().dispose();
	}
	
	public DugmeOdustaniIzmenuProfesoraKontroler()
	{
		super("Odustani");
	}

}
