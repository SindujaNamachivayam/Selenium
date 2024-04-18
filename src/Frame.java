import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.id("RESULT_TextField-0")).sendKeys("surya");
		driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-1_0']")).click();
		driver.findElement(By.xpath("//input[@class='text_field calendar_field hasDatepicker']")).sendKeys("03/12/1991");
		WebElement dropdown = driver.findElement(By.id("RESULT_RadioButton-3"));
		Select s = new Select(dropdown);
		s.selectByValue("Radio-2");
		driver.findElement(By.id("FSsubmit")).click();
//		TakesScreenshot ts = (TakesScreenshot) driver; //screenshot 
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination=new File("D:\\selenium workspace\\Selenium\\ScreenShot\frame.png");
//		FileUtils.copyFile(source,destination);	
		}

}
