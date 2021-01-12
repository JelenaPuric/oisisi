package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Kontroleri.DodajStudentaController;

public class ProzorDodajStudenta extends JFrame
{
  private JTextField txtIme;
  private JTextField txtPrezime;
  private JTextField txtDatumRodjenja;
  private JTextField txtAdresaStanovanja;
  private JTextField txtBrojTelefona;
  private JTextField txtEmail;
  private JTextField txtBrojIndeksa;
  private JTextField txtGodinaUpisa;
  private JComboBox<String> trenutnaGodinaStudija;
  private JComboBox<String> nacinFinansiranja;
  private JButton potvrdi;
  private JButton odustani;
  private JLabel lblIme;
  private JLabel lblPrezime;
  private JLabel lblDatumRodjenja;
  private JLabel lblAdresaStanovanja;
  private JLabel lblBrojTelefona;
  private JLabel lblEmail;
  private JLabel lblBrojIndeksa;
  private JLabel lblGodinaUpisa;
  private JLabel lblTrenutnaGodinaStudija;
  private JLabel lblNacinFinansiranja;
  private static ProzorDodajStudenta instance;
  
  public static ProzorDodajStudenta getInstance() 
  {
	  if(instance==null) 
	  {
		  instance= new ProzorDodajStudenta();
	  }
	  return instance;
	  
  }
  
