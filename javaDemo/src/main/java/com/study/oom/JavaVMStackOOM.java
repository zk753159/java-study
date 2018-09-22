package com.study.oom;

/**
 * -Xss2M
 * @author xiaojuan
 *
 */
public class JavaVMStackOOM {

	private void dontStop() {
		while(true) {
			
		}
	}
	
	public void stackLeakByThread() {
		int i = 0;
		while(true) {
			Thread thread = new Thread(new Runnable() {

				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName());
					dontStop();
					
				}
				
			},"thread_" + i++);
			thread.start();
		}
	}
	public static void main(String[] args) {
		JavaVMStackOOM oom = new JavaVMStackOOM();
		oom.stackLeakByThread();

	}

}
