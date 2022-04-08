package com.udemy.tests;

import com.udemy.pages.SerenityDemoPage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.io.File;

@RunWith(SerenityRunner.class)
public class SerenityDemoTest {

    @Managed
    private WebDriver driver;
    private SerenityDemoPage demoPage;

    @Test
    public void testSerenityDemoPage() {
        File file = new File("src/test/resources/UploadMe.txt");
        demoPage.open();
       // demoPage.checkStateOfElements();
        //demoPage.selectOption();
       // demoPage.waits();
        //demoPage.handleAlerts();
        //demoPage.executeJavascript();
       // demoPage.printNumberOfParagraphs();
        //demoPage.findMethodTest();
        demoPage.uploadFile(file.getAbsolutePath());


    }
}
