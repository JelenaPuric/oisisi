package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.MyWindow;
import View.ProzorUklanjanjeProfSaPredmeta;

public class DugmePotvrdiUklanjanjeProfSaPredmeta extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int index= MyWindow.getInstance().getCentralniPanel().getTblPredmeti().getSelectedRow();
		MyWindow.getInstance().getModel().getPredmeti().get(index).setProfesor(null);
		ProzorUklanjanjeProfSaPredmeta.getInstance().dispose();
		
		
	}
	public DugmePotvrdiUklanjanjeProfSaPredmeta() {
		super("Da");
	}

}
