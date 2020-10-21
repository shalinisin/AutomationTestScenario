package com.automationpractice;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestScenario {

	@Test
	public void shoppingValidation() {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserEXE\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");

		// STEP No 1
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email")).sendKeys("******");
		driver.findElement(By.id("passwd")).sendKeys("******");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']/span/i")).click();

		// STEP NO 2
		driver.findElement(By.xpath("//span[contains(text(),'My addresses')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Add a new address')]")).click();
		
		//STEP NO 3
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("firstname")).sendKeys("firstname");
		driver.findElement(By.id("lastname")).clear();
		driver.findElement(By.id("lastname")).sendKeys("last name");
		driver.findElement(By.id("company")).sendKeys("company");
		driver.findElement(By.id("address1")).sendKeys("address1");
		driver.findElement(By.id("address2")).sendKeys("address2");
		driver.findElement(By.id("city")).sendKeys("city");
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText("Arizona");
		driver.findElement(By.id("postcode")).sendKeys("12345");
		Select country = new Select(driver.findElement(By.id("id_country")));
		country.selectByVisibleText("United States");
		driver.findElement(By.id("phone")).sendKeys("7876787665");
		driver.findElement(By.id("phone_mobile")).sendKeys("4567890988");
		driver.findElement(By.id("other")).sendKeys("other");
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys("alias");
		
		//STEP NO 4
		driver.findElement(By.xpath("//button[@id='submitAddress']//span")).click();

		// STEP NO 5
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Women')]"))).build().perform();
		driver.findElement(By.xpath("//li//a[contains(text(),'Summer Dresses')]")).click();
		
		//STEP NO 6
		driver.findElement(By.xpath("//li[@id='list']//a//i")).click(); // list view

		//STEP NO 7
		driver.findElement(By.xpath("(//h5//a)[1]")).click();
		
		//STEP NO 8
		driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//a[2]//span//i")).click();
		driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//a[2]//span//i")).click();
		driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//a[2]//span//i")).click();
		driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//a[2]//span//i")).click();
		
		//STEP NO 9
		Select size = new Select(driver.findElement(By.id("group_1")));
		size.selectByValue("3");
		
		//STEP NO 10
		driver.findElement(By.id("color_11")).click();
		
		//STEP NO 11
		driver.findElement(By.xpath("//p[@id='add_to_cart']//button//span")).click();
		
		//STEP NO 12
		driver.findElement(By.xpath("//div[@class='button-container']//span//span//i")).click();

		// STEP NO 13
		driver.findElement(By.xpath("//div[@class='shopping_cart']//b")).click();
		driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id='center_column']/form/p/button/span")).click();
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.xpath("//*[@id='form']/p/button/span")).click();
		driver.findElement(By.xpath("//p[@class='payment_module']//a[contains(text(),'Pay by bank wire')]")).click();
		driver.findElement(By.xpath("//*[@id='cart_navigation']/button/span")).click();
		
		/*// Second dress selection
		driver.findElement(By.xpath("(//a[contains(text(),'Summer Dresses')])[3]")).click();
		driver.findElement(By.xpath("(//h5//a)[3]")).click();
		driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//a[2]//span//i")).click();
		driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//a[2]//span//i")).click();
		driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//a[2]//span//i")).click();
		driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//a[2]//span//i")).click();

		Select size1 = new Select(driver.findElement(By.id("group_1")));
		size1.selectByValue("3");

		driver.findElement(By.id("color_8")).click();
		driver.findElement(By.xpath("//p[@id='add_to_cart']//button//span")).click();

		driver.findElement(By.xpath("//div[@class='button-container']//span//span//i")).click();*/


		// STEP NO 14
		driver.findElement(By.xpath("//div[@class='header_user_info']//a//span")).click();
		driver.findElement(By.xpath("//*[@id='center_column']/div/div[1]/ul/li[1]/a/span")).click();

		// STEP No 15

		/*
		 * File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(file, new File("D:\\Workspace\\screenshot\\order.jpg"));
		 */

		// STEP NO 16
		driver.findElement(By.xpath("//div[@class='header_user_info']//a[contains(text(),'Sign out')]")).click();

	}

}
