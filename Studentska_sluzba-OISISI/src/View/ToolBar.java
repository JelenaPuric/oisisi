package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Kontroleri.IzmenaEntitetKontroler;
import Kontroleri.PretragaKontroler;
import Kontroleri.ProzorDodajEntitetKontroler;
import Kontroleri.ProzorObrisiKontroler;

public class ToolBar extends JPanel{
	
	private JButton dugmeDodaj;
	private JButton dugmeIzmeni;
	private JButton dugmeIzbrisi;
	private JButton dugmePretrazi;
	private JTextField  poljePretrazi;
	
	public ToolBar()
	{
		this.setLayout(new BorderLayout());
		
	    dugmeDodaj= new JButton(new ProzorDodajEntitetKontroler());
		dugmeIzmeni= new JButton(new IzmenaEntitetKontroler());
		dugmeIzbrisi= new JButton(new ProzorObrisiKontroler());
		dugmePretrazi= new JButton(new PretragaKontroler());
		poljePretrazi= new JTextField();
		
		poljePretrazi.setPreferredSize(new Dimension(200,30));
		
		
		JPanel levi= new JPanel();
		JPanel desni= new JPanel();
		levi.setLayout(new FlowLayout(FlowLayout.LEFT));
		desni.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		levi.add(dugmeDodaj);
		levi.add(dugmeIzmeni);
		levi.add(dugmeIzbrisi);
		desni.add(poljePretrazi);
		desni.add(dugmePretrazi);
		
		
		
		add(levi,BorderLayout.WEST);
		add(desni,BorderLayout.EAST);
	}

	public JButton getDugmeDodaj() {
		return dugmeDodaj;
	}

	public void setDugmeDodaj(JButton dugmeDodaj) {
		this.dugmeDodaj = dugmeDodaj;
	}

	public JButton getDugmeIzmeni() {
		return dugmeIzmeni;
	}

	public void setDugmeIzmeni(JButton dugmeIzmeni) {
		this.dugmeIzmeni = dugmeIzmeni;
	}

	public JButton getDugmeIzbrisi() {
		return dugmeIzbrisi;
	}

	public void setDugmeIzbrisi(JButton dugmeIzbrisi) {
		this.dugmeIzbrisi = dugmeIzbrisi;
	}

	public JButton getDugmePretrazi() {
		return dugmePretrazi;
	}

	public void setDugmePretrazi(JButton dugmePretrazi) {
		this.dugmePretrazi = dugmePretrazi;
	}

	public JTextField getPoljePretrazi() {
		return poljePretrazi;
	}

	public void setPoljePretrazi(JTextField poljePretrazi) {
		this.poljePretrazi = poljePretrazi;
	}
	
	

}