package com.jdriven.blog.profiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
        //Create new context to show the XML Spring profile setup
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		//Setting 'ldap' as active profile
		ctx.getEnvironment().setActiveProfiles("ldap");
        //Load the app-context.xml from the root of the classpath
		ctx.load("classpath:app-context.xml");
		//We need to refresh the application because we added a resource
        ctx.refresh();
		//Closing the application context to release and destroy all resources and cached beans
        ctx.close();

        //Creating a new context to show the annotation Spring profile setup
        AnnotationConfigApplicationContext actx = new AnnotationConfigApplicationContext();
        //Setting 'saml' as active profile
        actx.getEnvironment().setActiveProfiles("saml");
        //Scan base package for annotations
        actx.scan("com.jdriven.blog");
        //We need to refresh the application because we added a scan
        actx.refresh();
        //Closing the application context to release and destroy all resources and cached beans
        actx.close();
	}
}
