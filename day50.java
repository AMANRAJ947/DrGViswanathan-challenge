class Solution {
    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        if (n == 1) return "";  // can't break a single-char palindrome

        char[] arr = palindrome.toCharArray();

        // Try to change leftmost non-'a' in the left half to 'a'
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != 'a') {
                arr[i] = 'a';
                return new String(arr);
            }
        }

        // All left-half chars are 'a': change the last char to 'b'
        arr[n - 1] = 'b';
        return new String(arr);
    }
}