  public ProzorDodajStudenta()
  {
	  setTitle("Dodavanje studenta");
	 
	  setLayout(new BorderLayout());
	  JPanel mainPanel=new JPanel();
	  setPreferredSize(new Dimension(600,500));
	  pack();
	  
	  mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));	  
	  JPanel pnlIme=new JPanel();
	  JPanel pnlPrezime=new JPanel();
	  JPanel pnlDatumRodjenja=new JPanel();
	  JPanel pnlAdresaStanovanja=new JPanel();
	  JPanel pnlBrojTelefona=new JPanel();
	  JPanel pnlEmail=new JPanel();
	  JPanel pnlBrojIndeksa=new JPanel();
	  JPanel pnlGodinaUpisa=new JPanel();
	  JPanel pnlTrenutnaGodinaStudija=new JPanel();
	  JPanel pnlNacinFinansiranja=new JPanel();
	  JPanel pnlDugme=new JPanel();
	  
	  Dimension dim= new Dimension(100,20);
	  lblIme= new JLabel("Ime*");
	  txtIme=new JTextField();
	  txtIme.setPreferredSize(dim);
	  lblPrezime=new JLabel("Prezime*");
	  txtPrezime=new JTextField();
	  txtPrezime.setPreferredSize(dim);
	  lblDatumRodjenja=new JLabel("Datum rodjenja*");
	  txtDatumRodjenja=new JTextField();
	  txtDatumRodjenja.setPreferredSize(dim);
	  lblAdresaStanovanja=new JLabel("Adresa stanovanja*");
	  txtAdresaStanovanja=new JTextField();
	  txtAdresaStanovanja.setPreferredSize(dim);
	  lblBrojTelefona=new JLabel("Broj telefona*");
	  txtBrojTelefona=new JTextField();
	  txtBrojTelefona.setPreferredSize(dim);
	  lblEmail=new JLabel("E-mail adresa*");
	  txtEmail=new JTextField();
	  txtEmail.setPreferredSize(dim);
	  lblBrojIndeksa=new JLabel("Broj indeksa*");
	  txtBrojIndeksa=new JTextField();
	  txtBrojIndeksa.setPreferredSize(dim);
	  lblGodinaUpisa=new JLabel("Godina upisa*");
	  txtGodinaUpisa=new JTextField();
	  txtGodinaUpisa.setPreferredSize(dim);
	  lblTrenutnaGodinaStudija=new JLabel("Trenutna godina studija*");
	  trenutnaGodinaStudija=new JComboBox<String>();
	  trenutnaGodinaStudija.setPreferredSize(dim);
	  lblNacinFinansiranja=new JLabel("Način finansiranja*");
	  nacinFinansiranja=new JComboBox<String>();
	  nacinFinansiranja.setPreferredSize(dim);
	  potvrdi=new JButton(new DodajStudentaController());
	  odustani=new JButton("Odustani");
	  trenutnaGodinaStudija.addItem("I(prvo)");
	  trenutnaGodinaStudija.addItem("II(druga)");
	  trenutnaGodinaStudija.addItem("III(treća)");
	  trenutnaGodinaStudija.addItem("IV(četvrta)");
	  nacinFinansiranja.addItem("Budžet");
	  nacinFinansiranja.addItem("Samofinansiranje");
	  
	  pnlIme.setLayout(new FlowLayout());
	  pnlIme.add(lblIme);
	  pnlIme.add(txtIme);
	  pnlPrezime.setLayout(new FlowLayout());
	  pnlPrezime.add(lblPrezime);
	  pnlPrezime.add(txtPrezime);
	  pnlDatumRodjenja.setLayout(new FlowLayout());
	  pnlDatumRodjenja.add(lblDatumRodjenja);
	  pnlDatumRodjenja.add(txtDatumRodjenja);
	  pnlAdresaStanovanja.setLayout(new FlowLayout());
	  pnlAdresaStanovanja.add(lblAdresaStanovanja);
	  pnlAdresaStanovanja.add(txtAdresaStanovanja);
      pnlBrojTelefona.setLayout(new FlowLayout());
	  pnlBrojTelefona.add(lblBrojTelefona);
	  pnlBrojTelefona.add(txtBrojTelefona);
	  pnlEmail.setLayout(new FlowLayout());
	  pnlEmail.add(lblEmail);
	  pnlEmail.add(txtEmail);
	  pnlBrojIndeksa.setLayout(new FlowLayout());
	  pnlBrojIndeksa.add(lblBrojIndeksa);
	  pnlBrojIndeksa.add(txtBrojIndeksa);
	  pnlGodinaUpisa.setLayout(new FlowLayout());
	  pnlGodinaUpisa.add(lblGodinaUpisa);
	  pnlGodinaUpisa.add(txtGodinaUpisa);
	  pnlTrenutnaGodinaStudija.setLayout(new FlowLayout());
	  pnlTrenutnaGodinaStudija.add(lblTrenutnaGodinaStudija);
	  pnlTrenutnaGodinaStudija.add(trenutnaGodinaStudija);
	  pnlNacinFinansiranja.setLayout(new FlowLayout());
	  pnlNacinFinansiranja.add(lblNacinFinansiranja);
	  pnlNacinFinansiranja.add(nacinFinansiranja);
	  pnlDugme.setLayout(new FlowLayout());
	  pnlDugme.add(potvrdi);
	  pnlDugme.add(odustani);
	  
	  mainPanel.add(pnlIme);
	  mainPanel.add(pnlPrezime);
	  mainPanel.add(pnlDatumRodjenja);
	  mainPanel.add(pnlAdresaStanovanja);
	  mainPanel.add(pnlBrojTelefona);
	  mainPanel.add(pnlEmail);
	  mainPanel.add(pnlBrojIndeksa);
	  mainPanel.add(pnlGodinaUpisa);
	  mainPanel.add(pnlTrenutnaGodinaStudija);
	  mainPanel.add(pnlNacinFinansiranja);
	  mainPanel.add(pnlDugme);
	  
	  
	  add(mainPanel,BorderLayout.CENTER);
	  
	  
	  
  }

public JTextField getTxtIme() {
	return txtIme;
}

public void setTxtIme(JTextField txtIme) {
	this.txtIme = txtIme;
}

public JTextField getTxtPrezime() {
	return txtPrezime;
}

public void setTxtPrezime(JTextField txtPrezime) {
	this.txtPrezime = txtPrezime;
}

public JTextField getTxtDatumRodjenja() {
	return txtDatumRodjenja;
}

public void setTxtDatumRodjenja(JTextField txtDatumRodjenja) {
	this.txtDatumRodjenja = txtDatumRodjenja;
}

public JTextField getTxtAdresaStanovanja() {
	return txtAdresaStanovanja;
}

