package com.greatlearning.gradedassessment1;

public class SuperDepartment {
	public String departmentName() {
		return "Super Department";
	}
    public String getTodaysWork() {
    	return "No Work as of now";
    }
    public String getWorkDeadline() {
    	return "Nil";
    }
    public String isTodayAHoliday() {
    	return "Today is not a Holiday";
    }
    
// The below constructor is defined to work while using constructor to print the output.
    SuperDepartment(){
    	System.out.print("\n Welcome to ");
    }

}
