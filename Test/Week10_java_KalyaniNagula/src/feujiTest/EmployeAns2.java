package feujiTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmployeAns2 {

	public static void main(String[] args) {
		EmployeeTest employeeTest=new EmployeeTest();
		List<Employee> employeeList = employeeTest.method();
		System.out.println( "Get the names of all employees who have joined after 2015");
		 employeeList.stream().filter(e->e.getYearOfJoining()>2015).forEach(e->System.out.println(e));


}
}
