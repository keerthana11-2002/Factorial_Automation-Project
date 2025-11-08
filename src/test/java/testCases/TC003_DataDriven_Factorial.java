package testCases;

import org.testng.annotations.Test;

import pageObjects.DataDriven_Factorial;
import testBase.BasePage_testCases;
import utilities.DataReading;

public class TC003_DataDriven_Factorial extends BasePage_testCases {
	
	@Test(dataProvider = "factorialData", dataProviderClass = DataReading.class)
	public void DataDriven(String numberValue, String expectedValue) {
		int number = Integer.parseInt(numberValue);

		DataDriven_Factorial obj = new DataDriven_Factorial(driver);
		obj.getInputText(number);
		obj.getCalBtn();

		String actualResult = obj.getResultValue();
		System.out.println("Input: " + number + " Expected: " + expectedValue + " Actual: " + actualResult);
		assert actualResult.equals(expectedValue) : "Mismatch!";
	}

}
