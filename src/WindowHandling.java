import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("realme12pro5G",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='_4rR01T'][1]")).click();
		Set<String> tab = driver.getWindowHandles();
		List<String> win = new ArrayList<>(tab);
		System.out.println(tab);
		driver.switchTo().window(win.get(1));
		org.openqa.selenium.interactions.Actions ac = new org.openqa.selenium.interactions.Actions(driver);
		WebElement element = driver.findElement(By.xpath("//div[@class='_2usHgU']"));
		ac.moveToElement(element).perform();
		WebElement element2 = driver.findElement(By.xpath("//iframe[@class='_1JqCrR']"));
		driver.switchTo().frame(element2);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
	}

}
