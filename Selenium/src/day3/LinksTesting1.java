package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTesting1 {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.linkText("Gmail")).click();
		String expUrl="https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail#identifier";
		String actUrl=driver.getCurrentUrl();
		if(expUrl.equals(actUrl))
		{
			System.out.println("Gmail link is working correctly");
		}
		else
		{
			System.out.println("Gmail link is not working correctly");
		}
		driver.close();
	}
}


