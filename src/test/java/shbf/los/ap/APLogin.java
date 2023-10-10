package shbf.los.ap;

import com.aventstack.extentreports.Status;
import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.ap.APHomePageObject;
import pageobjects.ap.APLoginPageObject;
import reportconfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.*;
import static org.testng.Assert.assertTrue;

public class APLogin extends BaseTest {
    private String account, accountInvalid, password, passwordInvalid;
    private String browserName;
    private APLoginPageObject apLoginPage;
    private APHomePageObject apHomePage;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        apLoginPage = new APLoginPageObject(URL_LOS_MASTER);
        account = "aplv1";
        accountInvalid = "a";
        password = "123456";
        passwordInvalid = "a";
    }

    @Test
    public void loginEmptyData(Method method) {
        ExtentTestManager.startTest(method.getName(), "Input Empty Data");
        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 01: Input Empty Account Textbox");
        apLoginPage.inputToAccountTextbox("");

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 02: Input Empty Password Textbox");
        apLoginPage.inputToPasswordTextbox("");

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 03: Click Button Login");
        apLoginPage.clickToLoginButton();

        assertTrue(apLoginPage.isTemporalMessageWarningDisplayed());
    }

    @Test
    public void loginInvalidData(Method method) {
        ExtentTestManager.startTest(method.getName(), "Input Invalid Data");
        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 01: Input Invalid Account Textbox");
        apLoginPage.inputToAccountTextbox(accountInvalid);

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 02: Input Invalid Password Textbox");
        apLoginPage.inputToPasswordTextbox(passwordInvalid);

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 03: Click Button Login");
        apLoginPage.clickToLoginButton();

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 04: Check Popup Error Displayed");
        assertTrue(apLoginPage.isTemporalMessageWarningDisplayed());
    }

    @Test
    public void loginSuccess(Method method) {
        ExtentTestManager.startTest(method.getName(), "Login Success");
        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 01: Input Valid Account And Password");
        apHomePage = apLoginPage.goToLoginSuccess(account, password);

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 02: Check Go To The Homepage");
        assertTrue(apHomePage.getTextAccount().contains(account));
    }
}
