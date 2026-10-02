class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // edge case: if the given array is empty return new empty array
        if(strs.length == 0){
            return new ArrayList<>();
        }

        // if its not empty create a HashMap with String as key & List as value
        Map<String, List<String>> map = new HashMap<>();
        // create an array of size 26 to use as a counter
        int[] count = new int[26];
        // iterate through the given strs[] array
        for(String s : strs){
            // make sure to start our count[] array fro 0
            Arrays.fill(count, 0);
            //iterate through all the characters of str in strs[]
            for(char c : s.toCharArray()){
                // add all the characters of str inside count[] by adding their value from 0 to 1
                count[c - 'a']++;
            }

            // create a StringBuilder to store the value we just retireved from count[]
            StringBuilder sb = new StringBuilder("");

            // iterate through count[] and add all the value to StringBuilder sb
            for(int i =0; i < 26; i++){
                sb.append("#");
                sb.append(count[i]);
            }

            // assign the string we created as a key for our HashMap
            String key = sb.toString();
            //if map doesn't already have  c, store it in a array list
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        // return it in the output format requested
        return new ArrayList<>(map.values());
    }


}