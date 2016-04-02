package com.struts2Tiles.tutorial.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

@ParentPackage(value = "tutorial")
public class ProjectManagementAction {
	@Action(value = "/projectmanagementaction", results = {
			@Result(location = "projectmgmt", name = "success",type="tiles"),
			@Result(location = "login.jsp", name = "test")
	})
	public String execute() throws Exception {
		return "success";
	}
}
