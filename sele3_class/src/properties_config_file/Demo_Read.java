package properties_config_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Demo_Read {

	public static void main(String[] args) {
		try {
			
			FileInputStream fis= new FileInputStream(".//variable_fields//config_file.properties");
			
			Properties prop = new Properties();
			
			prop.load(fis);
			
			String key1 = prop.getProperty("username");
			
			System.out.println(key1);
			
			String key2 = prop.getProperty("address");
			
			System.out.println(key2);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
