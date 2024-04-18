package Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://catking.in/list-of-countries-capitals-currencies-of-the-world");
//		List<WebElement> table = driver.findElements(By.xpath("//table/tbody/tr/td"));
//		for (WebElement table1: table) {
//			System.out.println(table1.getText());
//			}
		WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]"));
		System.out.println(element.getText());
		driver.close();
	}

}
