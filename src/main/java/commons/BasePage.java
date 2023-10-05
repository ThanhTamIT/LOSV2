package commons;

import driver.DriverManager;
import pageobjects.sale.SaleHomePageObject;

import static commons.BasePageUI.CONTAINER_LOADING;
import static commons.BasePageUI.PM_MODAL_LOADING;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.testng.Assert.assertFalse;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class BasePage {

	public static BasePage getBasePage() {
		return new BasePage();
	}

	public void openPageUrl(String pageUrl) {
		DriverManager.getDriver().get(pageUrl);
	}


	private WebElement getWebElement(String locator) {
		return DriverManager.getDriver().findElement(By.xpath(locator));
	}

	private String getDynamicXpath(String locator, String... dynamicValues) {
		locator = String.format(locator, (Object[]) dynamicValues);
		return locator;
	}

	public static Actions getActions() {
		return new Actions(DriverManager.getDriver());
	}

	public void clearElementText(String locatorType) {
		WebElement element = getWebElement(locatorType);
		sleepMiliSecond(200);
		getActions().click(element).keyDown(element, Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		if (!"".equals(element.getText()))
			getActions().keyDown(element, Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		sleepMiliSecond(200);
	}

	public void clearElementText(String locatorType, String... dynamicValues) {
		WebElement element = this.getWebElement(getDynamicXpath(locatorType, dynamicValues));
		sleepMiliSecond(200);
		getActions().click(element).keyDown(element, Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		if (!"".equals(element.getText()))
			getActions().keyDown(element, Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		sleepMiliSecond(200);
	}
	public void switchToFrameIframe(String locator) {
		DriverManager.getDriver().switchTo().frame(this.getWebElement(locator));
	}

	public void doubleClick(String locator) {
		Actions actions = new Actions(DriverManager.getDriver());
		actions.doubleClick(this.getWebElement(locator)).perform();
	}
	
	public void doubleClick(String locator, String...dynamicValues ) {
		Actions actions = new Actions(DriverManager.getDriver());
		actions.doubleClick(this.getWebElement(getDynamicXpath(locator, dynamicValues))).perform();
	}

	public void uploadImage(String locator, String imagePath) {
		WebElement element = this.getWebElement(locator);
		element.sendKeys(imagePath);
	}

	public void uploadImage(String locator, String imagePath, String... dynamicValues) {
		WebElement element = this.getWebElement(getDynamicXpath(locator, dynamicValues));
		element.sendKeys(imagePath);
	}

	public void waitForContainerLoadingInvisible() {
		WebDriverWait explicitWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(longTimeout));
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(CONTAINER_LOADING)));
	}

	public void waitForPMModalLoadingInvisible() {
		WebDriverWait explicitWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(longTimeout));
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(PM_MODAL_LOADING)));
	}

	public void selectItemInDefaultDropdown(String locator, String textItem) {
		Select select = new Select(this.getWebElement(locator));
		select.selectByVisibleText(textItem);
	}

	public void selectItemInDefaultDropdown(String locatorType, String textItem, String... dynamicValues) {
		Select select = new Select(this.getWebElement(getDynamicXpath(locatorType, dynamicValues)));
		select.selectByVisibleText(textItem);
	}

	public void openNewTab(String pageUrl) {
		String openNewTabWithLinkScript = "window.open('" + pageUrl + "','_blank');";
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(openNewTabWithLinkScript);
		ArrayList<String> tabs = new ArrayList<String>(DriverManager.getDriver().getWindowHandles());
		DriverManager.getDriver().switchTo().window(tabs.get(1));
	}

	public void switchOldTab() {
		ArrayList<String> tabs1 = new ArrayList<String>(DriverManager.getDriver().getWindowHandles());
		DriverManager.getDriver().switchTo().window(tabs1.get(0));
	}

	public void switchTabTwo() {
		ArrayList<String> tabs1 = new ArrayList<String>(DriverManager.getDriver().getWindowHandles());
		DriverManager.getDriver().switchTo().window(tabs1.get(1));
	}

	public String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}

	public String getPageUrl() {
		return DriverManager.getDriver().getCurrentUrl();
	}

	public String getPageSource() {
		return DriverManager.getDriver().getPageSource();
	}

	public Set<Cookie> getAllCookies() {
		return DriverManager.getDriver().manage().getCookies();
	}

	public void setAllCookies(Set<Cookie> allCookies) {
		for (Cookie cookie : allCookies) {
			DriverManager.getDriver().manage().addCookie(cookie);
		}
	}

	public Alert waitForAlertPresence() {
		explicitWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(timeout));
		return explicitWait.until(ExpectedConditions.alertIsPresent());
	}

	public void acceptAlert() {
		alert = waitForAlertPresence();
		alert.accept();
		sleepInSecond(2);
	}

	public void cancelAlert() {
		alert = waitForAlertPresence();
		alert.dismiss();
	}

	public void sendkeyToAlert(String value) {
		alert = waitForAlertPresence();
		alert.sendKeys(value);
	}

	public String getAlertText() {
		alert = waitForAlertPresence();
		return alert.getText();
	}

	public void switchToWindowByID(String parentID) {
		Set<String> allTabIDs = DriverManager.getDriver().getWindowHandles();
		for (String id : allTabIDs) {
			if (!id.equals(parentID)) {
				DriverManager.getDriver().switchTo().window(id);
				break;
			}
		}
	}

	public void switchToWindowByTitle(String tabTitle) {
		Set<String> allTabIDs = DriverManager.getDriver().getWindowHandles();
		for (String id : allTabIDs) {
			DriverManager.getDriver().switchTo().window(id);
			String actualTitle = DriverManager.getDriver().getTitle();
			if (actualTitle.equals(tabTitle)) {
				break;
			}
		}
	}

	public void closeAllTabWithoutParent(String parentID) {
		Set<String> allTabIDs = DriverManager.getDriver().getWindowHandles();
		for (String id : allTabIDs) {
			if (!id.equals(parentID)) {
				DriverManager.getDriver().switchTo().window(id);
				DriverManager.getDriver().close();
			}
			DriverManager.getDriver().switchTo().window(parentID);
		}
	}

	public void sleepInSecond(long timeout) {
		try {
			Thread.sleep(timeout * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void backToPage() {
		DriverManager.getDriver().navigate().back();
	}

	public void refreshToPage() {
		DriverManager.getDriver().navigate().refresh();
	}

	public void forwardToPage() {
		DriverManager.getDriver().navigate().forward();
	}

	public WebElement getElement(String locator) {
		return DriverManager.getDriver().findElement(getByXpath(locator));
	}

	public WebElement getElement(String locator, String... params) {
		return DriverManager.getDriver().findElement(getByXpath(getDynamicLocator(locator, params)));
	}

	public List<WebElement> getElements(String locator) {
		return DriverManager.getDriver().findElements(getByXpath(locator));
	}

	public By getByXpath(String locator) {
		return By.xpath(locator);
	}

	public String getDynamicLocator(String locator, String... params) {
		return String.format(locator, (Object[]) params);
	}

	public void clickToElement(String locatorType) {
		this.getWebElement(locatorType).click();
	}

	public void clickToElement(String locatorType, String... dynamicValues) {
		this.getWebElement(getDynamicXpath(locatorType, dynamicValues)).click();
	}

	public void sendKeyToElement(String locator, String value) {
		WebElement element = this.getWebElement(locator);
		clearElementText(locator);
		element.sendKeys(value);
	}

	public void sendKeyToElement(String locator, String value, String... params) {
		WebElement element = this.getWebElement(getDynamicXpath(locator, params));
		clearElementText(locator, params);
		element.sendKeys(value);
	}
	
	public void clickElementIfDisplay(String locator) {
		try {
			overrideGlobalTimeout(shortTimeout);

			if (this.getWebElement(locator).isDisplayed()) {
				overrideGlobalTimeout(longTimeout);

				clickToElement(locator);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getElementSize(String locator) {
		return getElements(locator).size();
	}

	public int getElementSize(String locator, String... params) {
		locator = getDynamicLocator(locator, params);
		return getElements(locator).size();
	}

	public void selectDropdownByText(String locator, String itemText) {
		select = new Select(getElement(locator));
		select.selectByVisibleText(itemText);
	}

	public void selectDropdownByText(String locator, String itemText, String... params) {
		locator = getDynamicLocator(locator, params);
		select = new Select(getElement(locator));
		select.selectByVisibleText(itemText);
	}

	public String getSelectedItemDropdown(String locator) {
		select = new Select(getElement(locator));
		return select.getFirstSelectedOption().getText();
	}

	public String getSelectedItemDropdown(String locator, String... params) {
		locator = getDynamicLocator(locator, params);
		select = new Select(getElement(locator));
		return select.getFirstSelectedOption().getText();
	}

	public boolean isDropdownMultiple(String locator) {
		select = new Select(getElement(locator));
		return select.isMultiple();
	}

	public void selectItemInCustomDropdown(String parentLocator, String childItemLocator,
			String expectedItem) {
		getElement(parentLocator).click();
		sleepInSecond(1);

		explicitWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(longTimeout));
		List<WebElement> allItems = explicitWait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(getByXpath(childItemLocator)));

		for (WebElement item : allItems) {
			if (item.getText().trim().equals(expectedItem)) {
				jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
				jsExecutor.executeScript("arguments[0].scrollIntoView(true);", item);
				sleepInSecond(1);

				item.click();
				sleepInSecond(1);
				break;
			}
		}
	}

	public String getElementAttribute(String locator, String attriuteName) {
		return getElement(locator).getAttribute(attriuteName);
	}

	public String getElementAttribute(String locator, String attriuteName, String... params) {
		return getElement(getDynamicLocator(locator, params)).getAttribute(attriuteName);
	}

	public String getElementColor(String locator) {
		return getElement(locator).getCssValue("background-color");
	}

	public String getElementText(String locator) {
		return getElement(locator).getText();
	}

	public String getElementText(String locator, String... params) {
		return getElement(getDynamicLocator(locator, params)).getText().trim();
	}

	public void checkToCheckboxOrRadio(String locator) {
		if (!isElementSelected(locator)) {
			getElement(locator).click();
		}
	}

	public void checkToCheckboxOrRadio(String locator, String... params) {
		locator = getDynamicLocator(locator, params);
		if (!isElementSelected(locator)) {
			getElement(locator).click();
		}
	}

	public void uncheckToCheckbox(String locator) {
		if (isElementSelected(locator)) {
			getElement(locator).click();
		}
	}

	public boolean isElementDisplayed(WebDriver driver, String locator) {
		try {
			// Displayed : Visible on UI + In DOM
			// undisplayed : invisible on ui + in dom
			return getElement(locator).isDisplayed();
		} catch (Exception e) {
			// undisplayed : invisible on ui + not in dom
			e.printStackTrace();
			return false;
		}
	}

	public boolean isElementUndisplayed(String locator) {
		System.out.println("Start time =" + new Date().toString());
		overrideGlobalTimeout(shortTimeout);
		List<WebElement> elements = getElements(locator);
		overrideGlobalTimeout(longTimeout);

		if (elements.size() == 0) {
			System.out.println("Element not in DOM and not visible on UI");
			System.out.println("End time = " + new Date().toString());
			return true;
		} else if (elements.size() > 0 && !elements.get(0).isDisplayed()) {
			System.out.println("Element in DOM but not visible on UI");
			System.out.println("End time = " + new Date().toString());
			return true;
		} else {
			System.out.println("Element in DOM and visible on UI");
			return false;
		}
	}

	public boolean isElementUndisplayed(String locator, String... params) {
		System.out.println("Start time =" + new Date().toString());
		overrideGlobalTimeout(shortTimeout);
		List<WebElement> elements = getElements(getDynamicLocator(locator, params));
		overrideGlobalTimeout(longTimeout);

		if (elements.size() == 0) {
			System.out.println("Element not in DOM and not visible on UI");
			System.out.println("End time = " + new Date().toString());
			return true;
		} else if (elements.size() > 0 && !elements.get(0).isDisplayed()) {
			System.out.println("Element in DOM but not visible on UI");
			System.out.println("End time = " + new Date().toString());
			return true;
		} else {
			System.out.println("Element in DOM and visible on UI");
			return false;
		}
	}

	public void overrideGlobalTimeout(long timeout) {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}

	public boolean isElementDisplayed(String locator, String... params) {
		return getElement(getDynamicLocator(locator, params)).isDisplayed();
	}

	public boolean isElementEnabled(String locator) {
		return getElement(locator).isEnabled();
	}

	public boolean isElementEnabled(String locator, String... params) {
		return getElement(getDynamicLocator(locator, params)).isEnabled();
	}

	public boolean isElementSelected(String locator) {
		return getElement(locator).isSelected();
	}

	public boolean isElementSelected(String locator, String... params) {
		return getElement(getDynamicLocator(locator, params)).isSelected();
	}

	public WebDriver switchToIframeByElement(String locator) {
		return DriverManager.getDriver().switchTo().frame(getElement(locator));
	}

	public WebDriver switchToDefaultContent() {
		return DriverManager.getDriver().switchTo().defaultContent();
	}

	public void hoverToElement(String locator) {
		action = new Actions(DriverManager.getDriver());
		action.moveToElement(getElement(locator)).perform();
	}

	public void hoverToElement(String locator, String... params) {
		action = new Actions(DriverManager.getDriver());
		action.moveToElement(getElement(getDynamicLocator(locator, params))).perform();
	}

	public void doubleClickToElement(String locator) {
		action = new Actions(DriverManager.getDriver());
		action.doubleClick(getElement(locator)).perform();
	}

	public void rightClickToElement(String locator) {
		action = new Actions(DriverManager.getDriver());
		action.contextClick(getElement(locator)).perform();
	}

	public void dragAndDropElement(String sourceLocator, String tagetLocator) {
		action = new Actions(DriverManager.getDriver());
		action.dragAndDrop(getElement(sourceLocator), getElement(tagetLocator)).perform();
	}

	public void pressKeyToElement(String locator, Keys key) {
		action = new Actions(DriverManager.getDriver());
		action.sendKeys(getElement(locator), key).perform();
	}

	public void pressKeyToElement(String locator, String key) {
		action = new Actions(DriverManager.getDriver());
		action.sendKeys(getElement(locator), key).perform();
	}

	public void pressKeyToElement(String locator, Keys key, String... params) {
		action = new Actions(DriverManager.getDriver());
		locator = getDynamicLocator(locator, params);
		action.sendKeys(getElement(locator), key).perform();
	}

	public Object executeForBrowser(String javaScript) {
		jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
		return jsExecutor.executeScript(javaScript);
	}

	public String getInnerText() {
		jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
		return (String) jsExecutor.executeScript("return document.documentElement.innerText;");
	}

	public boolean areExpectedTextInInnerText(String textExpected) {
		jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
		String textActual = (String) jsExecutor
				.executeScript("return document.documentElement.innerText.match('" + textExpected + "')[0]");
		return textActual.equals(textExpected);
	}

	public void scrollToBottomPage() {
		jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
		jsExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public void navigateToUrlByJS(String url) {
		jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
		jsExecutor.executeScript("window.location = '" + url + "'");
	}

	public void highlightElement(String locator) {
		jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
		WebElement element = getElement(locator);
		String originalStyle = element.getAttribute("style");
		jsExecutor.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", element, "style",
				"border: 2px solid red; border-style: dashed;");
		sleepInSecond(1);
		jsExecutor.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", element, "style",
				originalStyle);
	}

	public void clickToElementByJS(String locator) {
		jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
		jsExecutor.executeScript("arguments[0].click();", getElement(locator));
	}

	public void scrollToElement(String locator) {
		jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", getElement(locator));
	}

	public void sendkeyToElementByJS(String locator, String value) {
		jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
		jsExecutor.executeScript("arguments[0].setAttribute('value', '" + value + "')", getElement(locator));
	}

	public void removeAttributeInDOM(String locator, String attributeRemove) {
		jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
		jsExecutor.executeScript("arguments[0].removeAttribute('" + attributeRemove + "');",
				getElement(locator));
	}

	public boolean isJQueryAjaxLoadedSuccess() {
		explicitWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(longTimeout));
		jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
		ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver driver) {
				return (Boolean) jsExecutor.executeScript("return (window.jQuery != null) && (jQuery.active === 0);");
			}
		};
		return explicitWait.until(jQueryLoad);
	}

	public boolean areJQueryAndJSLoadedSuccess() {
		explicitWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(timeout));
		jsExecutor = (JavascriptExecutor) DriverManager.getDriver();

		ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				try {
					return ((Long) jsExecutor.executeScript("return jQuery.active") == 0);
				} catch (Exception e) {
					return true;
				}
			}
		};

		ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				return jsExecutor.executeScript("return document.readyState").toString().equals("complete");
			}
		};

		return explicitWait.until(jQueryLoad) && explicitWait.until(jsLoad);
	}

	public String getElementValidationMessage(String locator) {
		jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
		return (String) jsExecutor.executeScript("return arguments[0].validationMessage;", getElement(locator));
	}

	public boolean isImageLoaded(String locator) {
		jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
		boolean status = (boolean) jsExecutor.executeScript(
				"return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
				getElement(locator));
		if (status) {
			return true;
		} else {
			return false;
		}
	}

	public void waitForElementVisible(String locator) {
		explicitWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(longTimeout));
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(getByXpath(locator)));
	}

	public void waitForElementVisible(String locator, String... params) {
		explicitWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(longTimeout));
		explicitWait
				.until(ExpectedConditions.visibilityOfElementLocated(getByXpath(getDynamicLocator(locator, params))));
	}

	public void waitForAllElementVisible(String locator) {
		explicitWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(longTimeout));
		explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(getByXpath(locator)));
	}

	public void waitForElementClickable(String locator, String... params) {
		explicitWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(longTimeout));
		explicitWait.until(ExpectedConditions.elementToBeClickable(getByXpath(getDynamicLocator(locator, params))));
	}

	public void waitForElementClickable(String locator) {
		explicitWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(longTimeout));
		explicitWait.until(ExpectedConditions.elementToBeClickable(getByXpath(locator)));
	}

	public void waitForElementInvisible(String locator, String... params) {
		explicitWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(longTimeout));
		explicitWait
				.until(ExpectedConditions.invisibilityOfElementLocated(getByXpath(getDynamicLocator(locator, params))));
	}

	public void waitForElementInvisible(String locator) {
		explicitWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(longTimeout));
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(getByXpath(locator)));
	}

	public void waitForElementInvisibleLongTime1(String locator) {
		explicitWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(longTimeout));
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(getByXpath(locator)));
	}
	
	public SaleHomePageObject loginToSystem(String userName, String password) {
		waitForElementVisible(BasePageUI.EDT_USER_LOGIN);
		sendKeyToElement(BasePageUI.EDT_USER_LOGIN, userName);
		waitForElementVisible(BasePageUI.EDT_PASSWORD_LOGIN);
		sendKeyToElement(BasePageUI.EDT_PASSWORD_LOGIN, password);
		clickToElement(BasePageUI.BTN_LOGIN);
		return new SaleHomePageObject();
	}

	public void connect(String... database) {
		hostName = database[0];
		dbName = database[1];
		userName = database[2];
		passWord = database[3];
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
//			conn = DriverManager.getConnection(connectionURL, userName, passWord);

			System.out.println("Connect success to DB: " + database);
		} catch (Exception e) {
			System.out.println("Can not connect to DB: " + database);
		}
	}

	public boolean isConnect(String... database) {
		hostName = database[0];
		dbName = database[1];
		userName = database[2];
		passWord = database[3];
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
//			conn = DriverManager.getConnection(connectionURL, userName, passWord);
			if (conn != null && !conn.isClosed()) {
				System.out.println("Connect success to DB: " + database);
				return true;
			} else {
				System.out.println("Can not connect to DB: " + database);
				return false;
			}

		} catch (Exception e) {
			System.out.println("Can not connect to DB: " + database);
			return false;
		}
	}

	/**
	 * lay du lieu tra ve tu cau lenh truy van, luu vao List 2 chieu
	 * 
	 * @param sql
	 * @param params
	 * @return
	 */
	public String[][] getData(String sql, String... params) {
		String[][] data = new String[100][100];
		try {
			System.out.println("Thuc thi cau lenh " + sql);
			ResultSet rs = executeSql(sql);
			int i = 0;
			if (rs != null) {
				while (rs.next()) {
					String[] currData = new String[params.length];
					for (int j = 0; j < params.length; j++) {
						System.out.println("Get collumn name " + params[j]);
						currData[j] = rs.getString(params[j]);
					}
					data[i] = currData;
					i++;
				}
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
			e.printStackTrace();
			return data;
		}
		return data;
	}

	public List<List<Object>> getDataObject(String sql, String... params) {

		List<List<Object>> result = new ArrayList<List<Object>>();
		try {
			System.out.println("Thuc thi cau lenh " + sql);
			ResultSet rs = executeSql(sql);
			int i = 0;
			if (rs != null) {
				while (rs.next()) {
					List<Object> data = new ArrayList<Object>();// 1 ban ghi gom nhieu cot
					for (int j = 0; j < params.length; j++) {
						// System.out.println("Get collumn name " + params[j]);
						data.add(rs.getObject(params[j])); // lay data cua tung cot
					}
					result.add(data); // lay toan bo ban ghi
					i++;
				}
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
			e.printStackTrace();
			return result;
		}
		return result;
	}
//	/**
//	 * So sanh du lieu tu cau lenh SQL tra ve voi mang du lieu
//	 * @param sql
//	 * @param params
//	 * @param expects
//	 * @return
//	 */
//	public boolean compareResult(String sql, String[] params, String[][] expects) {
//		String[][] data = getData(sql, params);
//		if (data != null){
//			if (expects.length > 0 && data.length > 0) {
//				for (int i = 0; i < expects.length; i++) {
//					if (expects[i] != null && data[i] != null) {
//						for (int j = 0; j < expects[i].length; j++) {
//							String s = StringUtils.safeTrim(data[i][j]);
//							System.out.println("Data get from DB: " + s);
//							String d = StringUtils.safeTrim(expects[i][j]);
//							System.out.println("Data expect: " + d);
//							if (d != null){
//								if (s != null && d != ""){
//								
//									if (!d.equalsIgnoreCase(s)) {
//										System.out.println("data not map " + s + " and " + d);
//										return false;
//									}
//								} else if (d.equals("")){
//									if (s != null){
//										return false;
//									}
//								}															
//							}
//						}
//					}
//				}
//			} else {
//				System.out.println("size of expects: " + expects.length);
//				System.out.println("size of data: " + data.length);
//				return false;
//			}
//		} else {
//			System.out.println("Data get from DB is null");
//			return false;
//		}
//		return true;
//	}

	/* thuc thi sql */
	public ResultSet executeSql(String sql) {
		try {
			if (conn == null) {
				connect();
			}
			Statement state = conn.createStatement();
			System.out.println("Thuc thi cau lenh " + sql);
			ResultSet rs = state.executeQuery(sql);
			// state.executeQuery("commit");
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Khong thuc thi duoc cau lenh: " + sql);
			Assert.assertFalse(false);
		}
		return null;
	}

	public boolean executeSql1(String sql) {
		boolean rs = false;
		try {
			if (conn == null) {
				connect();
			}
			Statement state = conn.createStatement();
			System.out.println("Thuc thi cau lenh " + sql);
			rs = state.execute(sql);
			// state.executeQuery("commit");
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Khong thuc thi duoc cau lenh: " + sql);
			Assert.assertFalse(false);
		}
		return rs;
	}

	/**
	 * Dem so luong ban ghi co ton tai theo dieu kien cau lenh truy van
	 * 
	 * @param sql
	 * @return
	 */
	public String checkRecordExist(String sql) {
		try {
			System.out.println("Thuc thu cau lenh " + sql);
			ResultSet rs = executeSql(sql);
			while (rs.next()) {
				return rs.getString("count(*)");
			}
		} catch (Exception e) {

		}
		return "";
	}

	// Tách chuỗi
	public String[] shouldMatchRegex(String pattern, String message) {
		String[] result = new String[10];
		Pattern p = Pattern.compile(pattern);
		Matcher matcher = p.matcher(message);
		if (matcher.find()) {
			for (int i = 0; i < matcher.groupCount() + 1; i++) {
				result[i] = matcher.group(i);
			}
		} else {
			Assert.fail("String, patten does not match");
		}
		return result;
	}

	public void verifyContains(String s1, String s2) {
		if (s1 != null && s2 != null) {
			Assert.assertFalse(!s2.contains(s1), "Chuỗi " + s1 + " không nằm trong chuỗi " + s2);
		}
	}

	public String formatDateToString(Date date, String format) {
		DateFormat f = new SimpleDateFormat(format);
		String dat = "";
		try {
			dat = f.format(date);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
			System.out.println("Can not convert date");
		}
		System.out.println("dat" + dat);
		return dat;
	}

	public Date formatDate(String format, String date) {
		DateFormat f = new SimpleDateFormat(format);
		Date dat = null;
		try {
			dat = (Date) f.parse(date);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
			System.out.println("Can not convert date");
		}
		return dat;
	}

	public Date subtractDays(Date date, int days) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DATE, -days);

		return cal.getTime();
	}

	public String subtractDays(int days) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeZone(TimeZone.getTimeZone("GMT"));
		cal.add(Calendar.DATE, days);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.format(cal.getTime());
	}

	public String getTimeCurrent(String format) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		return dtf.format(now);
	}

