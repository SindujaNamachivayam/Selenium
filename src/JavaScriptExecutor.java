import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		WebElement myaccount = driver.findElement(By.linkText("My Account"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript ("arguments[0].scrollIntoView();",myaccount);//specific element
		Thread.sleep(1000);
		js.executeScript("window.scroll(0,0)"); //starting page
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		js.executeScript("arguments[0].value='mobile';",search);//search executor
		//search.sendKeys(Keys.ENTER);
		WebElement click = driver.findElement(By.xpath("//button[ @class='btn btn-default btn-lg']"));
		js.executeScript("arguments[0].click();",click);//click executor
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		js.executeScript("window.scrollBy(0,1382)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy (0 ,-744 )"); 
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\selenium workspace\\Selenium\\ScreenShot\\mobile.png");
		FileUtils.copyFile(src, des);
				
		}

	

}
