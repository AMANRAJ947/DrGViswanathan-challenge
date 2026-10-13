class Solution {
    public int findJudge(int n, int[][] trust) {
        // Track trust scores: positive means trusted, negative means trusts others
        int[] score = new int[n + 1];
        
        for (int[] t : trust) {
            score[t[0]]--;  // t[0] trusts someone
            score[t[1]]++;  // t[1] is trusted by someone
        }
        
        // Find person with score n-1 (trusted by all others, trusts nobody)
        for (int i = 1; i <= n; i++) {
            if (score[i] == n - 1) {
                return i;
            }
        }
        
        return -1;
    }
}