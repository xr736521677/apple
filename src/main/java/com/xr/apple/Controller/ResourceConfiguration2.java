package com.xr.apple.Controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class ResourceConfiguration2 extends WebMvcConfigurerAdapter{
	/**
	 * 自定义静态资源文件路径
	 * @param registry
	 */
	public void AddRecourceHandles(ResourceHandlerRegistry registry){
		registry.addResourceHandler("/xr/resources/**").addResourceLocations("classpath:/static/");
	}
}
