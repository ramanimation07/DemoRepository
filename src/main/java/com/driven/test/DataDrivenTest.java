package com.driven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {

		
		Xls_Reader xl = new Xls_Reader(
				"C:\\Users\\welcome\\eclipse-workspace\\DataDrivenFrameWorks\\src\\main\\java\\com\\testdata\\TestDataRediff.xlsx");
		String fullname = xl.getCellData("RegTestData", "fullname", 2);
		System.out.println(fullname);
		String rediffid = xl.getCellData("RegTestData", "rediffid", 2);
		System.out.println(rediffid);
		String password = xl.getCellData("RegTestData", "password", 2);
		System.out.println(password);
		String retypepassword = xl.getCellData("RegTestData", "retypepassword", 2);
		System.out.println(retypepassword);
		String emailaddress = xl.getCellData("RegTestData", "emailaddress", 2);
		System.out.println(emailaddress);
		String mobilenumber = xl.getCellData("RegTestData", "mobilenumber", 2);
		System.out.println(mobilenumber);
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		 
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys(fullname);
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys(rediffid);
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[11]/td[3]/input")).sendKeys(retypepassword);
		driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")).sendKeys(emailaddress);
		driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys(mobilenumber);
		
		
		
	}

}
