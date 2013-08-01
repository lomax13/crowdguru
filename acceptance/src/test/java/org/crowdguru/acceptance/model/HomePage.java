package org.crowdguru.acceptance.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private String homePageURL=System.getProperty("applicationURL");

    private static HomePage PAGE_INSTANCE = new HomePage();

    public static HomePage getInstance() {
        return PAGE_INSTANCE;
    }

    public WebElement signInOrRegisterButton() {
        return driver.findElement(By.xpath("//a[contains(text(),'Sign in / register')]"));

    }


    public void load() {
        driver.get(homePageURL);
    }


}
