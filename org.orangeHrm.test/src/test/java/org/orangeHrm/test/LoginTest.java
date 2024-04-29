package org.orangeHrm.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.orangeHrm.base.PlaywrightFactory;
import org.orangeHrm.page.Dashboard;
import org.orangeHrm.page.Login;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LoginTest {

	PlaywrightFactory pf;
	Page page;
	Login loginPage;
	Dashboard dashboard;
	@BeforeTest
	public void Setup() {
		pf= new PlaywrightFactory();
		page=pf.initBrowser();
		loginPage = new Login(page);
		dashboard = new Dashboard(page);
	}
	
	@Test
	public void LoginPageTest() {
		AssertJUnit.assertEquals(loginPage.gettitle(),"OrangeHRM" );
		loginPage.doLogin("admin","admin123");
	}
	@Test
	public void LogoutTest() {
		//loginPage.doLogin("admin","admin123");
		dashboard.Logout();
	}
	
	@AfterTest
	public void TearDown() {
		page.context().browser().close();
		
	}
}
