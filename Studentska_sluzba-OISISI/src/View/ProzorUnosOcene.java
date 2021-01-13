package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.time.LocalDateTime;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Kontroleri.DugmeOdustaniUnosOcene;
import Kontroleri.DugmePotvrdiUnosOceneKontroler;





public class ProzorUnosOcene extends JFrame {

	private JLabel lblsifra;
	private JLabel lblnaziv;
	private JLabel lblOcena;
	private JLabel lbldatum;
	private JTextField txtSifra;
	private JTextField txtNaziv;
	private JComboBox<String> ocena;
	private JTextField txtdatum;
	private JButton btnPotvrdi;
	private JButton btnOdustani;
	private static ProzorUnosOcene instance;
	

	public static ProzorUnosOcene getInstance() 
	{
		if(instance==null) 
		{
			
			instance=new ProzorUnosOcene();
		}
		return instance;
		
	}
	
	public ProzorUnosOcene()
	{
		Dimension dim= new Dimension(200,20);
		setLayout(new BorderLayout());
		JPanel mainPanel= new JPanel();
		setPreferredSize(new Dimension(500,300));
		pack();
		setLocationRelativeTo(null);
		mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		lblsifra= new JLabel("Sifra");
		lblnaziv= new JLabel("Naziv");
		lblOcena= new JLabel("Ocena");
		lbldatum= new JLabel("Datum");
		btnPotvrdi= new JButton(new DugmePotvrdiUnosOceneKontroler());
		btnOdustani= new JButton(new DugmeOdustaniUnosOcene());
		
		txtSifra= new JTextField();
		txtSifra.setPreferredSize(dim);
		txtNaziv= new JTextField();
		txtNaziv.setPreferredSize(dim);
		txtdatum= new JTextField();
		txtdatum.setPreferredSize(dim);

		ocena= new JComboBox<String>();
		
		
		
		
		ocena.addItem("6");
		ocena.addItem("7");
		ocena.addItem("8");
		ocena.addItem("9");
		ocena.addItem("10");
		
		JPanel levo= new JPanel();
		levo.setLayout(new BoxLayout(levo,BoxLayout.Y_AXIS));
		levo.add(lblsifra);
		levo.add(Box.createVerticalStrut(42));
		levo.add(lblnaziv);
		levo.add(Box.createVerticalStrut(42));
		levo.add(lblOcena);
		levo.add(Box.createVerticalStrut(42));
		levo.add(lbldatum);
		levo.add(Box.createVerticalStrut(41));
		levo.add(btnPotvrdi);
		
		JPanel desno= new JPanel();
		desno.setLayout(new BoxLayout(desno, BoxLayout.Y_AXIS));
		desno.add(txtSifra);
		desno.add(Box.createVerticalStrut(35));
		desno.add(txtNaziv);
		desno.add(Box.createVerticalStrut(35));
		desno.add(ocena);
		desno.add(Box.createVerticalStrut(35));
		desno.add(txtdatum);
		desno.add(Box.createVerticalStrut(35));
		desno.add(btnOdustani);
		
		mainPanel.add(levo);
		mainPanel.add(desno);
		
		this.add(mainPanel);
		
	}

	public JLabel getLblsifra() {
		return lblsifra;
	}

	public void setLblsifra(JLabel lblsifra) {
		this.lblsifra = lblsifra;
	}

	public JLabel getLblnaziv() {
		return lblnaziv;
	}

	public void setLblnaziv(JLabel lblnaziv) {
		this.lblnaziv = lblnaziv;
	}

	public JLabel getLblOcena() {
		return lblOcena;
	}

	public void setLblOcena(JLabel lblOcena) {
		this.lblOcena = lblOcena;
	}

	public JLabel getLbldatum() {
		return lbldatum;
	}

	public void setLbldatum(JLabel lbldatum) {
		this.lbldatum = lbldatum;
	}

	public JTextField getTxtSifra() {
		return txtSifra;
	}

	public void setTxtSifra(JTextField txtSifra) {
		this.txtSifra = txtSifra;
	}

	public JTextField getTxtNaziv() {
		return txtNaziv;
	}

	public void setTxtNaziv(JTextField txtNaziv) {
		this.txtNaziv = txtNaziv;
	}

	public JComboBox<String> getOcena() {
		return ocena;
	}

	public void setOcena(JComboBox<String> ocena) {
		this.ocena = ocena;
	}

	public JTextField getTxtdatum() {
		return txtdatum;
	}

	public void setTxtdatum(JTextField txtdatum) {
		this.txtdatum = txtdatum;
	}

	public JButton getBtnPotvrdi() {
		return btnPotvrdi;
	}

	public void setBtnPotvrdi(JButton btnPotvrdi) {
		this.btnPotvrdi = btnPotvrdi;
	}

	public JButton getBtnOdustani() {
		return btnOdustani;
	}

	public void setBtnOdustani(JButton btnOdustani) {
		this.btnOdustani = btnOdustani;
	}
	
	
	
	
	
	
	
	
}