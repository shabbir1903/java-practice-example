package com.practice.java8;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class CountByDeptIdOfEmployee {

	public static void main(String[] args) {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "Shabbir", 101, "active", 50000));
		empList.add(new Employee(102, "Ali", 101, "active", 60000));
		empList.add(new Employee(103, "Raj", 102, "inactive", 80000));
		empList.add(new Employee(104, "Raju", 102, "inactive", 50000));
		empList.add(new Employee(105, "Bob", 103, "active", 20000));
		empList.add(new Employee(106, "Shivam", 103, "inactive", 20000));
		empList.add(new Employee(107, "alice", 101, "active", 50000));
		
		//Count no of Employees by depId
		Map<Integer, Long> emp = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepId, Collectors.counting()));
		System.out.println(emp);
		
		

	}

}
