package com.java.listinterface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArryList {
	
	public static <E> void main(String[] args) {
		
		
		//static array
		int a[] = new int[3];
		a[0]=10;
		a[1]=10;
		a[2]=10;
		
		
		//dynamic array
		ArrayList ar=new ArrayList();//Non-generics
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add("babu");
		ar.add("boolean");
		
		System.out.println(ar.size());//size of array list
		System.out.println(ar.get(2));//get the value from index
		//System.out.println(ar.get(4));//ArrayIndexOutOfBoundException
		
		// to print all values from arraylist-->by using for loop
		System.out.println("*********************");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			System.out.println("***********************");
			
			
			//generics vs non genirics
			ArrayList<Integer> ar1=new ArrayList<Integer>();
			ar1.add(100);
			//ar1.add("selenoium");
			
			ArrayList<String> ar2=new ArrayList<String>();
			ar2.add("babu");
			
			
			//we don't know what type of data 
			ArrayList<E> ar3=new ArrayList<E>();
		   
			
			
			//employeee objects
			Employee e1=new Employee("babu",25,"QA");
			Employee e2=new Employee("balu",26,"dev");
			Employee e3=new Employee("siva",28,"admin");
			
			//create arraylist
			
			ArrayList<Employee> ar4=new ArrayList<Employee>();
			
			ar4.add(e1);
			ar4.add(e2);
			ar4.add(e3);
			
			//ITERATOR
			Iterator<Employee> it=ar4.iterator();
			while(it.hasNext()) {
				Employee emp=it.next();
				System.out.println(emp.name);
				System.out.println(emp.age);
				System.out.println(emp.dept);
				
			}
			//add all
			ArrayList<String> ar5=new ArrayList<String>();
			ar5.add("babu");
			ar5.add("Selenium");
			ar5.add("qtp");
				
			
			ArrayList<String> ar6=new ArrayList<String>();
			ar5.add("QA");
			ar5.add("DEV");
			ar5.add("VEE");
			
			
			ar5.addAll(ar6);
			
			for(int j=0;j<ar5.size();j++) {
				System.out.println(ar5.get(j));
				
			}
			
			//remove All
			ar5.removeAll(ar6);
			for(int j=0;j<ar5.size();j++) {
				System.out.println(ar5.get(j));
				
			}
			//RetainAlll
			
			
		}

	}
}



