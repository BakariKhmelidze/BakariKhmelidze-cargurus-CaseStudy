package com.bakarikhmelidze.cargurus.config;

import org.springframework.security.web.context.*;

public class SecurityWebApplicationInitializer
extends AbstractSecurityWebApplicationInitializer {

public SecurityWebApplicationInitializer() {
  super(SecurityConfig.class);
	}
}
