package File;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Configuartion
{
	private static Path relativePath=Paths.get("");
	public static String resourcesPath=relativePath.toAbsolutePath()+"/resources/";

}
