package logical_program;

public class Fibonacci_1 {

	public static void main(String[] args) {
		
		int n=0;
		int n1=1;
		int n2=10;    // number of count
		int sum;
		
		for (int i=1;i<=n2;i++) {
			sum=n+n1;
			System.out.print(n+",");
			n=n1;
			n1=sum;
			
		}
	}
	}

	


