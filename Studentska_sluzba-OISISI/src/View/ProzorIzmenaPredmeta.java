package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

import Kontroleri.PotvrdiIzmenuPredmetaKontroler;



public class ProzorIzmenaPredmeta extends JFrame 
{
   private JTabbedPane tabbedPane;
   private JTable tblInformacije;
   private JTable tblStudenti;
   private DefaultTableModel dtmInformacije;
   private DefaultTableModel dtmStudenti;
   private JTextField txtNazivPredmeta;
   private JTextField txtSifraPredmeta;
   private JComboBox<String> semestar;
   private JComboBox<String> godinaStudija;
   private JTextField txtPredmetniProfesor;
   private JTextField txtEspb;
   private JButton potvrdi;
   private JButton odustani;
   private JLabel lblNazivPredmeta;
   private JLabel lblSifraPredmeta;
   private JLabel lblSemestar;
   private JLabel lblGodinaStudija; 
   private JLabel lblPredmetniProfesor;
   private JLabel lblEspb;
	 
   private static ProzorIzmenaPredmeta instance;
   
   public static ProzorIzmenaPredmeta getInstance()
   {
	   if(instance==null)
	   {
		   instance=new ProzorIzmenaPredmeta();
	   }
	return instance;
	   
   }
   
   public ProzorIzmenaPredmeta()
   {
	   setTitle("Izmena predmeta");
	   setLayout(new BorderLayout());
	   JPanel mainPanel=new JPanel();
	   mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
	   JPanel pnlNazivPredmeta=new JPanel();
	   JPanel pnlSifraPredmeta=new JPanel();
	   JPanel pnlSemestar=new JPanel();
	   JPanel pnlGodinaStudija=new JPanel();
	   JPanel pnlPredmetniProfesor=new JPanel();
	   JPanel pnlEspb=new JPanel();
	   JPanel pnlDugme=new JPanel();
	   
	   Dimension dim= new Dimension(100,20);
	   lblNazivPredmeta= new JLabel("Naziv predmeta*");
       txtNazivPredmeta=new JTextField();
	   txtNazivPredmeta.setPreferredSize(dim);
	   lblSifraPredmeta= new JLabel("Šifra predmeta*");
	   txtSifraPredmeta=new JTextField();
	   txtSifraPredmeta.setPreferredSize(dim);
	   lblSemestar=new JLabel("Semestar*");
	   semestar=new JComboBox<String>();
	   semestar.setPreferredSize(dim);
	   lblGodinaStudija=new JLabel("Godina studija u kojoj se predmet izvodi*");
	   godinaStudija=new JComboBox<String>();
	   godinaStudija.setPreferredSize(dim);
	   lblPredmetniProfesor= new JLabel("Predmetni profesor*");
       txtPredmetniProfesor=new JTextField();
	   txtPredmetniProfesor.setPreferredSize(dim);
	   lblEspb= new JLabel("Broj ESPB bodova*");
       txtEspb=new JTextField();
	   txtEspb.setPreferredSize(dim);
	   
	   potvrdi=new JButton(new PotvrdiIzmenuPredmetaKontroler());
	   odustani=new JButton("Odustani");
	   odustani.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ProzorIzmenaPredmeta.getInstance().dispose();
				
			}
		});
	   
	      godinaStudija.addItem("I(prva)");
		  godinaStudija.addItem("II(druga)");
		  godinaStudija.addItem("III(treća)");
		  godinaStudija.addItem("IV(četvrta)");
		  semestar.addItem("Letnji");
		  semestar.addItem("Zimski");
		  
		  pnlNazivPredmeta.setLayout(new FlowLayout());
		  pnlNazivPredmeta.add(lblNazivPredmeta);
		  pnlNazivPredmeta.add(txtNazivPredmeta);
		  pnlSifraPredmeta.setLayout(new FlowLayout());
		  pnlSifraPredmeta.add(lblSifraPredmeta);
		  pnlSifraPredmeta.add(txtSifraPredmeta);
		  pnlSemestar.setLayout(new FlowLayout());
		  pnlSemestar.add(lblSemestar);
		  pnlSemestar.add(semestar);
		  pnlGodinaStudija.setLayout(new FlowLayout());
		  pnlGodinaStudija.add(lblGodinaStudija);
		  pnlGodinaStudija.add(godinaStudija);
	      pnlPredmetniProfesor.setLayout(new FlowLayout());
		  pnlPredmetniProfesor.add(lblPredmetniProfesor);
		  pnlPredmetniProfesor.add(txtPredmetniProfesor);
		  pnlEspb.setLayout(new FlowLayout());
		  pnlEspb.add(lblEspb);
		  pnlEspb.add(txtEspb);
	      pnlDugme.setLayout(new FlowLayout());
		  pnlDugme.add(potvrdi);
		  pnlDugme.add(odustani);
		  
		  mainPanel.add(pnlNazivPredmeta);
		  mainPanel.add(pnlSifraPredmeta);
		  mainPanel.add(pnlSemestar);
		  mainPanel.add(pnlGodinaStudija);
		  mainPanel.add(pnlPredmetniProfesor);
		  mainPanel.add(pnlEspb);
		  mainPanel.add(pnlDugme);
		  
		  tabbedPane=new JTabbedPane();
		  
		  Object[] naslovi = {"Studenti koji su položili predmet"};
		  dtmStudenti=new DefaultTableModel(naslovi,0);
		  
		  Object[] naslovi1 = {"Studenti koji nisu položili predmet"};
		  dtmStudenti=new DefaultTableModel(naslovi1,0);
		  
		  setLayout(new BorderLayout());
		  tblStudenti= new JTable(dtmStudenti);
		  setPreferredSize(new Dimension(800,600));
		  pack();
		  
		  JPanel p= new JPanel();
		  p.setLayout(new BorderLayout());
		  JPanel p1=new JPanel();
		  p1.setLayout(new BorderLayout());
		  JScrollPane sp= new JScrollPane(tblStudenti);
		  p.add(sp,BorderLayout.CENTER);
		  p1.add(sp,BorderLayout.CENTER);
		  tabbedPane.add("Informacije",mainPanel);
		  tabbedPane.add("Studenti koji su položili predmet",p);
		  tabbedPane.add("Studenti koji nisu položili predmet",p1);
		    
		    
		    
			
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

