import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement simple = driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']"));
		simple.click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		WebElement confirm = driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']"));
		confirm.click();
		Thread.sleep(1500);
		String text2 = driver.switchTo().alert().getText();
		System.out.println(text2);
		driver.switchTo().alert().dismiss();
		WebElement prompt = driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']"));
		prompt.click();
		driver.switchTo().alert().sendKeys("");
		Thread.sleep(1500);
		driver.switchTo().alert().sendKeys("TomJerry");
		Thread.sleep(1500);
		driver.switchTo().alert().accept();
				
		
	}

}
