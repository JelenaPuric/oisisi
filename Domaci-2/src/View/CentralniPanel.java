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


	
	public CentralniPanel()
	{
		this.setLayout(new BorderLayout());
		
		
	


		add(tabbedPane,BorderLayout.CENTER);
	}

	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public void setTabbedPane(JTabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}


	

	
}