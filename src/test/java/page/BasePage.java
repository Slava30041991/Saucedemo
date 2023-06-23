package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;
    final String URL = "https://www.saucedemo.com/";

    final String itemNameFromInventory ="//div[text() ='Sauce Labs Backpack']";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
