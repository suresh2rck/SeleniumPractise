package com.tcf.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationManager {

	public Properties ps = new Properties();

	public ConfigurationManager() {

		try {
			// load the files path
			File file = new File(
					"C:\\Users\\pc2\\eclipse-workspace\\SeleniumPractise\\src\\test\\resource\\properties\\config.properties");
			// read the file
			FileInputStream fis = new FileInputStream(file);

			ps.load(fis);

		} catch (Exception e) {

			e.printStackTrace();
			System.out.println(e);

		}

	}

	public String getURL() {
		String url = ps.getProperty("url");

		if (url == " " && url == null) {

			System.out.println("url not found in property file");
		}

		return url;

	}

	public String getbrowser() {
		String browser = ps.getProperty("browser");

		if (browser == " " && browser == null) {

			System.out.println("url not found in property file");
		}

		return browser;

	}
}
