package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Kontroleri.PonistavanjeOceneKontroler;
import Model.Ocena;
import Model.Student;

public class PolozeniPanel extends JPanel
{
	private JButton btnPonistiOcenu;
	private JTable tblPolozeni;
	private DefaultTableModel dtmPolozeni;
	private static JLabel prosecnaOcena;
	private static JLabel ukupnoEspb;
	
	
public PolozeniPanel()
{
	this.setLayout(new BorderLayout());

	
	Object[] data= {"Šifra predmeta","Naziv predmeta","ESPB","Ocena","Datum"};
	dtmPolozeni=new DefaultTableModel(data,0);
	
	tblPolozeni=new JTable(dtmPolozeni);
	JScrollPane spPolozeni=new JScrollPane(tblPolozeni);
	this.add(spPolozeni,BorderLayout.CENTER);
	btnPonistiOcenu=new JButton(new PonistavanjeOceneKontroler());
  
	
	prosecnaOcena=new JLabel("Prosečna ocena:");
	ukupnoEspb=new JLabel("Ukupno ESPB:");
	 JPanel levi= new JPanel();
	 JPanel desni= new JPanel();
	 JPanel boxPanel= new JPanel();
	 boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.Y_AXIS));
	 
	 levi.setLayout(new FlowLayout(FlowLayout.LEFT));
	 desni.setLayout(new FlowLayout(FlowLayout.RIGHT));
	 levi.add(btnPonistiOcenu);
	 boxPanel.add(prosecnaOcena);
	 boxPanel.add(ukupnoEspb);
	 desni.add(boxPanel);
	 add(levi,BorderLayout.NORTH);
	 add(desni,BorderLayout.SOUTH); 
	
	
}



public JButton getBtnPonistiOcenu() {
	return btnPonistiOcenu;
}



public void setBtnPonistiOcenu(JButton btnPonistiOcenu) {
	this.btnPonistiOcenu = btnPonistiOcenu;
}



public JTable getTblPolozeni() {
	return tblPolozeni;
}



public void setTblPolozeni(JTable tblPolozeni) {
	this.tblPolozeni = tblPolozeni;
}



public JLabel getProsecnaOcena() {
	return prosecnaOcena;
}



public void setProsecnaOcena(JLabel prosecnaOcena) {
	this.prosecnaOcena = prosecnaOcena;
}



public JLabel getUkupnoEspb() {
	return ukupnoEspb;
}



public void setUkupnoEspb(JLabel ukupnoEspb) {
	this.ukupnoEspb = ukupnoEspb;
}



public DefaultTableModel getDtmPolozeni() {
	return dtmPolozeni;
}


public void setDtmPolozeni(DefaultTableModel dtmPolozeni) {
	this.dtmPolozeni = dtmPolozeni;
}


public static void Izracunaj() 
{
	double suma=0;
	int espb=0;
	int index=MyWindow.getInstance().getCentralniPanel().getTblStudenti().getSelectedRow();
	if(index==-1) 
	{
		return;
	}
	
	Student s=MyWindow.getInstance().getModel().getStudenti().get(index);
	ArrayList<Ocena> ocene=s.getOcjene();
	for(Ocena o: ocene) 
	{
		suma+=o.getVrijednostOcjene();
		espb=o.getPredmet().getEspBodovi();
	}
	double p=0;
	if(ocene.size()==0) 
	{
		p=0;
	}
	 p=suma/ocene.size();
	prosecnaOcena.setText("Prosecna ocena: "+p);
	ukupnoEspb.setText("ESPB :"+espb);
	
}


}
