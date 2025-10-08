package week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomeWork {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("guest");
		
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		
		
   driver.findElement(By.partialLinkText("CRM/SFA")).click();
   
   driver.findElement(By.partialLinkText("Accounts")).click();
   
   driver.findElement(By.partialLinkText("Create Account")).click();
   
driver.findElement(By.name("description")).sendKeys("Selenium ");		
Thread.sleep(3000);
driver.findElement(By.name("numberEmployees")).sendKeys("0909");	
Thread.sleep(3000);
driver.findElement(By.name("officeSiteName")).sendKeys("leaf");
Thread.sleep(3000);
driver.findElement(By.id("accountName")).sendKeys("harshni");
Thread.sleep(3000);
driver.findElement(By.className("smallSubmit")).click();

String title = driver.getTitle();
		System.out.println(title);
		
	
		
		
	}

}
