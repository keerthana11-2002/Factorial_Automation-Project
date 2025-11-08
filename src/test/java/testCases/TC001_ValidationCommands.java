package testCases;

import org.testng.annotations.Test;

import pageObjects.Validation_commands;
import testBase.BasePage_testCases;

public class TC001_ValidationCommands extends BasePage_testCases {

	@Test
	public void verifyText() {
		Validation_commands obj = new Validation_commands(driver);
		obj.getInputText();
	}

	@Test
	public void verifyCalculateBtn() {
		Validation_commands obj = new Validation_commands(driver);
		obj.getCalculateBtn();

	}

	@Test
	public void verifyAboutLink() {
		Validation_commands obj = new Validation_commands(driver);
		obj.getAboutLink();
	}

	@Test
	public void verifyTermsLink() {
		Validation_commands obj = new Validation_commands(driver);
		obj.getTermsLink();
	}

	@Test
	public void verifyPolicy() {
		Validation_commands obj = new Validation_commands(driver);
		obj.getPolicyLink();

	}
}
