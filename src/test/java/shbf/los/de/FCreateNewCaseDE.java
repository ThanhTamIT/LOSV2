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
import pageuis.de.DEPageUI;
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
	        deNewcasePageObject.waitForElementVisible(BasePageUI.CASES_FRAME);
	        
	        ExtentTestManager.getTest().log(Status.INFO, "Step 03: Double click to APP_CODE expect");
	        deNewcasePageObject.clickToAppCodeExpect("DS223812310040021749");
	        
	        ExtentTestManager.getTest().log(Status.INFO, "Step 04: Input From Infomation about the loan applicant");
	        deNewcasePageObject.inputFormInfoAboutTheLoanApplicant("CỤC CẢNH SÁT ĐKQL CƯ TRÚ VÀ DLQG VỀ DÂN CƯ","04/09/2000");
	        
	        ExtentTestManager.getTest().log(Status.INFO, "Step 05: Input From Infomation about the loan applicant");
	        deNewcasePageObject.inputFormInfoLivingAddress("Thị trấn An Phú","Số 10");
	        
	        ExtentTestManager.getTest().log(Status.INFO, "Step 06: Input From Time spent living in current residence");
	        deNewcasePageObject.inputFormTimeSpentLiving("20","10");
	        
	        ExtentTestManager.getTest().log(Status.INFO, "Step 07: Input From info house,marital status, education level  ");
	        deNewcasePageObject.inputFormInfoHouseMaritalStatusEduLevel("Nhà riêng","Độc thân","Cao đẳng");
	        
	        ExtentTestManager.getTest().log(Status.INFO, "Step 08: Input From info JOB");
	        deNewcasePageObject.inputFormInfoJob("Cán bộ doanh nghiệp tư","SHB");
	        
	        ExtentTestManager.getTest().log(Status.INFO, "Step 09: Confirm address");
	        deNewcasePageObject.confirmAdress("Cùng địa chỉ sinh sống","Giống địa chỉ làm việc");
	        
	        ExtentTestManager.getTest().log(Status.INFO, "Step 10: Input Number Phone Company");
	        deNewcasePageObject.inputNumberPhoneCompany("0987897897");
	        
	        ExtentTestManager.getTest().log(Status.INFO, "Step 11: Input experience");
	        deNewcasePageObject.inputExperience("10","10","7","3");
	        
	        ExtentTestManager.getTest().log(Status.INFO, "Step 12: Input position & labour contrac type");
	        deNewcasePageObject.inputPositionAndLabourContractType("Cán bộ quản lý","Từ 1 đến 2 năm");
	        
	        ExtentTestManager.getTest().log(Status.INFO, "Step 13: Input REF people");
	        deNewcasePageObject.inputFirstRefPeople("Nguyen Van A","Bố mẹ đẻ","0923456789","Nguyen Van B","Bố mẹ đẻ","0923450989");
	      
	        ExtentTestManager.getTest().log(Status.INFO, "Step 14: Input Main financial capacity");
	        deNewcasePageObject.inputMainFinancialCapacity("50000000","10000000","0","Tiền mặt");
	        
	        ExtentTestManager.getTest().log(Status.INFO, "Step 15: Checkbox chose The customer currently does not have a loan at a credit institution");
	        deNewcasePageObject.clickToElement(DEPageUI.CBX_HAS_LOAN_OTHER_NO);
	        
	        ExtentTestManager.getTest().log(Status.INFO, "Step 16: Chose loan purpose");
	        deNewcasePageObject.selectItemInDefaultDropdown(DEPageUI.DRD_LOAN_PURPOSE, "Mua sắm phương tiện đi lại");
	        
	        ExtentTestManager.getTest().log(Status.INFO, "Step 17: Chose de decision");
	        deNewcasePageObject.scrollToElement(DEPageUI.DRD_DE_DECISION);
	        deNewcasePageObject.selectItemInDefaultDropdown(DEPageUI.DRD_DE_DECISION, "Chuyển lên bước tiếp theo");

	        ExtentTestManager.getTest().log(Status.INFO, "Step 18: Click button Completed");
	        deNewcasePageObject.scrollToElement(BasePageUI.BTN_COMPLETE);
	        deNewcasePageObject.clickToElement(BasePageUI.BTN_COMPLETE);

	        
	      
	    }

}
