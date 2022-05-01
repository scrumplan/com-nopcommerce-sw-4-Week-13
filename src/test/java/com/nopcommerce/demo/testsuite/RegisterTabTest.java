package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BooksPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTabTest extends TestBase {
    HomePage homepage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        homepage.clickOnRegisterLink();
        String expectedMessage = "Register";
        String actualMessage = registerPage.getRegisterTab();
        Assert.assertEquals(expectedMessage, actualMessage, "error");
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        homepage.clickOnRegisterLink();
        registerPage.enterFirstName("Lalita");
        registerPage.enterLastName("Desai");
        registerPage.enterEmail("Lalita113=@gmail.com");
        registerPage.enterPassword("Lalita123");
        registerPage.enterConfirmPassword("Lalita123");
        registerPage.clickOnRegisterButton();
        String expectedMessage = "Your registration completed";
        String actualMessage = registerPage.getRegisterCompletionMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Registered not completed");


    }
}

