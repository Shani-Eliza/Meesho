package Meesho_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Meesho_base.base_class;

public class test_class 
{
	WebDriver driver;
	String baseurl = "https://www.meesho.com/";
	
	@BeforeTest
	public void url() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		base_class obj = new base_class(driver);
		obj.search("Saree");
	}
	
	@Test
	public void test2()
	{
		base_class obj = new base_class(driver);
		obj.select();
	}
	
	@Test
	public void test3()
	{
		base_class obj = new base_class(driver);
		obj.title("Online Shopping Site for Fashion, Electronics, Home & More | Meesho");
	}
	
	@Test
	public void test4()
	{
		base_class obj = new base_class(driver);
		obj.color();
	}
	
	@AfterTest
	public void close()
	{
		//driver.quit();
	}
}
