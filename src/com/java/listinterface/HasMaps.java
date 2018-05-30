package com.java.listinterface;

import java.util.Hashtable;

public class HasMaps {

	public static void main(String[] args) {
		
		Hashtable  ht=new Hashtable();
		ht.put(1,"babu");
		ht.put(2,"puru");
		
		Hashtable  htc=new Hashtable();
		htc=(Hashtable)ht.clone();
		
		System.out.println("the value :"+ht);
		System.out.println("the value:"+htc);
		
		ht.clear();

		
		
		//contains value
		Hashtable  ht1=new Hashtable();
		ht1.put("A","naveen");
		ht1.put("B","babu");
		if(ht1.contains("naveen")) {
			System.out.println("value is found");
		}
		
		//ptint all values from hash table
		ht1.elements();
		System.out.println("print value from ht1");
		
		
		
	}

}
