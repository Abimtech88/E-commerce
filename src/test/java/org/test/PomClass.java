package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass extends HelperClass {

	public PomClass()
	{
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(xpath="//a[contains(text(),'nykaa fashion')]")
	private WebElement fash;
	@FindBy(xpath="//a[text()='Nykaa Fashion']")
	private WebElement fashion;
	@FindBy(xpath="//a[contains(text(),'Sarees')]")
	private WebElement sarees;
	@FindBy(xpath="//div[contains(text(),'Ivory Organza Silk Saree With Ditsy White Print Blouse (Set of 2)')]")
	private WebElement brand;
	@FindBy(xpath="//button[text()='Add to bag']")
	private WebElement bag;
	@FindBy(xpath="//button[text()='XL']")
	private WebElement size;
	@FindBy(xpath="//div[text()='Arpita Mehta']")
	private WebElement down;
	
	
	public WebElement getDown() {
		return down;
	}
	public WebElement getSize() {
		return size;
	}
	public WebElement getBag() {
		return bag;
	}
	public WebElement getBrand() {
		return brand;
	}
	public WebElement getFash() {
		return fash;
	}
	public WebElement getFashion() {
		return fashion;
	}
	public WebElement getSarees() {
		return sarees;
	}

	

	
	
}
