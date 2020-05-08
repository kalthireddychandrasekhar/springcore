package com.chandu.springcoreworkshop;

public class Two {
	private int id;
	private String name;
	
	Two(){
		System.out.println("two");
	}
	public Two(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Two [id=" + id + ", name=" + name + "]";
	}
	
	

}
