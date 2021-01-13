package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.MyWindow;
import View.ProzorUklanjanjeProfSaPredmeta;

public class DugmeMinusKontroler extends AbstractAction
{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ProzorUklanjanjeProfSaPredmeta.getInstance().show();
	}

		public DugmeMinusKontroler()
		{
			super("-");
		}
}

