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
