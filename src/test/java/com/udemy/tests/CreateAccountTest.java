package com.udemy.tests;

import com.udemy.pages.MyAccountPage;
import com.udemy.pages.ShopHomePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CreateAccountTest {

    @Managed(uniqueSession = true) //nie zamyka przeglądarki między testami
    private WebDriver driver;

    ShopHomePage homePage;
    MyAccountPage myAccountPage;



    @Test
    public void createAccount(){
        homePage.open();
        homePage.openMyAccountPage();
        myAccountPage.registerUser("tester33@jetbrains.com", "Str0n6P4ss@szkas01.com");
        Assert.assertEquals(true, myAccountPage.isLogoutLinkDisplayed());
    }

    @Test
    public void createSameAccount(){
        homePage.open();
        homePage.openMyAccountPage();
        myAccountPage.registerUser("tester3@jetbrains.com", "Str0n6P4ss@szkas01.com");
        Assert.assertTrue(myAccountPage.checkErrorMsg("An account is already registered with your email address. Please log in."));
        Assert.assertEquals(false, myAccountPage.isLogoutLinkDisplayed());
    }
}

