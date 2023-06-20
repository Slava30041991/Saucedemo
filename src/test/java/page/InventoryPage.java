package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.BaseTest;

public class InventoryPage extends BasePage{
    public static final By INVENTORI_TITLE = By.xpath("//span[@class ='title'  and text() = 'Products' ]");

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public boolean titleVisible() {
        return driver.findElement(INVENTORI_TITLE).isDisplayed();
    }


    }
