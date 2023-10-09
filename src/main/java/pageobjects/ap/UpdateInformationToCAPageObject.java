package pageobjects.ap;

import commons.BasePage;
import commons.BasePageUI;
import pageuis.ap.APHomePageUI;
import pageuis.ap.UpdateInformationToCAPageUI;

public class UpdateInformationToCAPageObject extends BasePage {

    public UpdateInformationToCAPageObject() {
    }

    public void goToUpdateInfoPage(String appCode) {
        switchToFrameIframe(BasePageUI.CASES_SUB_FRAME);
        doubleClick(BasePageUI.TXT_DYNAMIC_APP_CODE, appCode);
        waitForAllElementVisible(BasePageUI.OPEN_CASES_FRAME);
        switchToFrameIframe(BasePageUI.OPEN_CASES_FRAME);
        waitForElementVisible(UpdateInformationToCAPageUI.BTN_CLAIM_THIS_CASE);
        clickToElement(UpdateInformationToCAPageUI.BTN_CLAIM_THIS_CASE);
    }

    public void goToUpdateInfoPageTest() {
        switchToFrameIframe(BasePageUI.CASES_SUB_FRAME);
        doubleClick(APHomePageUI.ROW_DATA_APP_CODE_TEST);
        waitForAllElementVisible(BasePageUI.OPEN_CASES_FRAME);
        switchToFrameIframe(BasePageUI.OPEN_CASES_FRAME);
        sleepInSecond(5);
        waitForAllElementVisible(UpdateInformationToCAPageUI.BTN_OK);
        clickToElement(UpdateInformationToCAPageUI.BTN_OK);
    }

    public void updateDataInfo(String vhAccommodationTypeText, String vhHomeTypeText, String livingTimeInYear,
                               String livingTimeInMonth, String videoCallLocateIMG, String extraMiningVoucherIMG,
                               String apCreditHistory, String apDecision) {
        scrollToElement(UpdateInformationToCAPageUI.CBX_VIDEO_CALL_CODE);
        clickToElement(UpdateInformationToCAPageUI.CBX_VIDEO_CALL_CODE);
        scrollToElement(UpdateInformationToCAPageUI.INPUT_VH_ACCOMMODATION_TYPE);
        selectItemInDefaultDropdown(UpdateInformationToCAPageUI.INPUT_VH_ACCOMMODATION_TYPE, vhAccommodationTypeText);
        scrollToElement(UpdateInformationToCAPageUI.INPUT_VH_HOME_TYPE);
        selectItemInDefaultDropdown(UpdateInformationToCAPageUI.INPUT_VH_HOME_TYPE, vhHomeTypeText);
        scrollToElement(UpdateInformationToCAPageUI.INPUT_VH_LIVING_TIME_IN_YEAR);
        sendKeyToElement(UpdateInformationToCAPageUI.INPUT_VH_LIVING_TIME_IN_YEAR, livingTimeInYear);
        scrollToElement(UpdateInformationToCAPageUI.INPUT_VH_LIVING_TIME_IN_MONTH);
        sendKeyToElement(UpdateInformationToCAPageUI.INPUT_VH_LIVING_TIME_IN_MONTH, livingTimeInMonth);
        scrollToElement(UpdateInformationToCAPageUI.VIDEO_CALL_LOCATE_IMG);
        uploadImage(UpdateInformationToCAPageUI.VIDEO_CALL_LOCATE_IMG, videoCallLocateIMG);
        scrollToElement(UpdateInformationToCAPageUI.EXTRA_MINING_VOUCHER_IMG);
        uploadImage(UpdateInformationToCAPageUI.EXTRA_MINING_VOUCHER_IMG, extraMiningVoucherIMG);
        waitForElementVisible(UpdateInformationToCAPageUI.VIDEO_CALL_LOCATE_IMG_NAME);
        waitForElementVisible(UpdateInformationToCAPageUI.EXTRA_MINING_VOUCHER_IMG_NAME);
        scrollToElement(UpdateInformationToCAPageUI.INPUT_AP_CREDIT_HISTORY);
        selectItemInDefaultDropdown(UpdateInformationToCAPageUI.INPUT_AP_CREDIT_HISTORY, apCreditHistory);
        clickToElement(UpdateInformationToCAPageUI.BTN_SUGGEST);
        sleepInSecond(3);
        waitForElementVisible(UpdateInformationToCAPageUI.BTN_PASS_RULE_OK);
        clickToElement(UpdateInformationToCAPageUI.BTN_PASS_RULE_OK);
        scrollToElement(UpdateInformationToCAPageUI.INPUT_AP_DECISION);
        selectItemInDefaultDropdown(UpdateInformationToCAPageUI.INPUT_AP_DECISION, apDecision);
        scrollToElement(BasePageUI.BTN_COMPLETE);
        clickToElement(BasePageUI.BTN_COMPLETE);
    }

    public APHomePageObject clickContinueButton() {
        waitForElementVisible(BasePageUI.BTN_CONTINUE);
        clickToElement(BasePageUI.BTN_CONTINUE);
        return new APHomePageObject();
    }
}
