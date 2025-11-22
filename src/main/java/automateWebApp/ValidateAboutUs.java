package automateWebApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ValidateAboutUs {
	
	@Test
	public void test1() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.yessinfotech.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@type='button']) [5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("About Us")).click();
	 String	title = driver.getTitle();
	 if(title.equals("About Us | yes")) {
		 System.out.println("passed");
		 
	 }else
		 {
		 System.out.println("failed");
	 }
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
