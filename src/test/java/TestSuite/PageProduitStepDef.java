package TestSuite;

import Helper.Config;
import Helper.Utiles;
import Page.TriProduit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageProduitStepDef {
	@Given("admin accéde ala page maison connecté")
	public void admin_est_ala_page_home() {
		 Config.ConfigChrome();
		   Config.maximizewindow();
		   try {
		   Config.navigateUrl(Utiles.getPropret("Web_Portal_Link1"));
		   }catch (Exception e) {
			
		}
		
	}
	@When("admin click sur le produit {string}")
	public void admin_click_sur_le_produit(String produitname) throws InterruptedException {
	    TriProduit produt=new TriProduit(Config.driver);
	    produt.clicProduit(produitname);
	   
	}

	@Then("la page de produit est afiché")
	public void la_page_de_produit_est_afiché() throws InterruptedException {
		 Thread.sleep(3000);
		    Config.driver.quit();
	}
	
}
