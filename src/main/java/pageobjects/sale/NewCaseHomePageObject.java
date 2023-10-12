package pageobjects.sale;

import commons.BasePage;
import commons.BasePageUI;
import pageuis.sale.CreatNewCasePageUI;
import pageuis.sale.SaleHomePageUI;

public class NewCaseHomePageObject extends BasePage {

    public NewCaseHomePageObject() {
    }

    public void clickToCustomerBasePricing() {
        waitForAllElementVisible(BasePageUI.CASES_SUB_FRAME);
        switchToFrameIframe(BasePageUI.CASES_SUB_FRAME);
        doubleClick(SaleHomePageUI.CUSTOMER_BASE_PRICING);
    }

    public void inputIDCard(String frontIDCartIMG, String frontIDCartText, String backIDCartIMG, String backIDCartText, String fullFaceIMG, String fullFaceText) {
        waitForAllElementVisible(BasePageUI.OPEN_CASES_FRAME);
        switchToFrameIframe(BasePageUI.OPEN_CASES_FRAME);
        uploadImage(BasePageUI.DYNAMIC_INPUT_IMG, frontIDCartIMG, frontIDCartText);
        uploadImage(BasePageUI.DYNAMIC_INPUT_IMG, backIDCartIMG, backIDCartText);
        uploadImage(BasePageUI.DYNAMIC_INPUT_IMG, fullFaceIMG, fullFaceText);
    }
    public void clickCompleteButton() {
        waitForElementVisible(CreatNewCasePageUI.FRONT_IMG);
        waitForElementVisible(CreatNewCasePageUI.BACK_IMG);
        waitForElementVisible(CreatNewCasePageUI.FULL_FACE_IMG);
        waitForElementClickable(CreatNewCasePageUI.COMPLETE_BTN_IN_CUSTOMER_ID);
        scrollToElement(CreatNewCasePageUI.COMPLETE_BTN_IN_CUSTOMER_ID);
        clickToElement(CreatNewCasePageUI.COMPLETE_BTN_IN_CUSTOMER_ID);
    }

    public void inputRequesterInformation(String idCard, String iDCardIssue, String mobilePhone, String temporaryAddressProvince, String temporaryAddressDistrict) {
        waitForPMModalLoadingInvisible();
        sleepInSecond(5);
        sendKeyToElement(CreatNewCasePageUI.ID_CARD_NUMBER, idCard);
        scrollToElement(CreatNewCasePageUI.ID_CARD_ISSUE_PARENT);
        selectItemInDefaultDropdown(CreatNewCasePageUI.ID_CARD_ISSUE_PARENT, iDCardIssue);
        waitForPMModalLoadingInvisible();
        waitForElementVisible(CreatNewCasePageUI.MOBILE_PHONE_INPUT);
        scrollToElement(CreatNewCasePageUI.MOBILE_PHONE_INPUT);
        sendKeyToElement(CreatNewCasePageUI.MOBILE_PHONE_INPUT, mobilePhone);
        waitForElementVisible(CreatNewCasePageUI.MOBILE_OWNER_STATUS_CHECKBOX);
        scrollToElement(CreatNewCasePageUI.MOBILE_OWNER_STATUS_CHECKBOX);
        clickToElement(CreatNewCasePageUI.MOBILE_OWNER_STATUS_CHECKBOX);
        waitForElementVisible(CreatNewCasePageUI.HAS_SMART_PHONE_CHECKBOX);
        scrollToElement(CreatNewCasePageUI.HAS_SMART_PHONE_CHECKBOX);
        clickToElement(CreatNewCasePageUI.HAS_SMART_PHONE_CHECKBOX);
        waitForElementVisible(CreatNewCasePageUI.TEMPORARY_ADDRESS_PROVINCE_INPUT);
        scrollToElement(CreatNewCasePageUI.TEMPORARY_ADDRESS_PROVINCE_INPUT);
        selectItemInDefaultDropdown(CreatNewCasePageUI.TEMPORARY_ADDRESS_PROVINCE_INPUT, temporaryAddressProvince);
        waitForElementVisible(CreatNewCasePageUI.TEMPORARY_ADDRESS_DISTRICT_INPUT);
        scrollToElement(CreatNewCasePageUI.TEMPORARY_ADDRESS_DISTRICT_INPUT);
        selectItemInDefaultDropdown(CreatNewCasePageUI.TEMPORARY_ADDRESS_DISTRICT_INPUT, temporaryAddressDistrict);
    }

