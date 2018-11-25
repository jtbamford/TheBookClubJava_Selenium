package Selenium_Tests;

import org.openqa.selenium.Keys;
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
	
	@FindBy(xpath="//*[@id=\"deletebookbutton\"]")
	private WebElement deletebuttonone;
	
	public Boolean reviewDisplay() {
		return review.isDisplayed();
	}
	
	public Boolean bookDisplay() throws Exception {
		try {
		return deletebuttonone.isDisplayed();
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public void addBook(String rating, String review, String title, String author) {
		addbookbutton.click();
		addbooktitle.click();
		addbooktitle.sendKeys(title);
		addbookauthor.click();
		addbookauthor.sendKeys(author);
		addbookrating.click();
		addbookrating.sendKeys(rating);
		addbookreview.click();
		addbookreview.sendKeys(review);
	}
	
	public void deleteBook() {
		deletebuttonone.click();
	}
	
	public void searchForUser(String user) {
		searchbar.click();
		searchbar.clear();
		searchbar.sendKeys(user);
		searchbar.sendKeys(Keys.ENTER);
	}
	
	public void addbookbutton( ) {
		addbutton.click();
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

	public WebElement getDeletebuttonone() {
		return deletebuttonone;
	}

	public void setDeletebuttonone(WebElement deletebuttonone) {
		this.deletebuttonone = deletebuttonone;
	}

	public WebElement getSearchbar() {
		return searchbar;
	}

	public void setSearchbar(WebElement searchbar) {
		this.searchbar = searchbar;
	}

}
