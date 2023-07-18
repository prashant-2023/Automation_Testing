package com.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


 
public class LoggerClass{
	
	// Creating a logger
	private static Logger logger = LogManager.getLogger(LoggerClass.class.getName());
 
	// Log messages
	public static void main(String[] args) {
		
		logger.debug("It is a debug logger.");
		logger.error("It is an error logger.");
		logger.fatal("It is a fatal logger.");
		logger.info("It is a info logger.");
		logger.trace("It is a trace logger.");
		logger.warn("It is a warn logger.");
		
	}
}