package com.udemy.steps.cucumber;

import com.udemy.steps.serenity.HomePageSteps;
import com.udemy.steps.serenity.MyAccountSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.time.LocalTime;

public class MyAccountCucumberSteps {
    @Steps
    private HomePageSteps homePage;

    @Steps
    private MyAccountSteps myAccountPage;

    @Given("user on Selenium demo page")
    public void openSeleniumDemoHomePage(){
        homePage.openHomePage();
    }

    @When("user open account page")
    public void userOpenAccountPage() {
        homePage.openAccountPage();
    }

    @And("register with unique email and valid password")
    public void registerWithUniqueEmailAndValidPassword() {
        myAccountPage.registerUser(LocalTime.now().getNano()+"@gmail.com", "1@DDq2w3e4r5tQWE");
    }

    @Then("should see logout link")
    public void shouldSeeLogoutLink() {
        myAccountPage.checkLogoutLink(true);
    }
}
