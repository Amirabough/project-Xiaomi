package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class XIaomiHome {
@FindBy(linkText="Boutique")
WebElement home;

public XIaomiHome(WebDriver driver) {
	PageFactory.initElements(Config.driver, this);
}
public String verifmessage()
{
	String actualresult=home.getText();
	return actualresult;
}

}
