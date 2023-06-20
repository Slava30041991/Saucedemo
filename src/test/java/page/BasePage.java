package page;

import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;
    final String URL = "https://www.saucedemo.com/";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
