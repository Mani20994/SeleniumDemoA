package com.seledemo.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SelDemoA {
@Test
public void start() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	

		driver.manage().window().maximize();
		driver.get("http://awful-valentine.com/store/cart/");
		
		//MouseHover functions (Code)
	   Actions action=new Actions(driver);
	   action.moveToElement(driver.findElement(By.xpath(".//*[@id='secondary-menu']/li[2]/a"))).build().perform();
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	   driver.findElement(By.xpath(".//*[@id='secondary-menu']/li[2]/ul/li[1]/a")).click();
      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  
      //Mouse Hover function (Purchase forms)
      Actions action1=new Actions(driver);
	   action1.moveToElement(driver.findElement(By.xpath(".//*[@id='secondary-menu']/li[4]/a"))).build().perform();
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	   driver.findElement(By.xpath(".//*[@id='secondary-menu']/li[4]/ul/li[2]/a")).click();
      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      
      //Mouse Hover function(Store)
      Actions action11=new Actions(driver);
	   action11.moveToElement(driver.findElement(By.xpath(".//*[@id='secondary-menu']/li[5]/a"))).build().perform();
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	   driver.findElement(By.xpath(".//*[@id='secondary-menu']/li[5]/ul/li[1]/a")).click();
      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      
      //Continue shopping
	    driver.findElement(By.xpath("//*[@class='Cart66ButtonSecondary']")).click();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	      
	    // Checkout
	    Actions action111=new Actions(driver);
		   action111.moveToElement(driver.findElement(By.xpath(".//*[@id='secondary-menu']/li[5]/a"))).build().perform();
		   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	      driver.findElement(By.xpath(".//*[@id='secondary-menu']/li[5]/ul/li[2]/a")).click();
	      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	      driver.close();
	     }
}
					


