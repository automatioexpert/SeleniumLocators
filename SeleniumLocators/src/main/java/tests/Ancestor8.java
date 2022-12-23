package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ancestor8 {

	@Test
	public void ancestorTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.oreilly.com/online-learning/try-now.html");
		
		List<WebElement> elements=driver.findElements(By.xpath("//h2[@class='footer-header']/following-sibling::ul/li"));
		for(WebElement ele:elements) {
			System.out.println(ele.getText());	
		}
		
		driver.quit();
	
	}

}
