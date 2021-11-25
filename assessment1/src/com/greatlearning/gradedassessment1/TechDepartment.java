package com.greatlearning.gradedassessment1;

public class TechDepartment extends SuperDepartment{
	public String departmentName() {
		return "Tech Department";
	}
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String getStackInformation() {
		return "Core Java";
	}
	// By using below constructor, the output can be obtained while object creation
		TechDepartment(){
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getStackInformation());
		System.out.println(isTodayAHoliday());
	}

}
