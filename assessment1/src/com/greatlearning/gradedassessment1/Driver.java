package com.greatlearning.gradedassessment1;

public class Driver {

	public static void main(String[] args) {
	
	
		AdminDepartment admin = new AdminDepartment(); // can do upcasting if we use SuperDeparment to create the object
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
//		I would prefer the constructor method since it would look the main class simpler
// In case, you would like to see the only result of below code, please comment out the constructors in all classes.		
/* 
  		System.out.println("\n Welcome to " +admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
				
		System.out.println("\n Welcome to " +hr.departmentName());
 		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
				
		System.out.println("\n Welcome to " +tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getStackInformation());
		System.out.println(tech.isTodayAHoliday());
*/
	}
}
