package com.chandu.test;

public class Client {
	
	static Client client = new Client();
	
	Client(){
		System.out.println("client consructor");
	}
	public static Client createInstance() {
		System.out.println("instance is created using static factory method");
		return client;
	}
	
	
	
	

}
