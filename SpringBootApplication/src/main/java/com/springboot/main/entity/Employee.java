package com.springboot.main.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_Employee_info")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "employee_id")
	private int employeeId;

	@Column(name = "employee_name")
	private String empName;

	@Column(name = "salary")
	private Double salary;

	@Column(name = "depart_name")
	private String departName;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", empName=" + empName + ", salary=" + salary + ", departName="
				+ departName + "]";
	}

}
