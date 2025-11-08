package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.BasePage;

public class DataDriven_Factorial extends BasePage {

	public DataDriven_Factorial(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@name='number']")
	WebElement inputText;
	@FindBy(xpath = "//button[text()='Calculate!']")
	WebElement calBtn;
	@FindBy(xpath = "//p[@id='resultDiv']")
	WebElement resultTxt;

	public void getInputText(int number) {
		inputText.clear();
		inputText.sendKeys(String.valueOf(number));
	}

	public void getCalBtn() {
		calBtn.click();
	}

	public String getResultValue() {

		final String oldText;
		try {
			oldText = resultTxt.getText();
		} catch (Exception e) {

			return getUpdatedResult("");
		}

		return getUpdatedResult(oldText);
	}

	private String getUpdatedResult(String oldText) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(driver -> {
			String newText = resultTxt.getText().trim();
			return !newText.isEmpty() && !newText.equals(oldText);
		});

		String result = resultTxt.getText();
		if (result.contains(":")) {
			return result.split(":")[1].trim();
		} else {
			return result;
		}
	}

}
