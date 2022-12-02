import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");
		
		//Switch to Frame
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		
		Actions act = new Actions(driver);
		//act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		act.dragAndDropBy(driver.findElement(By.id("draggable")), 187, 4).build().perform();
		
		//Swith Back to Main
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Demos")).click();
		
		

	}

}