public JTable getTblStudenti() {
	return tblStudenti;
}

public void setTblStudenti(JTable tblStudenti) {
	this.tblStudenti = tblStudenti;
}

public DefaultTableModel getDtmInformacije() {
	return dtmInformacije;
}

public void setDtmInformacije(DefaultTableModel dtmInformacije) {
	this.dtmInformacije = dtmInformacije;
}

public DefaultTableModel getDtmStudenti() {
	return dtmStudenti;
}

public void setDtmStudenti(DefaultTableModel dtmStudenti) {
	this.dtmStudenti = dtmStudenti;
}

public JTextField getTxtNazivPredmeta() {
	return txtNazivPredmeta;
}

public void setTxtNazivPredmeta(JTextField txtNazivPredmeta) {
	this.txtNazivPredmeta = txtNazivPredmeta;
}

public JTextField getTxtSifraPredmeta() {
	return txtSifraPredmeta;
}

public void setTxtSifraPredmeta(JTextField txtSifraPredmeta) {
	this.txtSifraPredmeta = txtSifraPredmeta;
}

public JComboBox<String> getSemestar() {
	return semestar;
}

public void setSemestar(JComboBox<String> semestar) {
	this.semestar = semestar;
}

public JComboBox<String> getGodinaStudija() {
	return godinaStudija;
}

public void setGodinaStudija(JComboBox<String> godinaStudija) {
	this.godinaStudija = godinaStudija;
}

public JTextField getTxtPredmetniProfesor() {
	return txtPredmetniProfesor;
}

public void setTxtPredmetniProfesor(JTextField txtPredmetniProfesor) {
	this.txtPredmetniProfesor = txtPredmetniProfesor;
}

public JTextField getTxtEspb() {
	return txtEspb;
}

public void setTxtEspb(JTextField txtEspb) {
	this.txtEspb = txtEspb;
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

public JLabel getLblNazivPredmeta() {
	return lblNazivPredmeta;
}

public void setLblNazivPredmeta(JLabel lblNazivPredmeta) {
	this.lblNazivPredmeta = lblNazivPredmeta;
}

public JLabel getLblSifraPredmeta() {
	return lblSifraPredmeta;
}

public void setLblSifraPredmeta(JLabel lblSifraPredmeta) {
	this.lblSifraPredmeta = lblSifraPredmeta;
}

public JLabel getLblSemestar() {
	return lblSemestar;
}

public void setLblSemestar(JLabel lblSemestar) {
	this.lblSemestar = lblSemestar;
}

public JLabel getLblGodinaStudija() {
	return lblGodinaStudija;
}

public void setLblGodinaStudija(JLabel lblGodinaStudija) {
	this.lblGodinaStudija = lblGodinaStudija;
}

public JLabel getLblPredmetniProfesor() {
	return lblPredmetniProfesor;
}

public void setLblPredmetniProfesor(JLabel lblPredmetniProfesor) {
	this.lblPredmetniProfesor = lblPredmetniProfesor;
}

public JLabel getLblEspb() {
	return lblEspb;
}

public void setLblEspb(JLabel lblEspb) {
	this.lblEspb = lblEspb;
}
   
   
   
}
