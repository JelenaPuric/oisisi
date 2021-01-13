package View;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;




public class MyWindow extends JFrame

{
 
  private StatusBar statusBar;
  private ToolBar toolBar;
  private CentralniPanel centralniPanel;
  

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
	  centralniPanel= new CentralniPanel();
		add(centralniPanel,BorderLayout.CENTER);
	  setJMenuBar(new MenuBar());
	  statusBar= new StatusBar();
	  add(statusBar,BorderLayout.SOUTH);
	 
	  }
  


public ToolBar getToolBar() {
	return toolBar;
}

public void setToolBar(ToolBar toolBar) {
	this.toolBar = toolBar;
}

public CentralniPanel getCentralniPanel() {
	return centralniPanel;
}

public void setCentralniPanel(CentralniPanel centralniPanel) {
	this.centralniPanel = centralniPanel;
}

public StatusBar getStatusBar() {
	return statusBar;
}

public void setStatusBar(StatusBar statusBar) {
	this.statusBar = statusBar;
}


  
  
}
