import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		
		//Get Window Handles
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentHandle = it.next();
		String childHandle = it.next();
		
		//Switch to ChildTab
		driver.switchTo().window(childHandle);
		
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		
		//Switch to ParentTab
		driver.switchTo().window(parentHandle);
		
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
				
	}

}
