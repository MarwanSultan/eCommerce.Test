package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public WebDriver driver;

	@BeforeMethod
	public void initialize() throws Throwable {

		driver = new FirefoxDriver();
		driver.get("https://www.Amazon.com");
		driver.manage().window().maximize();

		BrowserWait();
	}
//-------------------------------------------------------------------------------------------

	//////////////////////////////////////////////////////////////////////////////////////////

	@AfterMethod
	public void end() throws Throwable {

		BrowserWait();

		driver.close();

	}

	public void BrowserWait() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("navFooter")));

		boolean status = element.isDisplayed();

		if (status) {
			System.out.println("Element is Displayed");
		}

		else

		{
			System.out.println("element is not Displayed");
		}

		Thread.sleep(3000);

	}
}
