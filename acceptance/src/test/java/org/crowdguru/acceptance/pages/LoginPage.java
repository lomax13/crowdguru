package org.crowdguru.acceptance.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private static LoginPage PAGE_INSTANCE = new LoginPage();

    public static LoginPage getInstance() {
        return PAGE_INSTANCE;
    }

    public WebElement registerButton(){
        return driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
    }

}
