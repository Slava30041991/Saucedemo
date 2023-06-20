package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.internal.BaseTestMethod;

public class RegistrationPage extends BasePage {
    public static final By USER_NAME = By.id("user-name");
    public static final By PASSWORD= By.id("password");
    public static final By LOGIN_BUTTON = By.id("login-button");
    public static final By ERROR_MESSAGE = By.xpath("//h3[@data-test ='error' ]");

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    public void openPage(){
        driver.get(URL);
    }
    public void inputLogin (String userName, String password){
        driver.findElement(USER_NAME).sendKeys(userName);
        driver.findElement(PASSWORD).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
    }
    public String getErrorMessage(){
        return driver.findElement(ERROR_MESSAGE).getText();
    }
}
