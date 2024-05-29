package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropReader {
	
	public static String readPropData(String propName) throws IOException
	{
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\Config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		String data = prop.getProperty(propName);
		
		System.out.println(data);
		
		return data;
		
	}
	
//	public static void main(String[] args) throws IOException {
//		
//		
//		PropReader pr = new PropReader();
//		
//		pr.readPropData();
//	}

}
