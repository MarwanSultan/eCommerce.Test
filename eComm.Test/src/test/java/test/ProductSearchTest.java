package test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.AmazonHomePage;
import util.BaseTest;

public class ProductSearchTest extends BaseTest {

	AmazonHomePage Amazon;

	
	
	@DataProvider(name = "Items")
	public static Object[] productSearch() {

		return new Object[][] { { "Samsung TV" }, { "Holographic monitor" }, { "Dell Docking Station" },
				{ "Advanced Monitors" } };
	}

	@Test(dataProvider = "Items")
	public void productItemSearch(String var) throws Throwable {
		AmazonHomePage Amazon = new AmazonHomePage(driver);
		assertTrue(Amazon.footerDisplayed());
		
		Amazon.productSearch(var);
		
		WebElement textbox = driver.findElement(By.id("idofElement"));
		textbox.sendKeys(Keys.ENTER);
		
		BrowserWait();

	}

}
