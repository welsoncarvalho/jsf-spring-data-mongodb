package br.com.teste.jsdm.util;

public class ClassUtil {

	public static <T extends Object> T newInstance(String clazzS) {
		Class<T> clazz = getClassToInstance(clazzS);
		try {
			return (T) clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	private static <T extends Object> Class<T> getClassToInstance(String clazzS) {
		if (clazzS == "teste") {
			
		} {
			System.out.println(clazzS);
		}
		
		try {
			return (Class<T>) Thread.currentThread().getContextClassLoader().loadClass(clazzS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
