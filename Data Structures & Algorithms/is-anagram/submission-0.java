class Solution {
    public boolean isAnagram(String s, String t) {
        // first check if they are the same size
        if(s.length() != t.length()){
            return false;
        }
        // convert them into char arrays
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        // sort the arrays
        Arrays.sort(first);
        Arrays.sort(second);

        // compare their values 
        if(Arrays.equals(first,second)){
            return true;
        }

        return false;
    }
}
