package numericpattren;

import java.util.Scanner;

public class LY2 {
	public static void main(String[] args) {
		int year;
		System.out.println("enter year:: ");
		Scanner M = new Scanner(System.in);
		year=M.nextInt();
		
		if (((year %4==0) && (year % 100!=0)) || (year %400==0)) 
			System.out.println("year is leap");
			else 
				System.out.println("year is not leap");
		}
		
	}

	
