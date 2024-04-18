import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown  {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	WebElement colors = driver.findElement(By.id("colors"));
	Select s=new Select(colors);
	boolean multiple = s.isMultiple();
	System.out.println("It's a Dropbox: " +multiple);
	s.selectByIndex(0);
	s.selectByValue("blue");
	Thread.sleep(1500);
	s.selectByVisibleText("White");
	Thread.sleep(1500);
	List<WebElement> options = s.getOptions();
	for (WebElement list:options) {
		System.out.println("list: " +list.getText());
	}
	List<WebElement> selectall = s.getAllSelectedOptions();
	for (WebElement allselect :selectall) {
		System.out.println("Selectall: " +allselect.getText());
	}
	s.getFirstSelectedOption();
	s.deselectByIndex(0);
	s.deselectByValue("blue");
	s.deselectByVisibleText("White");
	s.deselectAll();
	}
	

}
