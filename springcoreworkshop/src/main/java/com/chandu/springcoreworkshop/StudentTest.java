package com.chandu.springcoreworkshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
public static void main(String[] args) {
	ApplicationContext context  = new ClassPathXmlApplicationContext("student.xml","inheritance.xml");
	Student std = context.getBean("student",Student.class);
	System.out.println(std);
	//inhertance
	/*DetailedAddress address = context.getBean("dadr",DetailedAddress.class);
	System.out.println(address);*/
	
	
	//lookup metod 
	
	/*MySingleton singleton = context.getBean("mySingleton",MySingleton.class);
	singleton.m1();
	System.out.println("===============");
	singleton.m1();*/
	
	
	//collectio merge
/*	
	CollectionMerge merge = context.getBean("child",CollectionMerge.class);
	System.out.println(merge);
	*/
	
}
}
