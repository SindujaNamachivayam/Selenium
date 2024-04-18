import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver element = new ChromeDriver();
		element.get("https://www.google.com/");
		element.manage().window().maximize();
		element.navigate().to("https://www.flipkart.com/");
		org.openqa.selenium.WebElement element2 = element.findElement(By.name("q"));
		element2.sendKeys("headphones");
		element2.sendKeys(Keys.ENTER);
		element.navigate().refresh();
		org.openqa.selenium.WebElement login = element.findElement(By.linkText("Login"));
		login.click();
		boolean displayed = login.isDisplayed();
		System.out.println("keys display: " +displayed);
		boolean enabled = login.isEnabled();
		System.out.println("keys enabled: " +enabled);
		org.openqa.selenium.WebElement linktext = element.findElement(By.linkText("Aroma NB119 Titanium - 48 Hours Playtime Neckband Bluet..."));
		boolean selected = linktext.isSelected();
		System.out.println("key selected: " +selected);
		}

}
