package com.java8.stream.api;

import java.util.ArrayList;
import java.util.List;

class Employee1 {

	private int employeeId;
	private String EmpName;
	private double salary;

	public Employee1(int employeeId, String empName, double salary) {
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
public class CombinedFilterMapConcept {
	

	public static void main(String[] args) {
		List<Employee1> employeeInfo = new ArrayList<>();

		employeeInfo.add(new Employee1(201, "Ramesh", 30000.00));
		employeeInfo.add(new Employee1(202, "Rajesh", 35000.00));
		employeeInfo.add(new Employee1(203, "Mahesh", 80000.00));
		employeeInfo.add(new Employee1(204, "Somesh", 55000.00));
		employeeInfo.add(new Employee1(205, "Ravi", 45000.00));
		employeeInfo.add(new Employee1(202, "Manju", 60000.00));
		employeeInfo.add(new Employee1(202, "Kamesh", 75000.00));
		
//		System.out.println(employeeInfo);
		
		employeeInfo.stream().filter(p->p.getSalary()>40000.00).map(empSalary->empSalary.getSalary()).forEach(System.out::println);
		
		
	}

}
