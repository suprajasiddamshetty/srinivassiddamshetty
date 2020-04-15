package Tablepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OrangeDemoTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("orange hrm",Keys.ENTER);
		driver.findElement(By.xpath("//h3[contains(text(),'OrangeHRM: HR Management System | HR Management ...')]")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Free 30 Day Trial")));
		e.click();
		driver.manage().window().maximize();
		driver.findElement(By.name("FirstName")).sendKeys("supriya",Keys.TAB,"siddam",Keys.TAB,"suprajasiddamshetty456@gmail.com",Keys.TAB,"testing");
		WebElement e1=driver.findElement(By.name("NoOfEmployees"));
		Select s=new Select(e1);
		s.selectByValue("11 - 15");
		int x=s.getOptions().size();
		System.out.println(x);
	    if(s.isMultiple())
	    {
	    	System.out.println("multi select");
	    }
	    else
	    {
	    	System.out.println("single select");
	    }
	    driver.findElement(By.name("CompanyName")).sendKeys("nnn");
	    WebElement e2=driver.findElement(By.name("Industry"));
	    Select s1=new Select(e2);
	    s1.selectByValue("Other");
	    driver.findElement(By.name("Contact")).sendKeys("7780535762");
	    WebElement e3=driver.findElement(By.name("Country"));
	    Select s2=new Select(e3);
	    s2.selectByValue("India");
	    WebElement e4=driver.findElement(By.name("State"));
	    WebElement e5=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("State")));
	    Select s3=new Select(e4);
	 s3.selectByValue("Telangana");
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	// js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	  WebElement e6= driver.findElement(By.name("SetDummyData"));
	  //  js.executeScript("arguments[0].scrollIntoView();",e6);
	 js.executeScript("document.getElementsByName('SetDummyData')[0].scrollIntoView();");
	    e6.click();
	    Thread.sleep(1000);
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@role='presentation']")));
	    System.out.println("switch to frame");
	    Thread.sleep(1000);
	   WebElement e7= driver.findElement(By.className("recaptcha-checkbox-border"));
	   System.out.println("classname");
	   JavascriptExecutor js1=(JavascriptExecutor)driver;
	   js.executeScript("arguments[0].click();",e7);
	   driver.switchTo().defaultContent();
	   Thread.sleep(5000);
	   System.out.println("checkbox executed successfully");
	   Actions a=new Actions(driver);
	   WebElement e8=driver.findElement(By.xpath("//input[@type='submit']"));
	   a.click(e8).build().perform();
	   System.out.println("checkbox clciked successfully");
	 //  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@role='presentation']")));
	   
	   // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox recaptcha-checkbox-expired'] or div[@class='recaptcha-checkbox-border']")));
	    
//driver.findElement(By.xpath("//span[@class='recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox recaptcha-checkbox-expired'] or div[@class='recaptcha-checkbox-border']")).click();
	    
	    
		
		
		
		
	
				

	}
	
}
