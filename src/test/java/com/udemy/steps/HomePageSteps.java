package com.udemy.steps;

import com.udemy.pages.MyAccountPage;
import com.udemy.pages.ShopHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class HomePageSteps extends ScenarioSteps {

    public ShopHomePage homePage;
    @Step
    public void openHomePage(){
        homePage.open();

    }
    @Step
    public void openAccountPage(){
        homePage.openMyAccountPage();
    }

}
