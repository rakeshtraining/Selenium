package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void fail() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.edureka.co");
		driver.manage().window();
		String x = driver.getTitle();
		System.out.print(x);
		Assert.assertEquals(x, "Instructor led training" );
	  
  }
  
  @Test
  public void pass() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.edureka.co");
		driver.manage().window();
		String x = driver.getTitle();
		System.out.print(x);
		Assert.assertEquals(x, x);
	  
  }
  
}
