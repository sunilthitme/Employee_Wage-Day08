package com.employeeDay08;
public class EmployeWage {
		public static void main(String[] args) {
			System.out.println("Welcome to Employee Wage Computation");
		final int wagePerHour=20;
		final int dayinMonth=20;
		final int maxWorkingHour=100;
		CalWage wage=new CalWage();
		wage.calculate(wagePerHour,dayinMonth,maxWorkingHour);
		}

	}
class CalWage{
	public static void calculate(int wagePerHour,int dayinMonth,int maxWorkingHour) {
		int workingHour=0;
		int totalWorkingHour=0;
		int totalWage=0;
		for(int day=0; day<dayinMonth && totalWorkingHour<maxWorkingHour; day++) {
			int presentAbsent= (int)(Math.floor(Math.random() * 10)) % 3;
			switch(presentAbsent) {
			case 1:
			       workingHour=8;
			       System.out.print("Emplyee is Present Full time	");
		            break;
			case 2:
			        workingHour=4;
			        System.out.print("Emplyee is Present Part time ");
			        break;
			 default:
				     workingHour=0;
				     System.out.print("Emplyee is Absent");
				     break;
		
		}
		totalWorkingHour+=workingHour;
		int dailyWage=workingHour*wagePerHour;
		totalWage+=dailyWage;
		
		System.out.println("\t" +"Day " + day + " wage is ::"  + dailyWage);
		}
			
		System.out.println("Monthly wage is::"+totalWage);
		
	}
}
