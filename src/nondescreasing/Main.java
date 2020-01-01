package nondescreasing;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		int[] nums = {3,4,2,3};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		CheckNonDecreasingByModifyOneElementFunction solution = new CheckNonDecreasingByModifyOneElementFunction();
		
		System.out.println("Solution: " + solution.checkPossibility(nums));
	}
	
}
