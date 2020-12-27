package Kontroleri;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JLabel;

import View.MyWindow;

public class AboutKontroler extends AbstractAction
{

	public AboutKontroler()
	{
		super("About");
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JDialog dialog=new JDialog(MyWindow.getInstance(),"About");
		JLabel labela= new JLabel("This is about");
		dialog.setPreferredSize(new Dimension(250,250));
		dialog.pack();
		dialog.add(labela);
		dialog.show();
		
	}

}
