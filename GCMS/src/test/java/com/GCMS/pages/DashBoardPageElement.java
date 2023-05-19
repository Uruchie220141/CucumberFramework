package com.GCMS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GCMS.testbase.BaseClass;

public class DashBoardPageElement {
	
		 
	@FindBy(id="selected")
	public WebElement welcome ;
	
	
	@FindBy(xpath="//table[@width='100%']/tbody/tr")
	public WebElement allCases ;
	
	@FindBy(xpath="//*[@id=\"pageNav\"]/div[3]/a")
	public WebElement findCase ;
	
	
	
	public DashBoardPageElement() {
		
		PageFactory.initElements(BaseClass.driver, this);
		
	}

}
