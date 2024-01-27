package TestSuite;

import Helper.Config;
import Helper.Utiles;
import Page.AjoutProduct;
import io.cucumber.java.en.*;


public class AjoutProductStepDef {
	@Given("admin accede ala page produit")
	public void admin_accede_ala_page_produit() {
			 Config.ConfigChrome();
			   Config.maximizewindow();
			   try {
			   Config.navigateUrl(Utiles.getPropret("Web_Portal_Link1"));
			   }catch (Exception e) {
				
			}
			
		}

	
	@When("admin click sur le boutton ajout panier du produit {string}")
	public void admin_click_sur_le_boutton_ajout_panier_du_produit(String nameproduit) {
		AjoutProduct produit=new AjoutProduct(Config.driver);
		produit.clicAjoutByName(nameproduit);
	}

	@Then("le produit {string} est ajoute au panier")
	public void le_produit_est_ajoute_au_panier(String productname) {
		AjoutProduct produit=new AjoutProduct(Config.driver);
		produit.verifajout(productname);
	}
}
