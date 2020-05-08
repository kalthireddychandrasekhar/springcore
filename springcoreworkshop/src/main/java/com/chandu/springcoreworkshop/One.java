package com.chandu.springcoreworkshop;
//argument resolution
public class One {
	Two two;
	Three three;
	
	One(Two two, Three three){
		this.two = two;
		this.three=three;
		System.out.println("constructor resolution");
	}
	
	public One() {
		super();
	}

	public Two getTwo() {
		return two;
	}

	public void setTwo(Two two) {
		this.two = two;
	}

	public Three getThree() {
		return three;
	}

	public void setThree(Three three) {
		this.three = three;
	}

	@Override
	public String toString() {
		return "One [two=" + two + ", three=" + three + "]";
	}

	
}
