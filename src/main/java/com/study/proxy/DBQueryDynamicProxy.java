package com.study.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DBQueryDynamicProxy implements InvocationHandler{

	private IDBQuery real;
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if (real == null) {
			real  = new DBQuery();
		}
		return real.request();
	}
	
	//获取代理对象
	public static IDBQuery createProxy() {
		IDBQuery proxy = 
				(IDBQuery) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{IDBQuery.class}, new DBQueryDynamicProxy());
		return proxy;
	}

}
