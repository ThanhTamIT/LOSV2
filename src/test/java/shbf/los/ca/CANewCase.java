package shbf.los.ca;

import static commons.GlobalConstants.PROJECT_PATH;
import static commons.GlobalConstants.URL_MASTER;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commons.BaseTest;
import pageobject.ca.CAPageObject;
import pageobject.cb.CBPageObject;
import pageobject.dc.DCPageObject;
import pageobjects.sale.SaleHomePageObject;
import pageobjects.sale.SaleLoginPageObject;
import reportconfig.ExtentTestManager;

public class CANewCase extends BaseTest {
	
	private DCPageObject dcPageObject;
	private SaleLoginPageObject saleLoginPage;
	private SaleHomePageObject saleHomePage;
	private CBPageObject cbPageObject;
	private CAPageObject caPageObject;
	private String browserName;
	private String  bill1,  bill2,  bill3,  passportNumber,  idCardNumberOther,  passpord,  passpordComment,  martialStatus,  mobilePhone,
	 mobilePhoneDuration,  mobilePhoneDurationOther,  mobilePhoneOther,  education,  email,  livingTimeInMonth,  livingTimeInYear,
	 temporaryAddressStreet,  accomodationType,  job,  companyName,  companyPhoneNumber,  companyPhoneNumberExt,  companyTaxNumber,
	 customerExpense,  customerMainIncome,  department,  position,  bussinessAddress,  salaryMonthRevice,  salaryPaymentType,
	 labourContractType,  workingInMonth,  workingInYear,  experienceInMonth,  experienceInYear,  numberOfDependant,  incomeResource,  industry,
	 re1FullName,  re1MobilePhone,  re1Relationship,  re2FullName,  re2MobilePhone,  re2Relationship, s37CINumberSpouse,  s37ResultSpouse,
	 s37UpdateDateSpouse,  spouseCompanyName,  spouseCompanyPhoneNumber,spouseIdCardNumber,  spouseInCome,  spouseMobliePhone,  spouseName, account, password,
	 itemPCBResult, numberContractPending, numberContractReject, numberContractCancel, numberContractComplete, numberOverDueDay, numberOverDueLoanAmount,
	 numberOverDueDayMax, numberOverDueLoanAmountMax, numberOverDueDateMax, numberReQuestIn3Month, numberRejectIn3Month, numberRejectIn6Month, numberRequestIn6Month,
	 numberPCB, numberOtherPCB, loanAmountST, emist, termst, loanAmountMT, emimt, termmt, otherLoanAmountST, otherEmist, otherTermst, otherLoanAmountMT, otherEmiMT,
	 otherTermMT, creditCardLoanAmount, pcbScoreOption, pcbScaleScoreOption, riskassesmentOption, pcbUpdateDate, CICDrdOption,  img1PCBPath,  img2PCBPath,  img1CICPath,
	 img2CICPath,emimtBank,  emimtOther,  emistBank,  emistOther,  loanConsumerCA,  loanTermCA, caDescision,  commentCA,  creditHistory,  customerEmimtFC,  customerEmistFC,
	 taxCodeResult,  socialNetworkResult,  healtInsuranceResult,  s37PCBRelative;
     
	  
			

	 @BeforeClass
		public void beforeClass() {
			browserName = "chrome";
			account = "calv1";
			password = "IT123456";
			saleLoginPage = new SaleLoginPageObject(URL_MASTER);
			dcPageObject = new DCPageObject();
			cbPageObject = new CBPageObject();
			caPageObject = new CAPageObject();
			bill1 = "300.000";
			bill2 = "300.000";
			bill3 = "300.000";
			passportNumber ="0123345";
			idCardNumberOther = "021321";
			passpord = "Sổ hộ khẩu";
			passpordComment = "09321932";
			martialStatus = "Độc thân";
			education = "Đại học";
			mobilePhone = "0912393222";
			mobilePhoneDuration = "02";
			mobilePhoneOther = "0923109321";
			mobilePhoneDurationOther = "02";
			email = "test@gmail.com";
			temporaryAddressStreet = "gelex tower";
			livingTimeInMonth = "02";
			livingTimeInYear = "02";
			accomodationType = "Nhà riêng";
			job = "Cán bộ doanh nghiệp tư";
			companyName = "SHB";
			department = "tech";
			position = "Trưởng nhóm/Quản đốc";
			industry = "Dịch vụ lưu trú và ăn uống";
			companyPhoneNumber = "0993210932";
			companyPhoneNumberExt = "2312";
			companyTaxNumber = "4123213141";
			bussinessAddress = "Nhà sở hữu chung";
			salaryPaymentType = "Qua tài khoản SHB";
			salaryMonthRevice = "05";
			labourContractType = "< 1 năm";
			workingInMonth = "05";
			workingInYear = "05";
			experienceInMonth = "05";
			experienceInYear = "05";
			customerMainIncome = "50.000.000";
			numberOfDependant = "02";
			customerExpense = "2.000.000";
			incomeResource = "Thu nhập làm thêm/hoa hồng";
			re1FullName = "test1";
			re1MobilePhone = "0993210932";
			re1Relationship = "Chủ nhà trọ";
			re2FullName = "test2";
			re2MobilePhone = "0993210932";
			re2Relationship = "Chủ nhà trọ";
			spouseName = "tessttt";
			spouseMobliePhone = "0993210932";
			spouseIdCardNumber = "9283121";
			spouseInCome = "30.000.000";
			spouseCompanyName ="SHBFC";
			spouseCompanyPhoneNumber = "0993210932";
			s37ResultSpouse = "Đang có dư nợ, KHÔNG có nợ xấu hay nợ cần chú ý";
			s37CINumberSpouse = "2222";
			s37UpdateDateSpouse = "04/10/2023";
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
			taxCodeResult = "Không có thông tin MST";
			socialNetworkResult = "Có thông tin";
			healtInsuranceResult = "Trùng thông tin KH";
			s37PCBRelative = "testttt";
			emimt = "391203";
			emimtBank = "8319283";
			emistBank = "9302193";
			customerEmimtFC = "8923813";
			customerEmistFC = "461264";
			emimtOther = "0214";
			emistOther = "3012903";
			loanConsumerCA = "20.000.000";
			loanTermCA = "18 tháng";
			creditHistory = "Khách hàng mới";
			caDescision = "Đồng ý cho vay";
			commentCA = "testt";	
	 }
			
