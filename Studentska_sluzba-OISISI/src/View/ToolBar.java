package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Kontroleri.IzmenaProfesoraKontroler;
import Kontroleri.ProzorDodajEntitetKontroler;

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
		dugmeIzmeni= new JButton(new IzmenaProfesoraKontroler());
		dugmeIzbrisi= new JButton("Izbrisi");
		dugmePretrazi= new JButton("Pretrazi");
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

}