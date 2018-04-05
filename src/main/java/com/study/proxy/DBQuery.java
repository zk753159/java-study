package com.study.proxy;

public class DBQuery implements IDBQuery{

	public DBQuery() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public String request() {
		return "request string";
	}

}
