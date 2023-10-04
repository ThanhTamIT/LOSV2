package pageobjects.sale;

import commons.BasePage;
import driver.DriverManager;
import pageuis.sale.SaleLoginPageUI;

import static commons.GlobalConstants.URL_SALE;

public class SaleLoginPageObject extends BasePage {

    public SaleLoginPageObject(String loginUrl) {
        openPageUrl(loginUrl);
    }

    public void openLoginSale() {
        DriverManager.getDriver().get(URL_SALE);
    }

    public void clickToLoginButton() {
        waitForElementClickable(SaleLoginPageUI.LOGIN_BTN);
        clickToElement(SaleLoginPageUI.LOGIN_BTN);
    }

    public void inputToAccountTextbox(String account) {
        waitForElementVisible(SaleLoginPageUI.ACCOUNT_TEXTBOX);
        sendKeyToElement(SaleLoginPageUI.ACCOUNT_TEXTBOX, account);
    }

    public void inputToPasswordTextbox(String password) {
        waitForElementVisible(SaleLoginPageUI.PASSWORD_TEXTBOX);
        sendKeyToElement(SaleLoginPageUI.PASSWORD_TEXTBOX, password);
    }

    public boolean isTemporalMessageWarningDisplayed() {
        waitForElementVisible(SaleLoginPageUI.TEMPORAL_MESSAGE_WARNING);
        return isElementDisplayed(SaleLoginPageUI.TEMPORAL_MESSAGE_WARNING);
    }

    public SaleHomePageObject loginSuccess(String account, String password) {
        waitForElementVisible(SaleLoginPageUI.ACCOUNT_TEXTBOX);
        sendKeyToElement(SaleLoginPageUI.ACCOUNT_TEXTBOX, account);
        sendKeyToElement(SaleLoginPageUI.PASSWORD_TEXTBOX, password);
        clickToElement(SaleLoginPageUI.LOGIN_BTN);
        return new SaleHomePageObject();
    }
}
