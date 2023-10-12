package shbf.los.dc;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commons.BaseTest;
import pageobjects.dc.DCPageObject;
import pageobjects.sale.SaleHomePageObject;
import pageobjects.sale.SaleLoginPageObject;
import reportconfig.ExtentTestManager;

import static commons.GlobalConstants.*;

public class DCNewCase extends BaseTest {

    private DCPageObject dcPageObject;
    private SaleLoginPageObject saleLoginPage;
    private SaleHomePageObject saleHomePage;
    private String itemDrd, value, imageDC, date, tamperingComment, itemResult, dcComment, itemOpinion, account, password;
    private String browserName;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        saleLoginPage = new SaleLoginPageObject(URL_LOS_MASTER);
        dcPageObject = new DCPageObject();
        itemDrd = "Đang có dư nợ, KHÔNG có nợ xấu hay nợ cần chú ý";
        value = "11";
        imageDC = PROJECT_PATH + "\\uploadFiles\\dcIMG.jpg";
        date = "02/10/2023";
        tamperingComment = "test";
        itemResult = "Chính xác";
        dcComment = "test";
        itemOpinion = "Chuyển bước tiếp theo";
        account = "dc1";
        password = "123456";
    }

    @Test
    public void fillInformaitonDC(java.lang.reflect.Method method) {
        ExtentTestManager.startTest(method.getName(), "DC Create New Case");

        ExtentTestManager.getTest().log(Status.INFO, "Step : Login Success");
        saleHomePage = saleLoginPage.loginToSystem(account, password);

        ExtentTestManager.getTest().log(Status.INFO, "Step : Login Success");
        dcPageObject.testClickData(APP_CODE);

        ExtentTestManager.getTest().log(Status.INFO, "Step 01: Tra Cuu CIC");
        dcPageObject.checkCICS37(itemDrd, value, imageDC, date);

        ExtentTestManager.getTest().log(Status.INFO, "Step 02: Kiem Tra Thong Tin Khoan Vay");
        dcPageObject.checkLoanInformation();

        ExtentTestManager.getTest().log(Status.INFO, "Step 03: Kiem Tra Thong Tin Ho So");
        dcPageObject.fileInformation(itemResult, tamperingComment);

        ExtentTestManager.getTest().log(Status.INFO, "Step 05: Ket Luan");
        dcPageObject.conclude(itemOpinion, dcComment);

        ExtentTestManager.getTest().log(Status.INFO, "Step 06: Click Button Hoan Thanh");
        dcPageObject.clickCompleteButton();

		ExtentTestManager.getTest().log(Status.INFO, "Step 07: Click Button Continue");
		dcPageObject.clickContinueButton();
    }
}
