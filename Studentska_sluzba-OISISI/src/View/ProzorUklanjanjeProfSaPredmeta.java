package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Kontroleri.DugmeOdustaniUklanjanjeProf;
import Kontroleri.DugmePotvrdiUklanjanjeProfSaPredmeta;
import Kontroleri.PotvrdiBrisanjeKontroler;

public class ProzorUklanjanjeProfSaPredmeta extends JFrame{
	private JLabel lblporuka;
	private JButton dugmeDa;
	private JButton dugmeNe;
	
private static ProzorUklanjanjeProfSaPredmeta instance;
	
	public static ProzorUklanjanjeProfSaPredmeta getInstance() 
	{
		if(instance==null) 
		{
			
			instance=new ProzorUklanjanjeProfSaPredmeta();
		}
		return instance;
		
	}

	
	public ProzorUklanjanjeProfSaPredmeta()
	{
		Dimension dim= new Dimension(200,20);
		
		
		setLayout(new BorderLayout());
		//mainPanel
		JPanel mainPanel= new JPanel();
		setPreferredSize(new Dimension(300,300));
		pack();
		mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
		
		add(mainPanel,BorderLayout.CENTER);
		
		
		
		setTitle("Uklanjanje profesora sa predmeta");
		lblporuka= new JLabel("Da li ste sigurni da zelite da ukonite profesora " );
		dugmeDa= new JButton(new DugmePotvrdiUklanjanjeProfSaPredmeta());
		dugmeNe= new JButton(new DugmeOdustaniUklanjanjeProf());
		
		
		dugmeNe.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				    dispose();
				    instance=null;
				  } 
				} );
		
		JPanel pnlPoruka= new JPanel();
		
		pnlPoruka.add(lblporuka);
		
		JPanel pnlDugme= new JPanel();
		
		pnlDugme.add(dugmeDa);
		pnlDugme.add(dugmeNe);
		
		
		mainPanel.add(pnlPoruka);
		mainPanel.add(pnlDugme);
		
		
		
		
	}


	public JLabel getLblporuka() {
		return lblporuka;
	}


	public void setLblporuka(JLabel lblporuka) {
		this.lblporuka = lblporuka;
	}


	public JButton getDugmeDa() {
		return dugmeDa;
	}


	public void setDugmeDa(JButton dugmeDa) {
		this.dugmeDa = dugmeDa;
	}


	public JButton getDugmeNe() {
		return dugmeNe;
	}


	public void setDugmeNe(JButton dugmeNe) {
		this.dugmeNe = dugmeNe;
	}


	public static void setInstance(ProzorUklanjanjeProfSaPredmeta instance) {
		ProzorUklanjanjeProfSaPredmeta.instance = instance;
	}
	
	

	


}
