package pageObjects;

import java.util.List;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class AboutPage extends BasePage {

	public AboutPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[@href='/about']")
	WebElement aboutlink;
	@FindBy(tagName = "a")
	List<WebElement> links;

	public void clickAboutLink() {
		aboutlink.click();
		int TotalLinks = links.size();
		System.out.println(TotalLinks);

		for (WebElement link : links) {
			System.out.println(link.getText());

		}
		org.testng.Assert.assertTrue(TotalLinks > 5, "Total links are not greater than 5!");

	}

}
