package com.udemy.pages;

import io.cucumber.java.eo.Se;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@DefaultUrl("file:///D:/Szkolenie_tester/Serenity/Serenity.html")
public class SerenityDemoPage extends PageObject {

    private Logger log = LoggerFactory.getLogger(SerenityDemoPage.class);

    @FindBy(id = "fname")
    private WebElementFacade firesNameInput;

    @FindBy(name = "carSelect")
    private WebElementFacade carSelect;

    @FindBy(className = "topSecret")
    private WebElementFacade secretParagraph;

    @FindBy(id = "newPage")
    private WebElementFacade newPageButton;

    @FindBy(id= "showParagraph")
    private WebElementFacade showParagraphButton;

    @FindBy(id="createAlert")
    private WebElementFacade createAlertButton;

public void checkStateOfElements(){
    log.info("Is visible "+createAlertButton.isVisible());
    log.info("Is currently visible "+secretParagraph.isCurrentlyVisible());
    log.info("Is clickable "+createAlertButton.isClickable());
    log.info("Is present "+secretParagraph.isPresent());

    log.info("Is currently enabled "+secretParagraph.isCurrentlyEnabled()); //daje info czy jest
   // log.info("Is enabled "+secretParagraph.isEnabled()); // wyrzuca błąd jak nie ma elementu
}

public void selectOption(){
    //selenium
  //  Select select = new Select(carSelect);
    // select.selectByIndex(2);

    //Serenity
    carSelect.selectByIndex(1);
    carSelect.selectByValue("mercedes");
    carSelect.selectByVisibleText("Volvo");

}

public void waits(){
    firesNameInput.waitUntilClickable().click();
    carSelect.waitUntilEnabled().selectByValue("volvo");
    waitFor(carSelect).waitUntilVisible().selectByValue("mercedes");
    secretParagraph.click();

  /*  showParagraphButton.waitUntilVisible().click();
    waitForCondition().withTimeout(Duration.ofSeconds(10))
            .pollingEvery(Duration.ofMillis(500))
            .ignoring(NoSuchMethodException.class)
            .until(driver -> driver.findElements(By.tagName("p")).size()==0);*/
    }
}
