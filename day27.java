import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int best4 = -1, best7 = -1, minLen = Integer.MAX_VALUE;

        for (int sevens = 0; sevens * 7 <= n; sevens++) {
            int remaining = n - sevens * 7;

            if (remaining % 4 == 0) {
                int fours = remaining / 4;
                int len = fours + sevens;

                if (len < minLen) {
                    minLen = len;
                    best4 = fours;
                    best7 = sevens;
                }
            }
        }

        if (best4 == -1) {
            System.out.println(-1);
            return;
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < best4; i++)
            ans.append('4');

        for (int i = 0; i < best7; i++)
            ans.append('7');

        System.out.println(ans);
    }
}