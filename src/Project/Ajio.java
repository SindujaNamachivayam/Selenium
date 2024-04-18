package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.ajio.com/?utm_source=icubes&utm_medium=affiliate&utm_campaign=73820&clickid=6606e3fa660c680001949a36&pid=12&offer_id=2&attribution_window=1D&return_cancellation_window=45D&gad_source=1");
//		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
//		element.click();
//		element.sendKeys("shoes");
//		driver.findElement(By.xpath("//*[@class='ic-search']")).click();
		driver.get("https://www.flipkart.com/");
		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
		element.click();
		element.sendKeys("Samsung phone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
