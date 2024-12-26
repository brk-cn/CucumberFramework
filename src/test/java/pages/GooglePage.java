package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GooglePage {
    WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    static By searchBox = By.name("q");
    static By searchResults = By.cssSelector("cite");

    public void goToGoogle() {
        driver.get("https://www.google.com");
    }

    public void search(String query) {
        WebElement searchInput = driver.findElement(searchBox);
        searchInput.sendKeys(query);
        searchInput.sendKeys(Keys.RETURN);
    }

    public boolean isResultVisible(String text) {
        List<WebElement> results = driver.findElements(searchResults);

        for (WebElement result : results) {
            if (result.getText().contains(text)) {
                return true;
            }
        }
        return false;
    }

    public void clickResultByText(String text) {
        List<WebElement> results = driver.findElements(searchResults);

        for (WebElement result : results) {
            if (result.getText().contains(text)) {
                result.click();
                return;
            }
        }
    }
}