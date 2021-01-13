package File;

import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Configuartion
{
	private static Path relativePath=Paths.get("");
	public static String resourcesPath=relativePath.toAbsolutePath().toString()+"/resources/";
	
	
	private static Path currentRelativePath= Paths.get("");

	
	public static Icon addIcon=  new ImageIcon(currentRelativePath.toAbsolutePath().toString()+"/resources/add.png");
	public static Icon editIcon=  new ImageIcon(currentRelativePath.toAbsolutePath().toString()+"/resources/edit.png");
	public static Icon deleteIcon=  new ImageIcon(currentRelativePath.toAbsolutePath().toString()+"/resources/bin.png");
<<<<<<< HEAD
	public static Icon pretragaIcon= new ImageIcon(currentRelativePath.toAbsolutePath().toString()+"/resource/pretraga.png");
=======
	public static Icon closeIcon=  new ImageIcon(currentRelativePath.toAbsolutePath().toString()+"/resources/close1_3_13.png");
>>>>>>> 61d0fdb63b0bf6a98445b19912ed616a7b2f484a
	
}
