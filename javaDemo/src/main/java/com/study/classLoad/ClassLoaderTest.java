package com.study.classLoad;

import java.io.IOException;
import java.io.InputStream;
/**
 * 设计一个简单的类加载器
 * @author xiaojuan
 *
 */
public class ClassLoaderTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ClassLoader myLoader = new ClassLoader(){

			@Override
			public Class<?> loadClass(String name)
					throws ClassNotFoundException {
				try {
					//String filename = "com.study.classLoad.ClassLoaderTest";
					String filename = name.substring(name.lastIndexOf(".") + 1) + ".class";
					InputStream is = getClass().getResourceAsStream(filename);
					if (is == null) {
						return super.loadClass(name);
					}
					byte[] b = new byte[is.available()];
					is.read(b);
					return defineClass(name, b, 0, b.length);
				} catch (IOException e) {
					throw new ClassNotFoundException();
				}
				
			}
			
		};
		Object obj = myLoader.loadClass("com.study.classLoad.ClassLoaderTest").newInstance();
		System.out.println(obj.getClass());
		System.out.println(obj instanceof com.study.classLoad.ClassLoaderTest);
		
	}

}
