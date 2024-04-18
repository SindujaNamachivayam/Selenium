package Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTripProject {
static WebElement close;
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		WebDriverWait wait = new WebDriverWait(driver,60);
		 close = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("webklipper-publisher-widget-container-notification-frame")));
		 if(close.isDisplayed()) {
				driver.switchTo().frame(close);
				WebElement button = driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div"));
				Actions s = new Actions (driver);
				s.moveToElement(button).click().build().perform();		
				}
		driver.switchTo().defaultContent();
		WebDriverWait wait1 = new WebDriverWait(driver, 50);
		WebElement from = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='text'])[1]")));
		from.sendKeys("chennai");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
		WebDriverWait wait2=new WebDriverWait (driver,50);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='checkbox'])[1]"))).click();
		WebElement drag = driver.findElement(By.xpath("//div[@aria-valuemax='36000']"));
		WebElement drop = driver.findElement(By.xpath("//div[@aria-valuenow='30000']"));
		Actions s1 = new Actions (driver);
		s1.dragAndDrop(drag, drop).build().perform();
		//driver.close();
		
		
	}
}
