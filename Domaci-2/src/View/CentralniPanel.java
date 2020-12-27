package View;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;  


public class CentralniPanel extends JPanel{
	
	private JTabbedPane tabbedPane;
	private JTable tblProfesori;
	private DefaultTableModel dtmProfesori;
	
	public CentralniPanel()
	{
		this.setLayout(new BorderLayout());
		
		JPanel panelProfesori= new JPanel();
		panelProfesori.setLayout(new BorderLayout());

		Object[] data1= {"Ime", "Prezime", "Titula", "Zvanje"};
		dtmProfesori= new DefaultTableModel(data1,0);

		tblProfesori= new JTable(dtmProfesori);
		
		JScrollPane spProfesori= new JScrollPane(tblProfesori);
		
		panelProfesori.add(spProfesori,BorderLayout.CENTER);
		
		tabbedPane= new JTabbedPane();
		tabbedPane.add("Profesori",panelProfesori);
		
		add(tabbedPane,BorderLayout.CENTER);
	}

	public JTable getTblProfesori() {
		return tblProfesori;
	}

	public void setTblProfesori(JTable tblProfesori) {
		this.tblProfesori = tblProfesori;
	}

	public DefaultTableModel getDtmProfesori() {
		return dtmProfesori;
	}

	public void setDtmProfesori(DefaultTableModel dtmProfesori) {
		this.dtmProfesori = dtmProfesori;
	}

	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public void setTabbedPane(JTabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}


	

	
}