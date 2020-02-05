package com.step_defination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step_def {

	WebDriver driver;
	
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8083/TestMeApp");
		
	}
	
	@When("User navigates to Home Page")
	public void user_navigates_to_Login_Page() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.linkText("SignIn")).click();
	}
	
	@When("User enters {string} and {string}")
	public void user_enters_and (String username, String password) {
		
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
		
	}
	
//	@Then("Message displayed login successfully") 
//	public void message_displayed_login_successfully() {
//		
//		Assert.assertTrue(driver.findElement(By.linkText("SignOut")).isDisplayed());
//	}
//	
//	
//	
//	
//	
//	@Given("User clicks Category")
//	public void user_clicks_Category() {
//		
//		driver.findElement(By.name("userName")).sendKeys("admin");
//		driver.findElement(By.name("password")).sendKeys("password456");
//		driver.findElement(By.name("Login")).click();
//		
//		
//		driver.findElement(By.xpath("//h4[contains(.,'Add Category')]")).click();
//		
//	}
//	
//	@Given("User select {string} and {string}")
//	public void user_select_and(String cat, String subCat) {
//		
//		driver.findElement(By.name("catgName")).sendKeys(cat);
//		driver.findElement(By.name("catgDesc")).sendKeys("sports");
//		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
//		
//		driver.findElement(By.xpath("//h4[contains(.,'Add Sub Category')]")).click();
//		
//		Select var = new Select(driver.findElement(By.name("catname")));
//		var.deselectByVisibleText(cat);
//		driver.findElement(By.name("subCatgName")).sendKeys(subCat);
//		driver.findElement(By.name("subCatgDesc")).sendKeys("sports");
//		driver.findElement(By.xpath("//center//div[@class = 'col-xs-6 col-sm-6 col-md-4']//input[@type = 'submit']")).click();
//	}
//	
//	
//	@Then("Message displayed product added")
//	public void message_displayed_product_added() {
//		
//		driver.findElement(By.name("SignOut")).click();
//		
//	}
//	
//	
//	
//	
}
