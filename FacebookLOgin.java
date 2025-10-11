package week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLOgin {
	
public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("testleaf.2023@gamil.com");
	driver.findElement(By.id("pass")).sendKeys("Tuna@321");
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.linkText("Find your account and log in.")).click();
	
	
	String title = driver.getTitle();
	
System.out.println(title);
driver.close();
}
}
