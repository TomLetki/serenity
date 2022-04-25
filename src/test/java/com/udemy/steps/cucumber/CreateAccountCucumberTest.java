package com.udemy.steps.cucumber;

import com.udemy.steps.serenity.HomePageSteps;
import com.udemy.steps.serenity.MyAccountSteps;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/create_account.feature")
public class CreateAccountCucumberTest {

}

