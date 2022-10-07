package Basic_Logical_Program;

import java.util.Scanner;

public class Revesre_number {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	int org_num= num;  // for palindrome
	//12345
	//1 using algorithm
	int rev=0;
	while(num!=0) {
		rev=rev*10 +num%10;
		num=num/10;	
	}
System.out.println("Reverse number is: " +rev);
 // for the palindrome number check
if (org_num==rev) {
	System.out.println(org_num +" is palindrome number");
}
else {
	System.out.println(org_num +" is not palindrome number");
}
	}

}
