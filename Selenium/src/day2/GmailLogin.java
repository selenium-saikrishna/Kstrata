package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLogin {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("selenium.saikrishna");
		driver.findElement(By.id("next")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.id("Passwd")).sendKeys("asdfgh");
		driver.findElement(By.id("signIn")).click();
		

	}

}







