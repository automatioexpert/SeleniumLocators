package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ancestor5 {

	@Test
	public void ancestorTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oreilly.com/online-learning/try-now.html");
		driver.findElement(By.xpath("//li[@class='menuList-itemsP2']/ancestor::ul/li//a[@id='nav-signIn']")).click();
		// form[@class='Form--n0OwA']/child::div/child::label/input

		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Sign In')]")).getText());
		driver.findElement(By.xpath("//div[@class='orm-Input-root']/descendant::label/input"))
				.sendKeys("User49475954775@gs.com");

		driver.findElement(By.partialLinkText("free trial")).click();
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'10 days free')]")).getText());

		// Get the no elements matching
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='orm-Input-root']/descendant::input"));
		for (WebElement element : elements) {
			element.sendKeys("User373747347");
			System.out.println(element.getAttribute("value"));
		System.out.println("Text Box values");
		}

		Thread.sleep(3000);
		driver.quit();
	}

}
