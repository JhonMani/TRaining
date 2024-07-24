package stepdefintion.org;

import java.time.Duration;

import com.google.common.eventbus.AllowConcurrentEvents;

import base.org.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pom.org.PomClass;

public class StepClass extends BaseClass{
	
	PomClass mk= new PomClass(driver);
	

	@Given("To lunch the URL")
	public void to_lunch_the_url() {
		
		url(driver, "https://pizzaonline.dominos.co.in/");
	    maxi(driver);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Given("enter the delivery address details")
	public void enter_the_delivery_address_details() {
		clik(mk.getDelivery_enter());
		clik(mk.getAllow());
	}

	@Then("Entering the Area")
	public void entering_the_area() {
		sendvalues(mk.getAddress(), "600125");
	   
	}

	@Then("clik the locate icon")
	public void clik_the_locate_icon() {
		clik(mk.getLocate());
	    
	}

	

}
