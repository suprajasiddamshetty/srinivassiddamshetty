package Tablepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/ss185743/Desktop/seleniumhtml.html");
        int y=driver.findElements(By.xpath("html/body/table/tbody/tr")).size();
        System.out.println(y);
        int x=driver.findElements(By.xpath("html/body/table/tbody/tr/th")).size();
        System.out.println(x);
        
        for(int i=2;i<=y;i++)
        {
        	for(int j=1;j<=x;j++)
        	{
        		String z=driver.findElement(By.xpath("html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
        		System.out.print(z+" ");
        	}
        	System.out.println(" ");
        }
        driver.close();
	}

}
