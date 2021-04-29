package leetcode665;

public class CheckNonDecreasingByModifyOneElementFunction {
	public boolean checkPossibility(int[] nums){
		int numberOfChange = 0;
		
		// {3,4,2,3}
		for(int i = 1; i < nums.length & numberOfChange <= 1; i++){
			// Checking if previous element is bigger than next element
			if(nums[i - 1] > nums[i]){
				// Need to change the value
				numberOfChange++;
				
				// First, if i is 1 < 0, we know nums[i] is smaller
				// If current element is bigger than previous previous element
				if(i - 2 < 0 || nums[i - 2] <= nums[i]){
					// Change the previous element to the current element
					nums[i - 1] = nums[i];
				} else { // Else, the current element is not bigger than previous previous element
					// Change current element to previous element
					// This is for in case, {3,4,2,3}, changed 2 to 4, cause if we don't change 2, the last element might be a big number too
					nums[i] = nums[i - 1];
				}
			}
		}
		
		// return true when there was less than one changes for non-decreasing
		return numberOfChange <= 1;
	}
}
