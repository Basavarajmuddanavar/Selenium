package Testngs;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.checkerframework.common.util.report.qual.ReportCreation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class TestScript extends BaseClass{

	@Test(dataProvider="Basu", dataProviderClass= dataprov.class)
	public static void Test1(String Name, String Password, String Lap) throws InterruptedException

	{

		driver.findElement(By.xpath("//a[text()='Log in']")).click();


		driver.findElement(By.name("Email")).sendKeys(Name);
		driver.findElement(By.id("Password")).sendKeys(Password);


		driver.findElement(By.xpath("(//div/input[@type='submit'])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form/input[@id='small-searchterms']")).sendKeys(Lap);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form/input[@type='submit']")).click();
		WebElement price = driver.findElement(By.xpath("//a[@href='/141-inch-laptop']/../following-sibling::div[1]/div[3]/div[1]/span"));
		String text = price.getText();
		Reporter.log(text,true);
		
	
		
	

	}
}