    public void inputLoanAppInformation1(String productCategory, String schemeProduct, String billType, String billOwner,
                                         String customerCodeBill, String billAmount1, String billAmount2, String billAmount3) {
        waitForElementVisible(CreatNewCasePageUI.PRODUCT_CATEGORY_INPUT);
        scrollToElement(CreatNewCasePageUI.PRODUCT_CATEGORY_INPUT);
        selectItemInDefaultDropdown(CreatNewCasePageUI.PRODUCT_CATEGORY_INPUT, productCategory);
        waitForElementVisible(CreatNewCasePageUI.SCHEME_PRODUCT_INPUT);
        scrollToElement(CreatNewCasePageUI.SCHEME_PRODUCT_INPUT);
        selectItemInDefaultDropdown(CreatNewCasePageUI.SCHEME_PRODUCT_INPUT, schemeProduct);
        waitForElementVisible(CreatNewCasePageUI.BILL_TYPE_INPUT);
        scrollToElement(CreatNewCasePageUI.BILL_TYPE_INPUT);
        selectItemInDefaultDropdown(CreatNewCasePageUI.BILL_TYPE_INPUT, billType);
        waitForElementVisible(CreatNewCasePageUI.BILL_OWNER_INPUT);
        scrollToElement(CreatNewCasePageUI.BILL_OWNER_INPUT);
        selectItemInDefaultDropdown(CreatNewCasePageUI.BILL_OWNER_INPUT, billOwner);
        waitForElementVisible(CreatNewCasePageUI.CUSTOMER_CODE_BILL_INPUT);
        scrollToElement(CreatNewCasePageUI.CUSTOMER_CODE_BILL_INPUT);
        sendKeyToElement(CreatNewCasePageUI.CUSTOMER_CODE_BILL_INPUT, customerCodeBill);
        waitForElementVisible(CreatNewCasePageUI.BILL_AMOUNT1_INPUT);
        scrollToElement(CreatNewCasePageUI.BILL_AMOUNT1_INPUT);
        sendKeyToElement(CreatNewCasePageUI.BILL_AMOUNT1_INPUT, billAmount1);
        waitForElementVisible(CreatNewCasePageUI.BILL_AMOUNT2_INPUT);
        scrollToElement(CreatNewCasePageUI.BILL_AMOUNT2_INPUT);
        sendKeyToElement(CreatNewCasePageUI.BILL_AMOUNT2_INPUT, billAmount2);
        waitForElementVisible(CreatNewCasePageUI.BILL_AMOUNT3_INPUT);
        scrollToElement(CreatNewCasePageUI.BILL_AMOUNT3_INPUT);
        sendKeyToElement(CreatNewCasePageUI.BILL_AMOUNT3_INPUT, billAmount3);

    }

    public void inputLoanAppInformation2(String loanConsumer, String loanTerm, String applicationDate, String saleDecision) {
        scrollToElement(CreatNewCasePageUI.LOAN_CONSUMER_INPUT);
        sendKeyToElement(CreatNewCasePageUI.LOAN_CONSUMER_INPUT, loanConsumer);
        scrollToElement(CreatNewCasePageUI.LOAN_TERM_INPUT);
        selectItemInDefaultDropdown(CreatNewCasePageUI.LOAN_TERM_INPUT, loanTerm);
        scrollToElement(CreatNewCasePageUI.APPLICATION_DATE_INPUT);
        sendKeyToElement(CreatNewCasePageUI.APPLICATION_DATE_INPUT, applicationDate);
        scrollToElement(BasePageUI.BTN_VALIDATE);
        clickToElement(BasePageUI.BTN_VALIDATE);
        waitForPMModalLoadingInvisible();
        scrollToElement(CreatNewCasePageUI.SALE_DECISION_INPUT);
        selectItemInDefaultDropdown(CreatNewCasePageUI.SALE_DECISION_INPUT, saleDecision);
        sleepInSecond(3);
        waitForElementInvisible(CreatNewCasePageUI.MODAL_FADE);
        scrollToBottomPage();
        waitForElementClickable(BasePageUI.BTN_COMPLETE);
        clickToElement(BasePageUI.BTN_COMPLETE);
    }

    public void inputLoanAppInformationFile(String fullFaceIMG, String pOADocument, String customerAndStaffPhoto, String customerPhotoInsideHouse,
                                            String customerPhotoFrontHouse, String serviceBill) {
        uploadImage(BasePageUI.DYNAMIC_INPUT_IMG, fullFaceIMG, pOADocument);
        uploadImage(BasePageUI.DYNAMIC_INPUT_IMG, fullFaceIMG, customerAndStaffPhoto);
        uploadImage(BasePageUI.DYNAMIC_INPUT_IMG, fullFaceIMG, customerPhotoInsideHouse);
        uploadImage(BasePageUI.DYNAMIC_INPUT_IMG, fullFaceIMG, customerPhotoFrontHouse);
        uploadImage(BasePageUI.DYNAMIC_INPUT_IMG, fullFaceIMG, serviceBill);
        waitForElementVisible(CreatNewCasePageUI.SERVER_BILL_IMG);
        waitForElementVisible(CreatNewCasePageUI.POA_DOCUMENT);
        waitForElementVisible(CreatNewCasePageUI.CUSTOMER_AND_STAFF_PHOTO);
        waitForElementVisible(CreatNewCasePageUI.CUSTOMER_PHOTO_INSIDE_HOUSE);
        waitForElementVisible(CreatNewCasePageUI.CUSTOMER_PHOTO_FRONT_HOUSE);
        waitForElementClickable(CreatNewCasePageUI.SUBMIT_BTN);
        scrollToElement(CreatNewCasePageUI.SUBMIT_BTN);
        clickToElement(CreatNewCasePageUI.SUBMIT_BTN);
    }

    public SaleHomePageObject clickContinueButton() {
        waitForElementVisible(BasePageUI.BTN_CONTINUE);
        clickToElement(BasePageUI.BTN_CONTINUE);
        return new SaleHomePageObject();
    }

    public String getTextAppCode() {
        waitForElementVisible(CreatNewCasePageUI.TXT_APP_CODE);
        return getElementAttribute(CreatNewCasePageUI.TXT_APP_CODE, "value");
    }
}
