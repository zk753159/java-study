package com.study.proxy;

public class Test {

	public static void main(String[] args) {
		DBQueryDynamicProxy proxy = new DBQueryDynamicProxy();
		IDBQuery query = (IDBQuery) proxy.createProxy(new DBQueryImpl());
		System.out.println(query.getUser());
		System.out.println(query.getAccout());

	}

}
