package com.mkoner.spring_framework_core.using_xml_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		Cpu cpu = new Cpu("Intel", "1.5 GH");
		Computer computer = new Computer(ComputerType.DESKTOP, "abcw", cpu);
		System.out.println(computer);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
	}

}
