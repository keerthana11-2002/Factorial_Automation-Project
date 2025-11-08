package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataReading {

	@DataProvider(name = "factorialData")

	public Object[][] getExcelData() throws BiffException, IOException {

		FileInputStream fileInputStream = new FileInputStream(
				"C:\\Eclipse\\Factorial-Automation _Project\\Factorial-Automation_Project\\testData\\Data_Driven.xls");
		Workbook wb = Workbook.getWorkbook(fileInputStream);
		Sheet sheet = wb.getSheet("Sheet1");
		int rows = sheet.getRows();
		int cols = sheet.getColumns();

		Object[][] data = new Object[rows - 1][cols];

		for (int r = 1; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				data[r - 1][c] = sheet.getCell(c, r).getContents();
			}
		}

		wb.close();
		return data;

	}

}
