package Functionalities;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.PageFactory;


import PageObjectElements.AmazonElements;

public class Registration_page {
	
	public static void main(String[] args) throws AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/search?q=amazon+registration&ei=dNLKYdfSNonZz7sPv6eduAU&oq=amazon+re&gs_lcp=Cgdnd3Mtd2l6EAMYADIFCAAQkQIyBQgAEJECMggIABCxAxCRAjIICAAQsQMQkQIyBQgAEJECMggIABCABBCxAzIICAAQgAQQsQMyCAgAEIAEELEDMgUIABCABDIFCAAQgAQ6BwgAEEcQsAM6BwgAELADEEM6EAguEMcBENEDEMgDELADEEM6CgguEMgDELADEEM6BwgAELEDEEM6CAgAEIAEEMkDOgUIABCSAzoLCAAQgAQQsQMQgwE6CAguEIAEELEDSgQIQRgASgQIRhgAUIMDWMkIYLsPaAFwAngAgAGdA4gBrAWSAQcwLjIuNC0xmAEAoAEByAELwAEB&sclient=gws-wiz");
		driver.manage().window().maximize();
	
		PageFactory.initElements(driver, AmazonElements.class);
		
		AmazonElements.page.click();
		AmazonElements.customer_name.sendKeys("xyz Ab");
		AmazonElements.email.sendKeys("xyzab7065@gmail.com");
		AmazonElements.password.sendKeys("xyz@1234");
		AmazonElements.password_check.sendKeys("xyz@1234");
		AmazonElements.Continue.click();
		
		 Robot robot1=new Robot();
		 Dimension sc_size=Toolkit.getDefaultToolkit().getScreenSize();
		 Rectangle rect=new Rectangle(sc_size);
		 BufferedImage Source=robot1.createScreenCapture(rect);
		 File destination=new File("C:\\Users\\User\\Desktop\\Screenshot\\screen3.jpg");
		 ImageIO.write(Source, "png", destination);
		 
	}

}		
		/*driver.findElement(By.xpath("//h3[text()='Amazon Registration']")).click();
		
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("xyz Ab");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("xyzab7065@gmail.com");// xyz123ab@gmail.com//xyzab@sharklasers.com
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("xyz@1234");
		driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("xyz@1234");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		*/
		
	
