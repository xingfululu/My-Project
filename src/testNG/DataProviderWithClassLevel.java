package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderWithClassLevel {
private WebDriver driver;
//@Test(dataProvider = "Authentication", dataProviderClass = DataproviderClass.class)
public void test(String sUsername, String sPassword)
{
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.store.demoqa.com");
	driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 
    driver.findElement(By.id("log")).sendKeys(sUsername);

    driver.findElement(By.id("pwd")).sendKeys(sPassword);

    driver.findElement(By.id("login")).click();

    driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();

    driver.quit();
	
}
}
