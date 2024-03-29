package com.parts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.parts.controller")
public class WebConfig extends WebMvcConfigurationSupport {
    String[] paths = new String[]{"/","/WEB-INF/views/"};
@Bean
    public ViewResolver getViewResolver(){
    FreeMarkerViewResolver freeMarkerViewResolver = new FreeMarkerViewResolver();
    freeMarkerViewResolver.setOrder(1);
    freeMarkerViewResolver.setSuffix(".ftl");
    freeMarkerViewResolver.setPrefix("");
    return freeMarkerViewResolver;
}
@Bean
    public FreeMarkerConfigurer getFreeMakerConfigurer(){
    FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
    freeMarkerConfigurer.setTemplateLoaderPaths(paths);
    return freeMarkerConfigurer;
}

}
