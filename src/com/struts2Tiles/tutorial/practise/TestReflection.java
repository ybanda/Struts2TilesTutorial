package com.struts2Tiles.tutorial.practise;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {

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
	
	public Method[] getMethods(String className){
		Method[] methods = null;
		try {
			methods = getClass(className).getDeclaredMethods();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return methods;
	}
	
	public Method[] getMethods(String className, String fieldName, Class[] parameterTypes){
		String methodName = null;
		Method method = null;
		Method[] methods = new Method[2];
		try {
			methodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1, fieldName.length());
			method = getClass(className).getDeclaredMethod(methodName);
			methods[0] = method;
			
			methodName = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1, fieldName.length());
			method = getClass(className).getDeclaredMethod(methodName, parameterTypes);
			methods[1] = method;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return methods;
	}
	
	public Method getGetterMethod(String className, String fieldName){
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
	
	public void getGetterMethods(Class classDetails){
		Method[] methods = classDetails.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			if(methods[i].getName().contains("get")){
				System.out.println(i+". Getter Method Name : "+methods[i].getName());
			}
		}
	}
	
	public void getSetterMethods(Class classDetails){
		Method[] methods = classDetails.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			if(methods[i].getName().contains("set")){
				System.out.println(i+". Setter Method Name : "+methods[i].getName());
			}
		}
	}
	
	public static void main(String[] args){
		TestReflection testReflection = new TestReflection();
		Field[] fields = null;
		Method[] methods = null;
		
		fields = testReflection.getFields("com.vfs.elvis.model.SearchResults");
		methods = testReflection.getMethods("com.vfs.elvis.model.SearchResults", "roleName", new Class[]{String.class});
		
		for (int i = 0; i < fields.length; i++) {
			System.out.println(i+". Field Name : "+fields[i].getName()+" <<:::>> "+testReflection.getGetterMethod("com.vfs.elvis.model.SearchResults", fields[i].getName()).getName());
		}
		for (int i = 0; i < methods.length; i++) {
			System.out.println("Method "+(i+1)+" is : "+methods[i]);
		}
	}
	
}
