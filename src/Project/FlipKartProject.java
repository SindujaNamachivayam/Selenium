package Project;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKartProject {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions a = new Actions (driver);
		a.moveToElement(fashion).perform();
		WebElement ethnic = driver.findElement(By.xpath("(//a[@class='_1BJVlg'])[2]"));
		a.moveToElement(ethnic).build().perform();
		Thread.sleep(5000);
		WebElement saree = driver.findElement(By.linkText("Women Sarees"));
		a.moveToElement(saree).build().perform();
		saree.click();
		driver.findElement(By.xpath(" //div[text( )='Discount']")).click();
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[4]")).click();
		driver.findElement(By.xpath("(//div[@class='_2gmUFU _3V8rao'])[7]")).click();
		driver.findElement(By.xpath("//a[text()='Woven Narayanpet Cotton Blend, Cotton Silk Saree']")).click();
		Set<String> window1 = driver.getWindowHandles();
		List<String> win = new LinkedList<String>(window1);
		driver.switchTo().window(win.get(1));
		
		
		
	}

	

}
