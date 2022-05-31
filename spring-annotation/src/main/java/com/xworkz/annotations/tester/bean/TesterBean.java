package com.xworkz.annotations.tester.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.annotations.bean.PaperFactoryBean;
import com.xworkz.annotations.bean.TreeBean;

public class TesterBean {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		PaperFactoryBean bean = context.getBean(PaperFactoryBean.class);
		System.out.println(bean);
		bean.generatePaper();
	}
}
