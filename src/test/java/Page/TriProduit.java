package Page;

import java.time.Duration;
import java.util.List;

import org.apache.commons.collections4.functors.CatchAndRethrowClosure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Helper.Config;

public class TriProduit {
@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/h3/a ")
List<WebElement> produits;
   @FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[2]/div[4]/form/div/select")
   WebElement tri;
   
public TriProduit(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void xiaomiTri(String selectri) {
	try {
	Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Select select=new Select(tri);	
	
	select.selectByVisibleText(selectri);
	}catch (Exception e) {
		// TODO: handle exception
	}
}
public void clicProduit(String productname){
	try {
	for(WebElement prod : produits){
		if(prod.getText().contains(productname)){
			
			prod.click();
		}
   	 }
	
}catch (Exception e) {
	// TODO: handle exception
}
}
}
