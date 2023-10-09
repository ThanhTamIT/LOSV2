package pageobjects.ap;

import commons.BasePage;
import driver.DriverManager;
import pageuis.LoginPageUI;

import static commons.GlobalConstants.URL_SALE;

public class APLoginPageObject extends BasePage {

    public APLoginPageObject(String loginUrl) {
        openPageUrl(loginUrl);
    }

    public void openLoginAP() {
        DriverManager.getDriver().get(URL_SALE);
    }

    public void clickToLoginButton() {
        waitForElementClickable(LoginPageUI.LOGIN_BTN);
        clickToElement(LoginPageUI.LOGIN_BTN);
    }

    public void inputToAccountTextbox(String account) {
        waitForElementVisible(LoginPageUI.ACCOUNT_TEXTBOX);
        sendKeyToElement(LoginPageUI.ACCOUNT_TEXTBOX, account);
    }

    public void inputToPasswordTextbox(String password) {
        waitForElementVisible(LoginPageUI.PASSWORD_TEXTBOX);
        sendKeyToElement(LoginPageUI.PASSWORD_TEXTBOX, password);
    }

    public boolean isTemporalMessageWarningDisplayed() {
        waitForElementVisible(LoginPageUI.TEMPORAL_MESSAGE_WARNING);
        return isElementDisplayed(LoginPageUI.TEMPORAL_MESSAGE_WARNING);
    }

    public APHomePageObject goToLoginSuccess(String account, String password) {
        waitForElementVisible(LoginPageUI.ACCOUNT_TEXTBOX);
        sendKeyToElement(LoginPageUI.ACCOUNT_TEXTBOX, account);
        sendKeyToElement(LoginPageUI.PASSWORD_TEXTBOX, password);
        clickToElement(LoginPageUI.LOGIN_BTN);
        return new APHomePageObject();
    }
}
