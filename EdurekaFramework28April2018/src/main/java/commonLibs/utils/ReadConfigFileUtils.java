package commonLibs.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigFileUtils {
	
	public static Properties readProperties(String filename) throws Exception{
		
		filename = filename.trim();
		
		InputStream fileReader = new FileInputStream(filename);
		
		Properties property = new Properties();
		
		property.load(fileReader);
		
		return property;
		
		
	}

}
