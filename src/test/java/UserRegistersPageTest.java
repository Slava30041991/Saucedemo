import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistersPageTest extends BaseTest {
    String userNameLocator = "//input[@placeholder = 'Username']";
    String userPassword1Locator = "//input[@placeholder = 'Password']";
    String registerButtonLocator = "//input[@data-test = 'login-button']";
    String messageNotShowing = "Сообщение  не отображается";
    String messageProductsLocator = "//span[@class ='title']";
    String errorLockedOutUser = "//div[@class ='error-message-container error']";

    @Test
    public void userRegistrationWithValidData() {
        driver.get(BASE_URL);
        driver.findElement(By.xpath(userNameLocator)).sendKeys("standard_user");
        driver.findElement(By.xpath(userPassword1Locator)).sendKeys("secret_sauce");
        driver.findElement(By.xpath(registerButtonLocator)).click();
        String text = driver.findElement(By.xpath(messageProductsLocator)).getText();

        Assert.assertEquals(text, "Products", messageNotShowing);
    }
    @Test
    public void userLeftFieldsBlank (){
        driver.get(BASE_URL);
        driver.findElement(By.xpath(userNameLocator)).sendKeys("");
        driver.findElement(By.xpath(userPassword1Locator)).sendKeys("");
        driver.findElement(By.xpath(registerButtonLocator)).click();
        String text = driver.findElement(By.xpath("//div[@class = 'error-message-container error']")).getText();

        Assert.assertEquals(text, "Epic sadface: Username is required", messageNotShowing);
    }
    @Test
    public void userEntersOnlyFirstName (){
        driver.get(BASE_URL);
        driver.findElement(By.xpath(userNameLocator)).sendKeys("standard_user");
        driver.findElement(By.xpath(userPassword1Locator)).sendKeys("");
        driver.findElement(By.xpath(registerButtonLocator)).click();
        String text = driver.findElement(By.xpath("//div[@class = 'error-message-container error']")).getText();

        Assert.assertEquals(text, "Epic sadface: Password is required", messageNotShowing);
    }
    @Test
    public void userEntersOnlyPassword(){
        driver.get(BASE_URL);
        driver.findElement(By.xpath(userNameLocator)).sendKeys("");
        driver.findElement(By.xpath(userPassword1Locator)).sendKeys("secret_sauce");
        driver.findElement(By.xpath(registerButtonLocator)).click();
        String text = driver.findElement(By.xpath("//div[@class = 'error-message-container error']")).getText();

        Assert.assertEquals(text,"Epic sadface: Username is required", messageNotShowing);

    }
    @Test
    public void userEnteredWrongPassword(){
        driver.get(BASE_URL);
        driver.findElement(By.xpath(userNameLocator)).sendKeys("standard_user");
        driver.findElement(By.xpath(userPassword1Locator)).sendKeys("12345");
        driver.findElement(By.xpath(registerButtonLocator)).click();
        String text = driver.findElement(By.xpath("//div[@class = 'error-message-container error']")).getText();

        Assert.assertEquals(text,"Epic sadface: Username and password do not match any user in this service", messageNotShowing);

    }

    @Test
    public void lockedOutUser() {
        driver.get(BASE_URL);
        driver.findElement(By.xpath(userNameLocator)).sendKeys(nameLockedOutUser);
        driver.findElement(By.xpath(userPassword1Locator)).sendKeys("secret_sauce");
        driver.findElement(By.xpath(registerButtonLocator)).click();
        String text = driver.findElement(By.xpath(errorLockedOutUser)).getText();

        Assert.assertEquals(text, "Epic sadface: Sorry, this user has been locked out.", messageNotShowing);
    }
    @Test
    public void problemUser() {
        driver.get(BASE_URL);
        driver.findElement(By.xpath(userNameLocator)).sendKeys(problemUsername);
        driver.findElement(By.xpath(userPassword1Locator)).sendKeys("secret_sauce");
        driver.findElement(By.xpath(registerButtonLocator)).click();
        String text = driver.findElement(By.xpath(problemUsername)).getText();

        Assert.assertEquals(text, "Products", messageNotShowing);
    }

}

