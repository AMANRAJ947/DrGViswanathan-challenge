class Solution {
    public int countPrimes(int n) {
        if (n < 3) return 0;
        boolean[] composite = new boolean[n / 2];  // represents odd numbers 3,5,7,...
        int count = 1;  // prime 2
        for (int i = 3; (long) i * i < n; i += 2) {
            if (!composite[i / 2]) {
                for (int j = i * i; j < n; j += 2 * i) {
                    composite[j / 2] = true;
                }
            }
        }
        for (int i = 3; i < n; i += 2) {
            if (!composite[i / 2]) count++;
        }
        return count;
    }
}