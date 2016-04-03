package com.struts2Tiles.tutorial.actions;

import com.opensymphony.xwork2.ActionSupport;

public class ProgramaticVlidationAction extends ActionSupport {
	 private static final long serialVersionUID = 1L;
	 
	    private String uname;
	    private String gender;
	 
	    public String getUname() {
	        return uname;
	    }
	 
	    public void setUname(String uname) {
	        this.uname = uname;
	    }
	 
	    public String getGender() {
	        return gender;
	    }
	 
	    public void setGender(String gender) {
	        this.gender = gender;
	    }
	 
	    public String execute()
	    {
	    	return SUCCESS;
	    }
	 
	    public void validate()
	    {
	        if(null != uname && (uname.equals("") || uname.length()==0))
	            this.addFieldError("uname",getText("user.required"));
	        if(null != gender && (gender.equals("") || gender.length()==0))
	            this.addFieldError("gender",getText("gender.required"));
	 
	    }
	 
}