	@Test
	public void CANewCase (Method method) {
		ExtentTestManager.startTest(method.getName(), "CB Create New Case");
		
		 ExtentTestManager.getTest().log(Status.INFO, "Step : Login Success");
	     saleHomePage = saleLoginPage.loginSuccess(account, password);
	     
	     ExtentTestManager.getTest().log(Status.INFO, "Step : Login Success");
	     dcPageObject.testClickData();
	     
	     ExtentTestManager.getTest().log(Status.INFO, "Step : Check Evaluate Loan Purpose");
	     caPageObject.evaluateLoanPurpose(bill1, bill2, bill3);
	     
	     ExtentTestManager.getTest().log(Status.INFO, "Step : Check Personal Infonrmation");
	     caPageObject.verifyPersonalInformation(passportNumber, idCardNumberOther, passpord, passpordComment, martialStatus, mobilePhone, mobilePhoneDuration, mobilePhoneDurationOther, mobilePhoneOther, education, email, livingTimeInMonth, livingTimeInYear, temporaryAddressStreet, accomodationType);
	     
	     ExtentTestManager.getTest().log(Status.INFO, "Step : Check Appraisal Of Income And Expenditure");
	     caPageObject.appraisalOfIncomeAndExpenditure(job, companyName, companyPhoneNumber, companyPhoneNumberExt, companyTaxNumber, customerExpense, customerMainIncome, department, position, bussinessAddress, salaryMonthRevice, salaryPaymentType, labourContractType, workingInMonth, workingInYear, experienceInMonth, experienceInYear, numberOfDependant, incomeResource, industry);
	
	     ExtentTestManager.getTest().log(Status.INFO, "Step : Check Evaluate References");
	     caPageObject.evaluateReferences(re1FullName, re1MobilePhone, re1Relationship, re2FullName, re2MobilePhone, re2Relationship);
	     
	     ExtentTestManager.getTest().log(Status.INFO, "Step : Check Access Family Information");
	     caPageObject.accessFamilyInformation(s37CINumberSpouse, s37ResultSpouse, s37UpdateDateSpouse, spouseCompanyName, spouseCompanyPhoneNumber, spouseIdCardNumber, spouseInCome, spouseMobliePhone, spouseName);
	
	     ExtentTestManager.getTest().log(Status.INFO, "Step : Check PCB Result");
         caPageObject.PCBResult(itemPCBResult, numberContractPending, numberContractReject, numberContractCancel, numberContractComplete, numberOverDueDay, numberOverDueLoanAmount, numberOverDueDayMax, numberOverDueLoanAmountMax, numberOverDueDateMax, numberReQuestIn3Month, numberRejectIn3Month, numberRejectIn6Month, numberRequestIn6Month, numberPCB, numberOtherPCB, loanAmountST, emist, termst, loanAmountMT, emimt, termmt, otherLoanAmountST, otherEmist, otherTermst, otherLoanAmountMT, otherEmiMT, otherTermMT, creditCardLoanAmount, pcbScoreOption, pcbScaleScoreOption, riskassesmentOption, pcbUpdateDate);	
         
         ExtentTestManager.getTest().log(Status.INFO, "Step : Check CIC Result");
         caPageObject.CICResult(CICDrdOption, img1PCBPath, img2PCBPath, img1CICPath, img2CICPath);
         
         ExtentTestManager.getTest().log(Status.INFO, "Step : Check Addditional ApparaisalInformation");
         caPageObject.additionalApparaisalInformation(taxCodeResult, socialNetworkResult, healtInsuranceResult, s37PCBRelative);
         
         ExtentTestManager.getTest().log(Status.INFO, "Step : Check Conclude CA");
         caPageObject.concludeCA(emimtBank, emimtOther, emistBank, emistOther, loanConsumerCA, loanTermCA, caDescision, commentCA, creditHistory, customerEmimtFC, customerEmistFC);
         
         ExtentTestManager.getTest().log(Status.INFO, "Step : Click Button Complete");
         cbPageObject.clickButtonComplete();
         
	     ExtentTestManager.getTest().log(Status.INFO, "Step 07: Click Button Continue");
	     dcPageObject.clickContinueButton();
	
	}	
}
		

