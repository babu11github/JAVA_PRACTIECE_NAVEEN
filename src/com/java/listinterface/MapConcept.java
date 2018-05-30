package com.java.listinterface;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapConcept {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"babu");
		hm.put(2,"siva");
		hm.put(3,"soori");
		
		
		//System.out.println(hm.get(2));
		
	//print all vslues
		for(Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
		//data taken from employee table
		
		HashMap<Integer,Employee> emp=new HashMap<Integer,Employee>();
		
		Employee e1=new Employee("tom",25,"admin");
		Employee e2=new Employee("peter",26,"tester");
		Employee e3=new Employee("raju",27,"dev");
		
		emp.put(1,e1);
		emp.put(2,e2);
		emp.put(3,e3);
		
		
		for(Entry<Integer,Employee> m:emp.entrySet()) {
			int key=m.getKey();
			Employee e=m.getValue();
			System.out.println(key +""  );
			System.out.println(e.name + "" +e.age+""+e.dept);
		}
		

	}

}
