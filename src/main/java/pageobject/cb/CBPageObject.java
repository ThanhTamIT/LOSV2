package pageobject.cb;

import commons.BasePage;
import commons.BasePageUI;
import pageui.cb.CBPageUI;
import pageuis.sale.CreatNewCasePageUI;
import static commons.GlobalConstants.LONG_TIMEOUT2;
import static commons.GlobalConstants.LONG_TIMEOUT;


public class CBPageObject extends BasePage {
	public CBPageObject () {
	}
	
	
	public void PCBResult(String itemPCBResult, String numberContractPending, String numberContractReject, String numberContractCancel, String numberContractComplete,
		String numberOverDueDay, String numberOverDueLoanAmount, String numberOverDueDayMax, String numberOverDueLoanAmountMax, String numberOverDueDateMax, String numberReQuestIn3Month,
	    String numberRejectIn3Month, String numberRejectIn6Month, String numberRequestIn6Month, String numberPCB, String numberOtherPCB, String loanAmountST, String emist, String termst,
		String loanAmountMT, String emimt, String termmt, String otherLoanAmountST, String otherEmist, String otherTermst, String otherLoanAmountMT, String otherEmiMT, String otherTermMT,
		String creditCardLoanAmount, String pcbScoreOption, String pcbScaleScoreOption, String riskassesmentOption, String pcbUpdateDate){
		
		waitForElementVisible(CreatNewCasePageUI.OPEN_CASES_FRAME);
        switchToFrameIframe(CreatNewCasePageUI.OPEN_CASES_FRAME);
		waitForElementVisible(CBPageUI.BTN_CHECK_PCB);
		scrollToElement(CBPageUI.BTN_CHECK_PCB);
		clickToElement(CBPageUI.BTN_CHECK_PCB);
		waitForPMModalLoadingInvisible();
		waitForElementVisible(CBPageUI.RDO_PCB_YES);
		scrollToElement(CBPageUI.RDO_PCB_YES);
		clickToElementByJS(CBPageUI.RDO_PCB_YES);
		waitForElementVisible(CBPageUI.DRD_PCB_RESULT);
		scrollToElement(CBPageUI.DRD_PCB_RESULT);
		selectDropdownByText(CBPageUI.DRD_PCB_RESULT, itemPCBResult); 
		waitForPMModalLoadingInvisible();
		scrollToElement(CBPageUI.EDT_CONTRACT_PENDING);
		waitForElementVisible(CBPageUI.EDT_CONTRACT_PENDING);
		
//		sendKeyToElement(CBPageUI.EDT_CONTRACT_PENDING, numberContractPending);
		sendkeyToElementByJS(CBPageUI.EDT_CONTRACT_PENDING, numberContractPending);
		waitForElementVisible(CBPageUI.EDT_PCB_CONTRACT_REJECT);
		scrollToElement(CBPageUI.EDT_PCB_CONTRACT_REJECT);
		sendKeyToElement(CBPageUI.EDT_PCB_CONTRACT_REJECT, numberContractReject);
		waitForElementVisible(CBPageUI.EDT_PCB_CONTRACT_CANCEL);
		scrollToElement(CBPageUI.EDT_PCB_CONTRACT_CANCEL);
		sendKeyToElement(CBPageUI.EDT_PCB_CONTRACT_CANCEL, numberContractCancel);
		waitForElementVisible(CBPageUI.EDT_PCB_CONTRACT_COMPLETE);
		scrollToElement(CBPageUI.EDT_PCB_CONTRACT_COMPLETE);
		sendKeyToElement(CBPageUI.EDT_PCB_CONTRACT_COMPLETE, numberContractComplete);
		waitForElementVisible(CBPageUI.EDT_PCB_CONTRACT_COMPLETE);
		scrollToElement(CBPageUI.EDT_PCB_CONTRACT_COMPLETE);
		sendKeyToElement(CBPageUI.EDT_PCB_CONTRACT_COMPLETE, numberContractComplete);
		waitForElementVisible(CBPageUI.EDT_PCB_OVERDUEDAY_NUMBER);
		scrollToElement(CBPageUI.EDT_PCB_OVERDUEDAY_NUMBER);
		sendKeyToElement(CBPageUI.EDT_PCB_OVERDUEDAY_NUMBER, numberOverDueDay);
		waitForElementVisible(CBPageUI.EDT_PCB_OVER_DUE_LOAN_AMOUNT);
		scrollToElement(CBPageUI.EDT_PCB_OVER_DUE_LOAN_AMOUNT);
		sendKeyToElement(CBPageUI.EDT_PCB_OVER_DUE_LOAN_AMOUNT, numberOverDueLoanAmount);
		waitForElementVisible(CBPageUI.EDT_PCB_OVERDUEDAYMAX_NUMBER);
		scrollToElement(CBPageUI.EDT_PCB_OVERDUEDAYMAX_NUMBER);
		sendKeyToElement(CBPageUI.EDT_PCB_OVERDUEDAYMAX_NUMBER, numberOverDueDayMax);
		waitForElementVisible(CBPageUI.EDT_PCB_OVER_DUE_LOAN_AMOUNT_MAX);
		scrollToElement(CBPageUI.EDT_PCB_OVER_DUE_LOAN_AMOUNT_MAX);
		sendKeyToElement(CBPageUI.EDT_PCB_OVER_DUE_LOAN_AMOUNT_MAX, numberOverDueLoanAmountMax);
		waitForElementVisible(CBPageUI.EDT_PCB_OVERDUEDATEMAX);
		scrollToElement(CBPageUI.EDT_PCB_OVERDUEDATEMAX);
		sendKeyToElement(CBPageUI.EDT_PCB_OVERDUEDATEMAX, numberOverDueDateMax);
		waitForElementVisible(CBPageUI.EDT_PCB_NUMBER_REQUEST_IN_3_MONTH);
		scrollToElement(CBPageUI.EDT_PCB_NUMBER_REQUEST_IN_3_MONTH);
		sendKeyToElement(CBPageUI.EDT_PCB_NUMBER_REQUEST_IN_3_MONTH, numberReQuestIn3Month);
		waitForElementVisible(CBPageUI.EDT_PCB_NUMBER_REJECT_IN_3_MONTH);
		scrollToElement(CBPageUI.EDT_PCB_NUMBER_REJECT_IN_3_MONTH);
		sendKeyToElement(CBPageUI.EDT_PCB_NUMBER_REJECT_IN_3_MONTH, numberRejectIn3Month);
		waitForElementVisible(CBPageUI.EDT_PCB_NUMBER_REQUEST_IN_6_MONTH);
		scrollToElement(CBPageUI.EDT_PCB_NUMBER_REQUEST_IN_6_MONTH);
		sendKeyToElement(CBPageUI.EDT_PCB_NUMBER_REQUEST_IN_6_MONTH, numberRequestIn6Month);
		waitForElementVisible(CBPageUI.EDT_PCB_NUMBER_REJECT_IN_6_MONTH);
		scrollToElement(CBPageUI.EDT_PCB_NUMBER_REJECT_IN_6_MONTH);
		sendKeyToElement(CBPageUI.EDT_PCB_NUMBER_REJECT_IN_6_MONTH, numberRejectIn6Month);
		waitForElementVisible(CBPageUI.EDT_PCB_NUMBER);
		scrollToElement(CBPageUI.EDT_PCB_NUMBER);
		sendKeyToElement(CBPageUI.EDT_PCB_NUMBER, numberPCB);
		waitForElementVisible(CBPageUI.EDT_PCB_OTHER_NUMBER);
		scrollToElement(CBPageUI.EDT_PCB_OTHER_NUMBER);
		sendKeyToElement(CBPageUI.EDT_PCB_OTHER_NUMBER, numberOtherPCB);
		waitForElementVisible(CBPageUI.EDT_PCB_LOAN_AMOUNTST);
		scrollToElement(CBPageUI.EDT_PCB_LOAN_AMOUNTST);
		sendKeyToElement(CBPageUI.EDT_PCB_LOAN_AMOUNTST, loanAmountST);
		waitForElementVisible(CBPageUI.EDT_PCB_EMIST);
		scrollToElement(CBPageUI.EDT_PCB_EMIST);
		sendKeyToElement(CBPageUI.EDT_PCB_EMIST, emist);
		waitForElementVisible(CBPageUI.EDT_PCB_TERMST);
		scrollToElement(CBPageUI.EDT_PCB_TERMST);
		sendKeyToElement(CBPageUI.EDT_PCB_TERMST, termst);
		waitForElementVisible(CBPageUI.EDT_PCB_LOAN_AMOUNTMT);
		scrollToElement(CBPageUI.EDT_PCB_LOAN_AMOUNTMT);
		sendKeyToElement(CBPageUI.EDT_PCB_LOAN_AMOUNTMT, loanAmountMT);
		waitForElementVisible(CBPageUI.EDT_PCB_EMIMT);
		scrollToElement(CBPageUI.EDT_PCB_EMIMT);
		sendKeyToElement(CBPageUI.EDT_PCB_EMIMT, emimt);
		waitForElementVisible(CBPageUI.EDT_PCB_TERMMT);
		scrollToElement(CBPageUI.EDT_PCB_TERMMT);
		sendKeyToElement(CBPageUI.EDT_PCB_TERMMT, termmt);
		waitForElementVisible(CBPageUI.EDT_PCB_OTHER_LOAN_AMOUNT_ST);
		scrollToElement(CBPageUI.EDT_PCB_OTHER_LOAN_AMOUNT_ST);
		sendKeyToElement(CBPageUI.EDT_PCB_OTHER_LOAN_AMOUNT_ST, otherLoanAmountST);
		waitForElementVisible(CBPageUI.EDT_PCB_OTHER_EMIST);
		scrollToElement(CBPageUI.EDT_PCB_OTHER_EMIST);
		sendKeyToElement(CBPageUI.EDT_PCB_OTHER_EMIST, otherEmist);
		waitForElementVisible(CBPageUI.EDT_PCB_OTHER_TERMST);
		scrollToElement(CBPageUI.EDT_PCB_OTHER_TERMST);
		sendKeyToElement(CBPageUI.EDT_PCB_OTHER_TERMST, otherTermst);
		waitForElementVisible(CBPageUI.EDT_PCB_OTHER_LOAN_AMOUNTMT);
		scrollToElement(CBPageUI.EDT_PCB_OTHER_LOAN_AMOUNTMT);
		sendKeyToElement(CBPageUI.EDT_PCB_OTHER_LOAN_AMOUNTMT, otherLoanAmountMT);
		waitForElementVisible(CBPageUI.EDT_PCB_OTHER_EMIMT);
		scrollToElement(CBPageUI.EDT_PCB_OTHER_EMIMT);
		sendKeyToElement(CBPageUI.EDT_PCB_OTHER_EMIMT, otherEmiMT);
		waitForElementVisible(CBPageUI.EDT_PCB_OTHER_TERMMT);
		scrollToElement(CBPageUI.EDT_PCB_OTHER_TERMMT);
		sendKeyToElement(CBPageUI.EDT_PCB_OTHER_TERMMT, otherTermMT);
		waitForElementVisible(CBPageUI.EDT_PCB_CREDIT_CARD_LOAN_AMOUNT);
		scrollToElement(CBPageUI.EDT_PCB_CREDIT_CARD_LOAN_AMOUNT);
		sendKeyToElement(CBPageUI.EDT_PCB_CREDIT_CARD_LOAN_AMOUNT, creditCardLoanAmount);
		waitForElementVisible(CBPageUI.DRD_PCB_SCORE);
		scrollToElement(CBPageUI.DRD_PCB_SCORE);
		selectDropdownByText(CBPageUI.DRD_PCB_SCORE, pcbScoreOption);
		waitForElementVisible(CBPageUI.DRD_PCB_SCALE_SCORE);
		scrollToElement(CBPageUI.DRD_PCB_SCALE_SCORE);
		selectDropdownByText(CBPageUI.DRD_PCB_SCALE_SCORE, pcbScaleScoreOption);
		waitForElementVisible(CBPageUI.DRD_PCB_RISKASSESMENT);
		scrollToElement(CBPageUI.DRD_PCB_RISKASSESMENT);
		selectDropdownByText(CBPageUI.DRD_PCB_RISKASSESMENT, riskassesmentOption);
		waitForElementVisible(CBPageUI.EDT_PCB_UPDATE_DATE);
		scrollToElement(CBPageUI.EDT_PCB_UPDATE_DATE);
		sendKeyToElement(CBPageUI.DRD_PCB_RISKASSESMENT, pcbUpdateDate);
		
		
	}
	
	
	public void CICResult(String CICDrdOption, String img1PCBPath, String img2PCBPath, String img1CICPath, String img2CICPath, String imgFileS37Path) {
		
		
		waitForElementVisible(CBPageUI.RDO_CIC_H2H);
		scrollToElement(CBPageUI.RDO_CIC_H2H);
		clickToElementByJS(CBPageUI.RDO_CIC_H2H);
		waitForElementVisible(CBPageUI.DRD_CIC_RESULT);
		scrollToElement(CBPageUI.DRD_CIC_RESULT);
		selectDropdownByText(CBPageUI.DRD_CIC_RESULT, CICDrdOption);
		waitForElementVisible(CBPageUI.CHECKBOX_BANK_OCB);
		scrollToElement(CBPageUI.CHECKBOX_BANK_OCB);
		clickToElement(CBPageUI.CHECKBOX_BANK_OCB);
		waitForElementVisible(CBPageUI.CHECKBOX_OTHER);
		scrollToElement(CBPageUI.CHECKBOX_OTHER);
		clickToElement(CBPageUI.CHECKBOX_OTHER);

		scrollToElement(CBPageUI.INPUT_PCB_RESULT_IMG1x);

		uploadImage(CBPageUI.INPUT_PCB_RESULT_IMG1x, img1PCBPath);
		waitForElementVisible(CBPageUI.INPUT_PCB_RESULT_IMG1x);
//		scrollToElement(CBPageUI.INPUT_PCB_RESULT_IMG2);

		uploadImage(CBPageUI.INPUT_PCB_RESULT_IMG2, img2PCBPath);
		waitForElementVisible(CBPageUI.INPUT_PCB_RESULT_IMG2);
//		scrollToElement(CBPageUI.INPUT_CIC_RESULT_IMG1);

		uploadImage(CBPageUI.INPUT_CIC_RESULT_IMG1, img1CICPath);
		waitForElementVisible(CBPageUI.INPUT_CIC_RESULT_IMG1);
//		scrollToElement(CBPageUI.INPUT_CIC_RESULT_IMG2);

		uploadImage(CBPageUI.INPUT_CIC_RESULT_IMG2, img2CICPath);
		waitForElementVisible(CBPageUI.INPUT_CIC_RESULT_IMG2);
//		scrollToElement(CBPageUI.INPUT_FILE_S37_IMG);

		uploadImage(CBPageUI.INPUT_FILE_S37_IMG, imgFileS37Path);
		waitForElementVisible(CBPageUI.INPUT_FILE_S37_IMG);		
	}
	
	
	
