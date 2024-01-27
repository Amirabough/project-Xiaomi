package TestSuite;

import Helper.Config;
import Helper.Utiles;
import Page.XIaomiHome;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HomePageStepDef {
	@Given("admin acceder ala pageHome")
	public void admin_acceder_a_la_page_home() {
		 Config.ConfigChrome();
		   Config.maximizewindow();
		   try {
		   Config.navigateUrl(Utiles.getPropret("Web_Portal_Link"));
		   }catch (Exception e) {
			
		}
		
	}
	@When("admin saisir URL")
	public void admin_saisir_url() {
		
	    
	}

	@Then("page home {string}  est affiché")
	public void page_home_est_affiché(String name) throws InterruptedException {
		XIaomiHome home= new XIaomiHome(Config.driver);
		   String actuelmessage=home.verifmessage();
		    Assert.assertEquals(actuelmessage,name);
		    Thread.sleep(3000);
		    Config.driver.quit();
	}

}
