package com.chandu.test;

public class A {
	private B b;
	
	A(){
		System.out.println("A class object is created");
		//b=new B();
		
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}
	
	
	
	
}
