class Solution {
    public int countPrimeSetBits(int left, int right) {
        // Prime numbers up to 20 (max bits for numbers up to 10^6)
        // Using a bitmask for primes: bits 2,3,5,7,11,13,17,19 set
        int primeMask = 0;
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19};
        for (int p : primes) {
            primeMask |= (1 << p);
        }
        
        int count = 0;
        for (int num = left; num <= right; num++) {
            int setBits = Integer.bitCount(num);
            if ((primeMask & (1 << setBits)) != 0) {
                count++;
            }
        }
        
        return count;
    }
}