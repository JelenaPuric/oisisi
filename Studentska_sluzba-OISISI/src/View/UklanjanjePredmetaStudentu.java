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




public class UklanjanjePredmetaStudentu extends JFrame
{

	private JLabel lblPoruka;
	private JButton dugmeDa;
	private JButton dugmeNe;
	
private static UklanjanjePredmetaStudentu instance;

public static UklanjanjePredmetaStudentu getInstance()
{
	  if(instance==null)
	  {
		  instance= new UklanjanjePredmetaStudentu();
		  
	  }
	  
	  return instance;
}


public UklanjanjePredmetaStudentu()
{
	setTitle("Uklanjanje predmeta");
	setLayout(new BorderLayout());
	 JPanel mainPanel=new JPanel();
	 mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
	 Dimension dim= new Dimension(300,200);
	lblPoruka=new JLabel("Da li ste sigurni da želite da uklonite predmet?");
	lblPoruka.setPreferredSize(dim);
	dugmeDa=new JButton("Da");
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





public static void setInstance(UklanjanjePredmetaStudentu instance) {
	UklanjanjePredmetaStudentu.instance = instance;
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
