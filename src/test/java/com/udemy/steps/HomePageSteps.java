package com.udemy.steps;

import com.udemy.pages.MyAccountPage;
import com.udemy.pages.ShopHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class HomePageSteps extends ScenarioSteps {

    public ShopHomePage homePage;
    @Step(value = "Opening Home Page!")
    public void openHomePage(){
        homePage.open();
        getPages().currentPageAt(ShopHomePage.class);

    }
    @Step("Opening My Account Page!") // może być string
    public void openAccountPage(){
        homePage.openMyAccountPage();
    }

}
