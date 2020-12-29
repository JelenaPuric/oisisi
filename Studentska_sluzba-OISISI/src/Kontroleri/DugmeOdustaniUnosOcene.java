package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.ProzorUnosOcene;

public class DugmeOdustaniUnosOcene extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ProzorUnosOcene.getInstance().dispose();
	}

	public DugmeOdustaniUnosOcene()
	{
		super("Odustani");
	}
}
