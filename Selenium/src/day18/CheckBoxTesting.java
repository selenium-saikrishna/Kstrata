package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckBoxTesting {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");
	}
	
	@Test
	public void checkBoxTesting()
	{
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> check=block.findElements(By.tagName("input"));
		for(int i=0;i<check.size();i++)
		{
			if(!check.get(i).isSelected())
				check.get(i).click();
		}
	}

}
