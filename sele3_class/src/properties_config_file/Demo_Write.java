package properties_config_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo_Write {

	static Properties prop;
	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fos= new FileOutputStream(".//variable_fields//config_file.properties");
			
			prop = new Properties();
			
			prop.setProperty("id", "face");
			
			prop.setProperty("user2", "pravin@nano");
			
			prop.store(fos, "written data successfully----");
			
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
