package com.bridgelabempwage.oop;

class EmployeeAttendanceUC1 {
	// static variable
	public static final int IS_PRESENT = 1;

	/*
	 * Checking whether employee is present or absent
	 */
	public void empPresentOrAbsent() {
		// local variables
		int workHrs;
		int empCheck = (int) (Math.random() * 10) % 2;

		// computation to check presenty
		if (empCheck == IS_PRESENT) {
			workHrs = 8;
			System.out.println("Employee is present & working hours = " + workHrs);
		} else {
			workHrs = 0;
			System.out.println("Employee is absent & working hours = " + workHrs);
		}
	}
}

public class EmployeeAttendance {
	public static void main(String[] args) {
		EmployeeAttendanceUC1 obj = new EmployeeAttendanceUC1();// creating object for super-class
		obj.empPresentOrAbsent();// calling super-class method
	}
}
