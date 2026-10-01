class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create a HasMap
        HashMap<Integer, Integer> map = new HashMap<>();
        // iterate through nums[] and look for possible values- 
        for(int i = 0; i < nums.length; i++){
            // calculate the number needed to add up to target
            int remainder = target - nums[i];

            //check if we already have that number in the map
            if(map.containsKey(remainder)){
                // if found...
                // 1. make a new array and store the indexes of remainder and the current number 
                int[] result = {map.get(remainder), i};

                //2. sort the new array and return it 
                Arrays.sort(result);
                return result;
            }
            // if not found, add the current number & its index to the map
            map.put(nums[i], i);

        }

        // if nothing works, return an empty array
        return new int[] {};
        
    }
}
