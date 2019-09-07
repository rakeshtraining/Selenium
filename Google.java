package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Thread.sleep(5000);
		//driver.findElement(By.linkText("Images")).click();
		driver.findElement(By.xpath("//a[@href='https://www.google.co.in/imghp?hl=en&tab=wi&ogbl']")).click();
		driver.navigate().back();
		//Thread.sleep(5000);
		driver.navigate().forward();
		
		

	}

}
