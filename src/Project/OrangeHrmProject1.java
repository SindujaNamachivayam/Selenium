package Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmProject1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//JavascriptExecutor js = (JavascriptExecutor) driver;		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//username
		String username = driver.findElement(By.xpath("//p[text()='Username : Admin']")).getText();
		String substring1 = username.substring(11, 16);
		//System.out.println(substring1);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(substring1);
		//password
		String password = driver. findElement(By.xpath("//p[text()='Password : admin123']")).getText();
		String substring2 = password.substring(11);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(substring2);
		//System.out.println(substring2);
		//submit
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//click to admin
		driver.findElement(By.linkText("Admin")).click();
		//click to add
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		//click to user role
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//click to status
		driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[2]")).click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//emp name
		String name = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).getText();
		WebElement element = driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]"));
		element.sendKeys(name);
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//username
		WebElement user = driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]"));
		user.sendKeys("TomJerry");
		//password
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("Tomjerry@123");
		//confirm password
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).sendKeys("Tomjerry@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("TomJerry");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
		driver.close();
		
		}
}
