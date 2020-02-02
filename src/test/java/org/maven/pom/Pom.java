package org.maven.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	 public Pom() {
		//PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement user;
	@FindBy(id="pass")
	private WebElement password;
    @FindBy(id = "loginbutton")
    private WebElement login;
	public WebElement getUser() {
		return user;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
  
  
}
