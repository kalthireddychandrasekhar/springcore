package com.chandu.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("namespaces.xml");
		
		/*GenericApplicationContext*/
		/*GenericApplicationContext ctx = new GenericApplicationContext();
		new XmlBeanDefinitionReader(ctx).loadBeanDefinitions("namespaces.xml");
		ctx.refresh();*/
		
		//compound property
		/*A a = context.getBean("compound",A.class);
		System.out.println(a);*/
		
		//depends-on
		/*A dependson = context.getBean("a",A.class);*/
		
		/*lazy loading*/
		/* context.getBean("a",A.class);
		 context.getBean("b",B.class);*/
		
		//lifec cycle
		/*context.getBean("lifeCycle", BeanLifeCycle.class);  */
		
		/*factory-method*/
		/* context.getBean("factory",Client.class);
		 context.getBean("client",Client.class);  
		System.out.println(context.getType("factory"));*/
		
		/*ImportResources*/
	/*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigC.class);
		BeanA bean = context.getBean(BeanA.class);
		bean.doSomething();
		BeanB bean2 = context.getBean("chandu",BeanB.class);
		bean2.doSomething();
		BeanC bean3 = context.getBean(BeanC.class);
		bean3.doSomething();*/
		
	}

}
