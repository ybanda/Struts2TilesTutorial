package com.struts2Tiles.tutorial.actions;

import com.struts2Tiles.tutorial.dao.UserForm.UserForm;

public class PojoUserAction {
	
	private com.struts2Tiles.tutorial.dao.UserForm.UserForm userForm;

	public UserForm getUserForm() {
		return userForm;
	}

	public void setUserForm(UserForm userForm) {
		this.userForm = userForm;
	}
	
	public String execute(){
		return "success";
	}
	
	public String display(){
		return "success";
	}
	
}
