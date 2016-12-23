package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ChromeLaunch {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		
		driver.findElement(By.name("Email")).sendKeys("selenium.saikrishna");
		driver.findElement(By.id("next")).click();
		//Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.id("Passwd")).sendKeys("asdfgh");
		driver.findElement(By.id("signIn")).click();
	}
	

}













