package com.chandu.test;

public class B {
private C c;

B(){
	System.out.println("B class object is created");
	//c = new C();
}

public C getC() {
	return c;
}

public void setC(C c) {
	this.c = c;
}

@Override
public String toString() {
	return "B [c=" + c + "]";
}



}
