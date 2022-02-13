package com.bridgelabempwage.oop;

class EmpWageObj {
	// data members of class
	public static final int ISPARTTIME = 1;
	public static final int ISFULLTIME = 2;

	private final String companyName;
	private final int wagePerHrs;
	private final int numOfWorkingdays;
	private final int maxHrsInMonth;

	// constructor of a class
	public EmpWageObj(String companyName, int wagePerHour, int numOfWorkingday, int maxHrsInMonth) {
		this.companyName = companyName;
		this.wagePerHrs = wagePerHour;
		this.numOfWorkingdays = numOfWorkingday;
		this.maxHrsInMonth = maxHrsInMonth;

	}

	/*
	 * monthly computation based on company
	 */
	public void calculation() {
		int totalEmpWage = 0, totalWorkingDays = 0, totalEmpHrs = 0;

		while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfWorkingdays) {
			int empHrs = 0;
			totalWorkingDays++;
			int empcheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empcheck) {
			case ISPARTTIME:
				empHrs = 4;
				break;
			case ISFULLTIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
				break;
			}
			totalEmpHrs += empHrs;
			int empWage = empHrs * wagePerHrs;
			totalEmpWage += empWage;
		}
		System.out.println("Total Employee Wage of " + companyName + " is :" + totalEmpWage);
	}
}

public class EmpWageBuilder {

	public static void main(String[] args) {
		EmpWageObj companyA = new EmpWageObj("CompanyA", 10, 20, 100);
		companyA.calculation();
		EmpWageObj companyB = new EmpWageObj("CompanyB", 20, 15, 100);
		companyB.calculation();
		EmpWageObj companyC = new EmpWageObj("CompanyC", 30, 10, 100);
		companyC.calculation();

	}

}
