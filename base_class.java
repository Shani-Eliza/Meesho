package Meesho_base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class base_class 
{
	WebDriver driver;
	
	public base_class(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void search(String s)
	{
		By text = By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[1]/input");
		driver.findElement(text).click();
		driver.findElement(text).sendKeys(s, Keys.ENTER);
		
	}
	
	public void title(String s)
	{
		String act = driver.getTitle();
		Assert.assertEquals(s,act);
	}
	
	public void select()
	{
		By men = By.xpath("//*[@id=\"__next\"]/div[2]/div[4]/div/div[5]/span");
		WebElement menlink = driver.findElement(men);
		
		Actions act = new Actions(driver);
		act.moveToElement(menlink);
		act.perform();
		
		By logo = By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[1]/a/img");
		driver.findElement(logo).click();
		
		By jew = By.xpath("//*[@id=\"__next\"]/div[3]/div[1]/div/div[3]/div[1]/img");
		WebElement jewellery = driver.findElement(jew);
		act.moveToElement(jewellery);
		act.perform();
		
		By jewe = By.xpath("//*[@id=\"__next\"]/div[3]/div[1]/div/div[3]/div[1]/img");
		driver.findElement(jewe).click();
	}

	public void color() 
	{
		By hair_color = By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div/div[2]/div[2]/div[24]/div[15]/div[2]/div/span[3]/a");
		WebElement color = driver.findElement(hair_color);
		
		Actions act = new Actions(driver);
		act.moveToElement(color);
		act.perform();
		driver.findElement(hair_color).click();
	}
}
