package commons;

public class BasePageUI {
    public static final String CONTAINER_LOADING = "//div[@class='container-loading']";
    public static final String PM_MODAL_LOADING = "//div[@class='pm-modal-loading']";
    public static final String DYNAMIC_INPUT_IMG = "//form[@data-name='%s']//input[@type='file']";
	public static final String EDT_USER_LOGIN = "//input[@id='form[USR_USERNAME]']";
	public static final String EDT_PASSWORD_LOGIN = "//input[@id='form[USR_PASSWORD_MASK]']";
	public static final String BTN_LOGIN = "//input[@id='form[BSUBMIT]']";
	public static final String ACCOUNT_DYNAMIC = "//label[@class='textBlue']";
    public static final String CASES_FRAME = "//iframe[@name='casesFrame']";
    public static final String CASES_SUB_FRAME = "//iframe[@name='casesSubFrame']";
    public static final String TXT_DYNAMIC_APP_CODE = "//div[text()='%s']";
    public static final String OPEN_CASES_FRAME = "//iframe[@name='openCaseFrame']";
    public static final String BTN_VALIDATE = "//button[@id='form[btnValidate]']";
    public static final String INPUT_SELECT_DECISION = "//select[@id='form[slDecision]']";
    public static final String BTN_COMPLETE = "//button[@id='form[btnComplete]']";
    public static final String BTN_CONTINUE = "//input[@name='btnContinue_1']";
    public static final String ROW_DATA_APP_CODE = "//div[contains(text(),'%s')]";
}
