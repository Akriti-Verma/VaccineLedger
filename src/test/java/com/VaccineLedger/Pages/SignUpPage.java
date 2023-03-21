package com.VaccineLedger.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.VaccineLedger.Utility.BaseClass;

import io.cucumber.java.en.When;

public class SignUpPage extends BaseClass {
static By link_SignUp = By.xpath("//a[@class='vl-blue vl-link']");
	static By txt_Username = By.xpath("//input[@name='firstName']");
	static By txt_Password = By.xpath("//input[@name='lastName']");
	static By txt_Email = By.xpath("//input[@name='email']");
	static By txt_MobileNo = By.xpath("//input[@name='phone']");
	static By txt_TipoDe = By.xpath("//input[@type='text'][@id='mui-6']");
	static By txt_Nombre = By.xpath("//input[@id='mui-8']");
	static By btn_Continuar = By.xpath("//button[@type='submit']");

	// FUNCTIONS
	public static void click_SignUp() {
		driver.findElement(link_SignUp).click();
	}
	public static void enter_UserName_and_Password(String username, String password) {
		driver.findElement(txt_Username).sendKeys(username);
		driver.findElement(txt_Password).sendKeys(password);
	}

	public static void enter_EmailID(String email) {
		driver.findElement(txt_Email).sendKeys(email);
	}
	
	public static void enter_MobileNo(String mobileNo) {
		driver.findElement(txt_MobileNo).sendKeys(mobileNo);
		
	}

	  public static void enter_TipoDe_Organization(String TipoDeOrg) throws Exception {
	  jse=(JavascriptExecutor)driver; jse.executeScript("window.scrollTo(0,400)");
	  WebElement obj= driver.findElement(txt_TipoDe); obj.click();
	  obj.sendKeys(TipoDeOrg);
	  
	  }
	 
	public static void enter_Nambre_Organization(String nambreOrg) { 
		driver.findElement(txt_Nombre).sendKeys(nambreOrg);
	}
	
	public static void click_Continuar() {
		driver.findElement(btn_Continuar).click();
	}
}
