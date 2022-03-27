package edu.umb.cs680.hw2;

public class Singleton {
	private Singleton() {};
	private static Singleton inst = null;
	
	public static Singleton getInstance() {
		if(null == instance) inst = new Singleton();
		return inst;
	}

}

