package Testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC3 {
	
	@Test
	public void testcase1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jahid\\Documents\\Selenium_work\\Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
   String title=driver.getTitle();
		
		if(title.equalsIgnoreCase("orangeHRM"))
		{
		System.out.println("Landed in the right page");	
		}
		else
		{
			System.out.println("wrong site");
		}
		
	driver.quit();
		
	}

}
