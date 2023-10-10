package pageobjects.ap;

import commons.BasePage;
import commons.BasePageUI;
import pageuis.ap.APHomePageUI;

public class APHomePageObject extends BasePage {

    public APHomePageObject() {
    }

    public String getTextAccount() {
        waitForElementVisible(APHomePageUI.TXT_ACCOUNT);
        return getElementText(APHomePageUI.TXT_ACCOUNT);
    }

    public UpdateInformationToCAPageObject clickToIconCasesSelfServiceCase() {
        waitForAllElementVisible(BasePageUI.CASES_FRAME);
        switchToFrameIframe(BasePageUI.CASES_FRAME);
        clickToElement(APHomePageUI.ICON_CASES_SELFSERVICE);
        return new UpdateInformationToCAPageObject();
    }

    //Todo
    public UpdateInformationToCAPageObject clickToIconCasesSelfInboxCase() {
        waitForAllElementVisible(BasePageUI.CASES_FRAME);
        switchToFrameIframe(BasePageUI.CASES_FRAME);
        clickToElement(APHomePageUI.ICON_CASES_INBOX);
        return new UpdateInformationToCAPageObject();
    }
}
