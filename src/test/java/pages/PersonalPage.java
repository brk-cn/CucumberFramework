package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PersonalPage {
    WebDriver driver;

    public PersonalPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkTitle(String expectedTitle) {
        Assert.assertEquals(expectedTitle, driver.getTitle());
    }
}
