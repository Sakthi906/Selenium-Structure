package org.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonn {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		//WebElement amazonSearch = driver.findElement(By.xpath("//input[@type='text']"));
		//amazonSearch.sendKeys("iphone");
		//WebElement clickBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		//clickBtn.click();
		//driver.get("http://demo.automationtesting.in/Register.html\r\n" + 
				"");
//		WebElement firstNamee = driver.findElement(By.xpath("//input[@type='text']"));
//		firstNamee.click();
//		WebElement enterName = driver.findElement(By.xpath("//input[@type='text']"));
//		enterName.sendKeys("Sakthivel");
//		WebElement lastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		lastName.click();
//		WebElement lastNamee = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		lastNamee.sendKeys("Selvaraj");
//		WebElement adress = driver.findElement(By.xpath("//textarea[@rows='3']"));
//		adress.clear();
//		WebElement enterAdress = driver.findElement(By.xpath("//textarea[@rows='3']"));
//		enterAdress.sendKeys("Salem,Attur");
//		WebElement text = driver.findElement(By.xpath("//h1[text()='Automation Demo Site ']"));
//		String text2 = text.getText();
		//System.out.println(text2);
		driver.get(http://www.greenstechnologys.com/);
	    WebElement textt = driver.findElement(By.xpath("//div[contains@u,('Greens Technologys Software Training Centers in Chennai')]"));
		String greensText = textt.getText();
		System.out.println(greensText);
	}

}
