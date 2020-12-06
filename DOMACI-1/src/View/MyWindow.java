package View;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;



public class MyWindow extends JFrame

{
 
  private StatusBar statusBar;

  private static MyWindow instance;
  
  public static MyWindow getInstance()
  {
	  if(instance==null)
	  {
		  instance= new MyWindow();
		  
	  }
	  
	  return instance;
  }
  
  public MyWindow()
  {
	  this.setLayout(new BorderLayout());
	  
	  setJMenuBar(new MenuBar());
	  statusBar= new StatusBar();
	  add(statusBar,BorderLayout.SOUTH);
	 
	  }


public StatusBar getStatusBar() {
	return statusBar;
}

public void setStatusBar(StatusBar statusBar) {
	this.statusBar = statusBar;
}


  
  
}
