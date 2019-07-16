package nondescreasing;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		int[] nums = {4,2,3};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		System.out.println("Solution: " + checkPossibility(nums));
	}
	
    public static boolean checkPossibility(int[] nums) {
        // cnt is the number of changes
        int cnt = 0;
        
        for(int i = 1; i < nums.length && cnt <= 1; i++){
            if(nums[i - 1] > nums[i]){
                cnt++;
                
                if(i - 2 < 0 || nums[i - 2] <= nums[i]){
                    nums[i-1] = nums[i];
                }else{
                    nums[i] = nums[i-1];
                }
            }
        }
        // Since modifying at most 1
        // if the number of changes is less than or equal to 1, return true
        return cnt <= 1;
    }
}
