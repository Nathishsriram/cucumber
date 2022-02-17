package org.adacatinpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinClass {

	WebDriver driver;
	@Given("User is on adactin login Page")
	public void user_is_on_adactin_login_Page() {
	   
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		WebElement username  = driver.findElement(By.id("username"));
		username.sendKeys(string);
		WebElement userpass  = driver.findElement(By.id("password"));
		userpass.sendKeys(string2);
		WebElement loginbtn  = driver.findElement(By.id("login"));
		loginbtn.click();

		
	    	}
	
	@When("User click {string},{string},{string},{string}")
	public void user_click(String string, String string2, String string3, String string4) {
		Select locations = new Select(driver.findElement(By.id("location")));
		locations.selectByVisibleText(string);
		
		Select hotels = new Select(driver.findElement(By.id("hotels")));
		hotels.selectByVisibleText(string2);    
		
		Select roomtypes = new Select(driver.findElement(By.id("room_type")));
		roomtypes.selectByVisibleText(string3);  
		
		Select roomnumbers = new Select(driver.findElement(By.id("room_nos")));
		roomnumbers.selectByVisibleText(string4);    
		
	 WebElement searchbtn = driver.findElement(By.id("Submit"));
	 searchbtn.click();
	 
	 WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
	 radiobtn.click();
	 WebElement continuebtn = driver.findElement(By.id("continue"));
	 continuebtn.click();
	 
}

	@When("User enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enter(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	    
		WebElement firstname  = driver.findElement(By.id("first_name"));
		firstname.sendKeys(string);
				
		WebElement lastname  = driver.findElement(By.id("last_name"));
		lastname.sendKeys(string2);
		
		WebElement address  = driver.findElement(By.id("address"));
		address.sendKeys(string3);
		
		WebElement ccnum  = driver.findElement(By.id("cc_num"));
		ccnum.sendKeys(string4);
		
		Select cctype = new Select(driver.findElement(By.id("cc_type")));
		cctype.selectByVisibleText(string5);    
		
		Select expmonth = new Select(driver.findElement(By.id("cc_exp_month")));
		expmonth.selectByVisibleText(string6);    
		
		Select expyear = new Select(driver.findElement(By.id("cc_exp_year")));
		expyear.selectByVisibleText(string7);  
		
		WebElement cvv  = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys(string8);
		WebElement booknowbtn = driver.findElement(By.id("book_now"));
		booknowbtn.click();
	}

	
	


	
	@Then("Message displayed")
	public void message_displayed() throws InterruptedException {
		
		Thread.sleep(10000);
		WebElement findElement = driver.findElement(By.id("order_no"));
		String attribute = findElement.getAttribute("value");
		System.out.println(attribute);
driver.quit();

	}

}
