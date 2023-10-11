package pageuis.cb;

public class CBPageUI {
	
	//Block Ket Qua PCB
	public static final String BTN_CHECK_PCB = "//button[@id='form[btnGetPCBContract]']";
	public static final String BTN_VIEW_PCB = "//button[@id='form[btnViewPCBContract]']";
	public static final String RDO_PCB_YES = "//span[text()='Đã có kết quả PCB']//preceding-sibling::input";
	public static final String RDO_PCB_NO = "//span[text()='Chưa có kết quả PCB']//preceding-sibling::input";
	public static final String EDT_CONTRACT_PENDING = "//input[@id='form[pcbContractPending]']";
	public static final String DRD_PCB_RESULT = "//select[@id='form[pcbResult]']";
	public static final String EDT_PCB_CONTRACT_CANCEL = "//input[@id='form[pcbContractCancel]']";
	public static final String EDT_PCB_OVERDUEDAY_NUMBER = "//input[@id='form[pcbOverdueDayNumber]']";
	public static final String EDT_PCB_OVERDUEDAYMAX_NUMBER ="//input[@id='form[pcbOverdueDayMax]']";
	public static final String EDT_PCB_OVERDUEDATEMAX = "//input[@id='form[pcbOverdueDateMax]']";
	public static final String EDT_PCB_NUMBER_REQUEST_IN_3_MONTH = "//input[@id='form[pcbFCNumberRequestIn3Month]']";
	public static final String EDT_PCB_NUMBER_REQUEST_IN_6_MONTH = "//input[@id='form[pcbFCNumberRequestIn6Month]']";
	public static final String EDT_PCB_CONTRACT_REJECT = "//input[@id='form[pcbContractReject]']";
	public static final String EDT_PCB_CONTRACT_COMPLETE = "//input[@id='form[pcbContractComplete]']";
	public static final String EDT_PCB_OVER_DUE_LOAN_AMOUNT = "//input[@id='form[pcbOverdueLoanAmount]']";
	public static final String EDT_PCB_OVER_DUE_LOAN_AMOUNT_MAX = "//input[@id='form[pcbOverdueLoanAmountMax]']";
	public static final String EDT_PCB_NUMBER_REJECT_IN_3_MONTH = "//input[@id='form[pcbFCNumberRejectIn3Month]']";
	public static final String EDT_PCB_NUMBER_REJECT_IN_6_MONTH = "//input[@id='form[pcbFCNumberRejectIn6Month]']";
	public static final String EDT_PCB_NUMBER = "//input[@id='form[pcbFCNumber]']";
	public static final String EDT_PCB_OTHER_NUMBER = "//input[@id='form[pcbOtherNumber]']";
	public static final String EDT_PCB_LOAN_AMOUNTST = "//input[@id='form[pcbFCLoanAmountST]']";
	public static final String EDT_PCB_EMIST = "//input[@id='form[pcbFCEmiST]']";
	public static final String EDT_PCB_TERMST = "//input[@id='form[pcbFCTermST]']";
	public static final String EDT_PCB_LOAN_AMOUNTMT = "//input[@id='form[pcbFCLoanAmountMT]']";
	public static final String EDT_PCB_EMIMT = "//input[@id='form[pcbFCEmiMT]']";
	public static final String EDT_PCB_TERMMT = "//input[@id='form[pcbFCTermMT]']";
	public static final String EDT_PCB_OTHER_LOAN_AMOUNT_ST = "//input[@id='form[pcbOtherLoanAmountST]']";
	public static final String EDT_PCB_OTHER_EMIST = "//input[@id='form[pcbOtherEmiST]']";
	public static final String EDT_PCB_OTHER_TERMST = "//input[@id='form[pcbOtherTermST]']";
	public static final String EDT_PCB_OTHER_LOAN_AMOUNTMT = "//input[@id='form[pcbOtherLoanAmountMT]']";
	public static final String EDT_PCB_OTHER_EMIMT = "//input[@id='form[pcbOtherEmiMT]']";
	public static final String EDT_PCB_OTHER_TERMMT = "//input[@id='form[pcbOtherTermMT]']";
	public static final String EDT_PCB_CREDIT_CARD_LOAN_AMOUNT = "//input[@id='form[pcbCreditCardLoanAmount]']";
	public static final String DRD_PCB_SCORE = "//select[@id='form[pcbScore]']";
	public static final String DRD_PCB_SCALE_SCORE = "//select[@id='form[pcbScaleScore]']";
	public static final String DRD_PCB_RISKASSESMENT = "//select[@id='form[riskAssessment]']";
	public static final String EDT_PCB_UPDATE_DATE = "//input[@id='form[pcbUpdateDate]']";
	
