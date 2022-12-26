package com.exercise.pll;

public class TestEmployee {

public static void main(String[] args) {
		
		Employee e1= new Employee(444,"Nandu ","Mahajan",40000);
		
		System.out.println("\nemployee Id :"+ e1.getId());
		System.out.println("first Name :"+ e1.getfirstName());
		System.out.println("last name :"+ e1.getlastName());
		System.out.println("Name :"+ e1.Name());
		System.out.println("Salary :"+ e1.getSalary());
		System.out.println("Annual :"+ e1.getannualSalary());
		 
		
		e1.setSalary(40000);
		System.out.println("\nNew Salary :"+e1.getSalary());
		
		 
		System.out.println("after 30percent rise in salary :"+e1.rasieSalary(10));
		
		
		System.out.println("\nAll Details-"+e1.toString());
		 	
	}

}
