import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_ScreenShot {

	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://tutorialsninja.com/demo/");
		WebElement sch = driver.findElement(By.xpath("//input[@type='text']"));
		sch.sendKeys("laptop");
		sch.sendKeys(Keys.ENTER);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\selenium workspace\\Selenium\\ScreenShot\\tutorials.png");
		FileUtils.copyFile(source, destination);
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.makemytrip.com/");
		driver1.manage().window().maximize();
		WebElement search = driver1.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']"));
		search.sendKeys(Keys.ENTER);
		TakesScreenshot shot = (TakesScreenshot) driver1;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File des = new File ("D:\\selenium workspace\\Selenium\\ScreenShot\\image2.jpg");
		FileUtils.copyFile (src,des);
		
		
		
		}

}
