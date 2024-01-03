package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class ShoppingCartPage {

    By proceedToCheckoutBtn = By.className("wc-proceed-to-checkout");

    public void clickOnProceedToCheckoutBtn(){
        SeleniumHelpers.findElement(proceedToCheckoutBtn).click();
    }

}
