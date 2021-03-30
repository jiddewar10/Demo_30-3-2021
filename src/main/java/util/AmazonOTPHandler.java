package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonOTPHandler {

	public static final String Account_SID="AC45722214ce846a97701bf014b1a58982";
	public static final String AUTH_TOKEN="dd27b0fd0db4f9a52ee652083dd2d56c";
	public static  WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	 System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\eclipse-workspace\\E2EProject\\src\\main\\java\\resources\\chromedriver.exe");
   	 driver= new ChromeDriver();
   	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
   	 
   	 driver.get("https://www.amazon.in/");
   	 System.out.println("1");
   	WebElement e=driver.findElement(By.id("nav-link-accountList"));
   	 Actions a=new Actions(driver);
   	 a.moveToElement(e);
   	 System.out.println("2");
     driver.findElement(By.linkText("Start here.")).click();
     System.out.println("3");
     driver.findElement(By.name("customerName")).sendKeys("Test1");
     System.out.println("4");
     driver.findElement(By.cssSelector("input#ap_phone_number")).clear();
     driver.findElement(By.cssSelector("input#ap_phone_number")).sendKeys("9802555710");
     System.out.println("5");
     WebElement ele=driver.findElement(By.id("auth-country-picker"));
     ele.click();
     System.out.println("6");
     Select s=new Select(ele);
     s.selectByVisibleText("United States +1");
     System.out.println("7");
     driver.findElement(By.cssSelector("input#ap_password")).sendKeys("Deepaks@10");
     driver.findElement(By.cssSelector("input#continue")).click();
     driver.close();
   	 
     
   //  Twilio.init(Account_SID, AUTH_TOKEN);

	}
	

}
