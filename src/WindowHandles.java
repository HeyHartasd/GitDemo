import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandles {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		//Get Window Handles
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator(); //[parentTab],[childTab]
		String parentHandle = it.next();
		String childHandle = it.next();
		
		//Switch to New Tab
		driver.switchTo().window(childHandle);
		
		//Extracting text with Debug Mode
		String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at ")[1].split(" ")[0];
		
		//Switch to Main Tab
		driver.switchTo().window(parentHandle);
		
		driver.findElement(By.id("username")).sendKeys(email);
	}

}
