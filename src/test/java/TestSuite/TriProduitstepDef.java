package TestSuite;

import Helper.Config;
import Helper.Utiles;
import Page.TriProduit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TriProduitstepDef {
	@Given("admin accéde a la page maison connecté")
	public void admin_accéde_a_la_page_maison_connecté() {
		
		   Config.ConfigChrome();
		   Config.maximizewindow();
		   try {
		   Config.navigateUrl(Utiles.getPropret("Web_Portal_Link1"));
		   }catch (Exception e) {
			
		}
		
	}
	       
	@When("admin selectionne un tri {string}")
	public void admin_selectionne_un_tri(String tri) {
		TriProduit sort =new TriProduit(Config.driver);
	    sort.xiaomiTri(tri);
	}

	@Then("page des produits trié est affichés")
	public void page_des_produits_trié_est_affichés() {
	   
	}
	
}
