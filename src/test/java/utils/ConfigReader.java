package utils;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    public static Properties init() {
        properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties")) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load properties file", e);
        }
        return properties;
    }

    public static Properties getProperties() {
        return properties;
    }
}
