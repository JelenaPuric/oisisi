package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class NepolozeniPanel extends JPanel
{
  private JButton btnDodaj;
  private JButton btnObrisi;
  private JButton btnPolaganje;
  private JTable tblNepolozeni;
  private DefaultTableModel dtmNepolozeni;
  
  public NepolozeniPanel()
  {
	  this.setLayout(new BorderLayout());
	  
	  Object[] data= {"Šifra predmeta", "Naziv predmeta", "ESPB","Godina studija","Semestar"};
	  dtmNepolozeni=new DefaultTableModel(data,0);
		
		tblNepolozeni=new JTable(dtmNepolozeni);
		JScrollPane spNepolozeni=new JScrollPane(tblNepolozeni);
		this.add(spNepolozeni,BorderLayout.CENTER);
		
	btnDodaj=new JButton("Dodaj");
	btnObrisi=new JButton("Obriši");
	btnPolaganje=new JButton("Polaganje");
	
	 JPanel levi=new JPanel(); 
	 levi.setLayout(new FlowLayout(FlowLayout.LEFT));
	 levi.add(btnDodaj);
	 levi.add(btnObrisi);
	 levi.add(btnPolaganje);
	 add(levi,BorderLayout.NORTH);
	  
  }
  
  
  
}