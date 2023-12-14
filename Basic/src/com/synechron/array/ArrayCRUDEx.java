package com.synechron.array;

public class ArrayCRUDEx {

	// CRUD: Create, Read, Update, Delete
	
		//primitive data types/custom class (user defined)
		
		public static void main(String[] args) {
			
			EmployeeService employeeService = new EmployeeService();
			
			for (int i =1;i<=20;i++) {
				
			String result = employeeService.addEmployee(new Employee("ab00"+i, "abhi", "chivate", "pune", 2000, "9975477764"));
			System.out.println(result + i);
			}
			
			String result = employeeService.deleteEmployeeById("ab005");
			System.out.println(result);
			Employee employee = employeeService.getEmployeeById("ab005");
			System.out.println(employee);
			Employee employee2 = employeeService.getEmployeeById("ab005");
			System.out.println("after delete"+employee2);
			
			for (Employee emp : employeeService.getAllEmployees()) {
				System.out.println(emp);
			}
			
			Employee[] empls = employeeService.getEmployeesByName("abhi");
			
			
			System.out.println("list on basis of name: ");
			for (Employee employee3 : empls) {
				System.out.println(employee3);
				
			}
			
			
			}
		
	 
}
	 