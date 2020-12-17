package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;





public class ProzorDodajPredmet extends JFrame{
	
	private JTextField txtSifraPredmeta;
	private JTextField txtNazivPredmeta;
	private JComboBox<String> txtSemestar;
	private JComboBox<String> txtGodinaStudija;
	private JTextField txtProfesor;
	private JTextField txtEspbBodovi;
	
	private JLabel lblSifraPredmeta;
	private JLabel lblNazivPredmeta;
	private JLabel lblSemestar;
	private JLabel lblGodinaStudija;
	private JLabel lblProfesor;
	private JLabel lblEspbBodovi;
	
	
	private JButton btnPotvrdi;
	private JButton btnOdustani;
	private static ProzorDodajPredmet instance;
	
	public static ProzorDodajPredmet getInstance() 
	{
		if(instance==null) 
		{
			
			instance=new ProzorDodajPredmet();
		}
		return instance;
		
	}
	
	public ProzorDodajPredmet() 
	{
		setTitle("Dodavanje predmeta");
		Dimension dim= new Dimension(200,20);
		
		
		setLayout(new BorderLayout());
		JPanel mainPanel= new JPanel();
		setPreferredSize(new Dimension(800,600));
		pack();
		mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		add(mainPanel,BorderLayout.CENTER);
		
		lblSifraPredmeta= new JLabel("Šifra predmeta*");
		lblNazivPredmeta= new JLabel("Naziv predmeta*");
		lblSemestar= new JLabel("Semestar*");
		lblGodinaStudija= new JLabel("Godina studija*");
		lblProfesor= new JLabel("Profesor*");
		lblEspbBodovi= new JLabel("ESPB bodovi*");
	
		btnPotvrdi= new JButton("Potvrdi");
		btnOdustani= new JButton("Odustani");
		
		
		txtSifraPredmeta= new JTextField();
		txtSifraPredmeta.setPreferredSize(dim);
		txtNazivPredmeta= new JTextField();
		txtNazivPredmeta.setPreferredSize(dim);
		txtSemestar= new JComboBox<String>();
		txtSemestar.setPreferredSize(dim);
		txtSemestar.addItem("Ljetnji");
		txtSemestar.addItem("Zimski");
	    txtGodinaStudija= new JComboBox<String>();
		txtGodinaStudija.setPreferredSize(dim);
		txtGodinaStudija.addItem("I(prvo)");
		txtGodinaStudija.addItem("II(druga)");
		txtGodinaStudija.addItem("III(treća)");
		txtGodinaStudija.addItem("IV(četvrta)");
		txtProfesor= new JTextField();
		txtProfesor.setPreferredSize(dim);
		txtEspbBodovi= new JTextField();
		txtEspbBodovi.setPreferredSize(dim);
	
		
		
		JPanel levo= new JPanel();
		levo.setLayout(new BoxLayout(levo,BoxLayout.Y_AXIS));
		levo.add(lblSifraPredmeta);
		levo.add(Box.createVerticalStrut(10));
		levo.add(lblNazivPredmeta);
		levo.add(Box.createVerticalStrut(10));
		levo.add(lblSemestar);
		levo.add(Box.createVerticalStrut(10));
		levo.add(lblGodinaStudija);
		levo.add(Box.createVerticalStrut(10));
		levo.add(lblProfesor);
		levo.add(Box.createVerticalStrut(10));
		levo.add(lblEspbBodovi);
		levo.add(Box.createVerticalStrut(10));
		levo.add(btnPotvrdi);
		levo.add(Box.createVerticalStrut(10));

		


		
		JPanel desno= new JPanel();
		desno.setLayout(new BoxLayout(desno,BoxLayout.Y_AXIS));
		
		desno.add(txtSifraPredmeta);
		desno.add(Box.createVerticalStrut(10));
		desno.add(txtNazivPredmeta);
		desno.add(Box.createVerticalStrut(10));
		desno.add(txtSemestar);
		desno.add(Box.createVerticalStrut(10));
		desno.add(txtGodinaStudija);
		desno.add(Box.createVerticalStrut(10));
		desno.add(txtProfesor);
		desno.add(Box.createVerticalStrut(10));
		desno.add(txtEspbBodovi);
		desno.add(Box.createVerticalStrut(10));
		desno.add(btnOdustani);
		desno.add(Box.createVerticalStrut(10));
		
		mainPanel.add(levo);
		mainPanel.add(desno);
	
		
	}

	public JTextField getTxtSifraPredmeta() {
		return txtSifraPredmeta;
	}

	public void setTxtSifraPredmeta(JTextField txtSifraPredmeta) {
		this.txtSifraPredmeta = txtSifraPredmeta;
	}

	public JTextField getTxtNazivPredmeta() {
		return txtNazivPredmeta;
	}

	public void setTxtNazivPredmeta(JTextField txtNazivPredmeta) {
		this.txtNazivPredmeta = txtNazivPredmeta;
	}

	public JComboBox<String> getTxtSemestar() {
		return txtSemestar;
	}

	public void setTxtSemestar(JComboBox<String> txtSemestar) {
		this.txtSemestar = txtSemestar;
	}

	public JComboBox<String> getTxtGodinaStudija() {
		return txtGodinaStudija;
	}

	public void setTxtGodinaStudija(JComboBox<String> txtGodinaStudija) {
		this.txtGodinaStudija = txtGodinaStudija;
	}

	public JTextField getTxtProfesor() {
		return txtProfesor;
	}

	public void setTxtProfesor(JTextField txtProfesor) {
		this.txtProfesor = txtProfesor;
	}

	public JTextField getTxtEspbBodovi() {
		return txtEspbBodovi;
	}

	public void setTxtEspbBodovi(JTextField txtEspbBodovi) {
		this.txtEspbBodovi = txtEspbBodovi;
	}

	public JLabel getLblSifraPredmeta() {
		return lblSifraPredmeta;
	}

	public void setLblSifraPredmeta(JLabel lblSifraPredmeta) {
		this.lblSifraPredmeta = lblSifraPredmeta;
	}

	public JLabel getLblNazivPredmeta() {
		return lblNazivPredmeta;
	}

	public void setLblNazivPredmeta(JLabel lblNazivPredmeta) {
		this.lblNazivPredmeta = lblNazivPredmeta;
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

	public JLabel getLblProfesor() {
		return lblProfesor;
	}

	public void setLblProfesor(JLabel lblProfesor) {
		this.lblProfesor = lblProfesor;
	}

	public JLabel getLblEspbBodovi() {
		return lblEspbBodovi;
	}

	public void setLblEspbBodovi(JLabel lblEspbBodovi) {
		this.lblEspbBodovi = lblEspbBodovi;
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
