package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorsSauceDemoTest extends BaseTest {

    WebElement locatorIdUserName = driver.findElement(By.id("user-name"));
    WebElement locatorIdPassword =  driver.findElement(By.id("password"));
    WebElement locatorIdLogin = driver.findElement(By.id("login-button"));
    WebElement locatorNameUserName = driver.findElement(By.id("user-name"));
    WebElement locatorNamePassword = driver.findElement(By.name("password"));
    WebElement locatorNameLogin =   driver.findElement(By.name("login-button"));

    WebElement locatorClassNameUserName = driver.findElement(By.className("input_error form_input"));
    WebElement locatorClassPassword = driver.findElement(By.className("input_error form_input"));
    WebElement locatorClassNameLogin = driver.findElement(By.className("submit-button btn_action"));
    WebElement locatorLinkText = driver.findElement(By.linkText("Sauce Labs Backpack"));
    WebElement locatorPartialLinkText = driver.findElement(By.tagName("/static/media/red-t"));

    WebElement textSearch = driver.findElement(By.xpath ("//div[text() ='Sauce Labs Backpack']"));
    WebElement findElement = driver.findElement(By.xpath( "input[@type ='submit']"));
    WebElement addToCartButton = driver.findElement(By.xpath("button[@data-test = 'add-to-cart-sauce-labs-backpack']"));
    WebElement goodsSorting = driver.findElement(By.xpath("option[@value  = 'az']"));
    WebElement searchElementWithAndCondition = driver.findElement(By.xpath("//button[@class ='btn btn_primary btn_small btn_inventory' and @id = 'add-to-cart-sauce-labs-backpack']"));
    WebElement locatorAncestor = driver.findElement(By.xpath("//div[text() ='Sauce Labs Backpack']/ancestor::div[@class = 'inventory_item']"));
    WebElement locatorDescendant = driver.findElement(By.xpath("descendant::div[71]"));
    WebElement locatorParent = driver.findElement(By.xpath("  //parent::div/input[@class = 'input_error form_input']"));




}
