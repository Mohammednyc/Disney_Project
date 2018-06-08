package com.usa.stefdefination;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.usa.crossbrowser.browserFactory;
import com.usa.pageobjectmodel.PageObjectClass;
import com.usa.util.ExplicitWaitClass;
import com.usa.util.HighlightEmenet;
import com.usa.util.screenShot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
     
    @Listeners(com.usa.util.ListenerTest.class) 
    public class StefDefination  {
    PageObjectClass obj	;
    WebDriver driver;
    
	@Given("^User visit on homepage$")
	public void user_visit_on_homepage() throws Throwable {
		
	    driver = browserFactory.getBrowser("chrome", driver);
		driver.get(browserFactory.getURL());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        obj =PageFactory.initElements(driver, PageObjectClass.class);
        
    }
	@When("^User able to picks a dates$")
	public void user_able_to_picks_a_date() throws Throwable {
		
		//WebElement ChekingBox  = obj.SelectDateButton();
		//ExplicitWaitClass.getExplicitWait(ChekingBox, driver);
		//HighlightEmenet.drawBorderGreen(driver, ChekingBox);
        obj.SelectDateButton().click();
       // HighlightEmenet.drawBorderGreen(driver, ChekingBox);
       /// HighlightEmenet.drawBorderGreen(driver, webelement);
        
		obj.SelectFirstDate().click();
		
		WebElement element  = obj.SelectSecondDate();
		ExplicitWaitClass.getExplicitWait(element, driver);
	    obj.SelectSecondDate().click();
	}
	@When("^User picks two adults$")
	public void user_picks_two_adults() throws Throwable {
	obj.SelectFirstAdult().click();
	obj.SelectSecondAdult().click();
	}
    @When("^User picks one child and select age Twelve$")
	public void user_picks_one_child_and_select_age_Twelve() throws Throwable {
    obj.SelectFirstChild().click();
	obj.SelectDrup().click();
	obj.SelectFirstChildAge().click();
	}
    @When("^User picks another child and select age Five$")
	public void user_picks_another_child_and_select_age_Five() throws Throwable {

		obj.SelectSecondChild().click();
		obj.SelectDrup2().click();
		obj.SelectSecondChildAge().click();
	}
    @When("^User select All Resort Hotels button$")
	public void user_select_All_Resort_Hotels_button() throws Throwable {
	
		obj.SelectAllResortHotels().click();
		obj.SelectAllresortButton().click();
	}
    @When("^User clicks Find Resort$")
	public void user_clicks_Find_Resort() throws Throwable {
		WebElement element  = obj.SelectFindResort();
		ExplicitWaitClass.getExplicitWait(element, driver);
	    obj.SelectFindResort().click();
	}
    @Then("^User should see various resort options selects any available room in the resort and clicks select buttun$")
	public void user_should_see_various_resort_options() throws Throwable {
		
		obj.FindThirdResort();
	}
    @When("^User able to see all unavailable Room$")
	public void user_able_to_see_all_unavailable_Room() throws Throwable {
		
		obj.FindunavailableRoom();
	}
    @When("^user able to click available room$")
	public void user_able_to_click_available_room() throws Throwable {
	
		obj.FindavailableRoom();
	}

	@When("^User selects any ticket option$")
	public void user_selects_any_ticket_option_other_than_what_is_selected() throws Throwable {
		WebElement element  = obj.UpdateTicket();
		ExplicitWaitClass.getExplicitWait(element, driver);
		obj.UpdateTicket().click();
		//Thread.sleep(2000);
	}

	@When("^User clicks Park Hopper Option$")
	public void user_clicks_Park_Hopper_Option() throws Throwable {
		obj.UpdateParkHopper().click();
	}

	@When("^User clicks continue$")
	public void user_clicks_continue() throws Throwable {
		
		WebElement element  = obj.ClickContnueButton();
		ExplicitWaitClass.getExplicitWait(element, driver);
		obj.ClickContnueButton().click();
		//Thread.sleep(2000);
	}

	@Then("^User should see dining plan options and selects no dining plan and clicks continue$")
	public void user_should_see_dining_plan_options_and_selects_no_dining_plan_and_clicks_continue() throws Throwable {
		WebElement element  = obj.ClickAgainContnueButton();
		ExplicitWaitClass.getExplicitWait(element, driver);
	    obj.ClickAgainContnueButton().click();
		//WebElement webelement  = obj.ClickAgainContnueButton();
		//HighlightEmenet.drawBorderGreen(driver, webelement);
		 // obj.ClickAgainContnueButton().click();
	}
 
	
	@When("^User clicks Add Ground for Ground transportation$")
	public void user_clicks_Add_Ground_for_Ground_transportation() throws Throwable {
		obj.ClickGroundTransportation().click();
	}

	@When("^User clicks Next$")
	public void user_clicks_Next() throws Throwable {
		WebElement element  = obj.ClickNextButton();
		ExplicitWaitClass.getExplicitWait(element, driver);
		obj.ClickNextButton().click();
		//Thread.sleep(2000);
	}
    @When("^User clicks Done$")
	public void user_clicks_Done() throws Throwable {
	obj.ClickDoneButton().click();
	}
	@When("^User sees Complimentary on Ground transportation option$")
	public void user_sees_Complimentary_on_Ground_transportation_option() throws Throwable {
	obj.VerifyComplimentary();
	}
    @Then("^Screenshot of the cart page$")
	public void screenshot_of_the_cart_page() throws Throwable {
 /* WebElement element  = obj.TakeScreenShot();
	ExplicitWaitClass.getExplicitWait(element, driver);*/
    Thread.sleep(1000);
	obj.TakeScreenShot();
/*  screenShot.captureScreenShot(driver,"Ground Transportation line\r\n" + "Take a screenshot");
    System.out.println(">>>>>>>>>Take Screen short Ground Transportation<<<<<<<<<");	*/
	Thread.sleep(1000);
	}
    @When("^User remove all items from the cart$")
	public void user_remove_all_items_from_the_cart() throws Throwable {
	obj.RemoveCartClick().click();
	WebElement element  = obj.FinalRemoveCartClick();
	ExplicitWaitClass.getExplicitWait(element, driver);
	obj.FinalRemoveCartClick().click();
	//Thread.sleep(2000);
	}
    @When("^Another Screenshot$")
	public void another_Screenshot() throws Throwable {
   /*	WebElement element  = obj.TakeScreenShotAgain();
		ExplicitWaitClass.getExplicitWait(element, driver);*/
    	Thread.sleep(1000); 
	    obj.TakeScreenShotAgain();
 /*   screenShot.captureScreenShot(driver,"Empty Cart\r\n" + "Take a screenshot");
    System.out.println(">>>>>>>>>TakeScreen short Empty cart<<<<<<<<<");*/
	Thread.sleep(1000); 
	}
    @Then("^Usre success fully verify$")
	public void usre_success_fully_verify() throws Throwable {	
    String titlestatus = driver.findElement(By.xpath("//*[@id=\"emptyCart\"]/div/span[1]")).getText();
    String successfullmsg = "Your cart is empty. Have a Cart ID?";
    if (titlestatus.equalsIgnoreCase(successfullmsg)) {
	System.out.println(titlestatus + "::Remove Cart successfully");
	System.out.println(">>>>>>>>>>>>>Congratulations Test Success fully Done<<<<<<<<<<<<<<");
	} else {
	System.out.println("<<<<< Test Failed>>>>>>");
    }
	driver.quit();
    }}		

  
	
     