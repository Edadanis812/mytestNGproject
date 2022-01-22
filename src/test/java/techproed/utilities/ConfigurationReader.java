package techproed.utilities;

import jdk.swing.interop.SwingInterOpUtils;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigurationReader {
    //ConfigurationReader: to get data from file.
    // This class willONLY be used for getting the data from
    // configuration.properties file
    private static Properties properties;
    static { //static block =It going to run at first.

        //Path of the config file
        String path="configuration.properties";
        try {
            //opening the file
            FileInputStream file=new FileInputStream(path);//use opening file
            //Loading the file
            properties=new Properties();//How we can open the files? With load
            properties.load(file);
            //Closing the file
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Get out the static block
    //    This method accepts the key and returns the value
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
    //Test
    @Test
    public void test1(){
        System.out.println(getProperty("google_url"));
        System.out.println("test_environment");
        System.out.println(getProperty("url"));
    }

}
