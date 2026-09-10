class Solution {
    public int lengthOfLongestSubstring(String s) {


        int left = 0 ;
        int maxLength = Integer.MIN_VALUE;
        int right = 0 ;
        if(s.length()==0){
            return 0 ;
        }

        HashSet<Character> seen = new HashSet<>();

        while(right < s.length()){

            while(seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));

            maxLength = Math.max(maxLength , right - left + 1);
            right++;

        } 

        return maxLength;       
    }
}
