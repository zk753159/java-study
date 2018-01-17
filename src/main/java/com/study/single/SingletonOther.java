package com.study.single;


public class SingletonOther {
	private static SingletonOther instance = null;
	
	private SingletonOther() {
		System.out.println("SingletonOther");
	}
	
	public static synchronized SingletonOther getInstance() {
		if (null == instance) {
			instance = new SingletonOther();
		}
		return instance;
	}
}
