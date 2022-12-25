package com.java8.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

	private int employeeId;
	private String EmpName;
	private double salary;

	public Employee(int employeeId, String empName, double salary) {
		super();
		this.employeeId = employeeId;
		EmpName = empName;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "employeeId=" + employeeId + ", EmpName=" + EmpName + ", salary=" + salary + ""+"\n";
	}

}

public class StreamFilterConcept2 {

	public static void main(String[] args) {

		List<Employee> employeeDetails = new ArrayList<>();

		employeeDetails.add(new Employee(201, "Ramesh", 30000.00));
		employeeDetails.add(new Employee(202, "Rajesh", 35000.00));
		employeeDetails.add(new Employee(203, "Mahesh", 80000.00));
		employeeDetails.add(new Employee(204, "Somesh", 55000.00));
		employeeDetails.add(new Employee(205, "Ravi", 45000.00));
		employeeDetails.add(new Employee(202, "Manju", 60000.00));
		employeeDetails.add(new Employee(202, "Kamesh", 75000.00));
		
		System.out.println(employeeDetails);
		
 
		List<Employee> empCopy=new ArrayList<>();
		
		empCopy=employeeDetails.stream().filter(p->p.getSalary()>50000.00).collect(Collectors.toList());
		
		System.out.println(empCopy);
		
		employeeDetails.stream().filter(p->p.getSalary()>50000.00).forEach(p->System.out.println(p));// using iterator  and another way of printing
		
		System.out.println();
		employeeDetails.stream().filter(p->p.getSalary()>50000.00).forEach(System.out::println);// using iterator  and another way of printing
	}

}
