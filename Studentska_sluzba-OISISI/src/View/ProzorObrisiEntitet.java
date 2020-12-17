package View;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class ProzorObrisiEntitet extends JFrame{
	
	private JLabel lblporuka;
	private JButton dugmeDa;
	private JButton dugmeNe;
	
private static ProzorObrisiEntitet instance;
	
	public static ProzorObrisiEntitet getInstance(String entitet) 
	{
		if(instance==null) 
		{
			
			instance=new ProzorObrisiEntitet(entitet);
		}
		return instance;
		
	}

	
	public ProzorObrisiEntitet(String entitet)
	{
		Dimension dim= new Dimension(200,20);
		
		
		setLayout(new BorderLayout());
		//mainPanel
		JPanel mainPanel= new JPanel();
		setPreferredSize(new Dimension(300,300));
		pack();
		mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
		
		add(mainPanel,BorderLayout.CENTER);
		
		
		
		setTitle("Brisanje "+entitet);
		lblporuka= new JLabel("Da li ste sigurni da zelite da obrisete " +entitet+"?");
		dugmeDa= new JButton("Da");
		dugmeNe= new JButton("Ne");
		
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


	public static ProzorObrisiEntitet getInstance() {
		return instance;
	}


	public static void setInstance(ProzorObrisiEntitet instance) {
		ProzorObrisiEntitet.instance = instance;
	}
}
