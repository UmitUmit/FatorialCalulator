package com.careers.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties configFile;

    static {
        try {

            //provides access to file
            FileInputStream input = new FileInputStream("configuration.properties");
            //initialize configFile
            configFile = new Properties();
            //load properties file
            configFile.load(input);
            //close input stream
            input.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return configFile.getProperty(key);
    }
}

