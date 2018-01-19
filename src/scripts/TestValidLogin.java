package scripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;

public class TestValidLogin extends BaseTest 
{
	@Test
	public void testValidLogin() throws InterruptedException 
	{
		LoginPage l = new LoginPage(driver);
		//enter Username
		String username = Lib.getCellValue(EXCEL_PATH, "ValidLogin", 1, 0);
		l.setUsername(username);
		//enter password
		String password = Lib.getCellValue(EXCEL_PATH, "ValidLogin", 1, 1);
		l.setPassword(password);
		//click on login button
		l.clickLogin();
		Thread.sleep(3000);
		String expectedTitle = "actiTIME - Enter Time-Track";
		String actualtitle = driver.getTitle();
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualtitle, expectedTitle);
		s.assertAll();

	}
}
