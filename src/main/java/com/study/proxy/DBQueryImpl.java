package com.study.proxy;

/**
 * Ŀ��ʵ����
 * @author xiaojuan
 *
 */
public class DBQueryImpl implements IDBQuery{

	@Override
	public String getUser() {
		return "zhangsan";
	}

	@Override
	public String getAccout() {
		// TODO Auto-generated method stub
		return "4646446464";
	}

	@Override
	public String getTxn() {
		// TODO Auto-generated method stub
		return "45.21";
	}
	
	
	

}
