package View;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import Kontroleri.DugemPotvrdiDodavanjePredmetaProfesoruKontroler;
import Kontroleri.DugmeOdustaniDodavanjePredmetaProfesoruKontroler;
import Kontroleri.DugmePotvrdiIzmenuProfesora;
import Model.Predmet;

public class ProzorDodavanjePredmetaProfesoru extends JFrame {
	
	
	private JLabel lblpredmeti;
	private JButton btnPotvrdi;
	private JButton btnOdustani;
	private JTable tblPredmeti;
	private DefaultTableModel dtmPredmeti;
	private static ProzorDodavanjePredmetaProfesoru instance;
	
	public static ProzorDodavanjePredmetaProfesoru getInstance() 
	{
		if(instance==null) 
		{
			
			instance=new ProzorDodavanjePredmetaProfesoru();
		}
		return instance;
		
	}
	
	public ProzorDodavanjePredmetaProfesoru()
	{
		setPreferredSize(new Dimension(400,400));
		  pack();
		
		
		
		this.setLayout(new BorderLayout());
		
		setTitle("Dodaj predmet");
		JPanel panelLabele= new JPanel();
		JPanel panelTabela= new JPanel();
		JPanel panelDugme= new JPanel();
		panelLabele.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelTabela.setLayout(new BorderLayout());
		panelDugme.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		
		
		lblpredmeti= new JLabel("Predmeti:");
		panelLabele.add(lblpredmeti);
		add(panelLabele, BorderLayout.NORTH);
		
		btnPotvrdi= new JButton(new DugemPotvrdiDodavanjePredmetaProfesoruKontroler());
		btnOdustani= new JButton(new DugmeOdustaniDodavanjePredmetaProfesoruKontroler());
		
		panelDugme.add(btnPotvrdi);
		panelDugme.add(btnOdustani);
		add(panelDugme, BorderLayout.SOUTH);
		Object[] test= {""};
		dtmPredmeti= new DefaultTableModel(test,0);
		tblPredmeti= new JTable(dtmPredmeti);
		tblPredmeti.setRowSelectionAllowed(true);
		tblPredmeti.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		JScrollPane spPredmeti= new JScrollPane(tblPredmeti);
		panelTabela.add(spPredmeti, BorderLayout.CENTER);
		add(panelTabela,BorderLayout.CENTER);
		popuniTabeluPredmet();
		
		
	}

	public JLabel getLblpredmeti() {
		return lblpredmeti;
	}

	public void setLblpredmeti(JLabel lblpredmeti) {
		this.lblpredmeti = lblpredmeti;
	}

	public JButton getBtnPotvrdi() {
		return btnPotvrdi;
	}

	public void setBtnPotvrdi(JButton btnPotvrdi) {
		this.btnPotvrdi = btnPotvrdi;
	}

	public JButton getBtnOdustani() {
		return btnOdustani;
	}

	public void setBtnOdustani(JButton btnOdustani) {
		this.btnOdustani = btnOdustani;
	}

	public JTable getTblPredmeti() {
		return tblPredmeti;
	}

	public void setTblPredmeti(JTable tblPredmeti) {
		this.tblPredmeti = tblPredmeti;
	}

	public DefaultTableModel getDtmPredmeti() {
		return dtmPredmeti;
	}

	public void setDtmPredmeti(DefaultTableModel dtmPredmeti) {
		this.dtmPredmeti = dtmPredmeti;
	}
	
	public  void popuniTabeluPredmet()
	{
		for(int i=0; i<MyWindow.getInstance().getModel().getPredmeti().size();i++)
		{
		Predmet p= MyWindow.getInstance().getModel().getPredmeti().get(i);
		String s=p.getSifraPredmeta()+"-"+p.getNazivPredmeta();
		Object[] dataPred= {s};
		dtmPredmeti.addRow(dataPred);
		}
	}

}
