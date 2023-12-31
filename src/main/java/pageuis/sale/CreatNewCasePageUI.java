package pageuis.sale;

public class CreatNewCasePageUI {
    // Customer ID Page UI
    public static final String COMPLETE_BTN_IN_CUSTOMER_ID = "//span[contains(text(),'Hoàn thành')]";
    public static final String FRONT_IMG = "//div[@class='col-sm-12 panel-upload item-document-IdentityCardFront']//img";
    public static final String BACK_IMG = "//div[@class='col-sm-12 panel-upload item-document-IdentityCardBack']//img";
    public static final String FULL_FACE_IMG = "//div[@class='col-sm-12 panel-upload item-document-CustomerPhoto']//img";

    // Information Sale Page UI
    public static final String ID_CARD_ISSUE_PARENT = "//div[@id='idCardIssuePlace']//select";
    public static final String MOBILE_PHONE_INPUT = "//input[@id='form[mobilePhone]']";
    public static final String MOBILE_OWNER_STATUS_CHECKBOX = "//input[@id='form[mobileOwnerStatus]' and @value='YES']";
    public static final String HAS_SMART_PHONE_CHECKBOX = "//input[@id='form[hasSmartPhone]' and @value='YES']";
    public static final String TEMPORARY_ADDRESS_PROVINCE_INPUT = "//div[@id='temporaryAddressProvince']//select";
    public static final String TEMPORARY_ADDRESS_DISTRICT_INPUT = "//div[@id='temporaryAddressDistrict']//select";
    public static final String PRODUCT_CATEGORY_INPUT = "//div[@id='productCategory']//select";
    public static final String SCHEME_PRODUCT_INPUT = "//div[@id='schemeProduct']//select";
    public static final String BILL_TYPE_INPUT = "//div[@id='billType']//select";
    public static final String BILL_OWNER_INPUT = "//div[@id='billOwner']//select";
    public static final String CUSTOMER_CODE_BILL_INPUT = "//input[@id='form[customerCodeBill]']";
    public static final String BILL_AMOUNT1_INPUT = "//input[@id='form[billAmount1]']";
    public static final String BILL_AMOUNT2_INPUT = "//input[@id='form[billAmount2]']";
    public static final String BILL_AMOUNT3_INPUT = "//input[@id='form[billAmount3]']";
    public static final String LOAN_CONSUMER_INPUT = "//input[@id='form[loanConsumer]']";
    public static final String LOAN_TERM_INPUT = "//div[@id='loanTerm']//select";
    public static final String APPLICATION_DATE_INPUT = "//input[@id='form[applicationDate]']";
    public static final String SALE_DECISION_INPUT = "//div[@id='saleDecision']//select";
    public static final String POA_DOCUMENT = "//form[@id='POADocument']//p/a";
    public static final String CUSTOMER_AND_STAFF_PHOTO = "//form[@id='CustomerAndStaffPhoto']//p/a";
    public static final String CUSTOMER_PHOTO_INSIDE_HOUSE = "//form[@id='CustomerPhotoInsideHouse']//p/a";
    public static final String CUSTOMER_PHOTO_FRONT_HOUSE = "//form[@id='CustomerPhotoFrontHouse']//p/a";
    public static final String SERVER_BILL_IMG = "//form[@id='ServiceBill']//p/a";
    public static final String SUBMIT_BTN = "//button[@id='form[submitBtn]']";
    public static final String MODAL_FADE = "//div[@class='modal fade pm-modal-global in']";
    public static final String ID_CARD_NUMBER = "//input[@id='form[idCardNumber]']";
    public static final String TXT_APP_CODE = "//input[@id='form[appCode]']";
}
