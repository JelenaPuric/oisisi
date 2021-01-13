package Kontroleri;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import File.Configuartion;
import File.ReadWrite;
import View.CentralniPanel;

public class WindowListener extends WindowAdapter{

	public void windowOpened(WindowEvent e) 
	{
		
		ReadWrite.citajFile(Configuartion.resourcesPath+"/data.ss");
		CentralniPanel.loadTableStudenti();
		CentralniPanel.loadTableProfesor();
		CentralniPanel.loadTablePredmeti();
		
	}
	
	
	public void windowClosing(WindowEvent e)
	{
		ReadWrite.pisiFile("C:\\Users\\ljubi\\Documents\\GitHub\\oisisi\\Studentska_sluzba-OISISI\\src\\Data\\data.ss");
	}

}
