package shbf.los.salelead;

import com.aventstack.extentreports.Status;
import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.salelead.SaleLeadHomePageObject;
import pageobjects.salelead.SaleLeadLoginPageObject;
import pageobjects.salelead.UpdateInformationToSalePageObject;
import reportconfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.*;

public class UpdateInformationFromSale extends BaseTest {
    private String account, password, slDecision;
    private String browserName;
    private SaleLeadLoginPageObject saleLeadLoginPage;
    private SaleLeadHomePageObject saleLeadHomePage;
    private UpdateInformationToSalePageObject updateInformationToSalePage;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        saleLeadLoginPage = new SaleLeadLoginPageObject(URL_SALE);
        account = "sale.lead1";
        password = "It123456";
        slDecision = "Đồng ý";
    }

    @Test
    public void updateInformationSuccess(Method method) {
        ExtentTestManager.startTest(method.getName(), "Update Information To Sale");
        ExtentTestManager.getTest().log(Status.INFO, "Step 01: Login Success");
        saleLeadHomePage = saleLeadLoginPage.goToLogin(account, password);

        ExtentTestManager.getTest().log(Status.INFO, "Step 02: Go To Update Information Page");
        updateInformationToSalePage = saleLeadHomePage.goToUpdateInfoPage(APP_CODE);
        System.out.println("into_sale_lead: " + APP_CODE);
        ExtentTestManager.getTest().log(Status.INFO, "Step 03: Check Rule And G oTo Confirm Page");
        updateInformationToSalePage.checkRuleAndGoToConfirmPage(slDecision);

        ExtentTestManager.getTest().log(Status.INFO, "Step 04: Click Continue Button");
        saleLeadHomePage = updateInformationToSalePage.clickContinueButton();
    }
}
