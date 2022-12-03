package edu.learning.pages;

import edu.learning.Enums.WaitFor;
import edu.learning.driver.DriverFactory;
import edu.learning.driver.DriverManager;
import org.openqa.selenium.By;

public final class LoginPage extends BasePage {

    private By username = By.name("username");

    private By password = By.name("password");

    private By submit = By.xpath("//button[@type='submit']");

    public LoginPage enterUsername(String userName) {
        sendKeys(username, WaitFor.CLICKABLITY, userName);
        return this;
    }

    public LoginPage enterPassword(String pwd) {
        sendKeys(password, WaitFor.CLICKABLITY, pwd);
        return this;
    }

    public void clickSubmit() {
        click(submit, WaitFor.CLICKABLITY);
    }

}
