package automateWebApp;

import javax.annotation.processing.SupportedSourceVersion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class validateHomePage {
	
	
	@Test
	public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yessinfotech.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@type='button']) [5]")).click();
		Thread.sleep(3000);
	 String	title = driver.getTitle();
	 if(title.equals("Software training classes institute in Hadapsar Pune")) {
		 System.out.println("passed");
		 
	 }else
		 {
		 System.out.println("failed");
	 }
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
