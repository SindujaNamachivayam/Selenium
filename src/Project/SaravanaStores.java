package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SaravanaStores {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saravanastores.in/home/7707-holy-cross-gold-pendant.html");
		WebElement element = driver.findElement(By.id("quantity_wanted"));
		element.clear();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = '5';", element);
		driver.findElement(By.id("contact_products")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("first_name")).sendKeys("sinduja");
		driver.findElement(By.id("last_name")).sendKeys("sinduja");
		driver.findElement(By.id("email")).sendKeys("aaaaa@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("99999999");
		WebElement element2 = driver.findElement(By.id("quick-request"));
		Select s= new Select(element2);
		s.selectByVisibleText("Plea se call me back");
		driver.findElement(By.id("comment")).sendKeys("good product");
		driver.findElement(By.id("Gcaptcha")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("submit_cont")).click();
		driver.close();
		
		
		
		
	}

}
