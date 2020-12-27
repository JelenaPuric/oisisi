package View;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import Kontroleri.AboutKontroler;
import Kontroleri.HelpKontroler;
import Kontroleri.ProzorDodajEntitetKontroler;



public class MenuBar extends JMenuBar
{
	private JMenu fileMenu;
	private JMenu editMenu;
	private JMenu helpMenu;
	
	public MenuBar()
	{
		fileMenu= new JMenu("File");
		editMenu= new JMenu("Edit");
		helpMenu= new JMenu("Help");
		
		
		JMenuItem newItem= new JMenuItem(new ProzorDodajEntitetKontroler());
		newItem.setText("New");
		  KeyStroke keyStrokeToOpen
		    = KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK);
		 newItem.setAccelerator(keyStrokeToOpen);
		 
		 
		JMenuItem closeItem= new JMenuItem("Close");
		
		  KeyStroke keyStrokeToClose
		    = KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK);
		 closeItem.setAccelerator(keyStrokeToClose);
	
		
		fileMenu.add(newItem);
		fileMenu.add(closeItem);
		
		JMenuItem editItem= new JMenuItem("Edit");
		editItem.setText("Edit");
		  KeyStroke keyStrokeToEdit
		    = KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK);
		 editItem.setAccelerator(keyStrokeToEdit);
		
		JMenuItem deleteItem= new JMenuItem("Delete");
		deleteItem.setText("Delete");
		  KeyStroke keyStrokeToDelete
		    = KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_DOWN_MASK);
		 deleteItem.setAccelerator(keyStrokeToDelete);
		
		editMenu.add(editItem);
		editMenu.add(deleteItem);
		
		JMenuItem helpItem= new JMenuItem(new HelpKontroler());
		helpItem.setText("Help");
		  KeyStroke keyStrokeToHelp
		    = KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_DOWN_MASK);
		 helpItem.setAccelerator(keyStrokeToHelp);
		 
		JMenuItem aboutItem= new JMenuItem(new AboutKontroler());
		aboutItem.setText("About");
		  KeyStroke keyStrokeToAbout
		    = KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK);
		 aboutItem.setAccelerator(keyStrokeToAbout);
		 
		 //mneumonici
		 newItem.setMnemonic(KeyEvent.VK_N);
		 closeItem.setMnemonic(KeyEvent.VK_C);
		 editItem.setMnemonic(KeyEvent.VK_E);
		 deleteItem.setMnemonic(KeyEvent.VK_D);
		 helpItem.setMnemonic(KeyEvent.VK_H);
		 aboutItem.setMnemonic(KeyEvent.VK_A);
		
		helpMenu.add(helpItem);
		helpMenu.add(aboutItem);
		add(fileMenu);
		add(editMenu);
		add(helpMenu);
		
		
		
	}
}
