package com.study.proxy;

public class Test {

	public static void main(String[] args) {
		System.out.println(DBQueryDynamicProxy.createProxy().request());

	}

}
