package day14;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TabandPopupHandling {
	
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
		String title1=driver.getTitle();
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			String title2=driver.getTitle();
			if(!title1.equals(title2))
			{
				//xpath of 'Privacy and Cookies' in 2nd window
				driver.findElement(By.xpath("//*[@id='privacyLabel']")).click();
				break;
			}
		}
	}
	

}
