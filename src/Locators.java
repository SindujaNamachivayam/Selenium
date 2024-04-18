import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.get("https://www.google.com/");
		web.navigate().to("https://www.makemytrip.com/");
		WebElement element = web.findElement(By.id("fromCity"));
		element.sendKeys("Chennai, India");
		WebElement element2 = web.findElement(By.id("toCity"));
		element2.sendKeys("Delhi,India");
		element2.click();
		
		
		 
		
	}

}
