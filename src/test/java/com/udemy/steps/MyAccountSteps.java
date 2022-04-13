package com.udemy.steps;

import com.udemy.pages.MyAccountPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class MyAccountSteps {

    private MyAccountPage myAccountPage;

    @Step("Register user with email {0} and password {1}")
    public void registerUser(String email, String password) {
        myAccountPage.registerUser(email, password);
    }

    @Step("Checking if logout link is displayed")
    public void checkLogoutLink(boolean isDisplayed) {
        Assert.assertEquals(isDisplayed, myAccountPage.isLogoutLinkDisplayed());

    }

    @Step("Checking if error message equals {0}")
    public boolean checkErorMessage(String message) {
        Serenity.takeScreenshot();
        Serenity.recordReportData().withTitle("Msg >> ").andContents(message);
        return myAccountPage.checkErrorMsg(message);
    }
}
