package ControlStatementProject;

import java.util.Scanner;

public class leapYearCalculator {
	public static void main(String args[]) {
		int day = 0;
		int month;
		int year;
		
		System.out.print("Enter Month: (1-12)");
		Scanner scanMonth = new Scanner(System.in);
		month = scanMonth.nextInt();
		
		if(month < 1 || month > 12) {
			System.out.println("Invalid Input! (Enter 1-12)!");
		}
		else {
			int isEven = month%2;
			switch (isEven) {
			case 0:
				day = 30;
				break;
				
			case 1:
				day = 31;
				break;
			}
			
			System.out.println("Input Year: ");
			Scanner scanYear = new Scanner(System.in);
			year = scanYear.nextInt();
			
			if(year%4 == 0 && year%100 != 0) {
				System.out.println(year +" is a leap year");
				if(month == 2 && year%2 != 0) {
					day = 28;
				}
				else if(month == 2 && year%2 == 0) {
					day = 29;
				}
				else
					System.out.println(year+ "is not a leap year");
			}
			System.out.println("Ther are "+ day +" days, on month "+ month +" in year "+year);
		}
	}

}