//    public Long subtractTime(Date start, Date end) {
//    	Long diff;
//    	diff = start.getTime()-end.getTime();
//    	diff = TimeUnit.MILLISECONDS.toSeconds(diff);
//    	return diff;
//    }
	public String convertDateTest(String format1, String format2, String oldstring) {
		// String oldstring = "2011-01-18 00:00:00.0";
		Date date = new Date();
		try {
			date = new SimpleDateFormat(format1).parse(oldstring);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String test = new SimpleDateFormat(format2).format(date);
		System.out.println(test); // 2011-01-18

		return test;
	}

	public Long subtractTimeTest(String format, String date2) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));

		// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd
		// HH:mm:ss");

		LocalDateTime dateTime1 = LocalDateTime.parse(dtf.format(now), dtf);
		LocalDateTime dateTime2 = LocalDateTime.parse(date2, dtf);

		long diffInMilli = java.time.Duration.between(dateTime1, dateTime2).toMillis();

		return diffInMilli;
	}

	public int subtractTime(Date start, Date end) {
		Long diff;
		diff = start.getTime() - end.getTime();
		diff = TimeUnit.MILLISECONDS.toSeconds(diff);
		int dis = diff.intValue();
		return dis;
	}

	/**
	 * Dong connection
	 */
	public void close() {
		try {
			if (conn != null) {
				conn.close();
				System.out.println("Close connect to DB");
			}
		} catch (Exception e) {
			System.out.println("Can not close connection to DB");
		}
	}

	public static String read(InputStream input) throws IOException {
		try (BufferedReader buffer = new BufferedReader(new InputStreamReader(input))) {
			return buffer.lines().collect(Collectors.joining("\n"));
		}
	}

	public static String[] callWS(String urlText, String data, String... column) {
		String output = "";
		String[] da = new String[100];
		try {
			URL url = new URL(urlText);
			URLConnection connection = url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestProperty("Content-Type", "text/xml");
			connection.setRequestProperty("Accept", "text/xml");
			System.out.println("connection: " + connection);
			OutputStreamWriter osw = new OutputStreamWriter(connection.getOutputStream());
			osw.write(data);
			osw.flush();
			osw.close();
			InputStream in = connection.getInputStream();
			output = read(in);
			System.out.println("output cua WS: " + output);
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			InputSource src = new InputSource();
			src.setCharacterStream(new StringReader(output));
			Document doc = builder.parse(src);
			if (column.length > 0) {
				for (int i = 0; i < column.length; i++) {
					if (doc.getElementsByTagName(column[i]).item(0).getTextContent() != null) {
						da[i] = doc.getElementsByTagName(column[i]).item(0).getTextContent();
						System.out.println("Gia tri trong tag " + column[i] + "la: " + da[i]);
					}
				}
			}
		} catch (IOException | ParserConfigurationException | SAXException e) {
			e.printStackTrace();
			assertFalse(true, "Co loi khi thuc hien WS");

		}
		return da;
	}

	public static boolean callWS2(String urlText, String token, String method) {
		int responscode = 0;
		try {
			URL url = new URL(urlText);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestProperty("Content-Type", "text/xml");
			connection.setRequestProperty("Accept", "text/xml");
			connection.setRequestProperty("Authorization", token);
			connection.setRequestMethod(method);
			connection.setFixedLengthStreamingMode(0);
			System.out.println("connection: " + connection);
			// OutputStreamWriter osw = new
			// OutputStreamWriter(connection.getOutputStream());
			responscode = connection.getResponseCode();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (responscode == 200) ? true : false;
	}

	public static boolean callWS3(String urlText, String token, String method) {
		int responscode = 0;
		try {
			URL url = new URL(urlText);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestProperty("Authorization", token);
			connection.setRequestMethod(method);
			connection.setFixedLengthStreamingMode(0);
			System.out.println("connection: " + connection);
			// OutputStreamWriter osw = new
			// OutputStreamWriter(connection.getOutputStream());
			responscode = connection.getResponseCode();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (responscode == 200) ? true : false;
	}

	/**
	 * 
	 * @param sql
	 */
	public void executeManySQL(String... sql) {
		if (sql.length > 0) {
			try {
				if (conn == null) {
					connect();
				}
				Statement state = conn.createStatement();
				for (int i = 0; i < sql.length; i++) {
					state.executeQuery(sql[i]);
				}
			} catch (Exception e) {
				System.out.println("Khong thuc hien duoc cau lenh sql " + sql);
			}

		}
	}

	public void executeManySQL1(String... sql) {
		if (sql.length > 0) {
			try {
				if (conn == null) {
					connect();
				}
				Statement state = conn.createStatement();
				for (int i = 0; i < sql.length; i++) {
					state.execute(sql[i]);
				}
			} catch (Exception e) {
				System.out.println("Khong thuc hien duoc cau lenh sql " + sql);
			}

		}
	}

//		public String getResponseFromUrl(String urlText, String method,List<RequestHeaderUrl> header, String body, String key) {
//
//			String value = new String();
//			String responseText = new String();
//			try {
//				URL url = new URL(urlText);
//				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//				connection.setDoOutput(true);
//				//sconnection.setRequestProperty("Accept", "application/json");
//				for(int i =0; i<header.size(); i++) {
//				connection.setRequestProperty(header.get(i).getKey(), header.get(i).getValue());
//				}
//				while(!connection.getRequestMethod().equals(method))
//				     connection.setRequestMethod(method);
//				connection.setDoOutput(true);
//				try (OutputStream os = connection.getOutputStream()) {
//					byte[] input = body.getBytes("utf-8");
//					os.write(input, 0, input.length);
//				}
//				try (BufferedReader br = new BufferedReader(
//						new InputStreamReader(connection.getInputStream(), "utf-8"))) {
//					StringBuilder response = new StringBuilder();
//					String responseLine = null;
//					while ((responseLine = br.readLine()) != null) {
//						response.append(responseLine.trim());
//					}
//					responseText = response.toString();
//				}
//				
//
//			} catch (MalformedURLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			String[] tmp = responseText.split(":");
//	         for(int i =0; i<tmp.length;i++){
//	             if(tmp[i].indexOf(key)>0) {
//	            	 value = new String(tmp[i+1].split(",")[0]);
//	            	 value = new String(value.replace('\"','\0'));
//	                 break;
//	             }
//	         }
//           return value.trim();
//		}

//		public String getResponseFromUrlObject(String urlText, String method,List<RequestHeaderUrl> header, String body, String key) {
//			String value = new String();
//			String responseText = new String();
//			try {
//				URL url = new URL(urlText);
//				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//			
//				connection.setRequestProperty("Accept", "application/json, text/plain");
//				for(int i =0; i<header.size(); i++) {
//				connection.setRequestProperty(header.get(i).getKey(), header.get(i).getValue());
//				}
//			
//				connection.setRequestMethod(method);
//				connection.setDoInput(true);
//				connection.setDoOutput(true);
//				if(method == "POST") {
//					
//					try (OutputStream os = connection.getOutputStream()) {
//						byte[] input = body.getBytes("utf-8");
//						os.write(input, 0, input.length);
//					}
//				}
//				try (BufferedReader br = new BufferedReader(
//						new InputStreamReader(connection.getInputStream()))) {
//					StringBuilder response = new StringBuilder();
//					String responseLine = null;
//					while ((responseLine = br.readLine()) != null) {
//						response.append(responseLine.trim());
//					}
//					responseText = response.toString();
//				}
//				
//			} catch (MalformedURLException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//           return responseText.trim();
//		}
//		

	public String getItemFromLocalStorage(WebDriver driver, String key) {
		jsExecutor = (JavascriptExecutor) driver;
		return (String) jsExecutor.executeScript(String.format("return window.localStorage.getItem('%s');", key));
	}

	public String getScreenhot(WebDriver driver) {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots" under src
		// folder
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + "errorCapture_" + dateName
				+ ".png";
		File finalDestination = new File(destination);
		try {
			FileUtils.copyFile(source, finalDestination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return destination;
	}

	public String format(long timestampMilliSec, String timezone, String pattern) {
		Instant instant = Instant.ofEpochMilli(timestampMilliSec);
		ZoneId zoneId = ZoneId.of(timezone);
		ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, zoneId);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		return zonedDateTime.format(formatter);
	}

	private String hostName;
	private String pt;
	private String dbName;
	private String userName;
	private String passWord;

	private Connection conn;
	private Alert alert;
	private Select select;
	private Actions action;
	private long longTimeout = GlobalConstants.LONG_TIMEOUT;
	private long shortTimeout = GlobalConstants.SHOT_TIMEOUT;
	private long timeout = GlobalConstants.LONG_TIMEOUT;

	private WebDriverWait explicitWait;
	private JavascriptExecutor jsExecutor;


	public static String getRandomInt() {
		return randomNumeric(5);
	}

	public static String getRandomString() {
		return RandomStringUtils.randomAlphabetic(5);
	}

	public static void sleepMiliSecond(double miliSecond) {
		try {
			Thread.sleep((long) (miliSecond));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
