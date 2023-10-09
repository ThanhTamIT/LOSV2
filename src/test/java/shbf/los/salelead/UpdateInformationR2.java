package shbf.los.salelead;

import com.aventstack.extentreports.Status;
import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.salelead.SaleLeadHomePageObject;
import pageobjects.salelead.SaleLeadLoginPageObject;
import pageobjects.salelead.UpdateInformationR2PageObject;
import reportconfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.APP_CODE;
import static commons.GlobalConstants.URL_SALE;

public class UpdateInformationR2 extends BaseTest {
    private String account, password, approve;
    private String browserName;
    private SaleLeadLoginPageObject saleLeadLoginPage;
    private SaleLeadHomePageObject saleLeadHomePage;
    private UpdateInformationR2PageObject updateInformationR2Page;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        saleLeadLoginPage = new SaleLeadLoginPageObject(URL_SALE);
        account = "sale.lead1";
        password = "It123456";
        approve = "Đồng ý ký hợp đồng";
    }

    @Test
    public void updateInformationSuccess(Method method) {
        ExtentTestManager.startTest(method.getName(), "Update Information To Sale");
        ExtentTestManager.getTest().log(Status.INFO, "Step 01: Login Success");
        saleLeadHomePage = saleLeadLoginPage.goToLogin(account, password);

        ExtentTestManager.getTest().log(Status.INFO, "Step 02: Go To Update Information Page");
        updateInformationR2Page = saleLeadHomePage.goToUpdateInfoR2Page(APP_CODE);

        ExtentTestManager.getTest().log(Status.INFO, "Step 03: Input Decision Upload Contract");
        updateInformationR2Page.inputDecisionUploadContract(approve);

        ExtentTestManager.getTest().log(Status.INFO, "Step 04: Click Continue Button");
        saleLeadHomePage = updateInformationR2Page.clickContinueButton();
    }
}
