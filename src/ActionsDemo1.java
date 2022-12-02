import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsDemo1 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");
		
		Actions act = new Actions(driver);
		
		//Hover Mouse to Search, Click, ShiftDown(capital), Type hello, ShiftUp, Type kitty, Enter
		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.LEFT_SHIFT).sendKeys("hello").keyUp(Keys.LEFT_SHIFT).sendKeys(" kitty").sendKeys(Keys.ENTER).build().perform();

		//Hover mouse to WebElement
		act.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		
	}

}
