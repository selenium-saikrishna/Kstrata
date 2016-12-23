package day9;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotOnError1 {

	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		
		List<WebElement> links=driver.findElements(By.linkText("Kstrata"));
		if(links.size()==0)
		{
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile,new File("c:\\users\\sai\\desktop\\Google.png"));
		}
		else
		{
			driver.findElement(By.linkText("Kstrata")).click();
		}
		driver.close();
	}

}



