package com.ziejacode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ziejacode/beans/beans.xml");
		Person person = (Person)context.getBean("person", Person.class);
		System.out.println(person.speak());
		
		((ClassPathXmlApplicationContext) context).close(); 
	}
	
}
