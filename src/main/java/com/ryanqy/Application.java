package com.ryanqy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Intellj Idea on 3/14/16.
 *
 * @author wutong
 */
@SpringBootApplication
@MapperScan("com.ryanqy.mapper")
public class Application extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("images/**").addResourceLocations("/WEB-INF/jsp/images/", "/WEB-INF/jsp/admin/images/");
        registry.addResourceHandler("css/**").addResourceLocations("/WEB-INF/jsp/css/", "/WEB-INF/jsp/admin/css/");
        registry.addResourceHandler("js/**").addResourceLocations("/WEB-INF/jsp/js/", "/WEB-INF/jsp/admin/js/");
        registry.addResourceHandler("font/**").addResourceLocations("/WEB-INF/jsp/font/");
        registry.addResourceHandler("fonts/**").addResourceLocations("/WEB-INF/jsp/admin/fonts/");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

}
