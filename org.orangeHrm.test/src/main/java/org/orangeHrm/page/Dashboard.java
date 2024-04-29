package org.orangeHrm.page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Dashboard {
	
	private String pageTitle = "//h6";
	private String drowdwn= "//p[@class=\"oxd-userdropdown-name\"]";
	private String logout ="//ul[@class=\"oxd-dropdown-menu\"]/li[4]/a";
	

	private Page dasboard;


	public Dashboard(Page dasboard) {
		this.dasboard = dasboard;
	}
	
	public String getpageheader() {
		return dasboard.locator(pageTitle).textContent();
	}
	
	public Locator getdropdwn() {
		return dasboard.locator(drowdwn);
	}
	
	public Locator getlogout() {
		return dasboard.locator(logout);
	}
	
	
	public void Logout() {
		getdropdwn().click();
		getlogout().click();
	}
}
