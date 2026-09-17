import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int ans = 0, cur = 0; // 'a' = 0

        for (char ch : s.toCharArray()) {
            int next = ch - 'a';
            int diff = Math.abs(next - cur);
            ans += Math.min(diff, 26 - diff);
            cur = next;
        }

        System.out.println(ans);
    }
}day19b.java
