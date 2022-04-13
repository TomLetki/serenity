package com.udemy.steps;

import com.udemy.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MyAccountSteps {

    private MyAccountPage myAccountPage;
   @Step("Register user with email {0} and password {1}")
    public void registerUser(String email, String password){
        myAccountPage.registerUser(email, password);
    }

    @Step("Checking if logout link is displayed")
    public boolean checkLogoutLink(){
      return myAccountPage.isLogoutLinkDisplayed();
    }

    @Step("Checking if error message equals {0}")
    public boolean checkErorMessage(String message){
       return myAccountPage.checkErrorMsg(message);
    }
}
