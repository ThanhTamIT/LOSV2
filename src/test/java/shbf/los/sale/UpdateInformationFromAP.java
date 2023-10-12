package shbf.los.sale;

import com.aventstack.extentreports.Status;
import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.sale.SaleHomePageObject;
import pageobjects.sale.SaleLoginPageObject;
import pageobjects.sale.UpdateInformationToAPPageObject;
import reportconfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.*;
import static org.testng.Assert.assertTrue;

public class UpdateInformationFromAP extends BaseTest {
    private String account, password, appCode, approve, creditContractSignedLater, identityCardSignedLater, customerAndStaffPhotoSignedLater;
    private String browserName;
    private SaleLoginPageObject saleLoginPage;
    private SaleHomePageObject saleHomePage;
    private UpdateInformationToAPPageObject updateInformationToAPPage;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        saleLoginPage = new SaleLoginPageObject(URL_SALE);
        account = "sale1";
        password = "It123456";
        creditContractSignedLater = PROJECT_PATH + "\\uploadFiles\\Front.jpg";
        identityCardSignedLater = PROJECT_PATH + "\\uploadFiles\\Front.jpg";
        customerAndStaffPhotoSignedLater = PROJECT_PATH + "\\uploadFiles\\Front.jpg";
        appCode = APP_CODE;
        approve = "Đồng ý ký hợp đồng";
    }

    @Test
    public void updateInformationSuccess(Method method) {
        ExtentTestManager.startTest(method.getName(), "Create New Case");
        ExtentTestManager.getTest().log(Status.INFO, "Step 01: Login Success");
        saleHomePage = saleLoginPage.goToLoginSuccess(account, password);
        ExtentTestManager.getTest().log(Status.INFO, "Step 02: Check Go To The Homepage");
        assertTrue(saleHomePage.getTextAccount().contains(account));

        ExtentTestManager.getTest().log(Status.INFO, "Step 03: Go To Update Information To AP Page");
        updateInformationToAPPage = saleHomePage.goToUpdateInformationToAPPage(appCode);

        ExtentTestManager.getTest().log(Status.INFO, "Step 04: Update Information To AP Page");
        updateInformationToAPPage.updateDataInfo(approve, creditContractSignedLater, identityCardSignedLater, customerAndStaffPhotoSignedLater);

        ExtentTestManager.getTest().log(Status.INFO, "Step 05: Click Continue Button");
        saleHomePage = updateInformationToAPPage.clickContinueButton();
    }
}
