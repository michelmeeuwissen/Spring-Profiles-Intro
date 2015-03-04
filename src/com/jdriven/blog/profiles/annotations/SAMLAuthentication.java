package com.jdriven.blog.profiles.annotations;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("saml")
public class SAMLAuthentication {
	
	public SAMLAuthentication() {
		System.out.println("SAML Authentication set by annotations");
	}	
}