	//Block Ket Qua CIC 
	public static final String BTN_SUGGEST_GET_R11 = "//button[@id='form[btnSuggestGetR11]']";
	public static final String RDO_CIC_H2H = "//span[text()='CIC_H2H']//preceding-sibling::input";
	public static final String RDO_WEB = "//span[text()='WEB']//preceding-sibling::input";
	public static final String DRD_CIC_RESULT = "//select[@id='form[hasCICResult]']";
	public static final String CHECKBOX_FC_MCREDIT = "//input[@id='form[customerCIDebt][FC_MCREDIT]']";
	public static final String CHECKBOX_BANK_OCB = "//input[@id='form[customerCIDebt][BANK_OCB]']";
	public static final String CHECKBOX_OTHER = "//input[@id='form[customerCIDebt][OTHER]']";
	public static final String CHECKBOX_NO_DEBT = "//input[@id='form[customerCIDebt][NO_DEBT]']";
	public static final String INPUT_PCB_RESULT_IMG1 = "//form[@id='CreditBureauOtherPCBResultPhoto']";
	public static final String INPUT_PCB_RESULT_IMG1x = "//form[@id='CreditBureauOtherPCBResultPhoto']//input";
	public static final String INPUT_PCB_RESULT_IMG2 = "//form[@id='CreditBureauPCBResultPhoto']//input";
	public static final String INPUT_CIC_RESULT_IMG1 = "//form[@id='CreditBureauCICResultPhoto']//input";
	public static final String INPUT_CIC_RESULT_IMG2 = "//form[@id='CreditBureauOtherCICResultPhoto']//input";
	public static final String INPUT_FILE_S37_IMG = "//form[@id='CreditBureauFileS37']//input";
	public static final String INPUT_PCB_RESULT_IMG1x_NAME = "//form[@id='CreditBureauOtherPCBResultPhoto']//a";
	public static final String INPUT_PCB_RESULT_IMG2_NAME = "//form[@id='CreditBureauOtherPCBResultPhoto']//a";
	public static final String INPUT_CIC_RESULT_IMG1_NAME = "//form[@id='CreditBureauOtherPCBResultPhoto']//a";
	public static final String INPUT_CIC_RESULT_IMG2_NAME = "//form[@id='CreditBureauOtherPCBResultPhoto']//a";
	public static final String INPUT_FILE_S37_IMG_NAME = "//form[@id='CreditBureauFileS37']//a";
	public static final String PCB_RESULT_IMG1 = "//form[@id='CreditBureauOtherPCBResultPhoto']//div[@class='col-sm-12 fileupload-progress fade']";
	public static final String PCB_RESULT_IMG2 = "//form[@id='CreditBureauPCBResultPhoto']//div[@class='col-sm-12 fileupload-progress fade']";
	public static final String CIC_RESULT_IMG1 = "//form[@id='CreditBureauCICResultPhoto']//div[@class='col-sm-12 fileupload-progress fade']";
	public static final String CIC_RESULT_IMG2 = "//form[@id='CreditBureauOtherCICResultPhoto']//div[@class='col-sm-12 fileupload-progress fade']";
	public static final String FILE_S37_IMG = "//form[@id='CreditBureauFileS37']//div[@class='col-sm-12 fileupload-progress fade']";
			
	
	
	
	
	
	//Block Ket Luan 
	public static final String BTN_SYSTEM_SUGGEST = "//button[@id='form[btnSuggest]']";
	public static final String BTN_OK = "//button[text()='OK']";
	public static final String DRD_OPINION_CB = "//select[@id='form[cbDecision]']";
	public static final String EDT_COMMENT_CB = "//textarea[@id='form[cbComment]']";
	public static final String BTN_SAVE = "//button[@id='form[btnSave]']";
	public static final String BTN_COMPLETE = "//span[text()=' Hoàn thành ']";
	
}
