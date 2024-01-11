package feujiTest;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeAns4 {
	
	public static void main(String[] args) {
		EmployeeTest employeeTest=new EmployeeTest();
		List<Employee> employeeList = employeeTest.method();
	System.out.println(" Number of male and female employees are there in the sales and marketing department?");
Map<String, List<Employee>> NoOfMaleAndFemaleEmployeInTheSaleAndMarketing = employeeList.stream().filter(e->e.getDepartment()=="Sales"||e.getDepartment()=="Deparatment").collect(Collectors.groupingBy(Employee::getDepartment));
	System.out.println(NoOfMaleAndFemaleEmployeInTheSaleAndMarketing);
	}
}
