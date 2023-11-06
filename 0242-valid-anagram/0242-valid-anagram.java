class Solution {
    public boolean isAnagram(String s, String t) {

        //convert both string to lowercase
        s = s.toLowerCase();
        t = t.toLowerCase();

        //remove blank space
        s = s.replace(" " , "");
        t = t.replace(" " , "");

        //initialize the bucket array
        int[] counts = new int[26];

        //fill the bucket
        for (int i=0; i<s.length(); i++){
            counts[s.charAt(i)-'a']++;
        }
        for (int i=0; i<t.length(); i++){
            counts[t.charAt(i)-'a']--;
        }
        for ( int count : counts){
            if (count != 0)
            return false;
        }
        return true;
        
    }
}