public void setTxtAdresaStanovanja(JTextField txtAdresaStanovanja) {
	this.txtAdresaStanovanja = txtAdresaStanovanja;
}

public JTextField getTxtBrojTelefona() {
	return txtBrojTelefona;
}

public void setTxtBrojTelefona(JTextField txtBrojTelefona) {
	this.txtBrojTelefona = txtBrojTelefona;
}

public JTextField getTxtEmail() {
	return txtEmail;
}

public void setTxtEmail(JTextField txtEmail) {
	this.txtEmail = txtEmail;
}

public JTextField getTxtBrojIndeksa() {
	return txtBrojIndeksa;
}

public void setTxtBrojIndeksa(JTextField txtBrojIndeksa) {
	this.txtBrojIndeksa = txtBrojIndeksa;
}

public JTextField getTxtGodinaUpisa() {
	return txtGodinaUpisa;
}

public void setTxtGodinaUpisa(JTextField txtGodinaUpisa) {
	this.txtGodinaUpisa = txtGodinaUpisa;
}

public JComboBox<String> getTrenutnaGodinaStudija() {
	return trenutnaGodinaStudija;
}

public void setTrenutnaGodinaStudija(JComboBox<String> trenutnaGodinaStudija) {
	this.trenutnaGodinaStudija = trenutnaGodinaStudija;
}

public JComboBox<String> getNacinFinansiranja() {
	return nacinFinansiranja;
}

public void setNacinFinansiranja(JComboBox<String> nacinFinansiranja) {
	this.nacinFinansiranja = nacinFinansiranja;
}

public JButton getPotvrdi() {
	return potvrdi;
}

public void setPotvrdi(JButton potvrdi) {
	this.potvrdi = potvrdi;
}

public JButton getOdustani() {
	return odustani;
}

public void setOdustani(JButton odustani) {
	this.odustani = odustani;
}

public JLabel getLblIme() {
	return lblIme;
}

public void setLblIme(JLabel lblIme) {
	this.lblIme = lblIme;
}

public JLabel getLblPrezime() {
	return lblPrezime;
}

public void setLblPrezime(JLabel lblPrezime) {
	this.lblPrezime = lblPrezime;
}

public JLabel getLblDatumRodjenja() {
	return lblDatumRodjenja;
}

public void setLblDatumRodjenja(JLabel lblDatumRodjenja) {
	this.lblDatumRodjenja = lblDatumRodjenja;
}

public JLabel getLblAdresaStanovanja() {
	return lblAdresaStanovanja;
}

public void setLblAdresaStanovanja(JLabel lblAdresaStanovanja) {
	this.lblAdresaStanovanja = lblAdresaStanovanja;
}

public JLabel getLblBrojTelefona() {
	return lblBrojTelefona;
}

public void setLblBrojTelefona(JLabel lblBrojTelefona) {
	this.lblBrojTelefona = lblBrojTelefona;
}

public JLabel getLblEmail() {
	return lblEmail;
}

public void setLblEmail(JLabel lblEmail) {
	this.lblEmail = lblEmail;
}

public JLabel getLblBrojIndeksa() {
	return lblBrojIndeksa;
}

public void setLblBrojIndeksa(JLabel lblBrojIndeksa) {
	this.lblBrojIndeksa = lblBrojIndeksa;
}

public JLabel getLblGodinaUpisa() {
	return lblGodinaUpisa;
}

public void setLblGodinaUpisa(JLabel lblGodinaUpisa) {
	this.lblGodinaUpisa = lblGodinaUpisa;
}

public JLabel getLblTrenutnaGodinaStudija() {
	return lblTrenutnaGodinaStudija;
}

public void setLblTrenutnaGodinaStudija(JLabel lblTrenutnaGodinaStudija) {
	this.lblTrenutnaGodinaStudija = lblTrenutnaGodinaStudija;
}

public JLabel getLblNacinFinansiranja() {
	return lblNacinFinansiranja;
}

public void setLblNacinFinansiranja(JLabel lblNacinFinansiranja) {
	this.lblNacinFinansiranja = lblNacinFinansiranja;
}
  
  
}