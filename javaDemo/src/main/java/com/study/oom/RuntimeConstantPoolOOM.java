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
		//使用list保持常量池应用，避免Full GC回收常量池行为
		List<String> list = new ArrayList<String>();
		
		int i = 0;
		while(true) {
			list.add(String.valueOf(i++).intern());
		}
	}

}
