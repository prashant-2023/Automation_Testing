package com.constants;

import java.io.File;

public class Constants {

	public static final String CONFIG_FILE_PATH = System.getProperty("user.dir") + File.separator + "src" +  File.separator 
			+ "main" + File.separator + "java" + File.separator + "properties" + File.separator +"config.properties";
	public static final long WEBDRIVER_WAIT_TIMEOUT = 5;
	public static final long PAGE_LOAD_TIMEOUT = 20;
	public static final long IMPLICIT_WAIT_TIMEOUT = 10;
}
