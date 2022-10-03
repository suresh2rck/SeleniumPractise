package SeleniumMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resource\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.navigate().to("file:///C:/Users/pc2/Desktop/sample.html");

		WebElement multiDropDown = driver.findElement(By.xpath("//select[@id='language']"));

		Select sel = new Select(multiDropDown);
		
		sel.selectByVisibleText("JavaScript");
		Thread.sleep(2000);
		sel.selectByIndex(5);
		Thread.sleep(2000);
		sel.selectByValue("ASP");

		
		WebElement firstSelectedOption = sel.getFirstSelectedOption();
		
		String text2 = firstSelectedOption.getText();
		
		System.out.println("first selected dropdown");
		
		System.out.println(text2);
		System.out.println("==========================");
		
		
		List<WebElement> allSelectedOptions = sel.getAllSelectedOptions();

		for (WebElement webElement : allSelectedOptions) {

			String text = webElement.getText();
			System.out.println(text);
		}
/*
		Thread.sleep(3000);
		sel.deselectByValue("ASP");
		Thread.sleep(3000);
		sel.deselectByIndex(5);
		Thread.sleep(3000);
		sel.deselectByVisibleText("JavaScript"); */
		
		sel.deselectAll();
		
		System.out.println("==========================");
		List<WebElement> options = sel.getOptions();
		
		
		
		for (WebElement webElement : options) {
			
			String text = webElement.getText();
			
			System.out.println(text);
			
			
		}
	}

}
