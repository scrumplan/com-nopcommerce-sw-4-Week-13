package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;

import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homepage = new HomePage();
    ApparelPage apparelPage = new ApparelPage();

    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        homepage.clickOnApparelTab();
        String actualMessage = apparelPage.getApparelTab();
        Assert.assertEquals(actualMessage,"Apparel","error");
    }
    BooksPage booksPage = new BooksPage();

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        homepage.clickOnBooksTab();
        String actualMessage = booksPage.getBooksTab();
        Assert.assertEquals(actualMessage,"Books","error");
    }
    ComputerPage computerpage = new ComputerPage();

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        homepage.clickOnComputerTab();
        String actualMessage = computerpage.getComputerTab();
        Assert.assertEquals(actualMessage,"Computers","error");

    }
    DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage();

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        homepage.clickOnDigitalDownloadsTab();
        String actualMessage = digitalDownloadsPage.getDigitalDownloadsTab();
        Assert.assertEquals(actualMessage,"Digital downloads","error");

    }
    ElectronicPage electronicsPage = new ElectronicPage();

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        homepage.clickOnElectronicsTab();
        String actualMessage = electronicsPage.getElectronicsTab();
        Assert.assertEquals(actualMessage,"Electronics","error");
    }
    GiftCardPage giftCardPage = new GiftCardPage();

    @Test
    public void userShouldNavigateToGiftCardPageSuccessfully(){
        homepage.clickOnGiftCardTab();
        String actualMessage = giftCardPage.getGiftCardTab();
        Assert.assertEquals(actualMessage,"Gift Cards","error");
    }
    JewelryPage jewelryPage = new JewelryPage();

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        homepage.clickOnJewelryTab();
        String actualMessage = jewelryPage.getJewelryTab();
        Assert.assertEquals(actualMessage,"Jewelry","error");
    }

    }


