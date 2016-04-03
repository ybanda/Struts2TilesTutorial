package com.struts2Tiles.tutorial.actions;

public class InterceptorAction {

	public String execute(){
		System.out.println("In execute()");
		return "success";
	}
	
}
