package com.greatlearning.gradedassessment1;

public class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		return "Admin Department";
	}
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	// By using below constructor, the output can be obtained while object creation
		AdminDepartment(){
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
	}

}
