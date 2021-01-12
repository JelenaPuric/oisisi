package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Model.Model;
import View.MyWindow;


public class ReadWrite {
	
	 public static void citajFile(String putanja)
	   {
		   Model model;
		   
		   try {
			FileInputStream fis=new FileInputStream(putanja);
			ObjectInputStream obj=new ObjectInputStream(fis);
			model=(Model)obj.readObject();
			MyWindow.getInstance().setModel(model);
			fis.close();
			obj.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
	   }


	
	public static void pisiFile(String putanja)
	{
	
		try {
			FileOutputStream fos = new FileOutputStream(putanja);
			ObjectOutputStream obj= new ObjectOutputStream(fos);
			obj.writeObject(MyWindow.getInstance().getModel());
			fos.close();
			obj.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	

}
