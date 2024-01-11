package feujiTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeAns1 {

	public static void main(String[] args) {
		EmployeeTest employeeTest=new EmployeeTest();
		List<Employee> employeeList = employeeTest.method();
		
		Map<String, Long> maleandfemaleemployeesarethereintheorganization = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(maleandfemaleemployeesarethereintheorganization);
		
		
	}
		
		
		
}
