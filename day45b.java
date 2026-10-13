class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // If a common divisor exists, str1 + str2 must equal str2 + str1
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        
        // The length of the GCD string is gcd of the two lengths
        int gcdLen = gcd(str1.length(), str2.length());
        
        return str1.substring(0, gcdLen);
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}