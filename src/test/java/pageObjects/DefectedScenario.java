package pageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import testBase.BasePage;

public class DefectedScenario extends BasePage {

	public DefectedScenario(WebDriver driver) {
		super(driver);

	}

	public void verifyTitle() {
		String titleString = driver.getTitle();
		Assert.assertEquals(titleString, "Factorial");
		
		
	}

}
