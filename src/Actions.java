import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		org.openqa.selenium.interactions.Actions mouse = new org.openqa.selenium.interactions.Actions (driver);
		WebElement doubleclk = driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		mouse.doubleClick(doubleclk).build().perform(); //double click
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		mouse.dragAndDrop(drag, drop).build().perform(); //drag and drop
		driver.get("https://www.meesho.com/");
		WebElement move = driver.findElement(By.xpath("//span[text()='Electronics']"));
		mouse.moveToElement(move).build().perform();//move to element
		WebElement element = driver.findElement(By.xpath("//img[@alt='Meesho Logo']"));
		mouse.contextClick(element).perform();
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		}

}
