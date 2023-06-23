package miscellaneous;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddingCheckingCostGoodsCartTest extends BaseTest {
    String userNameLocator = "//input[@placeholder = 'Username']";
    String userPassword1Locator = "//input[@placeholder = 'Password']";
    String registerButtonLocator = "//input[@data-test = 'login-button']";
    String messageNotShowing = "Сообщение  не отображается";
    @Test
    public void scriptAddingItemCart() {
        driver.get(BASE_URL);
        driver.findElement(By.xpath(userNameLocator)).sendKeys("standard_user");
        driver.findElement(By.xpath(userPassword1Locator)).sendKeys("secret_sauce");
        driver.findElement(By.xpath(registerButtonLocator)).click();
        driver.findElement(By.xpath("//div[text ()= 'Sauce Labs Backpack']")).click();
        driver.findElement(By.xpath("//button[@id ='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//div[@id ='shopping_cart_container']")).click();
        String text = driver.findElement(By.xpath("//div[@class ='inventory_item_name' ]")).getText();
        String text1 = driver.findElement(By.xpath("//div[@class ='inventory_item_price' ]")).getText();

        Assert.assertEquals(text, "Sauce Labs Backpack", messageNotShowing);
        Assert.assertEquals(text1, "$29.99", messageNotShowing);

    }

}