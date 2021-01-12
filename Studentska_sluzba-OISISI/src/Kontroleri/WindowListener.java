package Kontroleri;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import File.ReadWrite;
import View.CentralniPanel;

public class WindowListener extends WindowAdapter{

	public void windowOpened(WindowEvent e) 
	{
		
		ReadWrite.citajFile("C:\\Users\\korisnik\\Documents\\GitHub\\oisisi\\Studentska_sluzba-OISISI\\src\\Data\\data.ss");
		
		
	}
	
	
	public void windowClosing(WindowEvent e)
	{
		ReadWrite.pisiFile("C:\\Users\\ljubi\\Documents\\GitHub\\oisisi\\Studentska_sluzba-OISISI\\src\\Data\\data.ss");
	}

}
