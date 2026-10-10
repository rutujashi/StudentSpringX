package com.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		//IOC
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Conversion from bean object to pojo object
				//object creation without new keyword
				Student s1 = (Student) context.getBean("student1");
				System.out.println(s1);
				
				Student s2 = (Student) context.getBean("student2");
				System.out.println(s2);
				
				Student s3 = (Student) context.getBean("student3");
				System.out.println(s3);
				
				Student s4 = (Student) context.getBean("student4");
				System.out.println(s4);
				
				Student s5 = (Student) context.getBean("student5");
				System.out.println(s5);
				
				Student s6 = (Student) context.getBean("student6");
				System.out.println(s6);
				
				Student s7 = (Student) context.getBean("student7");
				System.out.println(s7);
				
				Student s8 = (Student) context.getBean("student8");
				System.out.println(s8);
				
				Student s9 = (Student) context.getBean("student9");
				System.out.println(s9);
				
				Student s10 = (Student) context.getBean("student10");
				System.out.println(s10);
				
				

	}

}
