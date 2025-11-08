package testCases;

import org.testng.annotations.Test;

import pageObjects.AboutPage;
import testBase.BasePage_testCases;

public class TC004_AboutPage extends BasePage_testCases{
	@Test
	public void aboutPage() {
		AboutPage obj = new AboutPage(driver);
		obj.clickAboutLink();
	}

}
