package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.propertyreader.utility.Utility;
import org.openqa.selenium.By;

public class ApparelPage extends Utility {
    By ApparelTab = By.xpath("//h1[contains(text(),'Apparel')]");

    public String  getApparelTab() {
        return getTextFromElement(ApparelTab);

    }
}
