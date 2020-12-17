package com.example.springconcepts;

import com.example.springconcepts.component.DemoBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Spring Concept Demo.");
		ApplicationContext context= SpringApplication.run(SpringConceptsApplication.class, args);
		DemoBean demoBean=context.getBean(DemoBean.class);
		System.out.println("Checking context of DemoBean= "+demoBean.toString());
	}

}
