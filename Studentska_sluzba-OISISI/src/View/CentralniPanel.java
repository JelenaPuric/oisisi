package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Predmet;
import Model.Profesor;
import Model.Student;

import javax.swing.JScrollPane;  


public class CentralniPanel extends JPanel{
	
	private JTabbedPane tabbedPane;
	private JTable tblStudenti;
	private JTable tblProfesori;
	private JTable tblPredmeti;
	private DefaultTableModel dtmStudenti;
	private DefaultTableModel dtmProfesori;
	private DefaultTableModel dtmPredmeti;
	
	public CentralniPanel()
	{
		this.setLayout(new BorderLayout());
		
		JPanel panelStudenti= new JPanel();
		JPanel panelProfesori= new JPanel();
		JPanel panelPredmeti= new JPanel();
		panelStudenti.setLayout(new BorderLayout());
		panelProfesori.setLayout(new BorderLayout());
		panelPredmeti.setLayout(new BorderLayout());
		
		Object[] data= {"Index", "Ime", "Prezime", "Godina studija", "Status", "Prosek"};
		dtmStudenti= new DefaultTableModel(data,0);		
		
		Object[] data1= {"Ime", "Prezime", "Titula", "Zvanje"};
		dtmProfesori= new DefaultTableModel(data1,0);
		
		Object[] data2= {"Sifra predmeta", "Naziv predmeta", "Broj ESPB bodova", "Godina na kojoj se predmet izvodi", "Semestar u kom se predmet izvodi"};
		dtmPredmeti= new DefaultTableModel(data2,0);
		
		tblStudenti= new JTable(dtmStudenti);
		tblProfesori= new JTable(dtmProfesori);
		tblPredmeti= new JTable(dtmPredmeti);
		
		tblProfesori.setAutoCreateRowSorter(true);
		tblPredmeti.setAutoCreateRowSorter(true);
		
		
		JScrollPane spStudenti= new JScrollPane(tblStudenti);
		JScrollPane spProfesori= new JScrollPane(tblProfesori);
		JScrollPane spPredmeti= new JScrollPane(tblPredmeti);
		
		panelStudenti.add(spStudenti, BorderLayout.CENTER);
		panelProfesori.add(spProfesori,BorderLayout.CENTER);
		panelPredmeti.add(spPredmeti,BorderLayout.CENTER);
		
		tabbedPane= new JTabbedPane();
		tabbedPane.add("Studenti",panelStudenti);
		tabbedPane.add("Profesori",panelProfesori);
		tabbedPane.add("Predmeti",panelPredmeti);
		add(tabbedPane,BorderLayout.CENTER);
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

	public JTable getTblProfesori() {
		return tblProfesori;
	}

	public void setTblProfesori(JTable tblProfesori) {
		this.tblProfesori = tblProfesori;
	}

	public JTable getTblPredmeti() {
		return tblPredmeti;
	}

	public void setTblPredmeti(JTable tblPredmeti) {
		this.tblPredmeti = tblPredmeti;
	}

	public DefaultTableModel getDtmStudenti() {
		return dtmStudenti;
	}

	public void setDtmStudenti(DefaultTableModel dtmStudenti) {
		this.dtmStudenti = dtmStudenti;
	}

	public DefaultTableModel getDtmProfesori() {
		return dtmProfesori;
	}

	public void setDtmProfesori(DefaultTableModel dtmProfesori) {
		this.dtmProfesori = dtmProfesori;
	}

	public DefaultTableModel getDtmPredmeti() {
		return dtmPredmeti;
	}

	public void setDtmPredmeti(DefaultTableModel dtmPredmeti) {
		this.dtmPredmeti = dtmPredmeti;
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
	
	public static void popuniTabeluProfesor()
	{
		for(int i=0; i<MyWindow.getInstance().getModel().getProfesori().size();i++)
		{
		Profesor p= MyWindow.getInstance().getModel().getProfesori().get(i);
		Object[] dataProf= {p.getIme(), p.getPrezime(), p.getTitula(), p.getZvanja()};
		MyWindow.getInstance().getCentralniPanel().getDtmProfesori().addRow(dataProf);
		}
	}
	
	public static void loadTablePredmeti() 
	{
		for(int i=0; i<MyWindow.getInstance().getModel().getPredmeti().size(); i++) 
		{
			Predmet p=MyWindow.getInstance().getModel().getPredmeti().get(i);
			//Object[] data2= {"Šifra predmeta","Naziv predmeta","Broj ESPB bodova","Godina na kojoj se predmet izvodi","Semestar u kome se predmet izvodi"};

			Object[] data2= {p.getSifraPredmeta(),p.getNazivPredmeta(),p.getEspBodovi(),p.getGodinaStudija(),p.getSemestar()};
			MyWindow.getInstance().getCentralniPanel().getDtmPredmeti().addRow(data2);
			
		}
	}
	
}
