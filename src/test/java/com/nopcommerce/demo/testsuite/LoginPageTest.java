package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");


    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("Lalita122=@gmail.com");
        loginPage.enterPasswordField("Lalita123");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Log out";
        String actualErrorMessage = loginPage.getLogOutText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "user can not log in");


    }

    @Test
    public void verifyErrorMessageWithInvalidCradincial() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("Prime123@gmail.com");
        loginPage.enterPasswordField("prime123");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message not displayed");


    }


}
