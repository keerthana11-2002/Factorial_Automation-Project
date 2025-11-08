package testCases;

import org.testng.annotations.Test;

import pageObjects.VerificationText;
import testBase.BasePage_testCases;

public class TC002_VerificationText extends BasePage_testCases {
	@Test
	public void verifyPlaceholder() {
		VerificationText obj = new VerificationText(driver);
		obj.verifyInputPlaceholder();
	}

	@Test
	public void verifyUrl() {
		VerificationText obj1 = new VerificationText(driver);
		obj1.verifyURL();
	}

	@Test
	public void verifyGetTitle() {
		VerificationText obj2 = new VerificationText(driver);
		obj2.verifyTitle();
	}

}
