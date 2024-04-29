package org.orangeHrm.base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightFactory {
	
	Playwright playwright ;
	Browser browser;
	


	public Page initBrowser() {
		playwright = Playwright.create();
	    browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	    BrowserContext browsercontext=browser.newContext();
		Page page= browsercontext.newPage();
		page.navigate("https://opensource-demo.orangehrmlive.com/");
		
		return page;
	}
	
	
}
