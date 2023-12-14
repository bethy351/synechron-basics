package com.synechron.array;

public class EmployeeService {
	
	private Employee employees[] = new Employee[10];
	
	private static int count = -1;
	//one centralised copy
	
	public String addEmployee(Employee employee) {
		
		//business constraints
		//1. if array is full, it should incr size auto
		//2. no null employee details
		
		if (employee!=null) {
			count++;
			if(count<employees.length) {
				//allow to add to it
				employees[count] = employee;
				return "success";
			}
			else {
				System.out.println("size increased");
				//we should increase size of array
				Employee temp[] = new Employee[employees.length*2];
			
				//do we need to copy the content from employees into the new array?
				//employees->temp->write a for loop?
				// but we will use some predefined methods from the java.
				//System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
				// Object src : source array
				// int srcPos : start location from source to  do the copy work
				// Object dest : dest array (where we want to copy the content)
				// int destPost : start pos for destination array
				// int length : no of elements to be copied from src to dest)
				
				System.arraycopy(employees, 0, temp, 0, employees.length);
				//replace with Arrays.copy
				//when to prefer arraycopy and copy of method
				
				employees=temp;
				employees[count]=employee;
				return "success";
				
			}
		}
		else {
			return "not valid entry";
		}
	}
	//delete the element from the array 
	// public String deleteEmployeeById(string id)
	public String deleteEmployeeById(String id) {
		for (int i = 0; i < employees.length; i++) {
			if(employees[i].getEmpId().equals(id)) {
			//equals method: string
			// we shouldn't use == for checking the equality. 
			// should use == for primitive data types
				
				employees[i]=null;
				return "sucess";
		}
		
		
	}
		
		return "fail";
	}
	
	public Employee getEmployeeById(String id) {
		
		for (Employee employee : employees) {
			//employee may hold null value
			if(employee!=null && employee.getEmpId().equals(id))
					// id.equals(employee.getEmpId()))
				return employee;
		}
		return null;
	}
	
	//return all employees 
	
	public Employee[] getAllEmployees() {
		return employees;
		
		
	}
	
	//return all employees on the basis of name
	// find john
	
	public Employee[] getEmployeesByName(String name) { 
		Employee[] temp= new Employee[employees.length];
		int counter = -1;
		for (int i = 0; i < employees.length; i++) {
			if(employees[i]!=null && name.equals(employees[i].getEmpFirstName())) {
			
				//we need t add that employee into array
				temp[++counter] = employees[i];
			}
			
		}
		return temp;
		
	}
	
	//update : public String updateEmployeeById(String id, Employee employee) 
	
	
	
}