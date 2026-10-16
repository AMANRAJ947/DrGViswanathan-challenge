class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int count = 0;
        int[] lastPos = {-1, -1, -1}; // last position of 'a', 'b', 'c'
        
        for (int i = 0; i < n; i++) {
            lastPos[s.charAt(i) - 'a'] = i;
            
            // If we've seen all three characters, the minimum of lastPos
            // gives the smallest start index such that s[start..i] contains all three
            if (lastPos[0] != -1 && lastPos[1] != -1 && lastPos[2] != -1) {
                int minPos = Math.min(lastPos[0], Math.min(lastPos[1], lastPos[2]));
                count += minPos + 1; // All substrings starting from 0..minPos ending at i
            }
        }
        
        return count;
    }
}