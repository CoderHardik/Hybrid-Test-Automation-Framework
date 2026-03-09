package framework;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static {

        try {

            properties = new Properties();

            String path = System.getProperty("user.dir")
                    + "/src/test/resources/data.properties";

            FileInputStream fis = new FileInputStream(path);

            properties.load(fis);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {

        return properties.getProperty(key);
    }
}