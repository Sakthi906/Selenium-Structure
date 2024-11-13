package org.greens;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GreensTechnology {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement bio = driver.findElement(By.xpath("//p[contains(text(),'Velmurugan c')]"));
		String vel = bio.getText();
		System.out.println(vel);
		
		String attribute = bio.getAttribute("innerText");
		System.out.println(attribute);
	    
//		WebElement address = driver.findElement(By.xpath("(//h6[text()='Greens Technology '])[1]"));
//		String omr = address.getText();
//		System.out.println(omr);
//		
//		WebElement line1 = driver.findElement(By.xpath("No:11,"));
//		String linee = line1.getText();
//		System.out.println(linee);
		
//		WebElement python = driver.findElement(By.xpath("(//p[contains(text(),'Python')])[1]"));
//	    String create = python.getText();
//	    System.out.println(create);
	    
	    WebElement bioo = driver.findElement(By.xpath("//p[contains(text(),'He has')]"));
	    String murugan = bioo.getText();
	    System.out.println(murugan);
	    
	    String att = bioo.getAttribute("innerText");
	    System.out.println(att);
	}

}
