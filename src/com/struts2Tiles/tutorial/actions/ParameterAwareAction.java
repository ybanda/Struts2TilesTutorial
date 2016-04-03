package com.struts2Tiles.tutorial.actions;

import java.util.Map;

import org.apache.struts2.interceptor.ParameterAware;

public class ParameterAwareAction implements ParameterAware {
	
	private Map<String, String[]> params;
	
	@Override
	public void setParameters(Map<String, String[]> params) {
		this.params = params;
	}
	
	public String execute(){
		return "success";
	}
	
	public String display(){
		
		Object o1 = params.get("name");
		
		Object o2 = params.get("age");
		
		Object o3 = params.get("gender");
		
		System.out.println("o1 : "+o1.toString()+" : o2 :");
		
		return "success";
	}

}
