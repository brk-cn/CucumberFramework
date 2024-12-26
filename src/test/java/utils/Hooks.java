package utils;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.After;

import java.util.Properties;

public class Hooks {
    WebDriver driver;
    Properties properties;

    @Before
    public void before() {
        System.out.println("@BEFORE");
        properties = ConfigReader.init();
        driver = Driver.init();
    }

    @After
    public void after() {
        System.out.println("@AFTER");
        driver.quit();
    }
}
