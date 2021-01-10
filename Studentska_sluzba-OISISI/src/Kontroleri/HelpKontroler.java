package Kontroleri;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import View.MyWindow;

public class HelpKontroler extends AbstractAction
{

	public HelpKontroler()
	{
		super("Help");
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		JDialog dialog=new JDialog(MyWindow.getInstance(),"Help");
		dialog.setLayout(new BorderLayout());
		JLabel la= new JLabel("Akceleratori: ");
		JLabel la1= new JLabel("CTRL-H Help prozor: ");
		JLabel la2= new JLabel("CTRL-N prozor za dodavanje entiteta: ");
		JLabel la3= new JLabel("CTRL-A About prozor: ");
		JLabel la4= new JLabel("H Help prozor: ");
		JLabel la5= new JLabel("N prozor za dodavanje entiteta: ");
		JLabel la6= new JLabel("A About prozor: ");
		JLabel la7= new JLabel("Mneumonici: ");
		
		JPanel panel=new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.add(la);
		panel.add(la1);
		panel.add(la2);
		panel.add(la3);
		panel.add(la4);
		panel.add(la5);
		panel.add(la6);
		panel.add(la7);
		
		dialog.setPreferredSize(new Dimension(250,250));
		dialog.pack();
		dialog.add(panel,BorderLayout.CENTER);
		dialog.show();
		
	}

}
