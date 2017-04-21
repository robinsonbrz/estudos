package br.study.model;

public class ObjectFactory {

	public ObjectFactory() {
	}

	public Employee createEmployee() {
		return new Employee();
	}

	public Employees createEmployees() {
		return new Employees();
	}
}
