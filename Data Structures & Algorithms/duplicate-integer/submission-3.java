class Solution {
    public boolean hasDuplicate(int[] nums) {

        // use a HashSet, HashSet does not store dupplicate items

        Set seen = new HashSet<>(); // initialize the Hashet

        for(int num : nums){  // iterate through nums[]
            if(seen.contains(num)){ // check if we already have seen that value
                return true; // if so, return true;
            }
            // if not, add it to the HashSet
            seen.add(num);
        }

        // if we dont have any duplicates, return false
        return false;

        
    }
}