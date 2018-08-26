package com.study.oom;

import java.util.ArrayList;
import java.util.List;
/**
 * -Xms20M -Xmx20M
 * @author xiaojuan
 *
 */
public class HeapOOM {
	
	static class OOMObject {
		
	}
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<OOMObject>();
		
		while(true) {
			list.add(new OOMObject());
		}

	}

}
