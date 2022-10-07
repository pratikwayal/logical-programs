package Basic_Logical_Program;

public class Armstrongnumber_1 {

	public static void main(String[] args) {
		

		int n=371 ;
		int number=n;
		int r,sum=0;
		while (n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum + r*r*r;
			
		}
		if (number==sum)
			System.out.println("Its an armsstrong number");
		else
			System.out.println("Its an not armsstrong number");
	}

}



