class Solution {
    public int[] twoSum(int[] nums, int target) {
        // make a new result[] to store indexes
        int[] result = new int[2];

        // iterate through the nums[] and keep track of i
        for(int i = 0; i < nums.length; i++){
            // iterate through nums[] and keep track of j
            for(int j = 0; j < nums.length; j++){
                // compare if the sum of nums[i] and nums[j] = target
                if(nums[i] + nums[j] == target && i != j){
                    // if so, add them to the new array
                    result[0] = i;
                    result[1] = j;

                }
            }
            // sort the result array 
            Arrays.sort(result);
        } 
        return result;
        
    }
}
