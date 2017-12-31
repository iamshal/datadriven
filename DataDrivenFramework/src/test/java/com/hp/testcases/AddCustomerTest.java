package com.hp.testcases;


	


	import org.openqa.selenium.Alert;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.testng.Assert;
	
	import org.testng.annotations.Test;

	import com.hp.base.TestBase;
	import com.hp.utilities.TestUtil;

	public class AddCustomerTest extends TestBase {
		
		
		@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
		public void addCustomerTest(String firstname, String lastname, String postcode, String alerttext ) throws InterruptedException{
			
			
			
			
			click("addCustBtn_CSS");
			type("firstname_CSS",firstname);
			type("lastname_CSS", lastname);
			type("postcode_CSS",postcode);
			click("addbtn_CSS");


			Thread.sleep(2000);
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			
			Assert.assertTrue(alert.getText().contains (alerttext));
			alert.accept();
			
			Thread.sleep(2000);
			
		}
		
		

	}



