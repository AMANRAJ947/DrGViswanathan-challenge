import java.util.*;

public class Main {
    static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int[] c = new int[k];
        int total = 0;

        for (int i = 0; i < k; i++) {
            c[i] = sc.nextInt();
            total += c[i];
        }

        long[][] C = new long[total + 1][total + 1];

        for (int i = 0; i <= total; i++) {
            C[i][0] = C[i][i] = 1;

            for (int j = 1; j < i; j++) {
                C[i][j] = (C[i - 1][j - 1] + C[i - 1][j]) % MOD;
            }
        }

        long ans = 1;
        int sum = c[0];

        for (int i = 1; i < k; i++) {
            ans = ans * C[sum + c[i] - 1][c[i] - 1] % MOD;
            sum += c[i];
        }

        System.out.println(ans);
    }
}