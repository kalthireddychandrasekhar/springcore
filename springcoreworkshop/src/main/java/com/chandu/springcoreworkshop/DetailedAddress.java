package com.chandu.springcoreworkshop;

public class DetailedAddress {
	private String hno;
	private String city;
	private String distict;
	private String state;
	
	
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistict() {
		return distict;
	}
	public void setDistict(String distict) {
		this.distict = distict;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "DetailedAddress [hno=" + hno + ", city=" + city + ", distict=" + distict + ", state=" + state + "]";
	}
	
	

}
