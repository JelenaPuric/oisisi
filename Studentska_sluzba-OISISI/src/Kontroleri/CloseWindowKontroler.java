package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import File.Configuartion;
import View.MyWindow;

public class CloseWindowKontroler extends AbstractAction
{

	public CloseWindowKontroler()
	{
		super("Close",Configuartion.closeIcon);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		MyWindow.getInstance().dispose();
	}
 
}

