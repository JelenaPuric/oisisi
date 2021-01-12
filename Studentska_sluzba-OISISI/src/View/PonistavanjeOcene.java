package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Kontroleri.PotvrdiPonistavanjeOceneKontroler;


public class PonistavanjeOcene extends JFrame
{

	private JLabel lblPoruka;
	private JButton dugmeDa;
	private JButton dugmeNe;
	
private static PonistavanjeOcene instance;

public static PonistavanjeOcene getInstance()
{
	  if(instance==null)
	  {
		  instance= new PonistavanjeOcene();
		  
	  }
	  
	  return instance;
}


public PonistavanjeOcene()
{
	setTitle("Ponistavanje Ocene");
	setPreferredSize(new Dimension(300,300));
	pack();
	setLayout(new BorderLayout());
	 JPanel mainPanel=new JPanel();
	 mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
	 Dimension dim= new Dimension(300,200);
	lblPoruka=new JLabel("Da li ste sigurni da želite da poništite ocenu?");
	lblPoruka.setPreferredSize(dim);
	dugmeDa=new JButton(new PotvrdiPonistavanjeOceneKontroler());
	dugmeNe=new JButton("Ne");
	dugmeNe.addActionListener(new ActionListener() 
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			instance=null;
			dispose();
			
		}
		
	});
	JPanel pnlLblPoruka=new JPanel();
	JPanel pnlDugme=new JPanel();
	  pnlLblPoruka.setLayout(new FlowLayout());
	  pnlLblPoruka.add(lblPoruka);
	  pnlDugme.setLayout(new FlowLayout());
	  pnlDugme.add(dugmeDa);
	  pnlDugme.add(dugmeNe);
	  mainPanel.add(pnlLblPoruka);
	  mainPanel.add(pnlDugme);
	  
	  
	  add(mainPanel,BorderLayout.CENTER);
	
	
}





public static void setInstance(PonistavanjeOcene instance) {
	PonistavanjeOcene.instance = instance;
}


public JLabel getLblPoruka() {
	return lblPoruka;
}


public void setLblPoruka(JLabel lblPoruka) {
	this.lblPoruka = lblPoruka;
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



}

