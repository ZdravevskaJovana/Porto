package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class CheckoutPage {
    By firstNameField = By.id("billing_first_name");
    By lastNameField = By.id("billing_last_name");
    By streetAddressField = By.id("billing_address_1");
    By cityField = By.id("billing_city");
    By stateField = By.id("billing_state");
    By ZipCodeField = By.id("billing_postcode");
    By phoneNumberField = By.id("billing_phone");

    By emailField = By.id("billing_email");
    By placeOrderBtn = By.id("place_order");

    public void enterBillingDetails (
            String name, String surname, String address, String city, String state, String zipCode, String phone, String email){
        SeleniumHelpers.findElement(firstNameField).sendKeys(name);
        SeleniumHelpers.findElement(lastNameField).sendKeys(surname);
        SeleniumHelpers.findElement(streetAddressField).sendKeys(address);
        SeleniumHelpers.findElement(cityField).sendKeys(city);
        SeleniumHelpers.findElement(stateField).sendKeys(state);
        SeleniumHelpers.findElement(ZipCodeField).sendKeys(zipCode);
        SeleniumHelpers.findElement(phoneNumberField).sendKeys(phone);
        SeleniumHelpers.findElement(emailField).sendKeys(email);


    }
    public void clickOnPlaceOrderBtn (){
        SeleniumHelpers.findElement(placeOrderBtn).click();
    }


}
