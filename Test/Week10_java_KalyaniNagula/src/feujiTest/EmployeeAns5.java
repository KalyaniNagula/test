package feujiTest;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class EmployeeAns5 {

	public static void main(String[] args) {
		EmployeeTest employeeTest = new EmployeeTest();
		List<Employee> employeeList = employeeTest.method();
		System.out.println("List down the names of all employees in each department?");
		ConcurrentMap<String, List<Employee>> ListOfEmployeeInEachDeparment = employeeList.stream()
				.collect(Collectors.groupingByConcurrent(Employee::getDepartment));
		System.out.println(ListOfEmployeeInEachDeparment);
		
	}

}
