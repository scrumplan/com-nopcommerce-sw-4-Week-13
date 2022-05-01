package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.propertyreader.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicPage extends Utility {

    By ElectronicsTab = By.xpath("//h1[contains(text(),'Electronics')]");

    public String  getElectronicsTab(){
        return getTextFromElement(ElectronicsTab);

    }
}
