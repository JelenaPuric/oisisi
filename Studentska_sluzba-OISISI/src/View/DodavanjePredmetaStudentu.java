package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import Kontroleri.PotvrdiDodavanjePredmetaStudentuKontroler;
import Model.Predmet;

public class DodavanjePredmetaStudentu extends JFrame
{
   private JTable tblPredmeti;	
   private JButton potvrdi;
   private JButton odustani;
   private DefaultTableModel dtmPredmeti;
   private static DodavanjePredmetaStudentu instance;
   
   public static DodavanjePredmetaStudentu getInstance() 
   {
 	  if(instance==null) 
 	  {
 		  instance= new DodavanjePredmetaStudentu();
 	  }
 	  return instance;
 	  
   }
   
   public DodavanjePredmetaStudentu()
   {
	   setTitle("Dodavanje predmeta");
	   setPreferredSize(new Dimension(450,400));
		pack();
	   setLayout(new BorderLayout());
	   JPanel mainPanel=new JPanel();
	   mainPanel.setLayout(new BorderLayout());
	   String s="";
	   Object[] data={s};
	   dtmPredmeti=new DefaultTableModel(data,0);
	   tblPredmeti=new JTable(dtmPredmeti);
	   tblPredmeti.setRowSelectionAllowed(true);
	   tblPredmeti.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	   JScrollPane spPredmeti=new JScrollPane(tblPredmeti);
	   mainPanel.add(spPredmeti,BorderLayout.CENTER);
	   this.add(mainPanel,BorderLayout.CENTER);
	   
	   potvrdi= new JButton(new PotvrdiDodavanjePredmetaStudentuKontroler());
	   odustani=new JButton("Odustani");
	   odustani.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			  DodavanjePredmetaStudentu.getInstance().dispose();
				
			}
		});
	   
	   JPanel panelDugme= new JPanel();
	   panelDugme.setLayout(new FlowLayout());
	   panelDugme.add(potvrdi);
	   panelDugme.add(odustani);
	   popuniPredmete();
	   add(panelDugme,BorderLayout.SOUTH);
	   
	   
	   
   }
   
   private  void popuniPredmete() 
   {
	   for(int i=0; i<MyWindow.getInstance().getModel().getPredmeti().size(); i++) 
	   {
		   Predmet p=MyWindow.getInstance().getModel().getPredmeti().get(i);
		   String upis=p.getSifraPredmeta()+"-"+p.getNazivPredmeta();
		   Object[] rowData= {upis};
		   System.out.println(upis);
		   dtmPredmeti.addRow(rowData);
		   
		   
	   }
	   
   }

public JTable getTblPredmeti() {
	return tblPredmeti;
}

public void setTblPredmeti(JTable tblPredmeti) {
	this.tblPredmeti = tblPredmeti;
}

public JButton getPotvrdi() {
	return potvrdi;
}

public void setPotvrdi(JButton potvrdi) {
	this.potvrdi = potvrdi;
}

public JButton getOdustani() {
	return odustani;
}

public void setOdustani(JButton odustani) {
	this.odustani = odustani;
}

public DefaultTableModel getDtmPredmeti() {
	return dtmPredmeti;
}

public void setDtmPredmeti(DefaultTableModel dtmPredmeti) {
	this.dtmPredmeti = dtmPredmeti;
}

public static void setInstance(DodavanjePredmetaStudentu instance) {
	DodavanjePredmetaStudentu.instance = instance;
}
   
   
   
}