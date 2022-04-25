package com.udemy.tests;

import com.udemy.steps.serenity.HomePageSteps;
import com.udemy.steps.serenity.MyAccountSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

//@RunWith(SerenityRunner.class)
public class CreateAccountTest {

    @Managed(uniqueSession = true) //nie zamyka przeglądarki między testami
    private WebDriver driver;

    @Steps
    private HomePageSteps homePageSteps;
    @Steps
    private MyAccountSteps myAccountPageSteps;


   // @Test
    //@Screenshots(onlyOnFailures = true)
    public void createAccount() {
        homePageSteps.openHomePage();
        homePageSteps.openAccountPage();
        myAccountPageSteps.registerUser("tester39@jetbrains.com", "Str0n6P4ss@szkas01.com");
        myAccountPageSteps.checkLogoutLink(true);

    }

 //   @Test
    //@Screenshots(disabled = true)
    public void createSameAccount() {
        homePageSteps.openHomePage();
        homePageSteps.openAccountPage();
        myAccountPageSteps.registerUser("tester36@jetbrains.com", "Str0n6P4ss@szkas01.com");
        myAccountPageSteps.checkErorMessage("An account is already registered with your email address. Please log in.");
        myAccountPageSteps.checkLogoutLink(false);
    }
}

