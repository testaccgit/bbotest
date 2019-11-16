package com.api.javademo.configuration;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import com.api.javademo.services.*;
import com.api.javademo.services.impl.*;

@Configuration
public class ApplicationConfigurations {	
		
	@Bean
	public AlwaysSampler defaultSampler() {
	  return new AlwaysSampler();
	}
	
	
	//cross origin 
	@Bean
	public WebMvcConfigurer corsConfigurer()
	{
		return new WebMvcConfigurerAdapter()
		{
			@Override
			public void addCorsMappings(CorsRegistry registry)
			{
				System.out.println("adding cors support");
				registry.addMapping("/**").allowedOrigins("*").allowedHeaders("*").allowedMethods("OPTIONS", "HEAD",
						"GET", "PUT", "POST", "PATCH");
			}
		};
	}
	
	
	
}
