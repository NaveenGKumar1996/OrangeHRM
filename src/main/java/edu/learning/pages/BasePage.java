package edu.learning.pages;

import edu.learning.Enums.WaitFor;
import edu.learning.driver.DriverManager;
import edu.learning.utils.WaitUtils;
import org.openqa.selenium.By;

public class BasePage {

    protected BasePage() {
    }

    protected void click(By by, WaitFor wait) {
        WaitUtils.performExplicitWait(by, wait).click();
    }

    protected void sendKeys(By by, WaitFor wait, String text) {
        WaitUtils.performExplicitWait(by, wait).sendKeys(text);
    }

    protected String pageTitle() {
        return DriverManager.getDriver().getTitle();
    }

}
