package org.sample;

import java.util.*;
import java.util.List;

public class Sanple extends Employee{

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setId(500);            // we are setting the values for those inputs, so we use set method
		e.setName("Java");
		
		Employee e1 = new Employee();
		e1.setId(200);
		e1.setId(100);    // taking the update value
		e1.setName("Selenium");
		
		System.out.println("=====Using List======");
		List<Employee> l = new ArrayList<Employee>(); // must use class name in <employee>
		l.add(e);
		l.add(e1);
		
		//System.out.println(Employee.getId());  // we can't print it directly because the method is static and we are using next class for it
		//System.out.println(Employee.getName());
		
		for (Employee employee : l) {
			
			System.out.println(employee.getId());
			System.out.println(employee.getName());		
		}
	// System.out.println(e);		 // shows the storage where it is stored
		
		System.out.println("=====Using Set======");
		
		Employee e2 = new Employee();
		e2.setId(100);
		e2.setName("ragu");
		e2.setId(300);          // taking the update value
				
		Employee e3 = new Employee();
		e3.setId(200);
		e3.setName("Selenium");
		e3.setName("Selenium");     // this is set so ignoring the duplicate value i.e Selenium
		
		Set <Employee> s = new  LinkedHashSet <Employee> ();
		s.add(e2);
		s.add(e3);
		
		for (Employee employee : s) {
			System.out.println(employee.getId());			
			System.out.println(employee.getName());
			
		}
		
		
		
	}
}
