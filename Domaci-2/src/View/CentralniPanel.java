package View;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Student;

import javax.swing.JScrollPane;  


public class CentralniPanel extends JPanel{
	
	private JTabbedPane tabbedPane;
	private JTable tblStudenti;
	private JTable tblProfesori;
	private DefaultTableModel dtmStudenti;
	private DefaultTableModel dtmProfesori;
	
	public CentralniPanel()
	{
		this.setLayout(new BorderLayout());
		JPanel panelStudenti=new JPanel();
		JPanel panelProfesori= new JPanel();
		panelStudenti.setLayout(new BorderLayout());
		panelProfesori.setLayout(new BorderLayout());
		
		Object[] data= {"Indeks","Ime","Prezime","Godina studija","Status","Prosek"};
		dtmStudenti=new DefaultTableModel(data,0);
		
		tblStudenti=new JTable(dtmStudenti);

		Object[] data1= {"Ime", "Prezime", "Titula", "Zvanje"};
		dtmProfesori= new DefaultTableModel(data1,0);

		tblProfesori= new JTable(dtmProfesori);
		
		JScrollPane spStudenti=new JScrollPane(tblStudenti);
		JScrollPane spProfesori= new JScrollPane(tblProfesori);
		
		panelStudenti.add(spStudenti,BorderLayout.CENTER);
		panelProfesori.add(spProfesori,BorderLayout.CENTER);
		
		tabbedPane= new JTabbedPane();
		tabbedPane.add("Studenti",panelStudenti);
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

	public JTable getTblStudenti() {
		return tblStudenti;
	}

	public void setTblStudenti(JTable tblStudenti) {
		this.tblStudenti = tblStudenti;
	}

	public DefaultTableModel getDtmStudenti() {
		return dtmStudenti;
	}

	public void setDtmStudenti(DefaultTableModel dtmStudenti) {
		this.dtmStudenti = dtmStudenti;
	}

	public static void loadTableStudents() 
	{
		for(int i=0; i<MyWindow.getInstance().getModel().getStudenti().size(); i++) 
		{
			Student s=MyWindow.getInstance().getModel().getStudenti().get(i);
			//	Object[] data= {"Indeks","Ime","Prezime","Godina studija","Status","Prosek"};

			Object[] data= {s.getIndex(),s.getIme(),s.getPrezime(),s.getGodina(),s.getStatus(),s.getProsjecnaOcjena()};
			MyWindow.getInstance().getCentralniPanel().getDtmStudenti().addRow(data);
			
		}
	}
	

	
}