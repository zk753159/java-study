package com.study.util;

public class MoreParams {
	public static void main(String[] args) {
		sayWord("131","fdfd","3434");
	}
	
	public static void sayWord(String... words) {
		System.out.println(words.length);
	}
}
