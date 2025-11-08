package testCases;

import org.testng.annotations.Test;

import pageObjects.DefectedScenario;
import testBase.BasePage_testCases;

public class TC005_DefectedScenario extends BasePage_testCases{
	@Test
	public void verifyTitle() {
		DefectedScenario obj = new DefectedScenario(driver);
		obj.verifyTitle();
	}

}
