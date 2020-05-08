package com.chandu.test;

public class C {
private String message;



public C() {
System.out.println("C class object is created");
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

@Override
public String toString() {
	return "C [message=" + message + "]";
}


}
