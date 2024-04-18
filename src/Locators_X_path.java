import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_X_path {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver xpath = new ChromeDriver();
		xpath.manage().window().maximize();
		xpath.navigate().to("https://www.myntra.com/");
		WebElement search = xpath.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		search.sendKeys("laptop");
		search.sendKeys(Keys.ENTER);
		xpath.findElement(By.xpath("//label[@class='common-customRadio gender-label']")).click();		//click the men button  
		WebElement menbags = xpath.findElement(By.xpath("//h3[@class='product-brand']"));
		System.out.println(menbags.getText());
		WebElement price = xpath.findElement(By.xpath("//span[@class='product-discountedPrice'][1]"));
		System.out.println("price list: " +price.getText());
		WebElement name = xpath.findElement(By.xpath("//h4[text()='Men Formal Laptop Bag']"));
		System.out.println(name.getText());
		name.click();
		List<WebElement> swissbag = xpath.findElements(By.xpath("//h3[text()='Gear']"));
		for(WebElement bag:swissbag) {
		System.out.println(bag.getText());
		System.out.println(bag.getTagName());

	}

}
}
