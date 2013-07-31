package org.crowdguru.acceptance.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    private static RegistrationPage PAGE_INSTANCE = new RegistrationPage();

    public static RegistrationPage getInstance() {
        return PAGE_INSTANCE;

    }

    public WebElement emailInputField(){
        return driver.findElement(By.id("inputEmail"));

    }

    public WebElement passwordInputField(){
        return driver.findElement(By.id("inputPassword"));

    }

    public WebElement saveDetailsAndContinueRegLaterButton(){
        return driver.findElement(By.xpath("//input[@value='Save details and continue registration later']"));

    }





}
