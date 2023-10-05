package shbf.los.de;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commons.BasePageUI;
import commons.BaseTest;
import commons.GlobalConstants;
import commons.GlobalConstants.*;
import pageobjects.de.DeNewcasePageObject;
import reportconfig.ExtentTestManager;

public class FCreateNewCaseDE extends BaseTest {
	private String browserName;
	 private String account, password;
	 private DeNewcasePageObject deNewcasePageObject;

	 @BeforeClass
	    public void beforeClass() {
	        browserName = "chrome";
	        deNewcasePageObject = new DeNewcasePageObject();
	        account = "de1";
	        password = "123456";	        
	    }
	 
	 @Test
	    public void createNewCaseSuccess(Method method) {
	        ExtentTestManager.startTest(method.getName(), "Create New Case");
	        ExtentTestManager.getTest().log(Status.INFO, "Step 01: Login Success");
	        deNewcasePageObject.openPageUrl(GlobalConstants.URL_LOS_MASTER);
	        deNewcasePageObject.loginToSystem(account, password);
	        
	        ExtentTestManager.getTest().log(Status.INFO, "Step 02: Verify login success");
	        assertTrue(deNewcasePageObject.getElementText(BasePageUI.ACCOUNT_DYNAMIC).contains(account));
	        
	        ExtentTestManager.getTest().log(Status.INFO, "Step 03: Double click to APP_CODE expect");
	        deNewcasePageObject.clickToAppCodeExpect("DS9CF942310040021720");
	        
	        ExtentTestManager.getTest().log(Status.INFO, "Step 02: Input From Infomation about the loan applicant");
	        
	        deNewcasePageObject.inputFormInfoAboutTheLoanApplicant();


	        

	       
	    }

}
