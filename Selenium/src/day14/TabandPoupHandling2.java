package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TabandPoupHandling2 {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://bing.com");
		
	}
	
	@Test
	public void windowTest()
	{
	   String mainurl=driver.getCurrentUrl();
	   String targeturl=driver.findElement(By.linkText("Help")).getAttribute("href");
	   driver.get(targeturl);
	   driver.findElement(By.xpath("//*[@id='privacyLabel']")).click();
	   driver.get(mainurl);
	}

}


