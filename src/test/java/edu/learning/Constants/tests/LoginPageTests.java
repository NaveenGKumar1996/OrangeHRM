package edu.learning.Constants.tests;

import edu.learning.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest {

    LoginPage lPage = new LoginPage();

    @Test(dataProvider = "UserDetails")
    public void validateLogin(String username, String password) {
        lPage
                .enterUsername(username)
                .enterPassword(password)
                .clickSubmit();
    }

    @DataProvider(name = "UserDetails", parallel = true)
    public Object[][] getUserDetails() {
        return new Object[][]{
                {"Admin", "admin123"},
                {"Admin", "admin"}
        };
    }

}
