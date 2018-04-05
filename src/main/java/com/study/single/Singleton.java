package com.study.single;

import org.apache.log4j.Logger;

public class Singleton {
	
	private Logger log = Logger.getLogger(Singleton.class);
	private static Singleton instance = new Singleton();
	
	private Singleton() {
		System.out.println("Singleton");
		log.info("Singleton");
	}
	
	public static Singleton getInstance() {
		return instance;
	}
}
