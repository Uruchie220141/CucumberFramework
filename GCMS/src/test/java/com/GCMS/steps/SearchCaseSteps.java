package com.GCMS.steps;

import com.GCMS.pages.LoginPage;
import com.GCMS.utils.CommonMethods;
import com.GCMS.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchCaseSteps extends CommonMethods{
	
	
	
	@Given("User enters valid credentials")
	public void user_enters_valid_credentials() {
	  
	loginPage.login(ConfigsReader.getProperty("userName"), ConfigsReader.getProperty("password"));
		
	}

	@Given("User clicks on Search case")
	public void user_clicks_on_search_case() {
		
		jsClick(dashboard.findCase);
	   
	}

	@Then("User enters decedents name {string} and checkRadio {string}")
	public void user_enters_decedents_name(String string) {
		
		sendText(findCase.nameId, string);
		
		clickRadioOrCheckbox(findCase.radioBtn,string );
		wait(2);
		
	   
		
	}

	@Then("User clicks on search")
	public void user_clicks_on_search() {
	   
		
	}

	@Then("User validates data results")
	public void user_validates_data_results() {
	   
		
	}

	@Then("User enters decedents caseID {int} and checkRadio {string}")
	public void user_enters_decedents_case_id(Integer int1, String string) {
	  
		
	}

}
