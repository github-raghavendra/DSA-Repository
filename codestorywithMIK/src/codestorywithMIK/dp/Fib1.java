package codestorywithMIK.dp;

import java.util.Arrays;

public class Fib1 {

	public static void style1() {
		int n = 5;
		// creating 1D array for memoization
		int[] dp = new int[10];
		Arrays.fill(dp, -1);
		System.out.println(Arrays.toString(dp));
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i < 10; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		System.out.println(Arrays.toString(dp));
	}

	public static int fib(int n) {
		if (n <= 1)
			return n;

		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		int fib = fib(10);
		System.out.println(fib);
	}
	

	public static int solve(int n, int[] dp) {
		if(n<=1)
			return n;
		if(dp[n] != -1) {
			return dp[n];
		}
		return dp[n] = solve(n-1, dp) + solve(n-2, dp);
	}

	public static void main2(String[] args) {
		int n =10;
		int[] dp = new int[n+1];
		Arrays.fill(dp, -1);
		System.out.println(Arrays.toString(dp));

		dp[0] = 0;
		dp[1] = 1;
		
		int solve = solve(n, dp);
		System.out.println(solve);
	}
	

	public static void main3(String[] args) {
		int a = 0;
		int b = 1;
		int n = 10;
		for (int i = 2; i < n; i++) {
			int c = a+b;
			a = b;
			b = c;
			System.out.println(c);
		}
	}

}
