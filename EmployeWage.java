package com.employeeDay08;

public class EmployeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage Computation");
		int hour=8;
		int perHour=20;
		int dailyHour=0;
		
		double ran=Math.random();
		if (ran>0.5) {
			System.out.println("Employee is Present");
			 dailyHour=hour*perHour;
			System.out.println("Daily Employee Wage is:: "+dailyHour);
		}
		else {
			System.out.println("Employee is Absent");
			System.out.println("Daily Employee Wage is:: "+dailyHour);
		}
	}

}
