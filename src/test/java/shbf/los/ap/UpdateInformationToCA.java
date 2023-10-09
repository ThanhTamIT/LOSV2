package shbf.los.ap;

import com.aventstack.extentreports.Status;
import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.ap.APHomePageObject;
import pageobjects.ap.APLoginPageObject;
import pageobjects.ap.UpdateInformationToCAPageObject;
import reportconfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.*;
import static org.testng.Assert.assertTrue;

public class UpdateInformationToCA extends BaseTest {
    private String account, password, vhAccommodationTypeText, vhHomeTypeText, livingTimeInYear, livingTimeInMonth,
            videoCallLocateIMG, extraMiningVoucherIMG, apCreditHistory, apDecision;
    private String browserName;
    private APLoginPageObject apLoginPage;
    private APHomePageObject apHomePage;
    private UpdateInformationToCAPageObject updateInformationToCAPage;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        apLoginPage = new APLoginPageObject(URL_LOS_MASTER);
        account = "aplv1";
        password = "123456";
        vhAccommodationTypeText = "Nhà riêng";
        vhHomeTypeText = "Căn hộ chung cư/ tập thể";
        livingTimeInYear = "5";
        livingTimeInMonth = "5";
        videoCallLocateIMG = PROJECT_PATH + "\\uploadFiles\\Face.jpg";
        extraMiningVoucherIMG = PROJECT_PATH + "\\uploadFiles\\Face.jpg";
        apCreditHistory = "Khách hàng mới";
        apDecision = "Đồng ý cho vay";
    }

    @Test
    public void updateInformationToCASuccess(Method method) {
        ExtentTestManager.startTest(method.getName(), "Update Information To CA Success");
        ExtentTestManager.getTest().log(Status.INFO, "Step 01: Login Success");
        apHomePage = apLoginPage.goToLoginSuccess(account, password);

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 02: Check Go To The Homepage");
        assertTrue(apHomePage.getTextAccount().contains(account));

        /* Todo
        ExtentTestManager.getTest().log(Status.INFO, "Step 03: Go To Unassigned Page");
        updateInformationToCAPage = apHomePage.clickToIconCasesSelfServiceCase();

        ExtentTestManager.getTest().log(Status.INFO, "Step 04: Go To Update Information Page");
        updateInformationToCAPage.goToUpdateInfoPage(APP_CODE);
         */

        ExtentTestManager.getTest().log(Status.INFO, "Step 04: Go To Update Information Page");
        updateInformationToCAPage = apHomePage.clickToIconCasesSelfInboxCase();
        updateInformationToCAPage.goToUpdateInfoPageTest();
        updateInformationToCAPage.updateDataInfo(vhAccommodationTypeText, vhHomeTypeText, livingTimeInYear, livingTimeInMonth,
                videoCallLocateIMG, extraMiningVoucherIMG, apCreditHistory, apDecision);
        apHomePage = updateInformationToCAPage. clickContinueButton();
    }
}
