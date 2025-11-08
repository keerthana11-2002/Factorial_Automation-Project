package pageObjects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import testBase.BasePage;

public class VerificationText extends BasePage {

	public VerificationText(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@name='number']")
	WebElement inputTxt;

	public void verifyInputPlaceholder() {
		String ActualMsg = inputTxt.getAttribute("placeholder");
		assertEquals(ActualMsg, "Enter an integer", "PlaceholderText is not matched");
	}

	public void verifyURL() {
		String actualMsg = driver.getCurrentUrl();
		assertTrue(actualMsg.contains("https"), "URL is not matched");
	}

	public void verifyTitle() {
		String actualMsg = driver.getTitle();
		SoftAssert assert1 = new SoftAssert();
		assert1.assertEquals(actualMsg, "Factorial", "Title is not matched");
		assert1.assertAll();
	}

}
