package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleProg {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Mythili\\eclipse-workspace\\GaneshGod\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	WebElement search = driver.findElement(By.xpath("(//input[@type='text'])"));
	//search.click();
	search.sendKeys("iphone");
	WebElement searchbtn = driver.findElement(By.xpath("(//input[@type='submit'])"));
	searchbtn.click();
	WebElement selecttitle = driver.findElement(By.xpath("//a[@class='a-link-normal a-text-normal']//child::span[contains(text(),'TracFone')]"));
	Thread.sleep(3000);
	selecttitle.click();
	String printtitle = driver.findElement(By.xpath("//span[contains(text(),'TracFone i')]//parent::h1")).getText();
	System.out.println(printtitle);
	String printprice = driver.findElement(By.xpath("//span[@id='price_inside_buybox']//parent::div")).getText();
	System.out.println(printprice);
	String deleviery = driver.findElement(By.xpath("//div[@class='a-spacing-base']//child::b")).getText();
	System.out.println(deleviery);
	}
	public void sample1() {
		

	}
	}

