import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Nested Frames")).click();
		
		driver.switchTo().frame("frame-top");
		
		driver.switchTo().frame("frame-middle");
		
		System.out.println(driver.findElement(By.id("content")).getText());

		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-right");
		
		System.out.println(driver.findElement(By.tagName("body")).getText());
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-left");
		
		System.out.println(driver.findElement(By.tagName("body")).getText());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame-bottom");
		
		System.out.println(driver.findElement(By.tagName("body")).getText());


	}

}
