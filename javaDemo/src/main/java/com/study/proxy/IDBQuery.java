package com.study.proxy;

/**
 * 目标接口
 * @author xiaojuan
 *
 */
public interface IDBQuery {
	//查询用户
	public String getUser();
	//查询账户
	public String getAccout();
	//查询金额
	public String getTxn();
}
