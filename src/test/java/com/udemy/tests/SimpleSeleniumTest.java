package com.udemy.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class SimpleSeleniumTest {

    @Managed
    private WebDriver driver;

    @Test
    public void openSeleniumDemoPage()
    {
    driver.get("http://seleniumdemo.com/");
    }
}
