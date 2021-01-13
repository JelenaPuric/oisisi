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

import Kontroleri.PotvrdiUklanjanjePredmetaSaProfesoraKontroler;


public class UklanjanjePredmetaSaProfesora extends JFrame
{

	private JLabel lblPoruka;
	private JButton dugmeDa;
	private JButton dugmeNe;
	
private static UklanjanjePredmetaSaProfesora instance;

public static UklanjanjePredmetaSaProfesora getInstance()
{
	  if(instance==null)
	  {
		  instance= new UklanjanjePredmetaSaProfesora();
		  
	  }
	  
	  return instance;
}


public UklanjanjePredmetaSaProfesora()
{
	setTitle("Ukloni predmet");
	setLayout(new BorderLayout());
	 JPanel mainPanel=new JPanel();
	 setPreferredSize(new Dimension(300,200));
    	pack();
    	setLocationRelativeTo(null);
	 mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
	 Dimension dim= new Dimension(100,100);
	lblPoruka=new JLabel("Da li ste sigurni?");
	lblPoruka.setPreferredSize(dim);
	dugmeDa=new JButton(new PotvrdiUklanjanjePredmetaSaProfesoraKontroler());
	dugmeNe=new JButton("Odustani");
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





public static void setInstance(UklanjanjePredmetaSaProfesora instance) {
	UklanjanjePredmetaSaProfesora.instance = instance;
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
