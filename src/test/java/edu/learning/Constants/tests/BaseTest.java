package edu.learning.Constants.tests;

import edu.learning.driver.DriverFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected BaseTest() {

    }

    @BeforeTest
    protected void setUp() {
        DriverFactory.initDriver();
    }

    @AfterTest
    protected void tearDown() {
        DriverFactory.quitDriver();
    }
}
