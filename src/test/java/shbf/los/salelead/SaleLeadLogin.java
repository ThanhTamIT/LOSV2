package shbf.los.salelead;

import com.aventstack.extentreports.Status;
import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.salelead.SaleLeadHomePageObject;
import pageobjects.salelead.SaleLeadLoginPageObject;
import reportconfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.URL_SALE;
import static org.testng.Assert.assertTrue;

public class SaleLeadLogin extends BaseTest {
    private String account, accountInvalid, password, passwordInvalid;
    private String browserName;
    private SaleLeadLoginPageObject saleLeadLoginPage;
    private SaleLeadHomePageObject saleLeadHomePage;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        saleLeadLoginPage = new SaleLeadLoginPageObject(URL_SALE);
        account = "sale.lead1";
        accountInvalid = "a";
        password = "It123456";
        passwordInvalid = "a";
    }

    @Test
    public void loginEmptyData(Method method) {
        ExtentTestManager.startTest(method.getName(), "Input Empty Data");
        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 01: Input Empty Account Textbox");
        saleLeadLoginPage.inputToAccountTextbox("");

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 02: Input Empty Password Textbox");
        saleLeadLoginPage.inputToPasswordTextbox("");

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 04: Click Button Login");
        saleLeadLoginPage.clickToLoginButton();

        assertTrue(saleLeadLoginPage.isTemporalMessageWarningDisplayed());
    }

    @Test
    public void loginInvalidData(Method method) {
        ExtentTestManager.startTest(method.getName(), "Input Invalid Data");
        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 01: Input Invalid Account Textbox");
        saleLeadLoginPage.inputToAccountTextbox(accountInvalid);

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 02: Input Invalid Password Textbox");
        saleLeadLoginPage.inputToPasswordTextbox(passwordInvalid);

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 04: Click Button Login");
        saleLeadLoginPage.clickToLoginButton();

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 04: Check Popup Error Displayed");
        assertTrue(saleLeadLoginPage.isTemporalMessageWarningDisplayed());
    }

    @Test
    public void loginSuccess(Method method) {
        ExtentTestManager.startTest(method.getName(), "Login Success");
        ExtentTestManager.getTest().log(Status.INFO, "Login Success");
        saleLeadHomePage = saleLeadLoginPage.goToLogin(account, password);
        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 01: Check Go To The Homepage");
        assertTrue(saleLeadHomePage.getTextAccount().contains(account));
    }
}
