package com.example.springconcepts;

import com.example.springconcepts.component.DemoBean;
import com.example.springconcepts.component.EmployeeBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {
	public static final Logger logger=LoggerFactory.getLogger(SpringConceptsApplication.class);
	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concept Demo.");
		ApplicationContext context= SpringApplication.run(SpringConceptsApplication.class, args);
		DemoBean demoBean=context.getBean(DemoBean.class);
		logger.debug("Checking context of DemoBean= "+demoBean.toString());
		EmployeeBean employeeBean=context.getBean(EmployeeBean.class);
		employeeBean.setEmpId(2);
		employeeBean.setEmpName("Spring");
		employeeBean.showEmployeeDetails();
	}
}
