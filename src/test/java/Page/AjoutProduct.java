package Page;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class AjoutProduct {
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/h3/a ")
	List<WebElement> produits;
	@FindBy(xpath="/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/form/div/button")
	WebElement boutonAjout;
	@FindBy(className="xoo-wsc-pname")
	WebElement contenantPanier;
	public AjoutProduct(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clicAjoutByName(String productname) {
		try {
		for(WebElement produit:produits){
			if(produit.getText().contains(productname)){	
				Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				produit.click();	
				Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				boutonAjout.click();
				
			}
	}
		}catch(Exception e) {
			}
	}

	
	
public void verifajout(String name) {
	try {
		for(WebElement produit: produits){
			if(produit.getText().contains(name)){	
				Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				Assert.assertTrue("produit non ajouté au panier",contenantPanier.getText().contains(name));
	                }
              }
	}catch (Exception e) {
		// TODO: handle exception
	}
}
}
	
	
	
	

