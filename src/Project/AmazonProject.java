package Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonProject {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=16526533694036946542&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302642&hvtargid=kwd-10573980&hydadcr=14453_2371562&gad_source=1");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hp laptop",Keys.ENTER);
		driver.findElement(By.xpath("(//a[@target='_blank'])[2]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> win = new ArrayList<>(windowHandles);
		driver.switchTo().window(win.get(1));	
		WebElement element = driver.findElement(By.xpath("//input[@aria-labelledby='a-autoid-4-announce']"));
		element.click();
		driver.findElement(By.xpath("//div[@class='a-popover-inner']"));
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_SPACE);
		WebElement qty = driver.findElement(By.xpath("(//select[@data-action='a-dropdown-select'])[4]"));
		Select s = new Select(qty);
		s.selectByIndex(2);
		Thread.sleep(10000);
		//		WebDriverWait wait = new WebDriverWait (driver,30);
		WebElement element2 = driver.findElement(By.id("add-to-cart-button"));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(element2);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element2);
		element2.click();
		driver.findElement(By.xpath("(//a[@class='a-button-text'])[3]")).click();
		driver.close();		

	}      
	

}
