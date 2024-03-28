package com.mkoner.spring_framework_core.using_xml_config;

import java.util.Date;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		Cpu cpu = new Cpu("Intel", "1.5 GH");
		Computer computer = new Computer(ComputerType.DESKTOP, "abcw", cpu);
		System.out.println(computer);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Computer computer1 = context.getBean("computer", Computer.class);
		System.out.println(computer1);
		Locale english = Locale.ENGLISH;
		Locale french = Locale.FRENCH;
		Object[] object =  new Object[] {"Mamadou", new Date()};
		System.out.println("================ENGLISH==========");
		System.out.println(context.getMessage("msg", null, english));
		System.out.println(context.getMessage("paramMesg", object, english));
		
		System.out.println("================FRENCH==========");
		System.out.println(context.getMessage("msg", null, french));
		System.out.println(context.getMessage("paramMesg", object, french));
		
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
