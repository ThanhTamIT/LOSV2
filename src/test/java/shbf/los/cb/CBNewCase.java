package shbf.los.cb;

import static commons.GlobalConstants.PROJECT_PATH;
import static commons.GlobalConstants.URL_MASTER;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.github.dockerjava.api.model.Driver;

import commons.BaseTest;
import pageobject.cb.CBPageObject;
import pageobject.dc.DCPageObject;
import pageobjects.sale.SaleHomePageObject;
import pageobjects.sale.SaleLoginPageObject;
import reportconfig.ExtentTestManager;

public class CBNewCase extends BaseTest {
	
	private DCPageObject dcPageObject;
	private SaleLoginPageObject saleLoginPage;
	private SaleHomePageObject saleHomePage;
	private CBPageObject cbPageObject;
		
	
	private String  account, password, itemPCBResult, numberContractPending, numberContractReject, numberContractCancel, numberContractComplete,
	 numberOverDueDay,  numberOverDueLoanAmount,  numberOverDueDayMax,  numberOverDueLoanAmountMax,  numberOverDueDateMax,  numberReQuestIn3Month,
     numberRejectIn3Month,  numberRejectIn6Month,  numberRequestIn6Month,  numberPCB,  numberOtherPCB,  loanAmountST,  emist,  termst,
	 loanAmountMT,  emimt,  termmt,  otherLoanAmountST,  otherEmist,  otherTermst,  otherLoanAmountMT,  otherEmiMT,  otherTermMT,
	 creditCardLoanAmount,  pcbScoreOption,  pcbScaleScoreOption,  riskassesmentOption,  pcbUpdateDate,  CICDrdOption,  img1PCBPath,  img2PCBPath,
	 img1CICPath,  img2CICPath,  imgFileS37Path,  concluedeOption,  commentCB;
	private String browserName;
	
	
	@BeforeClass
	public void beforeClass() {
		browserName = "chrome";
		saleLoginPage = new SaleLoginPageObject(URL_MASTER);
		dcPageObject = new DCPageObject();
		cbPageObject = new CBPageObject();
		account = "cb1";
		password = "123456";
		itemPCBResult = "Không có thông tin PCB";
		numberContractPending = "2";
		numberContractReject ="2";
		numberContractComplete = "2";
		numberContractCancel ="2";
		numberOverDueDay = "2";
		numberOverDueLoanAmount = "2";
		numberOverDueDayMax = "2";
		numberOverDueLoanAmountMax = "2";
		numberOverDueDateMax ="2";
		numberReQuestIn3Month ="2";
		numberRejectIn3Month ="2";
		numberRequestIn6Month = "2";
		numberRejectIn6Month ="2";
		numberPCB = "2";
		numberOtherPCB ="2";
		loanAmountST ="2";
		emist ="2";
		termst ="2";
		loanAmountMT = "2";
		emimt = "2";
		termmt = "2";
		otherLoanAmountST = "2";
		otherEmist = "2";
		otherTermMT ="2";
		otherEmiMT = "2";
		creditCardLoanAmount = "2";
		pcbScoreOption = "1 - 378";
		pcbScaleScoreOption = "A";
		riskassesmentOption = "Rủi ro rất thấp";
		pcbUpdateDate = "06/01/2023";
		otherTermst = "2";
		otherLoanAmountMT = "2";
		CICDrdOption = "Không cần tra CIC";
		img1CICPath = PROJECT_PATH + "\\uploadFiles\\dcIMG.jpg";
		img1PCBPath = PROJECT_PATH + "\\uploadFiles\\testIMG.png";
		img2CICPath = PROJECT_PATH + "\\uploadFiles\\testIMG.png";
		img2PCBPath = PROJECT_PATH + "\\uploadFiles\\testIMG.png";
		imgFileS37Path = PROJECT_PATH + "\\uploadFiles\\testIMG.png";
		concluedeOption = "Chuyển TĐ điện thoại";
		commentCB = "tesst";
				
		}
	
	@Test
	public void CBNewCase(Method method) {
		ExtentTestManager.startTest(method.getName(), "CB Create New Case");
		
		 ExtentTestManager.getTest().log(Status.INFO, "Step : Login Success");
	     saleHomePage = saleLoginPage.loginSuccess(account, password);
	     
	     ExtentTestManager.getTest().log(Status.INFO, "Step : Login Success");
	     dcPageObject.testClickData();
	     
	     ExtentTestManager.getTest().log(Status.INFO, "Step1 : Check PCB Result");
	     cbPageObject.PCBResult(itemPCBResult, numberContractPending, numberContractReject, numberContractCancel, numberContractComplete, numberOverDueDay, numberOverDueLoanAmount, numberOverDueDayMax, numberOverDueLoanAmountMax, numberOverDueDateMax, numberReQuestIn3Month, numberRejectIn3Month, numberRejectIn6Month, numberRequestIn6Month, numberPCB, numberOtherPCB, loanAmountST, emist, termst, loanAmountMT, emimt, termmt, otherLoanAmountST, otherEmist, otherTermst, otherLoanAmountMT, otherEmiMT, otherTermMT, creditCardLoanAmount, pcbScoreOption, pcbScaleScoreOption, riskassesmentOption, pcbUpdateDate);
	     
	     ExtentTestManager.getTest().log(Status.INFO, "Step2 : Check CIC Result");
	     cbPageObject.CICResult(CICDrdOption, img1PCBPath   , img2PCBPath, img1CICPath, img2CICPath, imgFileS37Path);

	     ExtentTestManager.getTest().log(Status.INFO, "Step3 : Check conclude CB");
	     cbPageObject.concludeCB(concluedeOption, commentCB);
	  
	     ExtentTestManager.getTest().log(Status.INFO, "Step 06: Click Button Hoan Thanh");
		 cbPageObject.clickButtonComplete();
		 
	     ExtentTestManager.getTest().log(Status.INFO, "Step 07: Click Button Continue");
	     dcPageObject.clickContinueButton();
		 
	}
 }
