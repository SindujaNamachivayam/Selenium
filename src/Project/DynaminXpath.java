package Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynaminXpath {
	static WebDriver driver;
	static List<Integer> listtext = new ArrayList<Integer>();
	static int min;
private static void identifier() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/men-sports-shoes");
			}
private static void dynamicPath() throws InterruptedException {
				List<WebElement> amount = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
		for (WebElement list : amount) {
		String text = list.getText();
		String replaceAll = text.replaceAll("Rs. ", "");
		int int1 = Integer.parseInt(replaceAll);
		listtext.add(int1);
	}
System.out.println(listtext);
}
private static void getminimumproduct() {
	
	min = Collections.min(listtext);
	System.out.println("Minimum Price & Product details: "+min);
	driver.findElement(By.xpath("//li[@class='product-base']//following::*[text()='']"));
	

}
	public static void main(String[] args) throws InterruptedException {
		identifier();
		dynamicPath();
		getminimumproduct();
		
		
		

	}

}
