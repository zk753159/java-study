package com.study.oom;

/**
 * -Xss128k
 * @author xiaojuan
 *
 */
public class JavaVMStackSOF {

	private int stackLength = 1;
	
	public void stackLeak() {
		stackLength++;
		System.out.println(stackLength);
		stackLeak();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaVMStackSOF oom = new JavaVMStackSOF();
		oom.stackLeak();
	}

}
