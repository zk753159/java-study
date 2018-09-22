package com.study.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DBQueryDynamicProxy implements InvocationHandler{

	//Ŀ�����
	private Object target;
	
	//���������ʵ����ķ���������ʱ����ִ��ʱ��ִ��invoke����
	//InvocationHandler�ӿڵķ�����proxy��ʾ����method��ʾԭ���󱻵��õķ�����args��ʾ�����Ĳ���
	//
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("��ʼ��ѯ���ݿ⣺��������");
		//����Ŀ�귽��
		Object ret = method.invoke(target, args);
		return ret;
	}
	
	//��ȡ�������
	public Object createProxy(Object target) {
		//ָ��Ŀ�����
		this.target = target;
		//�÷�������ָ�����������һ��ӿڼ����ô��������ɶ�̬������ʵ��
		//��һ�����������������������������Ҫ��ָ��ΪĿ�����ͬһ���������
		//�ڶ�������Ҫʵ�ֺ�Ŀ�����һ���Ľӿڣ�����ֻ��Ҫ�õ�Ŀ�����Ľӿ�
		//����������������Щ�����صķ����ڱ�����ʱ��Ҫִ���ĸ�InvocationHandler��invoke����
		Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
		return proxy;
	}

}
