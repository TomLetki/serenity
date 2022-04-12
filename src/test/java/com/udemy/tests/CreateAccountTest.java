package com.udemy.tests;

import com.udemy.pages.MyAccountPage;
import com.udemy.pages.ShopHomePage;
import com.udemy.steps.HomePageSteps;
import com.udemy.steps.MyAccountSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CreateAccountTest {

    @Managed(uniqueSession = true) //nie zamyka przeglądarki między testami
    private WebDriver driver;

    @Steps
    private HomePageSteps homePageSteps;
    @Steps
    private MyAccountSteps myAccountPageSteps;


    @Test
    public void createAccount() {
        homePageSteps.openHomePage();
        homePageSteps.openAccountPage();
        myAccountPageSteps.registerUser("tester36@jetbrains.com", "Str0n6P4ss@szkas01.com");
        Assert.assertEquals(true, myAccountPageSteps.checkLogoutLink());
    }

    @Test
    public void createSameAccount() {
        homePageSteps.openHomePage();
        homePageSteps.openAccountPage();
        myAccountPageSteps.registerUser("tester34@jetbrains.com", "Str0n6P4ss@szkas01.com");
        Assert.assertTrue(myAccountPageSteps.checkErorMessage("An account is already registered with your email address. Please log in."));
        Assert.assertEquals(false, myAccountPageSteps.checkLogoutLink());
    }
}

