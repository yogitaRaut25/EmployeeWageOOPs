package com.bridgelabempwage.oop;

class PartTimeWage {
	// static & final variables
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;

	public void partTimeDailyWage() {
		// local variables
		int workHrs;
		int empCheck = (int) (Math.random() * 10) % 3;

		// computation to check daily wage
		if (empCheck == IS_FULL_TIME) {
			workHrs = 16;
			System.out.println("Employee is full time present & working hours = " + workHrs);
		} else if (empCheck == IS_PART_TIME) {
			workHrs = 8;
			System.out.println("Employee is part time present & working hours = " + workHrs);
		} else {
			workHrs = 0;
			System.out.println("Employee is absent & working hours = " + workHrs);
		}
		System.out.println("Employee daily wage = " + (workHrs * WAGE_PER_HOUR));
	}
}

public class PartTimeEmpWage {

	public static void main(String[] args) {
		PartTimeWage obj = new PartTimeWage();
		obj.partTimeDailyWage();
	}

}
