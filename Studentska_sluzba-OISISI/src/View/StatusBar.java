
package View;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 * 
 * @author Jelena Puric RA215-2018
 * Kreiramo klasu StatusBar koja nasljedjuje JPanel i ima polja naziv i datum tipa JLabel.
 */

public class StatusBar extends JPanel
{
 private JLabel naziv;
 private JLabel datum;
 
 
 /**
  * Kreiran je prazan konstrukor za klasu StatusBar gdje postavljamo zeljeni naziv i datum. Biramo BorderLayout.
  * Kako bi napravili realno vrijeme i datum u nasem status baru koristimo timer koji funkcionise preko ActionListener-a.
  * Postavimo da nam je datum date tipa LocalDateTime trenutan(now) i on ce biti ispisan kao neki String d gdje postavimo
  * da prvo ispisuje sate, minute, dan, mjesec i na kraju godinu. Takodje je String prilagodjen formi koja se trazi u
  * specifikaciji tj. da se postave razmaci ili : gdje treba. Na kraju ubacimo taj String d u nasu promjenljivu datum preko setText.
  */
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
			String d;
			d=String.valueOf(date.getHour())+":"+String.valueOf(date.getMinute())+" "+String.valueOf(date.getDayOfMonth())+"."+String.valueOf(date.getMonthValue())+"."+String.valueOf(date.getYear())+".";
			
			datum.setText(d);
			
		}
		
	 });
	 
	 /**
	  * Otpocinjemo timer. Uredjujemo izgled naseg prozora StatusBar tako sto napravimo dva panela levi i desni.
	  * U levom postavimo FlowLayout na levu stranu, a u desnom na desnu. U levi dodamo naziv, a u desni datum.
	  * Na kraju dodajemo da se levi panel nalazi zapadno na BorderLayout-u, a desni istocno.
	  */
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