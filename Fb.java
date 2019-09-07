package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.manage().window();
		driver.findElement(By.id("email")).sendKeys("edureka@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("edureka123");
		driver.findElement(By.id("loginbutton")).click();
		

		

	}

}
