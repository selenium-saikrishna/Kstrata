package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTesting1 {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://ebay.in");
		
		//using sendkeys
		                //id of the dropdown
		driver.findElement(By.id("gh-cat")).sendKeys("Mobile Phones");
		
		//using select class
		                    //id of the dropdown
		WebElement dropdown=driver.findElement(By.id("gh-cat"));
		Select myselect=new Select(dropdown);
		myselect.selectByIndex(1);
		myselect.selectByValue("162260");
		myselect.selectByVisibleText("Movies & Music");

	}

}
