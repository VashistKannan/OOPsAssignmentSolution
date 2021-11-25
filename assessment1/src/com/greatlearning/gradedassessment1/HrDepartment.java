package com.greatlearning.gradedassessment1;

public class HrDepartment extends SuperDepartment{
	public String departmentName() {
		return "Hr Department";
	}
	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String doActivity() {
		return "team Lunch";
	}
	// By using below constructor, the output can be obtained while object creation
		HrDepartment(){
		System.out.println(departmentName());
		System.out.println(doActivity());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
	}

}
