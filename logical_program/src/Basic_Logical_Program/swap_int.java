package Basic_Logical_Program;

public class swap_int {
	public static void main(String [] args) {
		int a=10;
		int b=20;
//		int c=a;
//		a=b;
//		b=c;
		a=a+b;
		b=a-b;
		a=a-b;
			
		System.out.println("after swapping a:"+a+" & b :"+b);
	}
}