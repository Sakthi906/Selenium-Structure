package org.shop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopClues {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement product = driver.findElement(By.id("//div[@id='det_img_136389200']"));
		product.click();
	}

}
