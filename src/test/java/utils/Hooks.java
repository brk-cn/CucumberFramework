package utils;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks {
    WebDriver driver;

    @Before
    public void before() {
        System.out.println("@BEFORE");
        driver = Driver.init();
    }

    @After
    public void after() {
        System.out.println("@AFTER");
        driver.quit();
    }
}
