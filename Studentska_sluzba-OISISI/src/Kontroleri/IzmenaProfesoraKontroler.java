package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import Model.Profesor;
import View.MyWindow;
import View.ProzorIzmenaProfesora;

public class IzmenaProfesoraKontroler extends AbstractAction {

	 public IzmenaProfesoraKontroler() {
		super("Izmeni");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int index=MyWindow.getInstance().getCentralniPanel().getTblProfesori().getSelectedRow();
		if(index!=-1) 
		{
			Profesor p= MyWindow.getInstance().getModel().getProfesori().get(index);
			ProzorIzmenaProfesora.getInstance().getTxtIme().setText(p.getIme());
			ProzorIzmenaProfesora.getInstance().getTxtPrezime().setText(p.getPrezime());
			//TODO datum format yyyy-mm-dd
			ProzorIzmenaProfesora.getInstance().getTxtDatumRodjenja().setText(p.getDatum().toString());
			ProzorIzmenaProfesora.getInstance().getTxtAdresaStanovanja().setText(p.getAdresaStanovanja());
			ProzorIzmenaProfesora.getInstance().getTxtKontaktTelefon().setText(p.getKontaktTel());
			ProzorIzmenaProfesora.getInstance().getTxtEmail().setText(p.getEmail());
			ProzorIzmenaProfesora.getInstance().getTxtAdresaKancelarije().setText(p.getAdresaKancelarije());
			ProzorIzmenaProfesora.getInstance().getTxtBrojLicneKarte().setText(p.getBrojLicneKarte());
			ProzorIzmenaProfesora.getInstance().getTxtTitula().setText(p.getTitula());
			ProzorIzmenaProfesora.getInstance().getTxtZvanje().setText(p.getZvanja());
		 ProzorIzmenaProfesora.getInstance().show();
		}
	}

}
