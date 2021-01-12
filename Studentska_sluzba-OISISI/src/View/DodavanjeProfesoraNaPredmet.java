package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import Kontroleri.PotvrdiDodavanjeProfesoraNaPredmetKontroler;
import Model.Predmet;
import Model.Profesor;



public class DodavanjeProfesoraNaPredmet extends JFrame{
	  private JButton btnPotvrdi;
	  private JButton btnOdustani;
	  private JTable tblProfesori;
	  private DefaultTableModel dtmProfesori;
	  private static DodavanjeProfesoraNaPredmet instance;
	   
	   public static DodavanjeProfesoraNaPredmet getInstance() 
	   {
	 	  if(instance==null) 
	 	  {
	 		  instance= new DodavanjeProfesoraNaPredmet();
	 	  }
	 	  return instance;
	 	  
	   }
	  
	  public DodavanjeProfesoraNaPredmet()
	  {
		  
		  setTitle("Odaberi profesora");
		  JPanel mainPanel=new JPanel();
		  setPreferredSize(new Dimension(450,400));
		  pack();
		  this.setLayout(new BorderLayout());
		  
		  String s="";
		  Object[] data= {s};
		  dtmProfesori=new DefaultTableModel(data,0);
		  tblProfesori=new JTable(dtmProfesori);
	      tblProfesori.setRowSelectionAllowed(true);
		  tblProfesori.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		  JScrollPane spProfesori=new JScrollPane(tblProfesori);
		  mainPanel.add(spProfesori,BorderLayout.CENTER);
		  this.add(mainPanel,BorderLayout.CENTER);
			   
			   btnPotvrdi= new JButton(new PotvrdiDodavanjeProfesoraNaPredmetKontroler());
			   btnOdustani=new JButton("Odustani");
			   btnOdustani.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
					  DodavanjeProfesoraNaPredmet.getInstance().dispose();
						
					}
				});
			   
			   JPanel panelDugme= new JPanel();
			   panelDugme.setLayout(new FlowLayout());
			   panelDugme.add(btnPotvrdi);
			   panelDugme.add(btnOdustani);
			   popuniProfesore();
			   add(panelDugme,BorderLayout.SOUTH);
			   
			   
			
		
		
	  }
	

	
		 private  void popuniProfesore() 
		   {
			   for(int i=0; i<MyWindow.getInstance().getModel().getProfesori().size(); i++) 
			   {
				   Profesor pr=MyWindow.getInstance().getModel().getProfesori().get(i);
				   String upis=pr.getIme()+"-"+pr.getPrezime();
				   Object[] rowData= {upis};
				   System.out.println(upis);
				   dtmProfesori.addRow(rowData);
				   
				   
			   }
			   
		
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
		 
		 

}
