package com.test.video;

import static org.testng.Assert.assertEquals;
import java.io.File;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import atu.testrecorder.ATUTestRecorder;

public class startRecording {

	public static final String USER_DIR = "user.dir";
	public static final String DOWNLOADED_FILES_FOLDER = "downloadFiles";
	WebDriver driver;
	File srcFile;
	File Pass_File_Folder1;
	public static final String Pass_File_Folder = "PassTestFolder";



	ATUTestRecorder recorder;
	String lalit = "LALIT";
	String ankit = "Ankit";

/*	@Test
public void Start() throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lalit\\Documents\\Lalit\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://www.google.com");
		assertEquals(true, false);

		driver.quit();

}
*/@Test
	public void Start1() throws Exception {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lalit\\Documents\\Lalit\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		
		driver.get("https://www.facebook.com/");

		assertEquals(true, true);
		driver.quit();
	

	}
@BeforeMethod
	public void startRecording(Method  result) throws Exception {

		recorder = new ATUTestRecorder(System.getProperty(USER_DIR) + File.separator + DOWNLOADED_FILES_FOLDER,
				result.getName(), false);

		recorder.start();

	}
public void stopRecording() throws Exception {

		recorder.stop();
	}

	@AfterMethod
	public void finalAssertTrue(ITestResult result) throws Exception {
		stopRecording();
		if (ITestResult.SUCCESS == result.getStatus()) {
			srcFile = new File(System.getProperty(USER_DIR) + File.separator + DOWNLOADED_FILES_FOLDER + File.separator
					+ result.getMethod().getMethodName() + ".mov");

			Pass_File_Folder1 = new File(System.getProperty(USER_DIR) + File.separator + Pass_File_Folder + File.separator
					+ result.getMethod().getMethodName() + ".mov");
			FileUtils.moveFile(srcFile, Pass_File_Folder1);
		}

	}
}
