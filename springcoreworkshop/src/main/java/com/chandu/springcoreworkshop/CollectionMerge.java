package com.chandu.springcoreworkshop;

import java.util.List;
import java.util.Properties;

import org.springframework.core.convert.Property;

public class CollectionMerge {
	
	private Properties userData;

	public Properties getUserData() {
		return userData;
	}

	public void setUserData(Properties userData) {
		this.userData = userData;
	}

	@Override
	public String toString() {
		return "CollectionMerge [userData=" + userData + "]";
	}
	
	
}
