package TestSuite;

import Helper.Config;
import Helper.Utiles;
import Page.MenuPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class MenuPageStepDef {
	@Given("admin est ala page Home")
	public void admin_est_ala_page_home() {
		 Config.ConfigChrome();
		   Config.maximizewindow();
		   try {
		   Config.navigateUrl(Utiles.getPropret("Web_Portal_Link"));
		   }catch (Exception e) {
			
		}
		
	}

	@When("admin hover le menu {string} and hover on {string}")
	public void admin_hover_le_menu_and_hover_on(String menuTitle, String submenutitle) {
		 MenuPage page=new MenuPage(Config.driver);
		   page.hoverOnMenu(menuTitle,submenutitle);
	}
	@When("admin click sur le submenu {string}")
	public void admin_click_sur_le_submenu(String submenuN) {
		MenuPage page=new MenuPage(Config.driver);
		page.clicOnsubmenu(submenuN);
	}

	@Then("admin redirigé vers la page de produit {string}")
	public void admin_redirigé_vers_la_page_de_produit(String namesubmenu) throws InterruptedException {
		MenuPage page=new MenuPage(Config.driver);
		Thread.sleep(2000);
		String actualmessage=page.verifmenu();
		Assert.assertEquals(namesubmenu, actualmessage);
	}




	}




