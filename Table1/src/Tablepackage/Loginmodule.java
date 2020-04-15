package Tablepackage;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.xml.internal.txw2.Document;

public class Loginmodule {

	public static JavascriptExecutor js;
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	js=(JavascriptExecutor)driver;
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("orange hrm login",Keys.ENTER);
	driver.findElement(By.xpath("//h3[text()='OrangeHRM']")).click();
	driver.findElement(By.id("txtUsername")).sendKeys("admin",Keys.TAB,"admin123",Keys.TAB,Keys.ENTER);
	WebElement e1=driver.findElement(By.xpath("//b[text()='Admin']"));
	Actions a=new Actions(driver);
	a.moveToElement(e1).build().perform();
	WebElement e2=driver.findElement(By.id("menu_admin_UserManagement"));
a.moveToElement(e2).build().perform();
driver.findElement(By.linkText("Users")).click();
int x=driver.findElements(By.xpath("html//table//tbody//tr")).size();
int y=driver.findElements(By.xpath("html//table//thead//th")).size();
System.out.println(x);
int count=0;

//driver.findElement(By.xpath("//thead//a[text()='Username']/ancestor::table//tbody//a[text()='Admin']")).click();
//int columns=driver.findElements(By.xpath("//thead//a[text()='Username']/ancestor::table//tbody//td[3]")).size();
for(int i=1;i<=x;i++)
{
	String data=driver.findElement(By.xpath("//thead//a[text()='Username']/ancestor::table//tbody//tr["+i+"]//td[3]")).getText();
	System.out.println(data);
	if(data.equals("ESS"))
	{
		count=count+1;
	}
}

System.out.println(count);
//thead//a[text()='Employee Name']/ancestor::table//tbody//td[text()='Admin']
//int y=driver.findElements(By.xpath("html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr/th")).size();

//for(int i=1;i<=y;i++)
	
//driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr[1]/td[1]")).click();
//System.out.println("---");
System.out.println(y);
//System.out.println(columns);


//thead//a[contains(text(),'Employee Name')]/following-sibling::tbody

//String aa=driver.findElement(By.xpath("//thead//a[text()='Status']/ancestor::table//tbody//tr[11]//td[text()='Enabled']")).getText();
//System.out.println(aa);
//
//for(int i=1;i<=x;i++)
//{
//	if(aa.equals("Enabled"));
//	{
//		
//		String xx=driver.findElement(By.xpath("//thead//a[text()='User Role']/ancestor::table//tbody//tr["+i+"]//td[3]")).getText();
//		System.out.println(xx);

//		}
     
//	}
	
//int Enb_users = driver.findElements(By.xpath("(//td[contains(text(),'Enabled')]/preceding-sibling::td[3])")).size();
//System.out.println(Enb_users);
//
//for(int i=1;i<=Enb_users;i++) {
//	
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("(//td[contains(text(),'Enabled')]/preceding-sibling::td[3])["+i+"]"));
//	
//	System.out.println(driver.findElement(By.xpath("(//td[contains(text(),'Enabled')]/preceding-sibling::td[3])["+i+"]")).getText());
//	js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("(//td[contains(text(),'Enabled')]/preceding-sibling::td[3])["+i+"]")));
//	Thread.sleep(1000);
//	
//}

ArrayList<String> array = new ArrayList<String>();
int stringdata=driver.findElements(By.xpath("//thead//a[text()='Employee Name']/ancestor::table/tbody//td[4]")).size();
for(int i=1;i<=stringdata;i++)
{
	
	String s= driver.findElement(By.xpath("(//thead//a[text()='Employee Name']/ancestor::table/tbody//td[4])["+i+"]")).getText();
	
	array.add(s);
	
	
}
System.out.println(array);
}






	}


