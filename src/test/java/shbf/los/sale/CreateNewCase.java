package shbf.los.sale;

import com.aventstack.extentreports.Status;
import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.sale.*;
import reportconfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.BasePage.getRandomInt;
import static commons.GlobalConstants.*;
import static org.testng.Assert.assertTrue;

public class CreateNewCase extends BaseTest {
    private String account, password, frontIDCartIMG, frontIDCartText, backIDCartIMG,
            backIDCartText, fullFaceIMG, fullFaceText, iDCardIssue, idCard, mobilePhone, temporaryAddressProvince,
            temporaryAddressDistrict, productCategory, schemeProduct, billType, billOwner, customerCodeBill,
            billAmount1, billAmount2, billAmount3, loanConsumer, loanTerm, applicationDate, saleDecision,
            pOADocument, customerAndStaffPhoto, customerPhotoInsideHouse, customerPhotoFrontHouse, serviceBill;
    private String browserName;
    private SaleLoginPageObject saleLoginPage;
    private SaleHomePageObject saleHomePage;
    private NewCaseHomePageObject createNewCaseHomePage;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        saleLoginPage = new SaleLoginPageObject(URL_SALE);
        account = "sale1";
        password = "It123456";
        frontIDCartIMG = PROJECT_PATH + "\\uploadFiles\\Front.jpg";
        frontIDCartText = "Mặt trước CMND/CCCD";
        backIDCartIMG = PROJECT_PATH + "\\uploadFiles\\Back.jpg";
        backIDCartText = "Mặt sau CMND/CCCD";
        fullFaceIMG = PROJECT_PATH + "\\uploadFiles\\Face.jpg";
        fullFaceText = "Ảnh khách hàng";
        iDCardIssue = "An Giang";
        idCard = "0380970" + getRandomInt();
        mobilePhone = "09150" + getRandomInt();
        temporaryAddressProvince = "An Giang";
        temporaryAddressDistrict = "Huyện An Phú";
        productCategory = "Bill Facilities";
        schemeProduct = "BF03";
        billType = "Hóa đơn điện";
        billOwner = "Khách hàng";
        customerCodeBill = getRandomInt();
        billAmount1 = "2000000";
        billAmount2 = "2000000";
        billAmount3 = "2000000";
        loanConsumer = "20000000";
        loanTerm = "6 tháng";
        applicationDate = getCurrentDate();
        saleDecision = "Chuyển lên bước tiếp theo";
        pOADocument = "Chứng từ chứng minh cư trú (POA)";
        customerAndStaffPhoto = "Ảnh chụp khách hàng và nhân viên kinh doanh";
        customerPhotoInsideHouse = "Ảnh chụp Khách hàng đứng trong nhà";
        customerPhotoFrontHouse = "Ảnh chụp Khách hàng đứng trước nhà";
        serviceBill = "Hóa đơn dịch vụ";
    }

    @Test
    public void createNewCaseSuccess(Method method) {
        ExtentTestManager.startTest(method.getName(), "Create New Case");
        ExtentTestManager.getTest().log(Status.INFO, "Step 01: Login Success");
        saleHomePage = saleLoginPage.goToLoginSuccess(account, password);
        ExtentTestManager.getTest().log(Status.INFO, "Step 02: Check Go To The Homepage");
        assertTrue(saleHomePage.getTextAccount().contains(account));

        ExtentTestManager.getTest().log(Status.INFO, "Step 03: Go To New Case Page");
        createNewCaseHomePage = saleHomePage.clickToIconCasesStartCase();

        ExtentTestManager.getTest().log(Status.INFO, "Step 04: Click Customer Base Pricing - Sale (Sale Input Data And Upload Document)");
        createNewCaseHomePage.clickToCustomerBasePricing();

        ExtentTestManager.getTest().log(Status.INFO, "Step 05: Input ID Cart - Click Complete Button");
        createNewCaseHomePage.inputIDCard(frontIDCartIMG, frontIDCartText, backIDCartIMG, backIDCartText, fullFaceIMG, fullFaceText);
        APP_CODE = createNewCaseHomePage.getTextAppCode();
        createNewCaseHomePage.clickCompleteButton();
        System.out.println("sale" + APP_CODE);
        ExtentTestManager.getTest().log(Status.INFO, "Step 06: Input Requester Information");
        createNewCaseHomePage.inputRequesterInformation(idCard, iDCardIssue, mobilePhone, temporaryAddressProvince, temporaryAddressDistrict);

        ExtentTestManager.getTest().log(Status.INFO, "Step 07: Input Loan Application Information 01");
        createNewCaseHomePage.inputLoanAppInformation1(productCategory, schemeProduct, billType, billOwner, customerCodeBill, billAmount1, billAmount2, billAmount3);

        ExtentTestManager.getTest().log(Status.INFO, "Step 08: Input Loan Application Information 02");
        createNewCaseHomePage.inputLoanAppInformation2(loanConsumer, loanTerm, applicationDate, saleDecision);

        ExtentTestManager.getTest().log(Status.INFO, "Step 09: Input Loan Application Information File");
        createNewCaseHomePage.inputLoanAppInformationFile(fullFaceIMG, pOADocument, customerAndStaffPhoto, customerPhotoInsideHouse, customerPhotoFrontHouse, serviceBill);

        ExtentTestManager.getTest().log(Status.INFO, "Step 10: Click Continue Button");
        saleHomePage = createNewCaseHomePage.clickContinueButton();
    }
}
