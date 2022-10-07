package logical_program;

import java.util.Scanner;

public class Find_largest_number_3_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a= sc.nextInt();
		System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        System.out.println("Eneter 3rd number");
         int c = sc.nextInt();
          if (a>b && a>c) {
	 System.out.println(a + " is largest number");
 }
	if (b>a && b>c)	 {
		 System.out.println(b+ "  is largest number");

	}
	else
		 System.out.println(c+  " is largest number");

	}

}
