package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.ProzorUklanjanjeProfSaPredmeta;

public class DugmeOdustaniUklanjanjeProf extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ProzorUklanjanjeProfSaPredmeta.getInstance().dispose();
		
	}
	
	public DugmeOdustaniUklanjanjeProf()
	{
		super("Ne");
	}

}
