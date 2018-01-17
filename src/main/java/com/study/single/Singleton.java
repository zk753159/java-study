package com.study.single;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton() {
		System.out.println("Singleton");
	}
	
	public static Singleton getInstance() {
		return instance;
	}
}
