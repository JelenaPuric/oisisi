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
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Kontroleri.DugmeOdustaniIzmenuProfesoraKontroler;
import Kontroleri.DugmePotvrdiIzmenuProfesora;
import Model.Predmet;

public class ProzorIzmenaProfesora extends JFrame{
	
	 private JTabbedPane tabbedPane;
	  private JTable tblInformacije;
	  private JTable tblPredmeti;
	  private DefaultTableModel dtmInfromacije;
	  private DefaultTableModel dtmPredmeti;
	  private JTextField txtIme;
	  private JTextField txtPrezime;
	  private JComboBox<String> cmbTitula;
	  private JComboBox<String> cmbZvanje;
	  private JTextField txtDatumRodjenja;
	  private JTextField txtAdresaStanovanja;
	  private JTextField txtKontaktTelefon;
	  private JTextField txtEmail;
	  private JTextField txtAdresaKancelarije;
	  private JTextField txtBrojLicneKarte;
	  private JButton potvrdi;
	  private JButton odustani;
	  private JLabel lblIme;
	  private JLabel lblPrezime;
	  private JLabel lblDatumRodjenja;
	  private JLabel lblAdresaStanovanja;
	  private JLabel lblKontaktTelefon;
	  private JLabel lblEmail;
	  private JLabel lblTitula;
	  private JLabel lblZvanje;
	  private JLabel lblAdresaKancelarije;
	  private JLabel lblBrojLicneKarte;
	  private JButton dodaj;
	  private JButton ukloni;
	  private static ProzorIzmenaProfesora instance;
	  
	  
	  
	  public static ProzorIzmenaProfesora getInstance() 
	  {
		  if(instance==null) 
		  {
			  instance= new ProzorIzmenaProfesora();
		  }
		  return instance;
		  
	  }
	  
