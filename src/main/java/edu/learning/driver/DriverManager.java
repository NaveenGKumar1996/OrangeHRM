package edu.learning.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class DriverManager {

    // You can create SubClass for threadLocal and extend Thread Local and override initial method
    // or user anonymous class and override withInitial method

    private DriverManager() {

    }

    // Use Supplier interface from Functional Interface concept, Which I used below
    //Default ThreadLocal value if Null, but make it as driver
    /*private static ThreadLocal<WebDriver> threadDriver = ThreadLocal.withInitial(() -> {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    });*/

    private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    public static void setDriver(WebDriver driver) {
        threadLocal.set(driver);
    }

    public static WebDriver getDriver() {
       return threadLocal.get();
    }

    public static void unload() {
        threadLocal.remove();
    }

}
