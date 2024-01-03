package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class OrderCompletePage {
    private By completionMsg = By.partialLinkText("Complete");

    public String getOrderCompletionMsg (){
        return SeleniumHelpers.findElement(completionMsg).getText();
    }
}
