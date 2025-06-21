package codestorywithMIK.twopointers;

import java.util.Arrays;

// leetcode:1498
public class SubsequenceSumTarget {

	public static void main(String[] args) {
		int[] nums = {5, 3, 7, 6};
		int target = 9;
		int ans = function(nums, target);
		System.out.println(ans);
	}
	
	// 4 Task
	public static int function(int[] nums, int target) {
		int n = nums.length;
		//1. sort the array
		Arrays.sort(nums);
		
		//2. Take two pointers
		int l=0;
		int r = n-1;
		
		//4th task resolve pow() function complexity
		int[] pow = new int[n];
		pow[0] = 1;
		for (int i = 1; i < pow.length; i++) {
			pow[i] = pow[i-1] * 2;
		}
		
		int result = 0;
		//3.add total possibilities
		while(l<=r) {
			if(nums[l] + nums[r] <= target) {
				result+= pow[r-l]; //result += Math.pow(2, r-l);
				l++;
			}else {
				r--;
			}
		}
		return result;
	}
}
