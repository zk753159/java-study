package com.study.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DBQueryDynamicProxy implements InvocationHandler{

	//目标对象
	private Object target;
	
	//关联的这个实现类的方法被调用时将被执行时，执行invoke方法
	//InvocationHandler接口的方法，proxy表示代理，method表示原对象被调用的方法，args表示方法的参数
	//
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("开始查询数据库：》》》》");
		//调用目标方法
		Object ret = method.invoke(target, args);
		return ret;
	}
	
	//获取代理对象
	public Object createProxy(Object target) {
		//指定目标对象
		this.target = target;
		//该方法用于指定类加载器、一组接口及调用处理器生成动态代理类实例
		//第一个参数产生代理对象的类加载器，需要将指定为目标对象同一个类加载器
		//第二个参数要实现和目标对象一样的接口，所以只需要拿到目标对象的接口
		//第三个参数表明这些被拦截的方法在被拦截时需要执行哪个InvocationHandler的invoke方法
		Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
		return proxy;
	}

}
