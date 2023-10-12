package Generic_liberies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Property_file {
public String getpropertyData(String key) throws Throwable {
	Properties p=new Properties();
	FileInputStream fis = new FileInputStream(ipathconstant.propertyfilePath);
	p.load(fis);
	return p.getProperty(key);
}
}
