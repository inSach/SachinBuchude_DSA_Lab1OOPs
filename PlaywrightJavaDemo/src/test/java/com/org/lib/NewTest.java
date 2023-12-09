package com.org.lib;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.nio.file.Paths;

import javax.lang.model.element.Element;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.ScreenSize;

public class NewTest {
  @Test
  public void first() {
	  Playwright playwright = Playwright.create();
	  Browser browserFF = playwright.webkit().launch();
	  Browser browserGC = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	  Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
	  int height = screensize.height;
	  int width = screensize.width;
	  BrowserContext context = browserGC.newContext(new Browser.NewContextOptions().setViewportSize(width, height));
//	  Page page = browserGC.newPage();
	  Page page = context.newPage();
	  page.navigate("https://playwright.dev/");
	  Locator e = page.locator("xpath=//*[@id=\"__docusaurus_skipToContent_fallback\"]/header/div/div/a");
	  e.click();
	  Locator e1 = page.locator("xpath=//*[@id=\"__docusaurus_skipToContent_fallback\"]/div/div/aside/div/div/nav/ul/li[1]/ul/li[2]/a");
	  e1.click();
	  page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
	  Locator searchBtn = page.locator("//*[@id=\"__docusaurus\"]/nav/div[1]/div[2]/div[2]/button/span[1]/span");
	  searchBtn.click();
	  Locator searchfield = page.locator("//*[@id=\"docsearch-input\"]");
	  searchfield.fill("Generating tests");
	  page.locator("//*[@id=\"docsearch-item-0\"]/a");
	  searchfield.press("Enter");
	  //browserGC.close();
  }
}
