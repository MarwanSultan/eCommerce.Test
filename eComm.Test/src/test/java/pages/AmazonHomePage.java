package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import util.PageObject;

public class AmazonHomePage extends PageObject {


	@FindBy(how = How.ID, using = "twotabsearchtextbox")
	WebElement searchbox;

	@FindBy(how = How.ID, using = "navFooter")
	WebElement footer;

	@FindBy(how = How.ID, using = "searchDropdownBox")
	WebElement itemLocationDropDown;

	/////////////////////////
	public AmazonHomePage(WebDriver driver) {

		super(driver);
		/////////////////////////
	}

//-----------------------------------------------

	public void productSearch(String var) throws Throwable {

		this.searchbox.sendKeys(var);
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 30);
		 * 
		 * WebElement element =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("navFooter")))
		 * ;
		 * 
		 * boolean status=element.isDisplayed();
		 * 
		 * 
		 * 
		 * if(status) { System.out.println("Element is Displayed"); }
		 * 
		 * else
		 * 
		 * {
		 * 
		 * System.out.println("element is not Displayed"); }
		 * 
		 * searchbox.sendKeys(Keys.ENTER); Thread.sleep(3000);
		 * 
		 */

	}
	

	
	

	public void SelectItemLocationDropDown() throws Throwable {
		itemLocationDropDown.click();
		Select item = new Select(itemLocationDropDown);
		item.selectByIndex(2);
		itemLocationDropDown.sendKeys(Keys.ENTER);

	}

	
	
	public boolean footerDisplayed() {
		
		return footer.isDisplayed();
		
		
	}
	
	public WebDriver getDriver() {

		return driver;
	}

	
	

}
