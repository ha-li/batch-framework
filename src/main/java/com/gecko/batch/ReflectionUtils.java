package com.gecko.batch;

import java.lang.reflect.Constructor;

public class ReflectionUtils {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Object createInstance(Class clzz, Class[] pParameterTypes, Object[] initArgs) {
		try {
			Constructor ctor = clzz.getDeclaredConstructor(pParameterTypes);
			ctor.setAccessible(true);
			return ctor.newInstance(initArgs);
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static Object createInstance(String className, Class[] pParameterTypes, Object[] initArgs) {
		try {
			Class clazs = Class.forName(className);
			return createInstance(clazs, pParameterTypes, initArgs);
		} catch (Exception e) {
			throw new RuntimeException();
		}

	}
}
