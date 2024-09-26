package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class ConfigReader {

    private static Properties properties;
    private final static String propertyFilePath = "config.properties";
   // private static final Logger logger = Logger.getLogger(ConfigReader.class.getName());

    // Private constructor to prevent instantiation
    private ConfigReader() {}

    // Lazy-loaded Singleton pattern to load properties once
    public static Properties getProperties() {
        if (properties == null) {
            synchronized (ConfigReader.class) {
                if (properties == null) {
                    properties = new Properties();
                    try (FileInputStream fis = new FileInputStream("C:\\Users\\barie\\IdeaProjects\\desktop-tutorial\\src\\test\\java\\utilities\\config.properties")) {
                        properties.load(fis);
                       // logger.info("Configuration file loaded successfully.");
                    } catch (IOException e) {
                     //   logger.severe("Could not load configuration file: " + e.getMessage());
                        throw new RuntimeException("Configuration.properties not found at " + propertyFilePath, e);
                    }
                }
            }
        }
        return properties;
    }

    // Utility methods to fetch properties with optional fallback values
    public static String getBrowserType() {

        return getProperties().getProperty("browser", "chrome");
    }

    public static String getApplicationUrl() {
        return getProperties().getProperty("url", "http://localhost");
    }

    public static String getHomePage() {
        return getProperties().getProperty("homepage", "http://localhost/home");
    }

    public static String getExcelFilePath() {
        return getProperties().getProperty("excelfilepath", "./default/path/to/excel");
    }

    public static String getGraphUrl()
    {
        return getProperties().getProperty("graphurl", "http://localhost/graph");
    }

    public static String getGraphGraphUrl() {
        return getProperties().getProperty("graphgraphurl", "http://localhost/graph/graph");
    }

    public static String getGraphRepresentationsUrl() {
        return getProperties().getProperty("graphrepresentationsurl", "http://localhost/graph/representations");
    }
}
