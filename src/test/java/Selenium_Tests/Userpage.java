package Selenium_Tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Userpage {
	
	@FindBy(xpath="//*[@id=\"table\"]/div/div[1]/div[1]/table/thead/tr/th[3]")
	private WebElement review;
	
	@FindBy(xpath="//*[@id=\"right-panel-link\"]")
	private WebElement backbutton;
	
	@FindBy(id="usernameinput")
	private WebElement searchbar;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/body/button[3]")
	private WebElement updateusernamebutton;
	
	@FindBy(id="usernameupdate")
	private WebElement usernameupdatebar;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/body/div[4]/div[2]/button")
	private WebElement updatebutton;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/body/button[2]")
	private WebElement addbookbutton;
	
	@FindBy(id="bookaddtitle")
	private WebElement addbooktitle;
	
	@FindBy(id="bookaddauthor")
	private WebElement addbookauthor;
	
	@FindBy(id="bookaddreview")
	private WebElement addbookreview;
	
	@FindBy(id="bookaddrating")
	private WebElement addbookrating;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/body/div[4]/button")
	private WebElement addbutton;
	
	@FindBy(xpath="//*[@id=\"table\"]/div/div[1]/div[2]/table/tbody/tr/td[5]/button")
	private WebElement deletebuttonone;
	
	@FindBy(xpath="//*[@id=\"table\"]/div/div[1]/div[2]/table/tbody/tr[1]/td[1]")
	private WebElement tabindexone;
	
	public Boolean reviewDisplay() {
		return review.isDisplayed();
	}
	
	
	public void usernameUpdate(String user) {
		updateusernamebutton.click();
		usernameupdatebar.clear();	
		usernameupdatebar.sendKeys(user);
		updatebutton.click();	
	}
	
	public void backButton() {
		backbutton.click();
	}

}
