package Project;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDynamic {
	static List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		WebElement kids = driver.findElement(By.linkText("Women"));
		Actions s = new Actions(driver);
		s.moveToElement(kids);
		driver.findElement(By.linkText("Dresses")).click();
		List<WebElement> price = driver.findElements(
				By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
		for (WebElement pricelist : price) {
			String text = pricelist.getText();
			String replaceAll = text.replaceAll("Rs. ", "");
			int int1 = Integer.parseInt(replaceAll);
			list.add(int1); 
			System.out.println(text);
		}
		System.out.println("Overall Price List: " + list); 
		driver.findElement(By.xpath("(//div[@class='common-radioIndicator'])[3]")).click();
	}
}
