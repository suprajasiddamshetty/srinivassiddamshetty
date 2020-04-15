package Tablepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UserRole {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("orange hrm",Keys.ENTER);
		driver.findElement(By.xpath("//h3[text()='OrangeHRM']")).click();
		driver.findElement(By.id("txtUsername")).sendKeys("admin",Keys.TAB,"admin123",Keys.TAB,Keys.ENTER);
		WebElement e1=driver.findElement(By.xpath("//b[text()='Admin']"));
		Actions a=new Actions(driver);
		a.moveToElement(e1).build().perform();
		
		Thread.sleep(1000);
        int elements = driver.findElements(By.xpath("//a[@id='menu_admin_viewAdminModule']/following-sibling::ul/li")).size();
		for(int i=1;i<=elements;i++)
		{
			WebElement e2=driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/following-sibling::*/child::li["+i+"]/a"));
			a.moveToElement(e2).build().perform();
			
			Thread.sleep(1000);
		}
		
		
		
		a.moveToElement(e1).build().perform();
		
		WebElement e3=driver.findElement(By.id("menu_admin_UserManagement"));
		a.moveToElement(e3).build().perform();
		driver.findElement(By.linkText("Users")).click();
		int count=driver.findElements(By.xpath("//table/descendant::th")).size();
		
		for(int i=2;i<=count;i++)
		{
		
		driver.findElement(By.xpath("//thead/descendant::th["+i+"]")).click();
		Thread.sleep(5000);
		
		}
	}
}
	/*	WebElement e2=driver.findElement(By.id("menu_admin_UserManagement"));
	a.moveToElement(e2).build().perform();
	driver.findElement(By.linkText("Users")).click();
	WebElement e3=driver.findElement(By.id("searchSystemUser_userType"));
	Select s=new Select(e3);
	int x=s.getOptions().size();
	System.out.println(x);
	for(int i=x-1;i>=0;i--)
	{
	s.selectByIndex(i);
	Thread.sleep(3000);
	}

	}

}
*/