package lab.exercise;

public class RecursiveFunction {
	
	// Recursive Factorial 
	public static int factorial(int n) {
		if(n==1)return 1;
		else {
			return n* factorial(n-1);
		}
	}

	// Series 
	public static void series(int n) {
		int first=0;
		int second=1;
		System.out.print(first+ ",");
		for (int i = 2; i <= n; i++) {
			int temp=first+second;
			first=second;
			second=temp;
			System.out.print(second + ",");			
		}
	}
	
	// Recursive Fibonacci sequence
	public static int fibonacci(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1)return 1;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String[] args) {
		System.out.println(factorial(4));
		
		series(10);
		
		System.out.println("\n\nFibonacci");
		for (int i = 0; i <= 10; i++) {
			System.out.print(fibonacci(i) + ", ");
		}
	}

}
