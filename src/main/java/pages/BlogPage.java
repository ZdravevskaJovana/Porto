package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class BlogPage {
  private   By blogLinkToTopics = By.cssSelector("div[data-title='Perfect Accessories']");

    public void selectBlogTopic (){
        SeleniumHelpers.findElement(blogLinkToTopics).click();
    }
}
