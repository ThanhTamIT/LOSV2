package pageobjects.sale;

import commons.BasePage;
import commons.BasePageUI;
import pageobjects.salelead.SaleLeadHomePageObject;
import pageuis.sale.UpdateInformationToAPPageUI;

public class UpdateInformationToAPPageObject extends BasePage {

    public UpdateInformationToAPPageObject() {
    }

    public void updateDataInfo(String approve, String creditContractSignedLater, String identityCardSignedLater, String customerAndStaffPhotoSignedLater) {
        waitForAllElementVisible(BasePageUI.OPEN_CASES_FRAME);
        switchToFrameIframe(BasePageUI.OPEN_CASES_FRAME);
        waitForElementVisible(UpdateInformationToAPPageUI.INPUT_SALE_DECISION_UPLOAD_CONTRACT);
        selectItemInDefaultDropdown(UpdateInformationToAPPageUI.INPUT_SALE_DECISION_UPLOAD_CONTRACT, approve);
        scrollToElement(UpdateInformationToAPPageUI.INPUT_CREDIT_CONTRACT_SIGNED_LATER);
        uploadImage(UpdateInformationToAPPageUI.INPUT_CREDIT_CONTRACT_SIGNED_LATER, creditContractSignedLater);
        scrollToElement(UpdateInformationToAPPageUI.INPUT_IDENTITY_CARD_SIGNED_LATER);
        uploadImage(UpdateInformationToAPPageUI.INPUT_IDENTITY_CARD_SIGNED_LATER, identityCardSignedLater);
        scrollToElement(UpdateInformationToAPPageUI.INPUT_CUS_AND_STAFF_PHOTO_SIGNED_LATER);
        uploadImage(UpdateInformationToAPPageUI.INPUT_CUS_AND_STAFF_PHOTO_SIGNED_LATER, customerAndStaffPhotoSignedLater);
        waitForElementVisible(UpdateInformationToAPPageUI.INPUT_IDENTITY_CARD_SIGNED_LATER_NAME);
        waitForElementVisible(UpdateInformationToAPPageUI.INPUT_CREDIT_CONTRACT_SIGNED_LATER_NAME);
        waitForElementVisible(UpdateInformationToAPPageUI.INPUT_CUS_AND_STAFF_PHOTO_SIGNED_LATER_NAME);
        scrollToElement(UpdateInformationToAPPageUI.BTN_COMPLETE);
        clickToElement(UpdateInformationToAPPageUI.BTN_COMPLETE);
    }

    public SaleHomePageObject clickContinueButton() {
        waitForElementVisible(BasePageUI.BTN_CONTINUE);
        clickToElement(BasePageUI.BTN_CONTINUE);
        return new SaleHomePageObject();
    }
}
