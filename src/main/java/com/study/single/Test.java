package com.study.single;

import com.study.util.LogUtil;

public class Test {
	public static void main(String[] args) {
		//LogUtil.initLog();
		Singleton.getInstance();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SingletonOther.getInstance();
	}
}
