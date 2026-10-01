class Solution {
    public boolean hasDuplicate(int[] nums) {
        // create the hashset
        HashSet<Integer> seen = new HashSet<>();
        //loop through the nums and add value-
        //to the HashSet ONLY if it already does not exist

        for(int n : nums){
            if(seen.contains(n)){
                return true;
            }
            seen.add(n);
        }
        return false;

        
    }
}