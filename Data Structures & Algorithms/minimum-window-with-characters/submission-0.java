class Solution { 

    public String minWindow(String s, String t) { 

        // If t is longer than s, a valid window is impossible
        if (t.length() > s.length()) { 
            return ""; 
        } 
 
        // Left and right pointers define the sliding window
        int left = 0; 
        int right = 0; 
 
        // Stores the length of the smallest valid window found
        int minLen = Integer.MAX_VALUE; 

        // Stores the starting index of the smallest window
        int minStart = 0; 
 
        // s = "OUZODYXAZV", t = "XYZ" 
 
        // Frequency of characters in the current window of s
        int[] sCount = new int[128]; 

        // Frequency of characters required from t
        int[] tCount = new int[128]; 
 
        // Build frequency map for characters required in t
        for (int i = 0; i < t.length(); i++) { 

            // Increase frequency of current character
            tCount[t.charAt(i)]++; 
        } 
 
        // Expand the window using the right pointer
        while (right < s.length()) { 

            // Add current right character to the window
            sCount[s.charAt(right)]++; 
 
            // While current window contains all required characters
            while (isFrequency(sCount, tCount)) { 

                // Check if current window is smaller than previous answer
                if (right - left + 1 < minLen) { 

                    // Update smallest window length
                    minLen = right - left + 1; 
 
                    // Store where the smallest window starts
                    minStart = left; 
                } 

                // Remove the leftmost character from the window
                sCount[s.charAt(left)]--; 

                // Move left pointer to shrink the window
                left++; 
            } 

            // Move right pointer to expand the window
            right++; 
        } 
 
        // Return smallest window, or "" if no valid window exists
        return minLen == Integer.MAX_VALUE 
                ? "" 
                : s.substring(minStart, minStart + minLen); 
    } 
 
    // Checks whether current window has all required characters
    private boolean isFrequency(int[] sCount, int[] tCount) { 

        // Check all ASCII characters
        for (int i = 0; i < 128; i++) { 

            // Current window doesn't have enough of this character
            if (tCount[i] > sCount[i]) { 
                return false; 
            } 
        } 

        // Window contains all required characters
        return true; 
    } 
}