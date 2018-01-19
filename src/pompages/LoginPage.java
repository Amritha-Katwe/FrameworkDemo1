package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//declare elements
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwdTB;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginBtn;
	
	//initialise the elements
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilisations
	public void setUsername(String un) {
		unTB.sendKeys(un);
	}
	public void setPassword(String pwd) {
		pwdTB.sendKeys(pwd);
	}
	public void clickLogin() {
		loginBtn.click();
	}
}
