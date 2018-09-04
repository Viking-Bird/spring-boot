package org.springframework.boot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.stereotype.Repository;

/**
 * Created by wangpeng
 * Date: 2018/9/1
 * Time: 18:20
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		AnnotationConfigServletWebServerApplicationContext context = (AnnotationConfigServletWebServerApplicationContext) SpringApplication.run(Application.class, args);
		String[] beanNames = context.getBeanDefinitionNames();

		System.out.println("所以beanNames个数：" + beanNames.length);

		for (String bn : beanNames) {
			System.err.println(bn);
		}

		beanNames =  context.getBeanNamesForAnnotation(Repository.class);
		System.out.println("Repository注解beanNames个数："+beanNames.length);

		for(String bn:beanNames){
			System.err.println(bn);
		}
	}
}
