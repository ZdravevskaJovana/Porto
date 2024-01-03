package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class MyAccPageLoginOrRegistration {

    private By registerEmailAddressField = By.id("reg_email");
    private By registerBtn = By.name("register");

    public void enterRegisterEmailAddress(String email){
        SeleniumHelpers.findElement(registerBtn).sendKeys(email);
    }
    public void clickOnRegisterBtn (){
        SeleniumHelpers.findElement(registerBtn).click();
    }

}


