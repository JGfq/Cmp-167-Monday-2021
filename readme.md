#Recursion
## Calling a method within itself
# Base Case: end recursion
# Recursive Call
	` ` `
		public static int sum(int target) {
		if (target <= 0) // base case
			return 0;
		else
			return target + sum(target - 1); // recursive code
	}
	
	- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

	(10 + ( 9 + (8 + (7 + (6 + (5 + (4 + (3 + (2 + (1 + (0)))))))))))
	(10 + ( 9 + (8 + (7 + (6 + (5 + (4 + (3 + (2 + (1))))))))))
	(10 + ( 9 + (8 + (7 + (6 + (5 + (4 + (3 + (3)))))))))	
	(10 + ( 9 + (8 + (7 + (6 + (5 + (4 + (6))))))))
	(10 + ( 9 + (8 + (7 + (6 + (5 + (10)))))))	
	(10 + ( 9 + (8 + (7 + (6 + (15))))))	
	(10 + ( 9 + (8 + (7 + (21)))))	
	(10 + ( 9 + (8 + (28))))	
	(10 + ( 9 + (36)))	
	(10 + (45))
	(55)
	` ` ` 
	
#Fibonacci Sequence 

 n = 0, 1
 fibn (n) = n 
 fibn = fib(n - 1) + fib(n - 2)
 
 0 1 1 2 3 5 8 13 21
	