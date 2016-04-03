package com.struts2Tiles.tutorial.actions;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

public class RequestAwareAction implements ServletRequestAware {
	
	private HttpServletRequest request;

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
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public String execute(){
		System.out.println("In execute()");
		return "success";
	}
	
	public String displayUserDetails(){
		request.setAttribute("a", name);
		request.setAttribute("b", age);
		request.setAttribute("c", gender);
		request.setAttribute("d", hobby);
		request.setAttribute("e", country);
		return "success";
	}
	
	public String next(){
		return "success";
	}
	
	public String back(){
		return "success";
	}
	
}
