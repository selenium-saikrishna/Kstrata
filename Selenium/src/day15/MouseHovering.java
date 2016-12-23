package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseHovering {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://yssofindia.org");
	}
	
	@Test
	public void  mouseHoverTest() throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement aboutYss=driver.findElement(By.xpath
				                          ("//*[@id='topmenu']/div/ul/li[5]/a/img"));
		WebElement contactUs=driver.findElement(By.xpath
				                     ("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/a"));

		action.moveToElement(aboutYss).moveToElement(contactUs).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath
				     ("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/ul/li[1]/a")).click();
		
	}
}








