package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.propertyreader.utility.Utility;
import org.openqa.selenium.By;

public class DigitalDownloadsPage extends Utility {
    By DigitalDownloadsTab = By.xpath("//h1[contains(text(),'Digital downloads')]");

    public String  getDigitalDownloadsTab() {
        return getTextFromElement(DigitalDownloadsTab);

    }
}
