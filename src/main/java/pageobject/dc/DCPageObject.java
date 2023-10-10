package pageobject.dc;

import commons.BasePage;
import commons.BasePageUI;
import pageuis.sale.CreatNewCasePageUI;
import pageuis.sale.DCPageUI;
import pageuis.sale.SaleHomePageUI;
import pageuis.sale.DCPageUI;

public class DCPageObject extends BasePage {
	public DCPageObject () {
		}
	
	public void checkCICS37 (String itemDrd, String value, String imagePath, String date ) {
//		waitForElementVisible(SaleHomePageUI.CASES_FRAME);
////        switchToFrameIframe(CreatNewCasePageUI.OPEN_CASES_FRAME);
		waitForElementVisible(CreatNewCasePageUI.OPEN_CASES_FRAME);
        switchToFrameIframe(CreatNewCasePageUI.OPEN_CASES_FRAME);
//        waitForAllElementVisible(SaleHomePageUI.CASES_SUB_FRAME);
//        switchToFrameIframe(SaleHomePageUI.CASES_SUB_FRAME);
		waitForElementVisible(DCPageUI.BTN_CHECK_CIC);
		scrollToElement(DCPageUI.BTN_CHECK_CIC);
		clickToElement(DCPageUI.BTN_CHECK_CIC);
		waitForElementVisible(DCPageUI.DRD_KET_QUA_S37);
		scrollToElement(DCPageUI.DRD_KET_QUA_S37);
		selectDropdownByText(DCPageUI.DRD_KET_QUA_S37, itemDrd);
		waitForElementVisible(DCPageUI.EDT_TCTD_S37);
		scrollToElement(DCPageUI.EDT_TCTD_S37);
		sendKeyToElement(DCPageUI.EDT_TCTD_S37, value);
		waitForElementVisible(DCPageUI.EDT_DATE_UPDATE_S37);
		scrollToElement(DCPageUI.EDT_DATE_UPDATE_S37);
		sendKeyToElement(DCPageUI.EDT_DATE_UPDATE_S37, date);
////		waitForElementVisible(DCPageUI.INPUT_IMG_S37);
////		scrollToElement(DCPageUI.INPUT_IMG_S37);
////		uploadImage(DCPageUI.INPUT_IMG_S37, imagePath);
	}
	
	public void checkLoanInformation () {
//		waitForElementVisible(DCPageUI.IMG_S37);
		waitForElementVisible(DCPageUI.RDO_BLACKLIST_NO);
		scrollToElement(DCPageUI.RDO_BLACKLIST_NO);
		clickToElement(DCPageUI.RDO_BLACKLIST_NO);
		waitForElementVisible(DCPageUI.RDO_DUPLICATE_NO);
		scrollToElement(DCPageUI.RDO_DUPLICATE_NO);
		clickToElement(DCPageUI.RDO_DUPLICATE_NO);
	}
	
	
	public void fileInformation(String itemResult, String tamperingComment) {
		waitForElementVisible(DCPageUI.RDO_HOSO1_YES);
		scrollToElement(DCPageUI.RDO_HOSO1_YES);
		clickToElement(DCPageUI.RDO_HOSO1_YES);
		waitForElementVisible(DCPageUI.RDO_HOSO2_YES);
		scrollToElement(DCPageUI.RDO_HOSO2_YES);
		clickToElement(DCPageUI.RDO_HOSO2_YES);
		waitForElementVisible(DCPageUI.RDO_HOSO3_YES);
		scrollToElement(DCPageUI.RDO_HOSO3_YES);
		clickToElement(DCPageUI.RDO_HOSO3_YES);
		waitForElementVisible(DCPageUI.RDO_HOSO4_YES);
		scrollToElement(DCPageUI.RDO_HOSO4_YES);
		clickToElement(DCPageUI.RDO_HOSO4_YES);
		waitForElementVisible(DCPageUI.DRD_TAMPERING_CONFIRM);
		scrollToElement(DCPageUI.DRD_TAMPERING_CONFIRM);
		selectDropdownByText(DCPageUI.DRD_TAMPERING_CONFIRM, itemResult);
		waitForElementVisible(DCPageUI.EDT_TAMPERING_COMMENT);
		scrollToElement(DCPageUI.EDT_TAMPERING_COMMENT);
		sendKeyToElement(DCPageUI.EDT_TAMPERING_COMMENT, tamperingComment);
	}
	
	public void conclude(String itemOpinion, String dcComment) {
		waitForElementVisible(DCPageUI.BTN_SYSTEM_SUGGEST);
		scrollToElement(DCPageUI.BTN_SYSTEM_SUGGEST);
		clickToElement(DCPageUI.BTN_SYSTEM_SUGGEST);
		waitForElementVisible(DCPageUI.BTN_OK);
		scrollToElement(DCPageUI.BTN_OK);
		clickToElement(DCPageUI.BTN_OK);
		waitForElementVisible(DCPageUI.DRD_OPINION_DC);
		scrollToElement(DCPageUI.DRD_OPINION_DC);
		selectDropdownByText(DCPageUI.DRD_OPINION_DC, itemOpinion);
		waitForElementVisible(DCPageUI.EDT_COMMENT_DC);
		scrollToElement(DCPageUI.EDT_COMMENT_DC);
		sendKeyToElement(DCPageUI.EDT_COMMENT_DC, dcComment);
		waitForElementVisible(DCPageUI.BTN_SAVE);
		scrollToElement(DCPageUI.BTN_SAVE);
		clickToElement(DCPageUI.BTN_SAVE);
		
		}
	
	
	public void clickCompleteButton() {
		waitForPMModalLoadingInvisible();
//		waitForElementVisible(DCPageUI.BTN_COMPLETE);
		scrollToElement(DCPageUI.BTN_COMPLETE);
		clickToElementByJS(DCPageUI.BTN_COMPLETE);
		
	}
	
	public void clickContinueButton() {
		waitForPMModalLoadingInvisible();
		clickToElement(DCPageUI.BTN_CONTINUE_DC);
		
	}
	
	public void testClickData() {
		waitForElementVisible(SaleHomePageUI.CASES_FRAME);
        switchToFrameIframe(SaleHomePageUI.CASES_FRAME);
//		waitForElementVisible(DCPageUI.MENU_ITEM_INBOX);
////		scrollToElement(DCPageUI.MENU_ITEM_INBOX);
//		clickToElement(DCPageUI.MENU_ITEM_INBOX);
		waitForElementVisible(SaleHomePageUI.CASES_SUB_FRAME);
        switchToFrameIframe(SaleHomePageUI.CASES_SUB_FRAME);
		waitForElementVisible(DCPageUI.TEST_DATA);
		scrollToElement(DCPageUI.TEST_DATA);
		doubleClickToElement(DCPageUI.TEST_DATA);
	}
}
