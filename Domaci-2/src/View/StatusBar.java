package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class StatusBar extends JPanel
{
 private JLabel naziv;
 private JLabel datum;
 
 public StatusBar()
 {
	 naziv= new JLabel("Studentska služba");
	 datum= new JLabel("Datum");
	 setLayout(new BorderLayout());
	 Timer timer=new Timer(1000,new ActionListener()
	 {

		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			// TODO Auto-generated method stub
			LocalDateTime date=LocalDateTime.now();
			datum.setText(date.toString());
			
		}
		
	 });
	 
	 timer.start();
	 JPanel levi= new JPanel();
	 JPanel desni= new JPanel();
	 levi.setLayout(new FlowLayout(FlowLayout.LEFT));
	 desni.setLayout(new FlowLayout(FlowLayout.RIGHT));
	 levi.add(naziv);
	 desni.add(datum);
	 add(levi,BorderLayout.WEST);
	 add(desni,BorderLayout.EAST);
	 
 }
 
 
 
}