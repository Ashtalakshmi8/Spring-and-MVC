package com.xworkz.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");
		PcBean bean = container.getBean(PcBean.class);
		bean.provideService();
	}

}