	  public ProzorIzmenaProfesora()
	  {
		  setTitle("Izmena profesora");
		  setLayout(new BorderLayout());
		  JPanel mainPanel=new JPanel();
		  mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));	  
		  JPanel pnlIme=new JPanel();
		  JPanel pnlPrezime=new JPanel();
		  JPanel pnlDatumRodjenja=new JPanel();
		  JPanel pnlAdresaStanovanja=new JPanel();
		  JPanel pnlKontaktTelefon=new JPanel();
		  JPanel pnlEmail=new JPanel();
		  JPanel pnlAdresaKancelarije=new JPanel();
		  JPanel pnlBrojLicneKarte=new JPanel();
		  JPanel pnlTitula=new JPanel();
		  JPanel pnlZvanje=new JPanel();
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
		  lblKontaktTelefon=new JLabel("Broj telefona*");
		  txtKontaktTelefon=new JTextField();
		  txtKontaktTelefon.setPreferredSize(dim);
		  lblEmail=new JLabel("E-mail adresa*");
		  txtEmail=new JTextField();
		  txtEmail.setPreferredSize(dim);
		  lblAdresaKancelarije=new JLabel("Adresa kancelarije*");
		  txtAdresaKancelarije=new JTextField();
		  txtAdresaKancelarije.setPreferredSize(dim);
		  lblBrojLicneKarte=new JLabel("Broj licne karte*");
		  txtBrojLicneKarte=new JTextField();
		  txtBrojLicneKarte.setPreferredSize(dim);
		  lblTitula=new JLabel("Titula*");
		  cmbTitula=new JComboBox<String>();
			 
		  lblZvanje=new JLabel("Zvanje*");
		  cmbZvanje=new JComboBox<String>();
		 
		    cmbTitula.addItem("BSc");
			cmbTitula.addItem("MSc");
			cmbTitula.addItem("mr");
			cmbTitula.addItem("dr");
			cmbTitula.addItem("prof. dr");

			cmbZvanje.addItem("saradnik u nastavi");
			cmbZvanje.addItem("asistent");
			cmbZvanje.addItem("asistent sa doktoratom");
			cmbZvanje.addItem("docent");
			cmbZvanje.addItem("vanredni profesor");
			cmbZvanje.addItem("redovni profesor");
			cmbZvanje.addItem("profesor emeritus");
	
	
		  potvrdi=new JButton(new DugmePotvrdiIzmenuProfesora());
		  odustani=new JButton(new DugmeOdustaniIzmenuProfesoraKontroler());
		
		  
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
	      pnlKontaktTelefon.setLayout(new FlowLayout());
		  pnlKontaktTelefon.add(lblKontaktTelefon);
		  pnlKontaktTelefon.add(txtKontaktTelefon);
		  pnlEmail.setLayout(new FlowLayout());
		  pnlEmail.add(lblEmail);
		  pnlEmail.add(txtEmail);
		  pnlAdresaKancelarije.setLayout(new FlowLayout());
		  pnlAdresaKancelarije.add(lblAdresaKancelarije);
		  pnlAdresaKancelarije.add(txtAdresaKancelarije);
		  pnlBrojLicneKarte.setLayout(new FlowLayout());
		  pnlBrojLicneKarte.add(lblBrojLicneKarte);
		  pnlBrojLicneKarte.add(txtBrojLicneKarte);
		  pnlTitula.setLayout(new FlowLayout());
		  pnlTitula.add(lblTitula);
		  pnlTitula.add(cmbTitula);
		  pnlZvanje.setLayout(new FlowLayout());
		  pnlZvanje.add(lblZvanje);
		  pnlZvanje.add(cmbZvanje);
		  pnlDugme.setLayout(new FlowLayout());
		  pnlDugme.add(potvrdi);
		  pnlDugme.add(odustani);
		  
		  mainPanel.add(pnlIme);
		  mainPanel.add(pnlPrezime);
		  mainPanel.add(pnlDatumRodjenja);
		  mainPanel.add(pnlAdresaStanovanja);
		  mainPanel.add(pnlKontaktTelefon);
		  mainPanel.add(pnlEmail);
		  mainPanel.add(pnlAdresaKancelarije);
		  mainPanel.add(pnlBrojLicneKarte);
		  mainPanel.add(pnlTitula);
		  mainPanel.add(pnlZvanje);
		  mainPanel.add(pnlDugme);
		  

		  dodaj= new JButton("Dodaj predmet");
		  ukloni= new JButton("Ukloni predmet");
		  
		  JPanel pnlb= new JPanel();
		  pnlb.add(dodaj);
		  pnlb.add(ukloni);
		  
		  
		  tabbedPane=new JTabbedPane();
		  
		  
		  Object[] naslovi= {"Sifra", "Naziv","Godina studija","Semestar" };
		  dtmPredmeti= new DefaultTableModel(naslovi,0);
		  
		  setLayout(new BorderLayout());
		  tblPredmeti= new JTable(dtmPredmeti);
		  setPreferredSize(new Dimension(800,600));
		  pack();
		  
		  
		    JPanel p= new JPanel();
		    p.setLayout(new BorderLayout());
		    JScrollPane sp= new JScrollPane(tblPredmeti);
		    p.add(sp,BorderLayout.CENTER);
		    p.add(pnlb,BorderLayout.NORTH);
		    tabbedPane.add("Informacije",mainPanel);
		    tabbedPane.add("Predmeti",p);
		    
		    
		    
			
			add(tabbedPane,BorderLayout.CENTER);
		  
		  
		
		  
	  }

	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public void setTabbedPane(JTabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}

	public JTable getTblInformacije() {
		return tblInformacije;
	}

	public void setTblInformacije(JTable tblInformacije) {
		this.tblInformacije = tblInformacije;
	}

	public JTable getTblPredmeti() {
		return tblPredmeti;
	}

	public void setTblPredmeti(JTable tblPredmeti) {
		this.tblPredmeti = tblPredmeti;
	}

	public DefaultTableModel getDtmInfromacije() {
		return dtmInfromacije;
	}

	public void setDtmInfromacije(DefaultTableModel dtmInfromacije) {
		this.dtmInfromacije = dtmInfromacije;
	}

	public DefaultTableModel getDtmPredmeti() {
		return dtmPredmeti;
	}

	public void setDtmPredmeti(DefaultTableModel dtmPredmeti) {
		this.dtmPredmeti = dtmPredmeti;
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

	
	public JComboBox<String> getCmbTitula() {
		return cmbTitula;
	}

	public void setCmbTitula(JComboBox<String> cmbTitula) {
		this.cmbTitula = cmbTitula;
	}

	public JComboBox<String> getCmbZvanje() {
		return cmbZvanje;
	}

	public void setCmbZvanje(JComboBox<String> cmbZvanje) {
		this.cmbZvanje = cmbZvanje;
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

	public JTextField getTxtKontaktTelefon() {
		return txtKontaktTelefon;
	}

	public void setTxtKontaktTelefon(JTextField txtKontaktTelefon) {
		this.txtKontaktTelefon = txtKontaktTelefon;
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}

	public JTextField getTxtAdresaKancelarije() {
		return txtAdresaKancelarije;
	}

	public void setTxtAdresaKancelarije(JTextField txtAdresaKancelarije) {
		this.txtAdresaKancelarije = txtAdresaKancelarije;
	}

	public JTextField getTxtBrojLicneKarte() {
		return txtBrojLicneKarte;
	}

	public void setTxtBrojLicneKarte(JTextField txtBrojLicneKarte) {
		this.txtBrojLicneKarte = txtBrojLicneKarte;
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

	public JLabel getLblKontaktTelefon() {
		return lblKontaktTelefon;
	}

	public void setLblKontaktTelefon(JLabel lblKontaktTelefon) {
		this.lblKontaktTelefon = lblKontaktTelefon;
	}

	public JLabel getLblEmail() {
		return lblEmail;
	}

	public void setLblEmail(JLabel lblEmail) {
		this.lblEmail = lblEmail;
	}

	public JLabel getLblTitula() {
		return lblTitula;
	}

	public void setLblTitula(JLabel lblTitula) {
		this.lblTitula = lblTitula;
	}

	public JLabel getLblZvanje() {
		return lblZvanje;
	}

	public void setLblZvanje(JLabel lblZvanje) {
		this.lblZvanje = lblZvanje;
	}

	public JLabel getLblAdresaKancelarije() {
		return lblAdresaKancelarije;
	}

	public void setLblAdresaKancelarije(JLabel lblAdresaKancelarije) {
		this.lblAdresaKancelarije = lblAdresaKancelarije;
	}

	public JLabel getLblBrojLicneKarte() {
		return lblBrojLicneKarte;
	}

	public void setLblBrojLicneKarte(JLabel lblBrojLicneKarte) {
		this.lblBrojLicneKarte = lblBrojLicneKarte;
	}
	  
	  
	  
	  
	  

	
	

}
