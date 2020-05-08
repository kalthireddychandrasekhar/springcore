package com.chandu.springcoreworkshop;

public abstract class MySingleton {
public abstract MyPrototype createPrototype();

public MySingleton() {
	System.out.println("singleton constructor");
}
public void m1() {
	System.out.println("m1 method");
	createPrototype().m2();
}
}
