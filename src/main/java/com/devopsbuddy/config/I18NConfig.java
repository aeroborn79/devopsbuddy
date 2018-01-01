package com.devopsbuddy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class I18NConfig {
	
	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource resourceMessageBundleSource = new ReloadableResourceBundleMessageSource();
		resourceMessageBundleSource.setBasename("classpath:i18n/messages");
		// Chech for new messages every 30 minutes
		resourceMessageBundleSource.setCacheSeconds(1800);
		return resourceMessageBundleSource;
	}

}