	public void concludeCB(String concluedeOption, String commentCB) {
//		overrideGlobalTimeout(LONG_TIMEOUT2);
////		waitForElementVisible(CBPageUI.PCB_RESULT_IMG1,CBPageUI.PCB_RESULT_IMG2,CBPageUI.CIC_RESULT_IMG1,CBPageUI.CIC_RESULT_IMG2,CBPageUI.FILE_S37_IMG );
//		waitForElementVisible(CBPageUI.PCB_RESULT_IMG1);
//		waitForElementVisible(CBPageUI.PCB_RESULT_IMG2);
//		waitForElementVisible(CBPageUI.CIC_RESULT_IMG1);
//		waitForElementVisible(CBPageUI.CIC_RESULT_IMG2);
//		waitForElementVisible(CBPageUI.FILE_S37_IMG);
		
		
		
		scrollToElement(CBPageUI.BTN_SYSTEM_SUGGEST);
		waitForElementVisible(CBPageUI.BTN_SYSTEM_SUGGEST);
		clickToElement(CBPageUI.BTN_SYSTEM_SUGGEST);
		waitForElementVisible(CBPageUI.BTN_OK);
		clickToElementByJS(CBPageUI.BTN_OK);
		scrollToElement(CBPageUI.DRD_OPINION_CB);
		waitForElementVisible(CBPageUI.DRD_OPINION_CB);
		selectDropdownByText(CBPageUI.DRD_OPINION_CB, concluedeOption);
		scrollToElement(CBPageUI.EDT_COMMENT_CB);
		waitForElementVisible(CBPageUI.EDT_COMMENT_CB);
		sendKeyToElement(CBPageUI.EDT_COMMENT_CB, commentCB);
		scrollToElement(CBPageUI.BTN_SAVE);
		waitForElementVisible(CBPageUI.BTN_SAVE);
		clickToElement(CBPageUI.BTN_SAVE);
		
		
	}
	
	
	public void clickButtonComplete() {
//		overrideGlobalTimeout(LONG_TIMEOUT);
		waitForPMModalLoadingInvisible();
		scrollToElement(CBPageUI.BTN_COMPLETE);
		waitForElementVisible(CBPageUI.BTN_COMPLETE);
		clickToElementByJS(CBPageUI.BTN_COMPLETE);
	}
}
