import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

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


   WebElement findElement = driver.findElement(By.xpath( "input[@type ='submit']"));
   WebElement addToCartButton = driver.findElement(By.xpath("button[@data-test = 'add-to-cart-sauce-labs-backpack']"));
   WebElement goodsSorting = driver.findElement(By.xpath("option[@value  = 'az']"));



    @Test
            public void SearchAttribute (){
        driver.get(BASE_URL);
        driver.findElement(By.xpath("input[@type ='submit']")).click();
    }

}
