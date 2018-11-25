package Selenium_Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Tests {

	WebDriver driver;
	String url;
	
	@Before
	public void setup() {
		url="http://localhost:3000";
		System.setProperty("webdriver.chrome.driver", "/Users/tombamford/ChromeDriver/chromedriver");
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
		Thread.sleep(3000);
		h1.signInInput("1");
		h1.signInButton();
		Thread.sleep(2000);
		Userpage u1 = PageFactory.initElements(driver,Userpage.class);
		assertEquals(true,u1.reviewDisplay()); 
	}
	
	@Test
	public void backTest() throws Exception {
		driver.get(url); 
		Homepage h1 = PageFactory.initElements(driver,Homepage.class);
		Thread.sleep(3000);
		h1.signInInput("2");
		h1.signInButton();
		Thread.sleep(2000);
		Userpage u1 = PageFactory.initElements(driver,Userpage.class);
		u1.backButton();
		Thread.sleep(2000);
		assertEquals(true,h1.paragraphDisplay()); 
	}
	
	@Test
	public void searchTest() throws Exception {
		driver.get(url); 
		Homepage h1 = PageFactory.initElements(driver,Homepage.class);
		h1.signInInput("3");
		h1.signInButton();
		Thread.sleep(2000);
		Userpage u1 = PageFactory.initElements(driver,Userpage.class);
		u1.backButton();
		Thread.sleep(2000);
		h1.searchForUser("3");
		Thread.sleep(1000);
		assertEquals(true, u1.reviewDisplay());
	}
	
	@Test
	public void updateTest() throws Exception {
		driver.get(url); 
		Homepage h1 = PageFactory.initElements(driver,Homepage.class);
		Thread.sleep(3000);
		h1.signInInput("4");
		h1.signInButton();
		Thread.sleep(2000);
		Userpage u1 = PageFactory.initElements(driver,Userpage.class);
		u1.backButton();
		Thread.sleep(2000);
		h1.searchForUser("4");
		u1.usernameUpdate("5");
		Thread.sleep(2000);
		assertEquals(true, u1.reviewDisplay());
	}
	
	@Test
	public void addBookTest() throws Exception {
		driver.get(url); 
		Homepage h1 = PageFactory.initElements(driver,Homepage.class);
		Thread.sleep(3000);
		h1.signInInput("6");
		h1.signInButton();
		Thread.sleep(2000);
		Userpage u1 = PageFactory.initElements(driver,Userpage.class);
		u1.backButton();
		Thread.sleep(2000);
		h1.searchForUser("6");
		u1.addBook("1", "good", "Harry Potter", "J.K.Rowling");
		u1.addbookbutton();
		Thread.sleep(1000);
		assertEquals(true, u1.bookDisplay());
	}
	
	@Test
	public void deleteBookTest() throws Exception {
		driver.get(url); 
		Homepage h1 = PageFactory.initElements(driver,Homepage.class);
		Thread.sleep(3000);
		h1.signInInput("7");
		h1.signInButton();
		Thread.sleep(2000);
		Userpage u1 = PageFactory.initElements(driver,Userpage.class);
		u1.backButton();
		Thread.sleep(2000);
		h1.searchForUser("7");
		u1.addBook("1", "good", "Harry Potter", "J.K.Rowling");
		u1.addbookbutton();
		Actions actions = new Actions(driver);
		Thread.sleep(1500);
		actions.moveToElement(u1.getSearchbar()).click().perform();
		Thread.sleep(1500);
		actions.moveToElement(u1.getDeletebuttonone()).click().perform();
		Thread.sleep(1000);
		assertEquals(false, u1.bookDisplay());
	}
	
	@Test
	public void userpageSearchTest() throws Exception {
		driver.get(url); 
		Homepage h1 = PageFactory.initElements(driver,Homepage.class);
		Thread.sleep(3000);
		h1.signInInput("8");
		h1.signInButton();
		Thread.sleep(2000);
		Userpage u1 = PageFactory.initElements(driver,Userpage.class);
		u1.backButton();
		Thread.sleep(3000);
		h1.signInInput("9");
		h1.signInButton();
		Thread.sleep(2000);
		u1.searchForUser("8");
		Thread.sleep(1000);
		assertEquals(true, u1.reviewDisplay());
	}

	
}
