package org_m2i_dolibarr;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

 public class TestDolibarr {
	 
	 ChromeDriver driver;
	 
	 @Before
	 public void setup() {
		 
		    driver= new ChromeDriver();
		    driver.get("http://demo.testlogiciel.pro/dolibarr/index.php");
			driver.findElement(By.id("username")).sendKeys("jsmith");
			driver.findElement(By.id("password")).sendKeys("hp");
			driver.findElementByClassName("button").click();
	 }
	 
	 @After
	 public void teardown() {
		 driver.findElementByXPath(("//img[@alt='Déconnexion']")).click();
		 driver.close();
	 }

	
	/*	public void testConnexion() {
		
	ChromeDriver driver= new ChromeDriver();
	
	driver.get("http://demo.testlogiciel.pro/dolibarr/index.php");
	driver.findElement(By.id("username")).sendKeys("jsmith");
	driver.findElement(By.id("password")).sendKeys("hp");
	driver.findElementByClassN//ame("button").click();
	
	Assert. assertEquals("Espace accueil", driver.findElement(By.className("titre")).getText());
	
	driver.findElementByCssSelector("img.login").click();
	driver.close();
	

}*/

		
		@Test
	public void testtiers() {
		
		
		driver.findElementByCssSelector("div.mainmenu.companies").click();
		driver.findElementByLinkText("Nouveau tiers").click();
		driver.findElement(By.name("nom")).sendKeys("AB");
		driver.findElement(By.name("firstname")).sendKeys("Abby");
		//new Select(driver.findElement(By.name("civilité_id"))).selectByVisibleText("Madame");
	    driver.findElement(By.xpath("//input[@value='Créer tiers']")).click();
	    
		
	}
	
	}
	

