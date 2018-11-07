package com.test.video;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import atu.testrecorder.ATUTestRecorder;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class video {

	WebDriver driver;
	ATUTestRecorder recorder;

	@Test
	public void setup() throws Exception {
		DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		// Created object of ATUTestRecorder
		// Provide path to store videos and file name format.
		recorder = new ATUTestRecorder("C:\\ScriptVideos", "TestVideo-" + dateFormat.format(date), false);
		// To start video recording.
		recorder.start();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lalit\\Documents\\Lalit\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
	driver.manage().window().setSize(new Dimension(400, 768));
		Thread.sleep(2000);

		driver.manage().window().setSize(new Dimension(400, 400));
		Thread.sleep(2000);

		driver.manage().window().setSize(new Dimension(1024, 400));
	driver.quit();
		// To stop video recording.
	//	recorder.stop();

		

	}

	


}
