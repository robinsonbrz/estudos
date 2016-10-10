package com.terry.study.util;

import java.util.ArrayList;
import java.util.List;

import com.terry.study.types.avaragesalary.Employees;
import com.terry.study.types.employee.Employee;

public class Calculator {

	private List<Employee> employees = new ArrayList<Employee>();

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public double avarageSalary(Employees employees) {

		int index = employees.getEmployee().size();
		double sum = 0;

		for (Employee employee : employees.getEmployee())
			sum += employee.getSalary().doubleValue();

		return sum / index;
	}
}
