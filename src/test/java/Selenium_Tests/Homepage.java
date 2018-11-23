package Selenium_Tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	
	@FindBy(id="usernameinput")
	private WebElement search;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/body/p/button")
	private WebElement signinbutton;
	
	@FindBy(xpath="//*[@id=\"makeuser\"]")
	private WebElement signininput;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/body/p")
	private WebElement paragraph;
	
	public void searchForUser(String userone) {
		search.click();
		search.clear();
		search.sendKeys(userone);
		search.sendKeys(Keys.ENTER);
	}
	
	
	public void signInInput(String usertwo) {
		signininput.click();
		signininput.clear();
		signininput.sendKeys(usertwo);
	}
	
	public void signInButton() {
		System.out.println(signinbutton);
		
		signinbutton.click();
		signinbutton.click();
	}
	
	public Boolean paragraphDisplay() {
		return paragraph.isDisplayed();
	}
	
}
