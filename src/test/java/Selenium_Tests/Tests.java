package Selenium_Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Tests {

	WebDriver driver;
	String url;
	
	@Before
	public void setup() {
		url="http://localhost:3000";
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Development/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
	public void signInTest() throws Exception {
		driver.get(url); 
		Homepage h1 = PageFactory.initElements(driver,Homepage.class);
		h1.signInInput("Tom");
		Thread.sleep(5000);
		h1.signInButton();
		
		Thread.sleep(5000);
		
		Userpage u1 = PageFactory.initElements(driver,Userpage.class);
		assertEquals(true,u1.reviewDisplay()); 
	}
	
	@Test
	public void backTest() throws Exception {
		driver.get(url); 
		Homepage h1 = PageFactory.initElements(driver,Homepage.class);
		h1.signInInput("Tom");
		h1.signInButton();
		Userpage u1 = PageFactory.initElements(driver,Userpage.class);
		u1.backButton();
		assertEquals(true,h1.paragraphDisplay()); 
	}
	
	@Test
	public void searchTest() {
		driver.get(url); 
		Homepage h1 = PageFactory.initElements(driver,Homepage.class);
		h1.signInInput("Tom");
		h1.signInButton();
		Userpage u1 = PageFactory.initElements(driver,Userpage.class);
		u1.backButton();
		h1.searchForUser("Tom");
		assertEquals(true, u1.reviewDisplay());
	}

	
}
