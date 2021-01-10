package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Kontroleri.DodavanjePredmetaStudentuKontroler;
import Kontroleri.DugmePolaganjeKontroler;
import Kontroleri.UklanjanjePredmetaStudentuKontroler;


public class NepolozeniPanel extends JPanel
{
  private JButton btnDodaj;
  private JButton btnObrisi;
  private JButton btnPolaganje;
  private JTable tblNepolozeni;
  private DefaultTableModel dtmNepolozeni;
  
  
  public NepolozeniPanel()
  {
	  this.setLayout(new BorderLayout());
	  
	  Object[] data= {"Šifra predmeta", "Naziv predmeta", "ESPB","Godina studija","Semestar"};
	  dtmNepolozeni=new DefaultTableModel(data,0);
		
		tblNepolozeni=new JTable(dtmNepolozeni);
		JScrollPane spNepolozeni=new JScrollPane(tblNepolozeni);
		this.add(spNepolozeni,BorderLayout.CENTER);
		
	btnDodaj=new JButton(new DodavanjePredmetaStudentuKontroler());
	btnObrisi=new JButton(new UklanjanjePredmetaStudentuKontroler());
	btnPolaganje=new JButton(new DugmePolaganjeKontroler());
	
	 JPanel levi=new JPanel(); 
	 levi.setLayout(new FlowLayout(FlowLayout.LEFT));
	 levi.add(btnDodaj);
	 levi.add(btnObrisi);
	 levi.add(btnPolaganje);
	 add(levi,BorderLayout.NORTH);
	  
  }

public JButton getBtnDodaj() {
	return btnDodaj;
}

public void setBtnDodaj(JButton btnDodaj) {
	this.btnDodaj = btnDodaj;
}

public JButton getBtnObrisi() {
	return btnObrisi;
}

public void setBtnObrisi(JButton btnObrisi) {
	this.btnObrisi = btnObrisi;
}

public JButton getBtnPolaganje() {
	return btnPolaganje;
}

public void setBtnPolaganje(JButton btnPolaganje) {
	this.btnPolaganje = btnPolaganje;
}

public JTable getTblNepolozeni() {
	return tblNepolozeni;
}

public void setTblNepolozeni(JTable tblNepolozeni) {
	this.tblNepolozeni = tblNepolozeni;
}

public DefaultTableModel getDtmNepolozeni() {
	return dtmNepolozeni;
}

public void setDtmNepolozeni(DefaultTableModel dtmNepolozeni) {
	this.dtmNepolozeni = dtmNepolozeni;
}
  
  
  
}