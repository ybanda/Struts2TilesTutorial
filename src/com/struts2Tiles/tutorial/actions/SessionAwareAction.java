package com.struts2Tiles.tutorial.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class SessionAwareAction implements SessionAware {
	
	private Map<String, Object> session;

	private String name;
	
	private String gender;
	
	private String[] hobby;
	
	private String country;
	
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String execute(){
		System.out.println("In execute()");
		return "success";
	}
	
	public String displayUserDetails(){
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("Gender : "+gender);
		System.out.println("hobby : "+hobby);
		System.out.println("country : "+country);
		session.put("a",name);
		session.put("b", age);
		session.put("c", gender);
		session.put("d", hobby);
		session.put("e", country);
		return "success";
	}
	
	public String next(){
		return "success";
	}
	
	public String back(){
		return "success";
	}
	
}
