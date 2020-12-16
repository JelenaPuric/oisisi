package View;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import Model.Model;

public class MyWindow extends JFrame  {
	
	private Model model;
	private ToolBar toolBar;
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
		this.setLayout(new BorderLayout());
		centralniPanel= new CentralniPanel();
		add(centralniPanel,BorderLayout.CENTER);
		setPreferredSize(new Dimension(500,500));
		pack();
		
	
		toolBar= new ToolBar();
		add(toolBar,BorderLayout.NORTH);
		
		
		
		
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
	
	
	

}
