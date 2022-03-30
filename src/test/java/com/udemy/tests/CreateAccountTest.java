package com.udemy.tests;

import com.udemy.pages.ShopHomePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CreateAccountTest {

    @Managed
    private WebDriver driver;

    ShopHomePage homePage;

    @Test
    public void createAccount(){
        homePage.openHomePage();
    }
}
