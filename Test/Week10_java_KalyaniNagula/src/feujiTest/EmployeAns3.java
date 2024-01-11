package feujiTest;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeAns3 {

	public static void main(String[] args) {
		EmployeeTest employeeTest=new EmployeeTest();
		List<Employee> employeeList = employeeTest.method();
		System.out.println("Get the youngest employee details each department wise (By Using Optional)");
		 Map<String, Optional<Employee>> Gettheyoungestemployeedetailseachdepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.minBy(Comparator.comparing(Employee::getAge))));
System.out.println(Gettheyoungestemployeedetailseachdepartment.get(Gettheyoungestemployeedetailseachdepartment));
	}

}
