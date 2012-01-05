package org.eclipselabs.spray.wizard.tests;

import java.lang.reflect.Field;

public abstract class AbstractBuilder<T extends AbstractBuilder<T>> {
	private T t;
	
	@SuppressWarnings("unchecked")
	protected AbstractBuilder() {
		setInstance((T) this);
	}
	
	protected void setInstance(T t) {
		this.t = t;
	}
	
	public T getInstance() {
		return t;
	}
	
	protected T setValue(Object value, String attributeName) {
		Class<?> clazz = t.getClass();
		try {
			Field attribute = clazz.getDeclaredField(attributeName);
			attribute.setAccessible(true);
			attribute.set(t, value);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
		return t;
	}
}
