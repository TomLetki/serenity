package com.udemy.pages;

import io.cucumber.java.eo.Se;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.components.HtmlTable;
import org.asynchttpclient.request.body.generator.ByteArrayBodyGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static net.thucydides.core.matchers.BeanMatchers.the;
import static org.hamcrest.Matchers.is;

@DefaultUrl("file:///D:/Szkolenie_tester/Serenity/Serenity.html")
public class SerenityDemoPage extends PageObject {

    private Logger log = LoggerFactory.getLogger(SerenityDemoPage.class);

    @FindBy(id = "fname")
    private WebElementFacade firesNameInput;

    @FindBy(id = "city")
    private WebElementFacade cityInput;

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

    @FindBy(tagName = "p")
    private List<WebElementFacade> paragraphs;

    @FindBy(id = "myFile")
    private WebElementFacade fileUploadInput;

    @FindBy(id="table")
    private WebElementFacade table;


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

    public void handleAlerts(){
    createAlertButton.waitUntilVisible().click();
    getAlert().accept();
    }

    public void executeJavascript(){
    String test = "Prezykładowy tekst";
    getJavascriptExecutorFacade().executeScript("arguments[0].click();", showParagraphButton);
    getJavascriptExecutorFacade().executeScript("arguments[0].setAttribute('value', '"+test+"')", cityInput);
        System.out.println(evaluateJavascript("return document.title"));

    }
    public void printNumberOfParagraphs(){
    log.info("SIze of <p> list is "+paragraphs.size());
    }

    public void findMethodTest(){
        log.info("Size of <p> list is "+findAll(By.tagName("p")).size());
        log.info("Size of <p> list is "+findAll("p").size());

        log.info(findNested(By.tagName("body"), By.tagName("h1")).getText());
        log.info(find(Arrays.asList(By.tagName("body"),By.tagName("h1"))).getText());
        log.info(find(By.tagName("button")).getText());
        log.info(find(By.id("newPage")).getText());
        log.info(findNested(By.tagName("button"),By.id("newPage")).getText());


       }

public void uploadFile(String pathToFile){
    upload(pathToFile).to(fileUploadInput);

}
public void getResults(){
    List<Map<Object,String>> rows = HtmlTable.rowsFrom(table);
    System.out.println("Rows size is "+rows.size());
    Map<Object, String> firstRow = rows.get(0);
    System.out.println("Getting element by index "+firstRow.get(1));
    System.out.println("Getting element by coulmn hader "+firstRow.get("Firstname"));

    List<WebElement> filteredRows = HtmlTable.filterRows(table, the("Firstname", is("Eve")));
    System.out.println("Filtered rows size is "+filteredRows.size());
}

}
