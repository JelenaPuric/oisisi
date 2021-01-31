package View;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import Kontroleri.AboutKontroler;
import Kontroleri.CloseWindowKontroler;
import Kontroleri.HelpKontroler;
import Kontroleri.IzmenaEntitetKontroler;
import Kontroleri.ProzorDodajEntitetKontroler;
import Kontroleri.ProzorObrisiKontroler;
/**
 * 
 * @author Jelena Puric RA215-2018
 * Kreiramo klasu MenuBar koja nasljedjuje JMenuBar i ima polja fileMenu, editMenu i helpMenu. Sva polja su tipa JMenu.
 *
 */



public class MenuBar extends JMenuBar
{
	private JMenu fileMenu;
	private JMenu editMenu;
	private JMenu helpMenu;

	/**
	 * Kreiramo prazan konstruktor MenuBar() gdje postavljamo zeljene nazive polja.
	 */
	public MenuBar()
	{
		fileMenu= new JMenu("File");
		editMenu= new JMenu("Edit");
		helpMenu= new JMenu("Help");
		
	/**
	 * U fileMenu imamo dva polja newItem i closeItem tipa JMenuItem. U newItem postavljamo klasu ProzorDodajEntitetKontroler()
	 * kako bi klikom na to polje otvorili prozor da dodamo odredjeni entitet. Postavljamo da nam se to polje u aplikaciji zove "New".
	 * Pravimo akceleratore preko KeyStroke i KeyEvent. U ovom slucaju imamo keyStrokeToOpen gdje postavljamo preko KeyEventa da kada
	 * na tastaturi ukucamo ctrl N automatski nam se otvori prozor za dodavanje. Na kraju postavimo keyStrokeToOepn u newItem preko
	 * setAccelerator.
	 * U closeItem postavljamo klasu CloseWindowKontroler() kako bi klikom na to polje automatski zatvorili prozor.
	 * Pravimo akceleratore preko KeyStroke i KeyEvent. U ovom slucaju imamo keyStrokeToClose gdje postavljamo preko KeyEventa da kada
	 * na tastaturi ukucamo ctrl C automatski nam se zatvori prozor.
	 * U fileMenu dodajemo newItem i closeItem.
	 */
		JMenuItem newItem= new JMenuItem(new ProzorDodajEntitetKontroler());
		newItem.setText("New");
		  KeyStroke keyStrokeToOpen
		    = KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK);
		 newItem.setAccelerator(keyStrokeToOpen);
		 
		 
		JMenuItem closeItem= new JMenuItem(new CloseWindowKontroler());
		
		  KeyStroke keyStrokeToClose
		    = KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK);
		 closeItem.setAccelerator(keyStrokeToClose);
	
		
		fileMenu.add(newItem);
		fileMenu.add(closeItem);
		
	    /**
	     * U editMenu imamo dva polja editItem i deleteItem tipa JMenuItem. U editItem postavljamo klasu IzmenaEntitetKontroler()
	     * kako bi klikom na to polje otvorili prozor da izmjenimo odredjeni entitet. Postavljamo da nam se to polje u aplikaciji zove "Edit".
	     * Pravimo akceleratore preko KeyStroke i KeyEvent. U ovom slucaju imamo keyStrokeToEdit gdje postavljamo preko KeyEventa da kada
	     * na tastaturi ukucamo ctrl E automatski nam se otvori prozor za izmjenu. Na kraju postavimo keyStrokeToEdit u editItem preko
	     * setAccelerator.
	     * U deleteItem postavljamo klasu ProzorObrisiKontroler() kako bi klikom na to polje otvorili prozor za brisanje entiteta. Postavljamo da
	     * nam se to polje u aplikaciji zove "Delete". Pravimo akceleratore preko KeyStroke i KeyEvent. U ovom slucaju imamo keyStrokeToDelete
	     * gdje postavljamo preko KeyEventa da kada na tastaturi ukucamo ctrl D automatski nam se otvori prozor za brisanje. Na kraju postavimo 
	     * keyStrokeToDelete u deleteItem preko setAccelerator.
	     * U editMenu dodajemo editItem i deleteItem.
	     */
		JMenuItem editItem= new JMenuItem(new IzmenaEntitetKontroler());
		editItem.setText("Edit");
		  KeyStroke keyStrokeToEdit
		    = KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK);
		 editItem.setAccelerator(keyStrokeToEdit);
		
		JMenuItem deleteItem= new JMenuItem(new ProzorObrisiKontroler());
		deleteItem.setText("Delete");
		  KeyStroke keyStrokeToDelete
		    = KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_DOWN_MASK);
		 deleteItem.setAccelerator(keyStrokeToDelete);
		
		editMenu.add(editItem);
		editMenu.add(deleteItem);
		
		/**
		 * U helpMenu imamo dva polja helpItem i aboutItem tipa JMenuItem. U helpItem postavljamo dijalog HelpKontroler()
	     * kako bi klikom na to polje otvorili Help dijalog. Postavljamo da nam se to polje u aplikaciji zove "Help".
	     * Pravimo akceleratore preko KeyStroke i KeyEvent. U ovom slucaju imamo keyStrokeToHelp gdje postavljamo preko KeyEventa da kada
	     * na tastaturi ukucamo ctrl H automatski nam se otvori help dijalog. Na kraju postavimo keyStrokeToHelp u helpItem preko
	     * setAccelerator.
	     * U aboutItem postavljamo dijalog aboutKontroler() kako bi klikom na to polje otvorili About dijalog. Postavljamo da
	     * nam se to polje u aplikaciji zove "About". Pravimo akceleratore preko KeyStroke i KeyEvent. U ovom slucaju imamo keyStrokeToAbout
	     * gdje postavljamo preko KeyEventa da kada na tastaturi ukucamo ctrl A automatski nam se otvori About dijalog. Na kraju postavimo 
	     * keyStrokeToAbout u AboutItem preko setAccelerator.
	     * U helpMenu dodajemo helpItem i AboutItem.
		 */
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
		 
		 /**
		  * Kreiramo mnemonike za sve Item-e. Kreiramo ih tako sto postavljamo da klikom odredjenog slova na tastaturi
		  * preko KeyEveny.VK_zeljenoSlovo nama otvori odredjeni prozor koji je postavljen u odredjenom item-u. Mnemonike setujemo na 
		  * item-e preko funkcije setMnemonic koja prima KeyEvent.VK_slovo. U zavrsnoj aplikaciji ce nam biti podvuceno to slovo u nazivu Item-a
		  * kom smo setovali mnemonik.
		  */
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