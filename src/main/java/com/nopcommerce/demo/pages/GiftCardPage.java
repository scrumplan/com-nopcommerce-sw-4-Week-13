package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.propertyreader.utility.Utility;
import org.openqa.selenium.By;

public class GiftCardPage extends Utility {
    By GiftCard = By.xpath("//h1[contains(text(),'Gift Card')]");

    public String  getGiftCardTab() {
        return getTextFromElement(GiftCard);

    }
}
