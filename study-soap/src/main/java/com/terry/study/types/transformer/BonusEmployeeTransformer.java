package com.terry.study.types.transformer;

import java.util.Random;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

import com.terry.study.types.employee.Employee;
import com.terry.study.types.employeebonus.EmployeeBonusResponse;
import com.terry.study.types.employeebonus.EmployeeResponse;

public class BonusEmployeeTransformer extends AbstractTransformer {

	@Override
	protected Object doTransform(Object src, String enc) throws TransformerException {

		EmployeeResponse response = (EmployeeResponse) src;
		Employee emp = response.getEmployee();
		EmployeeBonusResponse bonus = new EmployeeBonusResponse();

		int low = 10;
		int high = 50;
		Random rand = new Random();
		int index = rand.nextInt((high - low) + 1) + low;

		double oldSalary = emp.getSalary().doubleValue();

		bonus.setEmployeeBonus(oldSalary * index);

		return bonus;
	}

}
