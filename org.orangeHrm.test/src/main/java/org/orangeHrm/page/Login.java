package org.orangeHrm.page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Login {
	
	private String logo="//img[@alt=\"company-branding\"]";
	private String username="//input[@name=\"username\"]";
	private String password="//input[@name=\"password\"]";
	private String loginbtn = "//button";
	
	
	private Page loginPage;
	public Page dasboard;

	public Login(Page loginPage) {
		this.loginPage = loginPage;
	}
	
	public String gettitle() {
		return loginPage.title();
	}
	public Locator getLogo() {
		return loginPage.locator(logo);
	}
	
	public Locator getUsername() {
		return loginPage.locator(username);
	}
	
	public Locator getPassword() {
		return loginPage.locator(password);
	}
	
	public Locator getLoginBtn() {
		return loginPage.locator(loginbtn);
	}
	
	public Dashboard doLogin(String usrname,String pass) {
		getUsername().fill(usrname);
		getPassword().fill(pass);
		getLoginBtn().click();
		return new Dashboard(dasboard);
	}
	
}
