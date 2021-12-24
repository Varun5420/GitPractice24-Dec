package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class FacebookLoginPOM extends BaseClass{
	
	public FacebookLoginPOM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({@FindBy(id="email"), @FindBy(name="email")})
	private WebElement txtUserName;


	@FindBys({@FindBy(id="pass"), @FindBy(name="pass")})
	private WebElement txtUserPass;
	
	

	public WebElement getTxtUserName() {
		return txtUserName;
	}


	public WebElement getTxtUserPass() {
		return txtUserPass;
	}

}
