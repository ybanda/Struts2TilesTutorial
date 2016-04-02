package com.struts2Tiles.tutorial.practise;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtil {
	
	public void processFormData(String className, String operation){
		Field[] fields = null;
		Method method = null;
		try {
			fields = getFields(className);
			for (int i = 0; i < fields.length; i++) {
				method = getMethod(className, fields[i].getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Class getClass(String className){
		Class classDetails = null;
		try {
			classDetails = Class.forName(className);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return classDetails;
	}
	
	public Field[] getFields(String className){
		Field[] fields = null;
		try {
			fields = getClass(className).getDeclaredFields();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fields;
	}
	
	public Method getMethod(String className, String fieldName){
		String methodName = null;
		Method method = null;
		try {
			methodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1, fieldName.length());
			method = getClass(className).getDeclaredMethod(methodName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return method;
	}
	
	public static void main(String[] args) {
		
	}
	
}
