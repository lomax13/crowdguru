package org.crowdguru.acceptance.driver;

import org.crowdguru.logging.IntroducedLogger;
import org.openqa.selenium.WebDriver;

public class SharedDriver {
    private static final WebDriver DRIVER = init();
    private static WebDriverFactory driverFactory;

    private static final String FIREFOX_DRIVER = "firefox";
    private static final String WEB_DRIVER_PROPERTY = "web.driver.name";

    private static WebDriver init() {
        String webDriverProperty = System.getProperty(WEB_DRIVER_PROPERTY);
        System.out.println("webDriverProperty:"+webDriverProperty);

        if (FIREFOX_DRIVER.equalsIgnoreCase(webDriverProperty)){
            	driverFactory = WebDriverGateway.getFirefoxFactory();
        }

        else{
            driverFactory = WebDriverGateway.getPhantomJSFactory();
        }

        try {
            return driverFactory.create();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public static WebDriver getInstance() {
        return DRIVER;
    }

    // close the driver
    static {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                DRIVER.quit();
            }
        });
    }


}
