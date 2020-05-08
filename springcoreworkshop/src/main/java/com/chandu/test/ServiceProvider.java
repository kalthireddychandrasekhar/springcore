package com.chandu.test;

public class ServiceProvider {
	
	private static Client client = new Client();
	public Client createClintInstance() {
		System.out.println("using instance factory method");
		return client;
	}

}
