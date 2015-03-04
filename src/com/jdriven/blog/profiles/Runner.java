package com.jdriven.blog.profiles;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		//Setting active profile
		ctx.getEnvironment().setActiveProfiles("ldap");
		ctx.load("classpath:app-context.xml");
		ctx.refresh();
		ctx.close();
	}
}
