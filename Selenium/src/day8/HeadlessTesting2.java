package day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class HeadlessTesting2 {

	
	public static void main(String[] args) throws IOException {
		System.setProperty("phantomjs.binary.path","c:\\phantomjs.exe");
		PhantomJSDriver driver=new PhantomJSDriver();
		driver.get("http://msn.com");
		System.out.println(driver.getTitle());
		
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("c:\\users\\sai\\desktop\\Msn.png"));

	}

}
