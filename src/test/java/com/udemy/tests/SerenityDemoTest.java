package com.udemy.tests;

import com.udemy.pages.SerenityDemoPage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SerenityDemoTest {

    @Managed
    private WebDriver driver;
    private SerenityDemoPage demoPage;

    @Test
    public void testSerenityDemoPage() {

        demoPage.open();
       // demoPage.checkStateOfElements();
        //demoPage.selectOption();
       // demoPage.waits();
        //demoPage.handleAlerts();
        demoPage.executeJavascript();


    }
}
