package com.jdriven.blog.profiles.annotations;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("ldap")
public class LDAPAuthentication {
	
	public LDAPAuthentication() {
		System.out.println("LDAP Authentication set by annotations");
	}	
}
