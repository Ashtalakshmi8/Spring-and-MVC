package com.xworkz.metro.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.metro.bean.MetroBean;

public class TesterClass {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");
		MetroBean bean = container.getBean(MetroBean.class);
	    bean.provideTransporation();

		System.out.println("Station count:" + bean.getNoOfStations());
		System.out.println("speed:" + bean.getSpeed());
//		System.out.println("avalableStation:"+bean.getAvailableStation());

	}

}
