package nondescreasing;

public class CheckNonDecreasingByModifyOneElementFunction {
	public boolean checkPossibility(int[] nums){
		int numberOfChange = 0;
		
		// [2,3,3,2,4]
		
		for(int i = 1; i < nums.length & numberOfChange <= 1; i++){
			// Checking if previous element is bigger than next element
			if(nums[i - 1] > nums[i]){
				// Need to change the value
				numberOfChange++;
				
				// If current element is bigger than previous previous element
				if(i - 2 < 0 || nums[i - 2] <= nums[i]){
					// Change the previous element to the current element
					nums[i - 1] = nums[i];
				} else { // Else, the current element is not bigger than previous previous element
					// Change current element to previous element
					nums[i] = nums[i - 1];
				}
			}
		}
		
		// return true when there was less than one changes for non-decreasing
		return numberOfChange <= 1;
	}
}
