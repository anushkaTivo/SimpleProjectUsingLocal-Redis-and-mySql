package com.abstraction;

public interface CacheSoln { // CacheSolution

	String get(String id);
	void set(String id, String name); // getKey
	boolean exists(String id); // isPresent
	
}
