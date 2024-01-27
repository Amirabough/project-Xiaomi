package Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class MenuPage {
@FindBy(xpath="/html/body/div[1]/header/nav/div[2]/ul/li/a")
List <WebElement> menus;
@FindBy(xpath="/html/body/div[1]/header/nav/div[2]/ul/li[3]/div[1]/div/ul/li/a")
List <WebElement> submenus;

@FindBy(xpath="/html[1]/body[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/header[1]/h1[1]")
WebElement HomemenuMessage;

public MenuPage(WebDriver driver) {
	PageFactory.initElements(Config.driver, this);
}
	public  void hoverOnMenu(String menunane) {
		Config.action=new Actions(Config.driver);
		try {
		
		for(WebElement menu: menus) {
			Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			if(menu.getText().contains(menunane)) {
				Thread.sleep(2000);
				Config.action.moveToElement(menu).perform();
				
			}
			
			}
		
		
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void clicOnsubmenu(String nomsubmenu) {
		
		try {
		for(WebElement submenu:submenus) {
			Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			if(submenu.getText().contains(nomsubmenu)) {
				Thread.sleep(2000);
				Config.action.moveToElement(submenu).click();
				
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public String verifmenu()
	{
		String actualresult=HomemenuMessage.getText();
		return actualresult;
	}     
}






