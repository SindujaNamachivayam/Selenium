import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System. getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/dropdowns");
		WebElement select = driver.findElement(By.id("fruits"));
		Select s=new Select (select);
		s.selectByIndex(1);
		Thread.sleep(5000);                                     
		s.selectByValue("2");
		Thread.sleep(5000);
		s.selectByVisibleText("Banana");
		
		
	}

}
