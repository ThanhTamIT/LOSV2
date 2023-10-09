package commons;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import driver.DriverManager;
import exception.BrowserNotSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    protected final Log log;

    @Parameters({"browser"})
    @BeforeSuite
    public void initBeforeSuite(@Optional("chrome") String browser) {
    }

    @Parameters({"browser", "appUrl"})
    @BeforeClass
    public void createDriver(@Optional("chrome") String browserName, @Optional("appUrl") String appUrl) {
        WebDriver driver = getBrowserDriver(browserName, appUrl);
        DriverManager.setDriver(driver);
    }

//    @AfterClass
    public static void closeDriver() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (DriverManager.getDriver() != null) {
            DriverManager.getDriver().quit();
        }
    }

    public BaseTest() {
        log = LogFactory.getLog(getClass());
    }

    protected WebDriver getBrowserDriver(String browserName, String appUrl) {
        BrowserList browserList = BrowserList.valueOf(browserName.toUpperCase());
        WebDriver driver;
        switch (browserList) {
            case CHROME:
                WebDriverManager.chromedriver().clearDriverCache();
                WebDriverManager.chromedriver().clearResolutionCache();
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(chromeOptions);
                break;

            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, GlobalConstants.PROJECT_PATH + "\\browserLogs\\FirefoxLog.log");
                driver = new FirefoxDriver();
                break;

            case EDGE:
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            case IE:
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;

            default:
                throw new BrowserNotSupport(browserName);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(GlobalConstants.LONG_TIMEOUT, TimeUnit.SECONDS);
        return driver;
    }

    public WebDriver getDriverInstance() {
        return DriverManager.getDriver();
    }

    protected boolean verifyEquals(Object actual, Object expected) {
        boolean pass = true;
        try {
            Assert.assertEquals(actual, expected);
            log.info(" -------------------------- PASSED -------------------------- ");
        } catch (Throwable e) {
            log.info(" -------------------------- FAILED -------------------------- ");
            pass = false;
            VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
            Reporter.getCurrentTestResult().setThrowable(e);
        }
        return pass;
    }

    protected String getCurrentDate() {
        DateTime nowUTC = new DateTime();
        int day = nowUTC.getDayOfMonth();
        if (day < 10) {
            String dayValue = "0" + day;
            return dayValue;
        }
        return String.valueOf(day);
    }

    protected String getCurrentMonth() {
        DateTime now = new DateTime();
        int month = now.getMonthOfYear();
        if (month < 10) {
            String monthValue = "0" + month;
            return monthValue;
        }
        return String.valueOf(month);
    }

    protected String getCurrentYear() {
        DateTime now = new DateTime();
        return String.valueOf(now.getYear());
    }

    protected String getCurrentDay() {
        return getCurrentDate() + "/" + getCurrentMonth() + "/" + getCurrentYear();
    }

    String projectLocation = System.getProperty("user.dir");
    String osName = System.getProperty("os.name");

    private enum BROWSER {
        CHROME, FIREFOX, IE, SAFARI, EDGE_LEGACY, EDGE_CHROMIUM, H_CHROME, H_FIREFOX;
    }

    public WebDriver getWebDriver() {
        return DriverManager.getDriver();
    }

    private String getSlash(String folderName) {
        String separator = File.separator;
        System.out.println(separator);
        return separator + folderName + separator;
    }

    protected String getRandomEmail() {
        Random rand = new Random();
        return "testing" + rand.nextInt(99999) + "@gmail.net";
    }

    private boolean checkTrue(boolean condition) {
        boolean pass = true;
        try {
            if (condition == true) {
                log.info(" -------------------------- PASSED -------------------------- ");
            } else {
                log.info(" -------------------------- FAILED -------------------------- ");
            }
            Assert.assertTrue(condition);
        } catch (Throwable e) {
            pass = false;

            VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
            Reporter.getCurrentTestResult().setThrowable(e);
        }
        return pass;
    }

    protected boolean verifyTrue(boolean condition) {
        return checkTrue(condition);
    }

    private boolean checkFailed(boolean condition) {
        boolean pass = true;
        try {
            if (condition == false) {
                log.info(" -------------------------- PASSED -------------------------- ");
            } else {
                log.info(" -------------------------- FAILED -------------------------- ");
            }
            Assert.assertFalse(condition);
        } catch (Throwable e) {
            pass = false;
            VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
            Reporter.getCurrentTestResult().setThrowable(e);
        }
        return pass;
    }

    protected boolean verifyFalse(boolean condition) {
        return checkFailed(condition);
    }

    private boolean checkEquals(Object actual, Object expected) {
        boolean pass = true;
        try {
            Assert.assertEquals(actual, expected);
            log.info(" -------------------------- PASSED -------------------------- ");
        } catch (Throwable e) {
            pass = false;
            log.info(" -------------------------- FAILED -------------------------- ");
            VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
            Reporter.getCurrentTestResult().setThrowable(e);
        }
        return pass;
    }

    public void deleteAllFilesInReportNGScreenshot() {
        log.info("-------------- START delete file in folder ---------------");
        try {
            String workingDir = System.getProperty("user.dir");
            String pathFolderDownload = workingDir + "/screenshotReportNG";
            File file = new File(pathFolderDownload);
            File[] listOfFiles = file.listFiles();
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    new File(listOfFiles[i].toString()).delete();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        log.info("-------------- END delete file in folder ---------------");
    }

    protected void cleanDriverInstance() {
        String cmd = "";
        try {
            String osName = System.getProperty("os.name").toLowerCase();
            log.info("OS name = " + osName);

            if (DriverManager.getDriver().toString().contains("chrome")) {
                if (osName.contains("mac")) {
                    cmd = "pkill chromedriver";
                } else if (osName.contains("windows")) {
                    cmd = "taskkill /F /FI \"IMAGENAME eq chromedriver*\"";
                }
            } else if (DriverManager.getDriver().toString().contains("internetexplorer")) {
                if (osName.contains("window")) {
                    cmd = "taskkill /F /FI \"IMAGENAME eq IEDriverServer*\"";
                }
            } else if (DriverManager.getDriver().toString().contains("firefox")) {
                if (osName.contains("mac")) {
                    cmd = "pkill geckodriver";
                } else if (osName.contains("windows")) {
                    cmd = "taskkill /F /FI \"IMAGENAME eq geckodriver*\"";
                }
            } else if (DriverManager.getDriver().toString().contains("edge")) {
                if (osName.contains("mac")) {
                    cmd = "pkill msedgedriver";
                } else if (osName.contains("windows")) {
                    cmd = "taskkill /F /FI \"IMAGENAME eq msedgedriver*\"";
                }
            }

            if (DriverManager.getDriver() != null) {
                DriverManager.getDriver().manage().deleteAllCookies();
                DriverManager.getDriver().quit();
            }

        } catch (Exception e) {
            log.info(e.getMessage());
        } finally {
            try {
                Process process = Runtime.getRuntime().exec(cmd);
                process.waitFor();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
