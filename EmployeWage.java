package com.employeeDay08;

public class EmployeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage Computation");
		int hour=8;
		int partHour=4;
		int perHour=20;
		int dailyHour=0;
		
		int ran=(int)(Math.floor(Math.random()*10))%3+1;
		switch (ran) {
		case 1:
			System.out.println("Employee is Present");
			 dailyHour=hour*perHour;
			System.out.println("Daily Employee Wage is:: "+dailyHour);
		break;
		case 2: 
			System.out.println("Employee is Present part time");
			 dailyHour=partHour*perHour;
			System.out.println("Daily Employee Wage is:: "+dailyHour);
		break;
		case 3:
			System.out.println("Employee is Absent");
			System.out.println("Daily Employee Wage is:: "+dailyHour);
		}
	}

}
