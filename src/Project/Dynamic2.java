package Project;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic2 {
	static WebDriver driver;
	static List<Integer> list1 = new ArrayList<Integer>();
	private static void findElement() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.click();
		search.sendKeys("samsung mobile",Keys.ENTER);
			}
	private static void rupeePath() {
		List<WebElement> phonelist = driver.findElements(By.xpath("//span[@class='a-price a-text-price']//preceding::span[@aria-hidden='true']"));
		for (WebElement list : phonelist) {
			String text = list.getText();
			int int1 = Integer.parseInt(text);
			list1.add(int1);
		}
System.out.println(list1);
	}

	public static void main(String[] args) {
		findElement();
		rupeePath();

	}

}
