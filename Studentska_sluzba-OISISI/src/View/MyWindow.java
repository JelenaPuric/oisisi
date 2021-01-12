package View;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import Model.Model;

public class MyWindow extends JFrame  {
	
	private Model model;
	private ToolBar toolBar;
	private StatusBar statusBar;
	private CentralniPanel centralniPanel;
	private static MyWindow instance;
	
	public static MyWindow getInstance() 
	{
		if(instance==null) 
		{
			
			instance=new MyWindow();
		}
		return instance;
		
	}
	
	public MyWindow()
	{
		setTitle("Studentska sluzba");
		 this.setLayout(new BorderLayout());
		  centralniPanel=new CentralniPanel();
		  setPreferredSize(new Dimension(700,600));
		  this.addWindowListener(new Kontroleri.WindowListener());
		  pack();
		  
		  setJMenuBar(new MenuBar());
		  model=new Model();
		  toolBar= new ToolBar();
		  statusBar= new StatusBar();
		  add(toolBar,BorderLayout.NORTH);
		  add(statusBar,BorderLayout.SOUTH);
		  add(centralniPanel,BorderLayout.CENTER);
		
		
		
		
	}

	public CentralniPanel getCentralniPanel() {
		return centralniPanel;
	}

	public void setCentralniPanel(CentralniPanel centralniPanel) {
		this.centralniPanel = centralniPanel;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}


	public ToolBar getToolBar() {
		return toolBar;
	}

	public void setToolBar(ToolBar toolBar) {
		this.toolBar = toolBar;
	}
	
	public StatusBar getStatusBar() {
		return statusBar;
	}

	public void setStatusBar(StatusBar statusBar) {
		this.statusBar = statusBar;
	}
	
	

}
