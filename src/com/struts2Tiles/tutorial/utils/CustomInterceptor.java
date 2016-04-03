package com.struts2Tiles.tutorial.utils;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

@SuppressWarnings("serial")
public class CustomInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("Pre Processing Logic 1");
		System.out.println("Pre Processing Logic 2");
		System.out.println("Pre Processing Logic 3");
		String result = ai.invoke();
		System.out.println("Post Processing Logic 1");
		System.out.println("Post Processing Logic 2");
		System.out.println("Post Processing Logic 3");
		return result;
	}

}
