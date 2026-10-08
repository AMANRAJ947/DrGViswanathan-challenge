import java.io.*;
import java.util.*;

public class Main {

    static final int MAX = 1000000;
    static boolean[] prime = new boolean[MAX + 1];

    static void sieve() {
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int i = 2; i * i <= MAX; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    prime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        sieve();

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            long x = Long.parseLong(st.nextToken());

            long root = (long) Math.sqrt(x);

            // Avoid floating-point precision problems
            while ((root + 1) * (root + 1) <= x) root++;
            while (root * root > x) root--;

            if (root * root == x && prime[(int) root]) {
                ans.append("YES\n");
            } else {
                ans.append("NO\n");
            }
        }

        System.out.print(ans);
    }
}