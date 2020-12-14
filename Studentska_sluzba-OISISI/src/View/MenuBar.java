package View;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


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
		
		
		JMenuItem newItem= new JMenuItem();
		newItem.setText("New");
		JMenuItem closeItem= new JMenuItem("Close");
		
		fileMenu.add(newItem);
		fileMenu.add(closeItem);
		
		JMenuItem editItem= new JMenuItem("Edit");
		JMenuItem deleteItem= new JMenuItem("Delete");
		
		editMenu.add(editItem);
		editMenu.add(deleteItem);
		
		JMenuItem helpItem= new JMenuItem("Help");
		JMenuItem aboutItem= new JMenuItem("About");
		
		helpMenu.add(helpItem);
		helpMenu.add(aboutItem);
		add(fileMenu);
		add(editMenu);
		add(helpMenu);
		
		
		
	}
}