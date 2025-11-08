package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class Validation_commands extends BasePage {
	
	public Validation_commands(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@name='number']")WebElement text;
   	@FindBy(xpath="//button[text()='Calculate!']")WebElement calculateBtn;
   	@FindBy(xpath="//a[@href='/about']")WebElement aboutLink;
   	@FindBy(xpath="//a[@href='/terms']")WebElement termsLink;
   	@FindBy(xpath="//a[@href='/privacy']")WebElement policyLink;

   	
   	public void getInputText() {
   		text.isDisplayed();
   		text.isEnabled();
   	}
   	
   	public void getCalculateBtn () {
   		 calculateBtn.isDisplayed();
   		calculateBtn.isEnabled();
   	}
   	
   	public void getAboutLink() {
   		aboutLink.isDisplayed();
   		aboutLink.isEnabled();
   	}
   	
   	public void getTermsLink() {
   		termsLink.isDisplayed();
   		termsLink.isEnabled();
   	}
   	public void getPolicyLink() {
   		policyLink.isDisplayed();
   		policyLink.isEnabled();
   	}
   	
   	
   	
   	
}
