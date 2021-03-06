package day7;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DropdownTesting3 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		//HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_24);
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement drop=driver.findElement(By.name("country")); 
		List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		System.out.println(dropdown.size());
		for(int i=0;i<dropdown.size();i++)
		{
			dropdown.get(i).click();
			if(dropdown.get(i).isSelected())
			{
				System.out.println(dropdown.get(i).getText()+" is active");
			}
			else
			{
				System.out.println(dropdown.get(i).getText()+" is inactive");
			}
		}
		driver.close();
	}

}
