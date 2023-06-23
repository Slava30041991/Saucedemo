package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;

public class LoginTest extends BaseTest {
    @Test
    public void loginUserValidDate() {
        loginPage.openPage();
        loginPage.inputLogin("standard_user", "secret_sauce");

        assertTrue(inventoryPage.titleVisible());
    }

    @Test

    public void userFieldRequired() {
        loginPage.openPage();
        loginPage.inputLogin("standard_user", "");

        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Password is required", "сообщение не отображается");
    }

    public void passwordFieldRequired() {
        loginPage.openPage();
        loginPage.inputLogin("", "secret_sauce");

        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username is required", "сообщение не отображается");
    }
    @Test

    public void userDoesNotCompleteNamePassword() {
        loginPage.openPage();
        loginPage.inputLogin("", "");

        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username is required", "сообщение не отображается");
    }
    @Test

    public void userEntersSpacesNamePassword() {
        loginPage.openPage();
        loginPage.inputLogin(" ", " ");

        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username and password do not match any user in this service", "сообщение не отображается");
}}

