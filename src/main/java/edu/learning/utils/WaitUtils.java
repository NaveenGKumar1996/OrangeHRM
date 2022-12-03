package edu.learning.utils;

import edu.learning.Constants.FrameworkConstants;
import edu.learning.Enums.WaitFor;
import edu.learning.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    public static WebElement performExplicitWait(By by, WaitFor wait) {
        WebElement element = null;

        if (wait == WaitFor.CLICKABLITY) {
           element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
                    .until(ExpectedConditions.elementToBeClickable(by));

        } else if (wait == WaitFor.VISIBLITY) {
            element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
        } else if (wait == WaitFor.PRESENCE) {
            element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
                    .until(ExpectedConditions.presenceOfElementLocated(by));
        } else {
            element = DriverManager.getDriver().findElement(by);
        }
        return element;
    }
}
