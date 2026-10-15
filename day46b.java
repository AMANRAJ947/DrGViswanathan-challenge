class Solution {
    public int findCenter(int[][] edges) {
        // The center must be in both edges[0] and edges[1]
        // Find the common node between the first two edges
        int a = edges[0][0], b = edges[0][1];
        int c = edges[1][0], d = edges[1][1];
        
        if (a == c || a == d) {
            return a;
        }
        return b;
    }
}