package com.study.gc;

/**
 * 新生代GC:指发生在新生代的垃圾收集动作，因为Java对象大多都具备朝生夕灭的特性，
 * 所以Minor GC非常频繁，一般回收速度也比较快
 * @author xiaojuan
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8
 */
public class MinorGC {
	private static final int _1MB = 1024*1024;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testAllocation();
	//	System.out.println("-----------------------");
	}
	
	public static void testAllocation() {
		byte[] allocation1,allocation2,allocation3,allocation4;
		allocation1 = new byte[2*_1MB];
		allocation2 = new byte[2*_1MB];
		allocation3 = new byte[2*_1MB];
		allocation4 = new byte[2*_1MB];
	}

}
