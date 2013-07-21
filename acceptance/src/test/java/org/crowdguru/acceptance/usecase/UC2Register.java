package org.crowdguru.acceptance.usecase;

import static org.junit.Assert.assertTrue;

import org.crowdguru.acceptance.driver.WebDriverFactory;
import org.crowdguru.acceptance.driver.WebDriverGateway;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class UC2Register{

	WebDriverFactory driverFactory = WebDriverGateway.getFirefoxFactory();
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		driver = driverFactory.create();
	}
	
	@Test
	public void testTitle() throws Exception {
        driver.get("http://localhost:8080/crowdguru");
        log().warn("Page title: '" + driver.getTitle() + "'");
        log().warn("Url: '" + driver.getCurrentUrl() + "'");
        assertTrue(driver.getTitle().contains("CrowdGuru"));
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
