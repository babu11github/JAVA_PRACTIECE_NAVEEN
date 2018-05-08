package com.java.listinterface;

import java.util.Iterator;

public class LinkedList {

	public static void main(String[] args) {
	
		java.util.LinkedList<String> ll=new java.util.LinkedList<>();
		ll.add("raju");
		ll.add("balu");
		ll.add("amma");
		System.out.println("print all values:"+ll);
	
		ll.addFirst("family");
		ll.addLast("friends");
		System.out.println("print all values:"+ll);
		
		
		//get
		System.out.println(ll.get(0));
		
		//set
		ll.set(0,"rani");
		System.out.println(ll.get(0));
		
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println("print all values:"+ll);
		
		
		
		//how to print all values 
		//for loop
		
		System.out.println("by using for loop");
		
		for(int n = 0;n<ll.size();n++) {
			System.out.println(ll.get(n));
		}
		
		//enhanced for loop
		
		for(String str:ll) {
			System.out.println(str);
		}
		
			
		
		//iterator
		
		Iterator<String> it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//while loop
		
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		}

}
