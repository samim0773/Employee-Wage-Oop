package com.bridgelabz;

class CheckEmployeePresentAbsent {
	// declare instance variable
	private int isEmpPresent = 1;

	CheckEmployeePresentAbsent() {
		
		// generate random number 0 1
		int empCheck = (int) Math.floor(Math.random()*10)%2;
		
		// condition for check emp present or absent
		if(empCheck == isEmpPresent) {
			System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is Absent");
		}
	}

	public int getIsEmpPresent() {
		return isEmpPresent;
	}

}
