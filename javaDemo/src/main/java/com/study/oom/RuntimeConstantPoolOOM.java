package com.study.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * -XX:PermSize=10M -XX:MaxPermSize=10M
 * @author xiaojuan
 *
 */
public class RuntimeConstantPoolOOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʹ��list���ֳ�����Ӧ�ã�����Full GC���ճ�������Ϊ
		List<String> list = new ArrayList<String>();
		
		int i = 0;
		while(true) {
			list.add(String.valueOf(i++).intern());
		}
	}

}
