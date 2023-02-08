package org.sample;

public class Employee {
	
	
// the value will be same when called in the same class and value will be different the gave in different class since we update the value newly

	private  int id =40;   // receives the value from the int given in setID
	private  String name= "nice" ;
	
	public  int getId() {// gets the variable and it returns the value to the instance variable
		return id;
	}
	public void setId(int id) {  // this.id is used to call the instance variable into the method and update the value
		this.id = id;
	}
	public  String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
