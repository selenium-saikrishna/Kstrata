package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTesting7 {
	public static void main(String args[])
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed())
			{
				String linkname=links.get(i).getText();
				String expUrl=links.get(i).getAttribute("href");
				links.get(i).click();
				String actUrl=driver.getCurrentUrl();
				if(expUrl.equals(actUrl))
				{
					System.out.println(linkname+" is working correctly");
				}
				else
				{
					System.out.println(linkname+" is not working correctly");
				}
				driver.navigate().back();
				links=driver.findElements(By.tagName("a"));
			}
			
		}
		driver.close();
	}

}
