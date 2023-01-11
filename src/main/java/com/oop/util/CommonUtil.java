package com.oop.util;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.*;

public class CommonUtil {
	
	public static final Logger log = Logger.getLogger(CommonUtil.class.getName());
	
	public static final Properties properties = new Properties();
	
	static {
		try {
			properties.load(CommonUtil.class.getResourceAsStream("config_haritha.properties"));
		} catch(IOException e) {
			log.log(Level.SEVERE, e.getMessage());
		}
	}
}
