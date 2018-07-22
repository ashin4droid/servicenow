package unrelated;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadlessWithScreenshot
{
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		
		//Set Chrome Headless mode as TRUE
		ChromeOptions options = new ChromeOptions();
		//options.setHeadless(true);
		
		//Instantiate Web Driver and open web page
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.google.com");
		System.out.println("Page title is - " + driver.getTitle());
		
		//Take screenshot
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("headless_screenshot.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		driver.close();
	}
}
