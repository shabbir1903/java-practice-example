package com.practice.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class MaxSalaryByDepId {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "Shabbir", 101, "active", 50000));
		empList.add(new Employee(102, "Ali", 101, "active", 60000));
		empList.add(new Employee(103, "Raj", 102, "inactive", 80000));
		empList.add(new Employee(104, "Raju", 102, "inactive", 50000));
		empList.add(new Employee(105, "Bob", 103, "active", 20000));
		empList.add(new Employee(106, "Shivam", 103, "inactive", 20000));
		empList.add(new Employee(107, "alice", 101, "active", 50000));

		empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepId,
						Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))))
				.entrySet().stream().forEach(entry -> {
					System.out.println("DeptId::" + entry.getKey() + "-----" + entry.getValue());
				});

	}

}
