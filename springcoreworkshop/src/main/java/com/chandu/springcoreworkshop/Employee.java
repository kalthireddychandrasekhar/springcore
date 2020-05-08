//setter dependency injection
package com.chandu.springcoreworkshop;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private int Id;
	private String name;
	private Address address;
	private Department department;
	
	private List<String> theList;
	private Set<String> theSet;
	private Map<String,String> theMap;
	private Properties theProperties;
	
	
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
	public List<String> getTheList() {
		return theList;
	}
	public void setTheList(List<String> theList) {
		this.theList = theList;
	}
	public Set<String> getTheSet() {
		return theSet;
	}
	public void setTheSet(Set<String> theSet) {
		this.theSet = theSet;
	}
	public Map<String, String> getTheMap() {
		return theMap;
	}
	public void setTheMap(Map<String, String> theMap) {
		this.theMap = theMap;
	}
	public Properties getTheProperties() {
		return theProperties;
	}
	public void setTheProperties(Properties theProperties) {
		this.theProperties = theProperties;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", address=" + address + ", department=" + department
				+ ", theList=" + theList + ", theSet=" + theSet + ", theMap=" + theMap + ", theProperties="
				+ theProperties + "]";
	}
	
	
	//bean life cycle
	public void init() {
		System.out.println("bean is initialized");
	}
	
	public void destroy() {
		System.out.println("beans is removed/destroyed after perform all activities");
	}

}
