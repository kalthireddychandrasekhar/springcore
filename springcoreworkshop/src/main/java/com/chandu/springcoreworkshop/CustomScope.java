package com.chandu.springcoreworkshop;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class CustomScope implements Scope {
	
	private Map<String,Object> scopeObject = Collections.synchronizedMap(new HashMap<String, Object>());
private	Map<String,Runnable> destuctionCallBacks = Collections.synchronizedMap(new HashMap<String, Runnable>());

	public Object get(String name, ObjectFactory<?> objectFactory) {
		if(!scopeObject.containsKey(name)) {
			scopeObject.put(name, objectFactory.getObject());
		}
		return scopeObject.get(name);
	}

	public String getConversationId() {
		return "custom";
	}

	public void registerDestructionCallback(String name, Runnable callBack) {
		destuctionCallBacks.put(name, callBack);
	}

	public Object remove(String name) {
		destuctionCallBacks.remove(name);
		return scopeObject.remove(name);
	}

	public Object resolveContextualObject(String key) {
		return null;
	}

}
