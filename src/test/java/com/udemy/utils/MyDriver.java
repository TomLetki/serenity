package com.udemy.utils;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class MyDriver implements DriverSource {
    @Override
    public WebDriver newDriver() {
        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();
        options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
        System.out.println("My driver implementation");
        return new EdgeDriver(options);

    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
