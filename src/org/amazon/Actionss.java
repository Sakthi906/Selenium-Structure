package org.amazon;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		TakesScreenshot tk= (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		
		File f=new File("C:\\Users\\wellcome\\eclipse-workspace\\Selenium\\ScreenShot\\Flipkart.png");
		FileUtils
		
//		WebElement fashion = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
//    	Actions a=new Actions(driver);
//		a.moveToElement(fashion).perform();
//		
//		WebElement living = driver.findElement(By.xpath("//a[text()='Living Room Furniture']"));
//		a.moveToElement(living).perform();
//		
//		WebElement sofas = driver.findElement(By.xpath("//a[text()='Sofas Sets & Sectionals']"));
//		a.click(sofas).perform();
	
//		driver.get("https://demo.guru99.com/test/drag_drop.html");
//		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
//        WebElement des = driver.findElement(By.id("bank"));
//		a.dragAndDrop(src, des).perform();
//		
//		WebElement src1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
//		WebElement des1 = driver.findElement(By.id("amt7"));
//		a.dragAndDrop(src1, des1).perform();
//		
//		WebElement src2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
//		WebElement des2 = driver.findElement(By.id("loan"));
//		a.dragAndDrop(src2, des2).perform();
//		
//		WebElement src3 = driver.findElement(By.xpath("//a[text()=' 5000']"));
//		WebElement des3 = driver.findElement(By.id("amt8"));
//		a.dragAndDrop(src3, des3).perform();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
