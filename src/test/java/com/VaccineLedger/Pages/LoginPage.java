package com.VaccineLedger.Pages;

import org.openqa.selenium.By;

import com.VaccineLedger.Utility.BaseClass;

public class LoginPage extends BaseClass {

	static By txt_Email=By.name("email");
	 
	static By btn_SignIn=By.xpath("//button[text()='Sign In']");
	
	static By btn_Verificar=By.xpath("//button[text()='VERIFICAR']");
	// FUNCTIONS
	public static void login(String email) {
	driver.findElement(txt_Email).sendKeys(email);
	
	}
	public static void clickon_SignIn() throws Exception {
	driver.findElement(btn_SignIn).click();
	Thread.sleep(3000);

	}
	
	public static void click_On_VERIFICAR() {
		driver.findElement(btn_Verificar).click();
	}
}
