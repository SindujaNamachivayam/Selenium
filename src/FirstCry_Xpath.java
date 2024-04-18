import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCry_Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver firstcry = new ChromeDriver();
		firstcry.get("https://www.firstcry.com/");
		firstcry.manage().window().maximize();
		WebElement search = firstcry.findElement(By.id("search_box"));
		search.click();
		search.sendKeys("baby cloth");
		WebElement srhclick = firstcry.findElement(By.xpath("//span[@class='search-button']"));
		srhclick.click();
		List<WebElement> product = firstcry.findElements(By.xpath("//a[@target='_blank']"));
		for(WebElement name: product) {
			System.out.println(name.getText());
		}
		                  
	}
}
