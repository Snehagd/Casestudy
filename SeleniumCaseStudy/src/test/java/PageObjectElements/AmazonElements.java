package PageObjectElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonElements {

    @FindBy(xpath="//h3[text()='Amazon Registration']")
    public static WebElement page;
    
    
	@FindBy(id="ap_customer_name")
	public static WebElement customer_name;
	
	@FindBy(id="ap_email")
	public static WebElement email;

	@FindBy(id="ap_password")
	public static WebElement password;
	
	@FindBy(id="ap_password_check")
	public static WebElement password_check;
	
	@FindBy(id="continue")
	public static WebElement Continue;
	
//Login page elements
	
	@FindBy(id="ap_email")
	public static WebElement email1;
	
	@FindBy(id="continue")
	public static WebElement Continue1;
	
	@FindBy(id="ap_password")
	public static WebElement password1;
	
	@FindBy(id="signInSubmit")
	public static WebElement Submit;
	
	@FindBy(id="twotabsearchtextbox")
	public static WebElement search;
	
	@FindBy(id="nav-search-submit-button")
	public static WebElement searchsubmit;
	
	@FindBy(linkText="Apple iPhone 11 Pro, 256GB, Midnight Green - Fully Unlocked (Renewed Premium)")
	public static WebElement item;
	
	@FindBy(id="add-to-cart-button")
	public static WebElement addtocart;
	
	@FindBy(linkText="Go to Cart")
	public static WebElement okcart;
	
	/*
	 * 	driver.findElement(By.id("ap_email")).sendKeys("xyzab7065@gmail.com");
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("ap_password")).sendKeys("xyz@1234");
			driver.findElement(By.id("signInSubmit")).click();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone x");
			driver.findElement(By.id("nav-search-submit-button")).click();
			driver.findElement(By.linkText("Apple iPhone 11 Pro, 256GB, Midnight Green - Fully Unlocked (Renewed Premium)")).click();
			driver.findElement(By.id("add-to-cart-button")).click();
			driver.findElement(By.linkText("Go to Cart")).click();
	 
	 
	 
	 
	 
	 */ 
	 
	
	
}
