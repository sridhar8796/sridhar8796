package org.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","");
            driver=new ChromeDriver();
	}
	public static void loadUrl(String s) {
		driver.get(s);
}
	public static void fill(WebElement e,String s) {
		e.sendKeys(s);

	}
    public static void click(WebElement e) {
		e.click();

	}
    public static void sbi(WebElement e,int i) {
	Select s =new Select(e);
    s.selectByIndex(i);	
    }
    public static void sbv(WebElement e,String s1) {
		Select s = new Select(e);
		s.selectByValue(s1);

	}
    public static void quit() {
		driver.quit();

	}
    public static void getTitle() {
		String s1 = driver.getCurrentUrl();
	
	}
	

}
