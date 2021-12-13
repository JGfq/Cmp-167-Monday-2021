public class RecursionCh12 {
	
	public static int fib(int n) {
		if(n <= 1) // base case
			return n;
		else 
			return fib(n - 1) + fib(n - 2); // recursive code
	}
	
	public static int sum(int target) {
		if (target <= 0) // base case
			return 0;
		else
			return target + sum(target - 1); // recursive code
	}
	
	public static void main(String[] args) {
		int n = 10;
		int result =  sum(n); // 55
		System.out.println(result);
		int f = fib(8); // 21 
		System.out.println(f);
		int p = product(7);
		System.out.println(p);
		int b = sumOfTwoNums(25, 30);
		System.out.println(b);
		
	}

	// Write a recursive method for product of all numbers from 1 to a target number
	
	public static int product(int target) {
		if (target <= 0)
			return 1;
		else 
			return target * product(target - 1);
	}
	
	// Write a recursive method that calculates the sum of all numbers in between of two numbers
	
	public static int sumOfTwoNums(int x, int y) {
		if (y == 0) 
			return x;
		else {
			return 1 + sumOfTwoNums(x, y - 1);
		}
	}
	
	
} // Class 

