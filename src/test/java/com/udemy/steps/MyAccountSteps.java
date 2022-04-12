package com.udemy.steps;

import com.udemy.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MyAccountSteps {

    private MyAccountPage myAccountPage;
   @Step
    public void registerUser(String email, String password){
        myAccountPage.registerUser(email, password);

    }
    @Step
    public boolean checkLogoutLink(){
      return myAccountPage.isLogoutLinkDisplayed();
    }
    @Step
    public boolean checkErorMessage(String message){
       return myAccountPage.checkErrorMsg(message);
    }
}
