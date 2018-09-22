package com.study.util;

import org.apache.log4j.PropertyConfigurator;

public class LogUtil {
	
	public static void initLog() {
		String filePath = Thread.currentThread().getContextClassLoader().getResource("log4j.properties").getPath();
		PropertyConfigurator.configure(filePath);
	}

}
