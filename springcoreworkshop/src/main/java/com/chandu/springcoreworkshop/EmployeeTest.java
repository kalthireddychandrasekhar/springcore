package com.chandu.springcoreworkshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		System.out.println("chandu");
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		System.out.println("hi");
		Employee emp = context.getBean("employee",Employee.class);
		System.out.println(emp);
		
		//bean scopes
		/*Employee singleton =context.getBean("employee",Employee.class);
		System.out.println("bean scopes example: singleton");
		System.out.println( emp == singleton );*/
		
		/*Employee prototype = context.getBean("employeeScope",Employee.class);
		Employee prototype2 = context.getBean("employeeScope",Employee.class);
		System.out.println(prototype == prototype2);*/
		
		//namespaces
		ApplicationContext context1 = new ClassPathXmlApplicationContext("namespaces.xml");
		/*Address address = context1.getBean("address",Address.class);
		Department dpt = context1.getBean("department",Department.class);
		System.out.println(address+ " "+dpt);*/
		
		//constructor Resolution
		/*One one = context1.getBean("resolution",One.class);*/
		
		//inner bean & null values
		/*One bean = context1.getBean("outerBean",One.class);
		System.out.println(bean);*/
		
	
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}
