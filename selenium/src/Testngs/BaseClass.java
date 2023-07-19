package Testngs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {


	public static WebDriver	driver;

	@BeforeMethod
	public static void OpenApp() throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");



		driver=new FirefoxDriver(); 
		driver.get("https://demowebshop.tricentis.com/");



		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(2000);

	}

	@AfterMethod
public static void CloseApp()
	{

		driver.quit();
	}

}
