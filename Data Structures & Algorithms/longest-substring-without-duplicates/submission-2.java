class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        int right = 0;

        HashSet<Character> seen = new HashSet<>();

        while (right < s.length()) {
            char charSeen = s.charAt(right);

            while (seen.contains(charSeen)) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(charSeen);

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }
}
